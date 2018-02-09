package com.tomdog.request;

import java.util.Arrays;

/**
 * 请求对象封装.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 16时42分
 */
public class Request {

    /**
     * 请求唯一ID.
     */
    private String requestId;
    /**
     * 请求的应用名称.
     */
    private String application;
    /**
     * 请求路由到指定的方法.
     */
    private MethodInfo method;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public MethodInfo getMethod() {
        return method;
    }

    public void setMethod(MethodInfo method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Request{" + "requestId='" + requestId + '\'' + ", application='" + application + '\'' + ", method="
            + method + '}';
    }
}
