/**
 */
package org.eclipse.gef4.kgraph.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef4.kgraph.*;
import org.eclipse.gef4.kgraph.properties.IPropertyHolder;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef4.kgraph.KGraphPackage
 * @generated
 */
public class KGraphAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static KGraphPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KGraphAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KGraphPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KGraphSwitch<Adapter> modelSwitch =
        new KGraphSwitch<Adapter>() {
			@Override
			public Adapter caseKGraphElement(KGraphElement object) {
				return createKGraphElementAdapter();
			}
			@Override
			public Adapter caseKLabeledGraphElement(KLabeledGraphElement object) {
				return createKLabeledGraphElementAdapter();
			}
			@Override
			public Adapter caseKGraphData(KGraphData object) {
				return createKGraphDataAdapter();
			}
			@Override
			public Adapter caseKNode(KNode object) {
				return createKNodeAdapter();
			}
			@Override
			public Adapter caseKEdge(KEdge object) {
				return createKEdgeAdapter();
			}
			@Override
			public Adapter caseKPort(KPort object) {
				return createKPortAdapter();
			}
			@Override
			public Adapter caseKLabel(KLabel object) {
				return createKLabelAdapter();
			}
			@Override
			public Adapter caseKShapeLayout(KShapeLayout object) {
				return createKShapeLayoutAdapter();
			}
			@Override
			public Adapter caseKEdgeLayout(KEdgeLayout object) {
				return createKEdgeLayoutAdapter();
			}
			@Override
			public Adapter caseKPoint(KPoint object) {
				return createKPointAdapter();
			}
			@Override
			public Adapter caseIPropertyHolder(IPropertyHolder object) {
				return createIPropertyHolderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KGraphElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KGraphElement
	 * @generated
	 */
    public Adapter createKGraphElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KLabeledGraphElement <em>KLabeled Graph Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KLabeledGraphElement
	 * @generated
	 */
    public Adapter createKLabeledGraphElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KGraphData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KGraphData
	 * @generated
	 */
    public Adapter createKGraphDataAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KNode <em>KNode</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KNode
	 * @generated
	 */
    public Adapter createKNodeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KEdge <em>KEdge</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KEdge
	 * @generated
	 */
    public Adapter createKEdgeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KPort <em>KPort</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KPort
	 * @generated
	 */
    public Adapter createKPortAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KLabel <em>KLabel</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KLabel
	 * @generated
	 */
    public Adapter createKLabelAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KShapeLayout <em>KShape Layout</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KShapeLayout
	 * @generated
	 */
    public Adapter createKShapeLayoutAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KEdgeLayout <em>KEdge Layout</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KEdgeLayout
	 * @generated
	 */
    public Adapter createKEdgeLayoutAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.KPoint <em>KPoint</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.KPoint
	 * @generated
	 */
    public Adapter createKPointAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder <em>IProperty Holder</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder
	 * @generated
	 */
    public Adapter createIPropertyHolderAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //KGraphAdapterFactory
