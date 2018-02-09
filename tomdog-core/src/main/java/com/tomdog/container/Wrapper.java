package com.tomdog.container;

/**
 * <strong>Wrapper</strong>是对需要暴露的服务和外部服务依赖的封装.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 17时38分
 */
public interface Wrapper extends Container {

    /**
     * set context name to wrapper.
     * @param contextName set a new contextName
     */
    void setContextName(String contextName);

    /**
     * get context name from wrapper.
     * @return
     */
    String getContextName();

    /**
     * set service name to wrapper.
     * @param serviceName
     */
    void setServiceName(String serviceName);

    /**
     * get service name from wrapper.
     * @return
     */
    String getServiceName();

    /**
     * set service class to wrapper.
     * @param clazz
     */
    void setServiceClass(Class<?> clazz);

    /**
     * get service class from wrapper.
     * @return
     */
    Class<?> getServiceClass();
}