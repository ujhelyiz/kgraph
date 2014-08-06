/**
 */
package org.eclipse.gef4.kgraph;

import org.eclipse.gef4.geometry.planar.Dimension;
import org.eclipse.gef4.geometry.planar.Point;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KShape Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Graph elements that represent shapes can be assigned a two-dimensional
 * position and a size.
 * <p>
 * Layout coordinates for nodes, ports, and node labels are relative to the container
 * node. The insets of the parent node are not included in the relative coordinates
 * of child nodes, but they are included in the relative coordinates of ports and
 * node labels. For edge labels the rules defined in {@link KEdgeLayout} apply.
 * Port labels are relative to their ports.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KShapeLayout#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KShapeLayout#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KShapeLayout {
    /**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(Point)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout_Position()
	 * @model dataType="org.eclipse.gef4.kgraph.Point"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KShapeLayout#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

				/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Dimension)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout_Size()
	 * @model dataType="org.eclipse.gef4.kgraph.Dimension"
	 * @generated
	 */
	Dimension getSize();

				/**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KShapeLayout#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

} // KShapeLayout
