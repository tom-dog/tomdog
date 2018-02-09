package com.tomdog.core;

/**
 * 组件生命周期.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 16时46分
 */
public interface Lifecycle {

    /**
     * 初始化组件.
     * @throws LifecycleException if this component detects a fatal error
     *  that prevents this component from being used
     */
    void init() throws LifecycleException;

    /**
     * 启动组件.
     * @throws LifecycleException if this component detects a fatal error
     *  that prevents this component from being used
     */
    void start() throws LifecycleException;

    /**
     * 停止组件.
     * @throws LifecycleException if this component detects a fatal error
     *  that prevents this component from being used
     */
    void stop() throws LifecycleException;

    /**
     * 销毁组件.
     * @throws LifecycleException if this component detects a fatal error
     *  that prevents this component from being used
     */
    void destroy() throws LifecycleException;
}
