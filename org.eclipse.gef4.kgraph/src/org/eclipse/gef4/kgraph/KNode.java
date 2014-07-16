/**
 */
package org.eclipse.gef4.kgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All nodes except exactly one node must have an assigned parent node. The node
 * without parent is the top node of the graph and represents the graph itself.
 * <p>The parent-child relationship of nodes can be used to describe hierarchy in
 * nested graphs.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KNode#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KNode#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KNode#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKNode()
 * @model
 * @generated
 */
public interface KNode extends KLabeledGraphElement, KShapeLayout {
    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KNode}.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KNode#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The children together with their edges form a subgraph that is contained
     * in this parent node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKNode_Children()
     * @see org.eclipse.gef4.kgraph.KNode#getParent
     * @model opposite="parent" containment="true"
     * @generated
     */
    EList<KNode> getChildren();

    /**
     * Returns the value of the '<em><b>Parent</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KNode#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The containing node, or {@code null} if this is the top-level node representing
     * the graph.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Parent</em>' container reference.
     * @see #setParent(KNode)
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKNode_Parent()
     * @see org.eclipse.gef4.kgraph.KNode#getChildren
     * @model opposite="children" transient="false"
     * @generated
     */
    KNode getParent();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KNode#getParent <em>Parent</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' container reference.
     * @see #getParent()
     * @generated
     */
    void setParent(KNode value);

    /**
     * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KPort}.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KPort#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Each node may have an arbitrary number of ports. Edges may or may not be
     * connected to ports.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ports</em>' containment reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKNode_Ports()
     * @see org.eclipse.gef4.kgraph.KPort#getContainer
     * @model opposite="container" containment="true"
     * @generated
     */
    EList<KPort> getPorts();

    /**
     * Returns the value of the '<em><b>Outgoing Edges</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KEdge}.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KEdge#getSourceNode <em>Source Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Edges</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Edges</em>' containment reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKNode_OutgoingEdges()
     * @see org.eclipse.gef4.kgraph.KEdge#getSourceNode
     * @model opposite="sourceNode" containment="true"
     * @generated
     */
    EList<KEdge> getOutgoingEdges();

    /**
     * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KEdge}.
     * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KEdge#getTargetNode <em>Target Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Edges</em>' reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKNode_IncomingEdges()
     * @see org.eclipse.gef4.kgraph.KEdge#getTargetNode
     * @model opposite="targetNode"
     * @generated
     */
    EList<KEdge> getIncomingEdges();

} // KNode
