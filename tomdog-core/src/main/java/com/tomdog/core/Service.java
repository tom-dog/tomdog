package com.tomdog.core;

import com.tomdog.connector.Connector;
import com.tomdog.container.Host;

/**
 * 一个<strong>Service</strong>中维护了一个或多个Connector，
 * 这些Connector共享了同一个Container.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 17时08分
 */
public interface Service {

    /**
     * @return the <code>Context</code> that handles requests for all
     * <code>Connectors</code> associated with this Service.
     */
    Host getContainer();

    /**
     * Set the <code>Context</code> that handles requests for all
     * <code>Connectors</code> associated with this Service.
     *
     * @param engine The new Engine
     */
    void setContainer(Host engine);

    /**
     * get the name of this Service.
     *
     * @return the name of this Service.
     */
    String getName();

    /**
     * Set the name of this Service.
     *
     * @param name The new service name
     */
    void setName(String name);

    /**
     * get Server.
     * @return the <code>Server</code> with which we are associated (if any).
     */
    Server getServer();

    /**
     * Set the <code>Server</code> with which we are associated (if any).
     *
     * @param server The server that owns this Service
     */
    void setServer(Server server);

    /**
     * get parent class loader.
     * @return the parent class loader for this component. If not set, return
     * {@link #getServer()} {@link Server#getParentClassLoader()}. If no server
     * has been set, return the system class loader.
     */
    ClassLoader getParentClassLoader();

    /**
     * Set the parent class loader for this service.
     *
     * @param parent The new parent class loader
     */
    void setParentClassLoader(ClassLoader parent);

    /**
     * Add a new Connector to the set of defined Connectors, and associate it
     * with this Service's Container.
     *
     * @param connector The Connector to be added
     */
    void addConnector(Connector connector);

    /**
     * Find and return the set of Connectors associated with this Service.
     *
     * @return the set of associated Connectors
     */
    Connector[] findConnectors();

    /**
     * Remove the specified Connector from the set associated from this
     * Service.  The removed Connector will also be disassociated from our
     * Container.
     *
     * @param connector The Connector to be removed
     */
    void removeConnector(Connector connector);

    /**
     * get mapper.
     * @return the mapper associated with this Service.
     */
    Mapper getMapper();
}
