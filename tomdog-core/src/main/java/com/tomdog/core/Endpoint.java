package com.tomdog.core;

import com.tomdog.request.Request;

/**
 * 服务调用的对端.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月09日 17时38分
 */
public interface Endpoint {

    /**
     * get application name.
     *
     * @return
     */
    String getApplicationName();

    /**
     * set application name to endpoint.
     *
     * @param applicationName new application name
     */
    void setApplicationName(String applicationName);

    /**
     * 发送请求到对端服务.
     *
     * @param request
     * @return
     */
    Object sendMessage(Request request);
}
