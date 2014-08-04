/**
 */
package org.eclipse.gef4.kgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KLabel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each label must be assigned a parent graph element and a text string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KLabel#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.KLabel#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKLabel()
 * @model
 * @generated
 */
public interface KLabel extends KGraphElement, KShapeLayout {
    /**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKLabel_Text()
	 * @model
	 * @generated
	 */
    String getText();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KLabel#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
    void setText(String value);

    /**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KLabeledGraphElement#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(KLabeledGraphElement)
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKLabel_Container()
	 * @see org.eclipse.gef4.kgraph.KLabeledGraphElement#getLabels
	 * @model opposite="labels" required="true" transient="false"
	 * @generated
	 */
    KLabeledGraphElement getContainer();

    /**
	 * Sets the value of the '{@link org.eclipse.gef4.kgraph.KLabel#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
    void setContainer(KLabeledGraphElement value);

} // KLabel
