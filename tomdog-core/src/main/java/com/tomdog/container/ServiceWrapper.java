package com.tomdog.container;

import java.lang.reflect.Method;

/**
 * 需要对外暴露的服务封装类.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月09日 16时30分
 */
public interface ServiceWrapper extends Wrapper {

    /**
     * set methods to service wrapper.
     * @param methods
     */
    void setMethods(Method[] methods);

    /**
     * get methods from service wrapper.
     * @return
     */
    Method[] getMethods();
}
