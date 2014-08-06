/**
 */
package org.eclipse.gef4.kgraph;

import java.util.List;
import org.eclipse.gef4.geometry.planar.Point;

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
 *   <li>{@link org.eclipse.gef4.kgraph.KEdgeLayout#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdgeLayout#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KEdgeLayout#getWayPoints <em>Way Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KEdgeLayout {
    /**
	 * Returns the value of the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Point</em>' attribute.
	 * @see #setStartPoint(Point)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout_StartPoint()
	 * @model dataType="org.eclipse.gef4.kgraph.Point"
	 * @generated
	 */
	Point getStartPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getStartPoint <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Point</em>' attribute.
	 * @see #getStartPoint()
	 * @generated
	 */
	void setStartPoint(Point value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(Point)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout_EndPoint()
	 * @model dataType="org.eclipse.gef4.kgraph.Point"
	 * @generated
	 */
	Point getEndPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Way Points</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.gef4.geometry.planar.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Way Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Way Points</em>' attribute list.
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKEdgeLayout_WayPoints()
	 * @model dataType="org.eclipse.gef4.kgraph.Point"
	 * @generated
	 */
	List<Point> getWayPoints();

} // KEdgeLayout
