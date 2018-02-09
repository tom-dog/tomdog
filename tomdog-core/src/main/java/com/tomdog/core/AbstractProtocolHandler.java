package com.tomdog.core;

import com.tomdog.container.Context;
import com.tomdog.request.Request;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Protocol Handler 的抽象基类.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月09日 17时06分
 */
public abstract class AbstractProtocolHandler implements ProtocolHandler {

    /**
     * 容器映射集合.
     */
    protected Mapper mapper;

    /**
     * 对端服务与连接通道的map<br/>
     * key is application name.
     */
    protected ConcurrentHashMap<String, Endpoint> endpointMap = new ConcurrentHashMap<>();

    @Override
    public void start() throws Exception {
        startInternal();
        mapper.listContext().forEach(context -> {
            exportContext(context);
        });

        Set<String> applicationSet = new HashSet<>();
        mapper.listReference().forEach(reference -> {
            applicationSet.add(reference.getApplicationName());
        });
        reference(applicationSet);
    }

    @Override
    public Object sendMessage(Request request) {
        Endpoint endpoint = getEndpoint(request.getApplication());
        if (null == endpoint) {
            throw new NullPointerException("no endpoint for: " + request.getApplication());
        }
        return endpoint.sendMessage(request);
    }

    /**
     * 将服务暴露到注册中心.
     *
     * @param context
     */
    protected abstract void exportContext(Context context);

    /**
     * 子类实现启动.
     */
    protected abstract void startInternal();

    /**
     * 根据外部依赖， 到注册中心发现匹配的服务，并建立连接.
     *
     * @param applicationSet
     */
    protected abstract void reference(Set<String> applicationSet);

    protected void addEndpoint(Endpoint endpoint) {
        endpointMap.put(endpoint.getApplicationName(), endpoint);
    }

    protected Endpoint getEndpoint(String applicationName) {
        return endpointMap.get(applicationName);
    }

    @Override
    public Mapper getMapper() {
        return this.mapper;
    }

    @Override
    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }
}
