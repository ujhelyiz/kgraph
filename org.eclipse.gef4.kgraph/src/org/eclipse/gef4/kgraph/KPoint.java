/**
 */
package org.eclipse.gef4.kgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KPoint#getXpos <em>Xpos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KPoint#getYpos <em>Ypos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPoint()
 * @model
 * @generated
 */
public interface KPoint {
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
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPoint_Xpos()
     * @model required="true"
     * @generated
     */
    double getXpos();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KPoint#getXpos <em>Xpos</em>}' attribute.
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
     * @see org.eclipse.gef4.kgraph.KGraphPackage#getKPoint_Ypos()
     * @model required="true"
     * @generated
     */
    double getYpos();

    /**
     * Sets the value of the '{@link org.eclipse.gef4.kgraph.KPoint#getYpos <em>Ypos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ypos</em>' attribute.
     * @see #getYpos()
     * @generated
     */
    void setYpos(double value);

} // KPoint
