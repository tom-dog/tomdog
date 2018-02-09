package com.tomdog.request;

import java.util.Arrays;

/**
 * 方法信息.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月09日 16时37分
 */
public class MethodInfo {
    /**
     * 方法别名，重载的方法必须通过此字段进行区分.
     */
    private String alias;
    /**
     * 方法名称.
     */
    private String name;
    /**
     * 请求参数类型列表.
     */
    private Class<?>[] parameterTypes;
    /**
     * 请求参数列表.
     */
    private Object[] parameters;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "MethodInfo{" + "alias='" + alias + '\'' + ", name='" + name + '\'' + ", parameterTypes=" + Arrays
            .toString(parameterTypes) + ", parameters=" + Arrays.toString(parameters) + '}';
    }
}
