package com.tomdog.core;

import com.tomdog.container.Context;
import com.tomdog.container.ReferenceWrapper;
import com.tomdog.container.ServiceWrapper;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器名称与容器的映射关系.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 17时29分
 */
public class Mapper {

    /**
     * 应用名称与应用容器map.
     */
    private ConcurrentHashMap<String, Context> contextMap =
        new ConcurrentHashMap<>();
    /**
     * 对外暴露的服务名称与所属容器的map.
     */
    private ConcurrentHashMap<String, ServiceWrapper> serviceMap =
        new ConcurrentHashMap<>();
    /**
     * 对外依赖的服务名称与所属容器的map.
     */
    private ConcurrentHashMap<String, ReferenceWrapper> referenceMap =
        new ConcurrentHashMap<>();

    /**
     * 添加一个context容器到map中.
     * @param context
     */
    public void addContext(Context context) {
        contextMap.put(context.getName(), context);
    }

    /**
     * 从map中获取一个context容器.
     * @param name 容器名称
     * @return
     */
    public Context getContext(String name) {
        return contextMap.get(name);
    }

    /**
     * 获取context容器的不可变集合.
     * @return
     */
    public Collection<Context> listContext() {
        return Collections.unmodifiableCollection(contextMap.values());
    }

    /**
     * 添加一个服务容器到map中.
     * @param service
     */
    public void addService(ServiceWrapper service) {
        serviceMap.put(service.getServiceName(), service);
    }

    /**
     * 从map中获取一个服务容器.
     * @param name 服务类名称
     * @return
     */
    public ServiceWrapper getService(String name) {
        return serviceMap.get(name);
    }

    /**
     * 添加一个对外服务依赖容器到map中.
     * @param reference
     */
    public void addReference(ReferenceWrapper reference) {
        referenceMap.put(reference.getReferName(), reference);
    }

    /**
     * 获取一个外部服务依赖容器.
     * @param referName 外部服务依赖名称
     * @return
     */
    public ReferenceWrapper getReference(String referName) {
        return referenceMap.get(referName);
    }

    /**
     * 获取外部服务依赖的不可变集合.
     * @return
     */
    public Collection<ReferenceWrapper> listReference() {
        return Collections.unmodifiableCollection(referenceMap.values());
    }
}
