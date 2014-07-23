/**
 */
package org.eclipse.gef4.kgraph;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KEdge Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The layout of edges is determined by a sequence of points: a point touching
 * the source port or source node, a list of bend points, and a point touching the
 * target port or target node.
 * <p>
 * All layout coordinates for edges are defined to be relative to the parent of
 * the source node, except when the target node is directly or indirectly contained
 * in the source node, in which case all coordinates are relative to the source node
 * itself. The insets of the reference node are not included in relative coordinates.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdgeLayout#getSourcePoint <em>Source Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdgeLayout#getTargetPoint <em>Target Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdgeLayout#getBendPoints <em>Bend Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KEdgeLayout {
    /**
     * Returns the value of the '<em><b>Source Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The source point is the point at which the edge touches the source node
     * or source port. The coordinates of source points must obey the general
     * rules for edge coordinates defined above.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Point</em>' containment reference.
     * @see #setSourcePoint(KPoint)
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout_SourcePoint()
     * @model containment="true"
     * @generated
     */
    KPoint getSourcePoint();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getSourcePoint <em>Source Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Point</em>' containment reference.
     * @see #getSourcePoint()
     * @generated
     */
    void setSourcePoint(KPoint value);

    /**
     * Returns the value of the '<em><b>Target Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The target point is the point at which the edge touches the target node
     * or target port. The coordinates of target points must obey the general
     * rules for edge coordinates defined above.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Point</em>' containment reference.
     * @see #setTargetPoint(KPoint)
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout_TargetPoint()
     * @model containment="true"
     * @generated
     */
    KPoint getTargetPoint();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getTargetPoint <em>Target Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Point</em>' containment reference.
     * @see #getTargetPoint()
     * @generated
     */
    void setTargetPoint(KPoint value);

    /**
     * Returns the value of the '<em><b>Bend Points</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.gef4.kgraph.KPoint}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The coordinates of bend points must obey the general rules for edge
     * coordinates defined above.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bend Points</em>' containment reference list.
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout_BendPoints()
     * @model containment="true"
     * @generated
     */
    List<KPoint> getBendPoints();

} // KEdgeLayout
