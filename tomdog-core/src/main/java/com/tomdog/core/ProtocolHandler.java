package com.tomdog.core;

/**
 * 具体的协议处理器.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 16时27分
 */
public interface ProtocolHandler {

    /**
     * Initialise the protocol.
     *
     * @throws Exception If the protocol handler fails to initialise
     */
    void init() throws Exception;

    /**
     * Start the protocol.
     *
     * @throws Exception If the protocol handler fails to start
     */
    void start() throws Exception;

    /**
     * Stop the protocol.
     *
     * @throws Exception If the protocol handler fails to stop
     */
    void stop() throws Exception;

    /**
     * Destroy the protocol (optional).
     *
     * @throws Exception If the protocol handler fails to destroy
     */
    void destroy() throws Exception;
}
