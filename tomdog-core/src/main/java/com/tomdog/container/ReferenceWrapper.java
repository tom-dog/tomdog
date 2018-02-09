package com.tomdog.container;

import com.tomdog.request.Request;

/**
 * 对外服务依赖的封装类.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月09日 16时30分
 */
public interface ReferenceWrapper extends Wrapper {

    /**
     * 获取服务依赖所属的应用名称.
     *
     * @return
     */
    String getApplicationName();

    /**
     * 设置依赖的服务所属应用的名称.
     *
     * @param applicationName
     */
    void setApplicationName(String applicationName);

    /**
     * 获取依赖在服务中的属性名称.
     *
     * @return
     */
    String getReferName();

    /**
     * 设置依赖在服务中的属性名称.
     *
     * @param referName
     */
    void setReferName(String referName);

    /**
     * 获取依赖的对象类型.
     *
     * @return
     */
    Class<?> getReferClassName();

    /**
     * 设置依赖的对象类型.
     *
     * @param clazz
     */
    void setReferClassName(Class<?> clazz);

    /**
     * 发送请求到对端服务.
     * @param request
     * @return
     */
    Object setMessage(Request request);
}
