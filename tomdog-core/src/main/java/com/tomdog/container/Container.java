package com.tomdog.container;

import com.tomdog.core.Lifecycle;

/**
 * 容器接口.
 *
 * @author jinshulin (jinshulin@zhengheyingshi.com)
 * @since 2018年02月08日 16时52分
 */
public interface Container extends Lifecycle {

    /**
     * Get the parent container.
     *
     * @return Return the Container for which this Container is a child, if
     * there is one. If there is no defined parent, return
     * <code>null</code>.
     */
    Container getParent();

    /**
     * Set the parent Container to which this Container is being added as a
     * child.  This Container may refuse to become attached to the specified
     * Container by throwing an exception.
     *
     * @param container Container to which this Container is being added
     * as a child
     * @throws IllegalArgumentException if this Container refuses to become
     * attached to the specified Container
     */
    void setParent(Container container);

    /**
     * Get the parent class loader.
     *
     * @return the parent class loader for this component. If not set, return
     * {@link #getParent()}.{@link #getParentClassLoader()}. If no
     * parent has been set, return the system class loader.
     */
    ClassLoader getParentClassLoader();

    /**
     * Set the parent class loader for this component.
     *
     * @param parent The new parent class loader
     */
    void setParentClassLoader(ClassLoader parent);

    /**
     * Add a new child Container to those associated with this Container,
     * if supported.  Prior to adding this Container to the set of children,
     * the child's <code>setParent()</code> method must be called, with this
     * Container as an argument.  This method may thrown an
     * <code>IllegalArgumentException</code> if this Container chooses not
     * to be attached to the specified Container, in which case it is not added
     *
     * @param child New child Container to be added
     * @throws IllegalArgumentException if this exception is thrown by
     * the <code>setParent()</code> method of the child Container
     * @throws IllegalArgumentException if the new child does not have
     * a name unique from that of existing children of this Container
     * @throws IllegalStateException if this Container does not support
     * child Containers
     */
    void addChild(Container child);

    /**
     * Obtain a child Container by name.
     *
     * @param name Name of the child Container to be retrieved
     * @return The child Container with the given name or <code>null</code> if
     * no such child exists.
     */
    Container findChild(String name);

    /**
     * Obtain the child Containers associated with this Container.
     *
     * @return An array containing all children of this container. If this
     * Container has no children, a zero-length array is returned.
     */
    Container[] findChildren();

    /**
     * Remove an existing child Container from association with this parent
     * Container.
     *
     * @param child Existing child Container to be removed
     */
    void removeChild(Container child);
}
