package com.tomdog.connector;

import com.tomdog.core.Adapter;
import com.tomdog.core.Lifecycle;
import com.tomdog.core.ProtocolHandler;
import com.tomdog.core.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * .
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 17时29分
 */
public abstract class Connector implements Lifecycle {
    public static final Logger logger = LoggerFactory.getLogger(Connector.class);

    /**
     * Coyote Protocol handler class name.
     */
    protected final String protocolHandlerClassName;

    /**
     * Coyote protocol handler.
     */
    protected final ProtocolHandler protocolHandler;

    /**
     * Coyote adapter.
     */
    protected Adapter adapter = null;
    /**
     * The <code>Service</code> we are associated with (if any).
     */
    protected Service service;

    public Connector(String protocol) {
        this.protocolHandlerClassName = protocol;
        // Instantiate protocol handler
        ProtocolHandler p = null;
        try {
            Class<?> clazz = Class.forName(protocolHandlerClassName);
            p = (ProtocolHandler)clazz.getConstructor().newInstance();
        }
        catch (Exception e) {
            logger.error("construct connector error.", e);
        }
        finally {
            this.protocolHandler = p;
        }
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
