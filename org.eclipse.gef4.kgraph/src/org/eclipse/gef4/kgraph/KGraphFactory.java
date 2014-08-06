/**
 */
package org.eclipse.gef4.kgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef4.kgraph.KGraphPackage
 * @generated
 */
public interface KGraphFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    KGraphFactory eINSTANCE = org.eclipse.gef4.kgraph.impl.KGraphFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
    KGraphData createKGraphData();

    /**
	 * Returns a new object of class '<em>KNode</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>KNode</em>'.
	 * @generated
	 */
    KNode createKNode();

    /**
	 * Returns a new object of class '<em>KEdge</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>KEdge</em>'.
	 * @generated
	 */
    KEdge createKEdge();

    /**
	 * Returns a new object of class '<em>KPort</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>KPort</em>'.
	 * @generated
	 */
    KPort createKPort();

    /**
	 * Returns a new object of class '<em>KLabel</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>KLabel</em>'.
	 * @generated
	 */
    KLabel createKLabel();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    KGraphPackage getKGraphPackage();

} //KGraphFactory
