/**
 */
package org.eclipse.gef4.kgraph;


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
 *   <li>{@link org.eclipse.gef4.kgraph.KShapeLayout#getXpos <em>Xpos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KShapeLayout#getYpos <em>Ypos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KShapeLayout#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KShapeLayout#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KShapeLayout {
    /**
	 * Returns the value of the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xpos</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpos</em>' attribute.
	 * @see #setXpos(double)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout_Xpos()
	 * @model
	 * @generated
	 */
    double getXpos();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KShapeLayout#getXpos <em>Xpos</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpos</em>' attribute.
	 * @see #getXpos()
	 * @generated
	 */
    void setXpos(double value);

    /**
	 * Returns the value of the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ypos</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ypos</em>' attribute.
	 * @see #setYpos(double)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout_Ypos()
	 * @model
	 * @generated
	 */
    double getYpos();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KShapeLayout#getYpos <em>Ypos</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ypos</em>' attribute.
	 * @see #getYpos()
	 * @generated
	 */
    void setYpos(double value);

    /**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout_Width()
	 * @model
	 * @generated
	 */
    double getWidth();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KShapeLayout#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
    void setWidth(double value);

    /**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKShapeLayout_Height()
	 * @model
	 * @generated
	 */
    double getHeight();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KShapeLayout#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
    void setHeight(double value);

} // KShapeLayout
