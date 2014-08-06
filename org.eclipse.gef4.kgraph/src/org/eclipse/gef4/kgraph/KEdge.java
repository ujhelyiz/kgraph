/**
 */
package org.eclipse.gef4.kgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KEdge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An edge must be assigned a source and a target node, but the source and target ports
 * are optional. The source and target references are opposite to the lists of outgoing and
 * incoming edges of nodes and ports, respectively.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdge#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdge#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdge#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdge#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdge()
 * @model
 * @generated
 */
public interface KEdge extends KLabeledGraphElement, KEdgeLayout {
    /**
	 * Returns the value of the '<em><b>Source Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KNode#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source node is expected to be set for each edge. This is especially
	 * important because the source node is defined to be the container of the
	 * edge, which is relevant for many EMF features such as XML storage or
	 * copying. The source reference is opposite to the nodes' list of outgoing
	 * edges, hence those references are synchronized automatically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Node</em>' container reference.
	 * @see #setSourceNode(KNode)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdge_SourceNode()
	 * @see org.eclipse.gef4.kgraph.KNode#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true" transient="false"
	 * @generated
	 */
    KNode getSourceNode();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdge#getSourceNode <em>Source Node</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Node</em>' container reference.
	 * @see #getSourceNode()
	 * @generated
	 */
    void setSourceNode(KNode value);

    /**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KNode#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target node is expected to be set for each edge.
	 * The target reference is opposite to the nodes' list of incoming
	 * edges, hence those references are synchronized automatically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(KNode)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdge_TargetNode()
	 * @see org.eclipse.gef4.kgraph.KNode#getIncomingEdges
	 * @model opposite="incomingEdges" required="true"
	 * @generated
	 */
    KNode getTargetNode();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdge#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
    void setTargetNode(KNode value);

    /**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KPort#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is optional, as a node may have no ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(KPort)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdge_SourcePort()
	 * @see org.eclipse.gef4.kgraph.KPort#getOutgoingEdges
	 * @model opposite="outgoingEdges"
	 * @generated
	 */
    KPort getSourcePort();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdge#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
    void setSourcePort(KPort value);

    /**
	 * Returns the value of the '<em><b>Target Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KPort#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference is optional, as a node may have no ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Port</em>' reference.
	 * @see #setTargetPort(KPort)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdge_TargetPort()
	 * @see org.eclipse.gef4.kgraph.KPort#getIncomingEdges
	 * @model opposite="incomingEdges"
	 * @generated
	 */
    KPort getTargetPort();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdge#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
    void setTargetPort(KPort value);

} // KEdge
