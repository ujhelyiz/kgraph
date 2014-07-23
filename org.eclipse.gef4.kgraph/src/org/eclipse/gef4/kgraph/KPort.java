/**
 */
package org.eclipse.gef4.kgraph;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each port must be assigned a containing node. A port may have incoming
 * edges as well as outgoing edges, but usually either one or the other kind is
 * referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KPort#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KPort#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KPort#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPort()
 * @model
 * @generated
 */
public interface KPort extends KLabeledGraphElement, KShapeLayout {
    /**
     * Returns the value of the '<em><b>Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KNode#getPorts <em>Ports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Each port must be assigned a containing node. This is especially
     * important because the node is defined to be the container of the
     * port, which is relevant for many EMF features such as XML storage or
     * copying.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Container</em>' container reference.
     * @see #setContainer(KNode)
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPort_Container()
     * @see org.eclipse.gef4.kgraph.KNode#getPorts
     * @model opposite="ports" required="true" transient="false"
     * @generated
     */
    KNode getContainer();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KPort#getContainer <em>Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' container reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(KNode value);

    /**
     * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KEdge}.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KEdge#getSourcePort <em>Source Port</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Edges</em>' reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPort_OutgoingEdges()
     * @see org.eclipse.gef4.kgraph.KEdge#getSourcePort
     * @model opposite="sourcePort"
     * @generated
     */
    List<KEdge> getOutgoingEdges();

    /**
     * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KEdge}.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KEdge#getTargetPort <em>Target Port</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Edges</em>' reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPort_IncomingEdges()
     * @see org.eclipse.gef4.kgraph.KEdge#getTargetPort
     * @model opposite="targetPort"
     * @generated
     */
    List<KEdge> getIncomingEdges();

} // KPort
