/**
 */
package org.eclipse.gef4.kgraph;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KLabeled Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Labeled graph elements contain an arbitrary number of labels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.KLabeledGraphElement#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKLabeledGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface KLabeledGraphElement extends KGraphElement {
    /**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gef4.kgraph.KLabel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gef4.kgraph.KLabel#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any graph element may have multiple labels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#getKLabeledGraphElement_Labels()
	 * @see org.eclipse.gef4.kgraph.KLabel#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
    List<KLabel> getLabels();

} // KLabeledGraphElement
