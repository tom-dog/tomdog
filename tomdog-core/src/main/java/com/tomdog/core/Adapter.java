package com.tomdog.core;

/**
 * 从协议解析到容器接收请求的适配器.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 16时39分
 */
public interface Adapter {

    /**
     * Call the service method, and notify all listeners.
     *
     * @param req The request object
     * @param res The response object
     *
     * @throws Exception if an error happens during handling of
     *   the request.
     */
    void service(Request req, Response res) throws Exception;
}
