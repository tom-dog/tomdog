package com.tomdog.container;

import java.net.URL;

/**
 * 一个应用上下文.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 17时19分
 */
public interface Context extends Container {

    /**
     * Return the URL of the descriptor for this context.
     *
     * @return The URL of the descriptor for this context
     */
    URL getConfigFile();


    /**
     * Set the URL of the descriptor for this context.
     *
     * @param configFile The URL of the descriptor for this context.
     */
    void setConfigFile(URL configFile);

    /**
     * get the context name for this application.
     * @return the context path for this application.
     */
    String getName();


    /**
     * Set the context name for this application.
     *
     * @param name The new context name
     */
    void setName(String name);

    /**
     * get reloadable flag for this application.
     * @return the reloadable flag for this application.
     */
    boolean getReloadable();


    /**
     * Set the reloadable flag for this application.
     *
     * @param reloadable The new reloadable flag
     */
    void setReloadable(boolean reloadable);
}
