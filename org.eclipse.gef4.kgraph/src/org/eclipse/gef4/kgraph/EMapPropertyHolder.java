/**
 */
package org.eclipse.gef4.kgraph;

import java.util.List;
import java.util.Map;
import org.eclipse.gef4.kgraph.properties.IProperty;
import org.eclipse.gef4.kgraph.properties.IPropertyHolder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMap Property Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property holder implementation based on {@link org.eclipse.emf.common.util.EMap} which can be used in Ecore models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.EMapPropertyHolder#getTransientProperties <em>Transient Properties</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.EMapPropertyHolder#getPersistentProperties <em>Persistent Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getEMapPropertyHolder()
 * @model abstract="true" superTypes="org.eclipse.gef4.kgraph.IPropertyHolder"
 * @generated
 */
public interface EMapPropertyHolder extends IPropertyHolder {
    /**
     * Returns the value of the '<em><b>Transient Properties</b></em>' map.
     * The key is of type {@link org.eclipse.gef4.kgraph.properties.IProperty<?>},
     * and the value is of type {@link java.lang.Object},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transient Properties</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transient Properties</em>' map.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getEMapPropertyHolder_TransientProperties()
     * @model mapType="org.eclipse.gef4.kgraph.IPropertyToObjectMap<org.eclipse.gef4.kgraph.IProperty<?>, org.eclipse.emf.ecore.EJavaObject>" transient="true"
     * @generated
     */
    Map<IProperty<?>, Object> getTransientProperties();

    /**
     * Returns the value of the '<em><b>Persistent Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.PropertyMapping}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistent Properties</em>' containment reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getEMapPropertyHolder_PersistentProperties()
     * @model containment="true"
     * @generated
     */
    List<PropertyMapping> getPersistentProperties();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Serialize all entries of the properties map using {@link Object#toString()}
     * and write them into the list of persistent entries. The previous content is cleared.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    void makePersistent();

} // EMapPropertyHolder
