/**
 */
package org.eclipse.gef4.kgraph;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the superclass of all elements of a graph such as nodes, edges, ports,
 * and labels. A graph element may contain an arbitrary number of additional
 * data instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KGraphElement#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KGraphElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface KGraphElement extends EMapPropertyHolder {
    /**
     * Returns the value of the '<em><b>Data</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Each element of this list may contain additional data for the model element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data</em>' containment reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKGraphElement_Data()
     * @model containment="true"
     * @generated
     */
    List<EObject> getData();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The optional identifier string can be used for serialization.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKGraphElement_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KGraphElement#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Returns the first data instance that matches the given class. Classes
     * can be obtained using the static package methods of the corresponding
     * EMF model.
     * @return graph data for the given type, or {@code null} if there is none
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    Object getData(EClass type);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Returns the first data instance that matches the given class.
     * @param type the class of graph data to retrieve
     * @return graph data for the given type, or {@code null} if there is none
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    <T extends EObject> T getData(Class<T> type);

} // KGraphElement
