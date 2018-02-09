package com.tomdog.core;

/**
 * <strong>Server</strong>是一组<strong>Service</strong>的集合.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 17时24分
 */
public interface Server extends Lifecycle {

    /**
     * get parent class loader.
     *
     * @return the parent class loader for this component.
     */
    ClassLoader getParentClassLoader();

    /**
     * Set the parent class loader for this server.
     *
     * @param parent The new parent class loader
     */
    void setParentClassLoader(ClassLoader parent);

    /**
     * Add a new Service to the set of defined Services.
     *
     * @param service The Service to be added
     */
    void addService(Service service);

    /**
     * Wait until a proper shutdown command is received, then return.
     */
    void await();

    /**
     * Find the specified Service
     *
     * @param name Name of the Service to be returned
     * @return the specified Service, or <code>null</code> if none exists.
     */
    Service findService(String name);

    /**
     * find services.
     * @return the set of Services defined within this Server.
     */
    Service[] findServices();

    /**
     * Remove the specified Service from the set associated from this
     * Server.
     *
     * @param service The Service to be removed
     */
    void removeService(Service service);
}
