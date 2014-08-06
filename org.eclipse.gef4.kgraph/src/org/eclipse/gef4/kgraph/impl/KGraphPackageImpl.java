/**
 */
package org.eclipse.gef4.kgraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gef4.geometry.planar.Dimension;
import org.eclipse.gef4.geometry.planar.Point;
import org.eclipse.gef4.kgraph.KEdge;
import org.eclipse.gef4.kgraph.KEdgeLayout;
import org.eclipse.gef4.kgraph.KGraphData;
import org.eclipse.gef4.kgraph.KGraphElement;
import org.eclipse.gef4.kgraph.KGraphFactory;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KLabel;
import org.eclipse.gef4.kgraph.KLabeledGraphElement;
import org.eclipse.gef4.kgraph.KNode;
import org.eclipse.gef4.kgraph.KPort;
import org.eclipse.gef4.kgraph.KShapeLayout;
import org.eclipse.gef4.kgraph.properties.IProperty;
import org.eclipse.gef4.kgraph.properties.IPropertyHolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KGraphPackageImpl extends EPackageImpl implements KGraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kGraphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kLabeledGraphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kGraphDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kShapeLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kEdgeLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPropertyHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iPropertyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dimensionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gef4.kgraph.KGraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KGraphPackageImpl() {
		super(eNS_URI, KGraphFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KGraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KGraphPackage init() {
		if (isInited) return (KGraphPackage)EPackage.Registry.INSTANCE.getEPackage(KGraphPackage.eNS_URI);

		// Obtain or create and register package
		KGraphPackageImpl theKGraphPackage = (KGraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KGraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KGraphPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKGraphPackage.createPackageContents();

		// Initialize created meta-data
		theKGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKGraphPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KGraphPackage.eNS_URI, theKGraphPackage);
		return theKGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKGraphElement() {
		return kGraphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGraphElement_Data() {
		return (EAttribute)kGraphElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKGraphElement__GetData__Class() {
		return kGraphElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGraphElement_Id() {
		return (EAttribute)kGraphElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKLabeledGraphElement() {
		return kLabeledGraphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKLabeledGraphElement_Labels() {
		return (EReference)kLabeledGraphElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKGraphData() {
		return kGraphDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKNode() {
		return kNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKNode_Children() {
		return (EReference)kNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKNode_Parent() {
		return (EReference)kNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKNode_Ports() {
		return (EReference)kNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKNode_OutgoingEdges() {
		return (EReference)kNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKNode_IncomingEdges() {
		return (EReference)kNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKEdge() {
		return kEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKEdge_SourceNode() {
		return (EReference)kEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKEdge_TargetNode() {
		return (EReference)kEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKEdge_SourcePort() {
		return (EReference)kEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKEdge_TargetPort() {
		return (EReference)kEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPort() {
		return kPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPort_Container() {
		return (EReference)kPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPort_OutgoingEdges() {
		return (EReference)kPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPort_IncomingEdges() {
		return (EReference)kPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKLabel() {
		return kLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKLabel_Text() {
		return (EAttribute)kLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKLabel_Container() {
		return (EReference)kLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKShapeLayout() {
		return kShapeLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKShapeLayout_Position() {
		return (EAttribute)kShapeLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKShapeLayout_Size() {
		return (EAttribute)kShapeLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKEdgeLayout() {
		return kEdgeLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEdgeLayout_StartPoint() {
		return (EAttribute)kEdgeLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEdgeLayout_EndPoint() {
		return (EAttribute)kEdgeLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKEdgeLayout_WayPoints() {
		return (EAttribute)kEdgeLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPropertyHolder() {
		return iPropertyHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyHolder__SetProperty__IProperty_Object() {
		return iPropertyHolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyHolder__GetProperty__IProperty() {
		return iPropertyHolderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyHolder__CopyProperties__IPropertyHolder() {
		return iPropertyHolderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyHolder__GetAllProperties() {
		return iPropertyHolderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyHolder__GetSerializedProperties() {
		return iPropertyHolderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProperty() {
		return iPropertyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDimension() {
		return dimensionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KGraphFactory getKGraphFactory() {
		return (KGraphFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kGraphElementEClass = createEClass(KGRAPH_ELEMENT);
		createEAttribute(kGraphElementEClass, KGRAPH_ELEMENT__ID);
		createEAttribute(kGraphElementEClass, KGRAPH_ELEMENT__DATA);
		createEOperation(kGraphElementEClass, KGRAPH_ELEMENT___GET_DATA__CLASS);

		kLabeledGraphElementEClass = createEClass(KLABELED_GRAPH_ELEMENT);
		createEReference(kLabeledGraphElementEClass, KLABELED_GRAPH_ELEMENT__LABELS);

		kGraphDataEClass = createEClass(KGRAPH_DATA);

		kNodeEClass = createEClass(KNODE);
		createEReference(kNodeEClass, KNODE__CHILDREN);
		createEReference(kNodeEClass, KNODE__PARENT);
		createEReference(kNodeEClass, KNODE__PORTS);
		createEReference(kNodeEClass, KNODE__OUTGOING_EDGES);
		createEReference(kNodeEClass, KNODE__INCOMING_EDGES);

		kEdgeEClass = createEClass(KEDGE);
		createEReference(kEdgeEClass, KEDGE__SOURCE_NODE);
		createEReference(kEdgeEClass, KEDGE__TARGET_NODE);
		createEReference(kEdgeEClass, KEDGE__SOURCE_PORT);
		createEReference(kEdgeEClass, KEDGE__TARGET_PORT);

		kPortEClass = createEClass(KPORT);
		createEReference(kPortEClass, KPORT__CONTAINER);
		createEReference(kPortEClass, KPORT__OUTGOING_EDGES);
		createEReference(kPortEClass, KPORT__INCOMING_EDGES);

		kLabelEClass = createEClass(KLABEL);
		createEAttribute(kLabelEClass, KLABEL__TEXT);
		createEReference(kLabelEClass, KLABEL__CONTAINER);

		kShapeLayoutEClass = createEClass(KSHAPE_LAYOUT);
		createEAttribute(kShapeLayoutEClass, KSHAPE_LAYOUT__POSITION);
		createEAttribute(kShapeLayoutEClass, KSHAPE_LAYOUT__SIZE);

		kEdgeLayoutEClass = createEClass(KEDGE_LAYOUT);
		createEAttribute(kEdgeLayoutEClass, KEDGE_LAYOUT__START_POINT);
		createEAttribute(kEdgeLayoutEClass, KEDGE_LAYOUT__END_POINT);
		createEAttribute(kEdgeLayoutEClass, KEDGE_LAYOUT__WAY_POINTS);

		iPropertyHolderEClass = createEClass(IPROPERTY_HOLDER);
		createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT);
		createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY);
		createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER);
		createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___GET_ALL_PROPERTIES);
		createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___GET_SERIALIZED_PROPERTIES);

		// Create data types
		iPropertyEDataType = createEDataType(IPROPERTY);
		pointEDataType = createEDataType(POINT);
		dimensionEDataType = createEDataType(DIMENSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(iPropertyEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		kGraphElementEClass.getESuperTypes().add(this.getIPropertyHolder());
		kLabeledGraphElementEClass.getESuperTypes().add(this.getKGraphElement());
		kGraphDataEClass.getESuperTypes().add(this.getIPropertyHolder());
		kNodeEClass.getESuperTypes().add(this.getKLabeledGraphElement());
		kNodeEClass.getESuperTypes().add(this.getKShapeLayout());
		kEdgeEClass.getESuperTypes().add(this.getKLabeledGraphElement());
		kEdgeEClass.getESuperTypes().add(this.getKEdgeLayout());
		kPortEClass.getESuperTypes().add(this.getKLabeledGraphElement());
		kPortEClass.getESuperTypes().add(this.getKShapeLayout());
		kLabelEClass.getESuperTypes().add(this.getKGraphElement());
		kLabelEClass.getESuperTypes().add(this.getKShapeLayout());

		// Initialize classes, features, and operations; add parameters
		initEClass(kGraphElementEClass, KGraphElement.class, "KGraphElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKGraphElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, KGraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKGraphElement_Data(), ecorePackage.getEJavaObject(), "data", null, 0, -1, KGraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getKGraphElement__GetData__Class(), null, "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(kLabeledGraphElementEClass, KLabeledGraphElement.class, "KLabeledGraphElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKLabeledGraphElement_Labels(), this.getKLabel(), this.getKLabel_Container(), "labels", null, 0, -1, KLabeledGraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kGraphDataEClass, KGraphData.class, "KGraphData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kNodeEClass, KNode.class, "KNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKNode_Children(), this.getKNode(), this.getKNode_Parent(), "children", null, 0, -1, KNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKNode_Parent(), this.getKNode(), this.getKNode_Children(), "parent", null, 0, 1, KNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKNode_Ports(), this.getKPort(), this.getKPort_Container(), "ports", null, 0, -1, KNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKNode_OutgoingEdges(), this.getKEdge(), this.getKEdge_SourceNode(), "outgoingEdges", null, 0, -1, KNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKNode_IncomingEdges(), this.getKEdge(), this.getKEdge_TargetNode(), "incomingEdges", null, 0, -1, KNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kEdgeEClass, KEdge.class, "KEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKEdge_SourceNode(), this.getKNode(), this.getKNode_OutgoingEdges(), "sourceNode", null, 1, 1, KEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKEdge_TargetNode(), this.getKNode(), this.getKNode_IncomingEdges(), "targetNode", null, 1, 1, KEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKEdge_SourcePort(), this.getKPort(), this.getKPort_OutgoingEdges(), "sourcePort", null, 0, 1, KEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKEdge_TargetPort(), this.getKPort(), this.getKPort_IncomingEdges(), "targetPort", null, 0, 1, KEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kPortEClass, KPort.class, "KPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPort_Container(), this.getKNode(), this.getKNode_Ports(), "container", null, 1, 1, KPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPort_OutgoingEdges(), this.getKEdge(), this.getKEdge_SourcePort(), "outgoingEdges", null, 0, -1, KPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPort_IncomingEdges(), this.getKEdge(), this.getKEdge_TargetPort(), "incomingEdges", null, 0, -1, KPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kLabelEClass, KLabel.class, "KLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, KLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKLabel_Container(), this.getKLabeledGraphElement(), this.getKLabeledGraphElement_Labels(), "container", null, 1, 1, KLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kShapeLayoutEClass, KShapeLayout.class, "KShapeLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKShapeLayout_Position(), this.getPoint(), "position", null, 0, 1, KShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKShapeLayout_Size(), this.getDimension(), "size", null, 0, 1, KShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kEdgeLayoutEClass, KEdgeLayout.class, "KEdgeLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKEdgeLayout_StartPoint(), this.getPoint(), "startPoint", null, 0, 1, KEdgeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKEdgeLayout_EndPoint(), this.getPoint(), "endPoint", null, 0, 1, KEdgeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKEdgeLayout_WayPoints(), this.getPoint(), "wayPoints", null, 0, -1, KEdgeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iPropertyHolderEClass, IPropertyHolder.class, "IPropertyHolder", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIPropertyHolder__SetProperty__IProperty_Object(), null, "setProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getIProperty());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "property", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPropertyHolder__GetProperty__IProperty(), null, "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getIProperty());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "property", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getIPropertyHolder__CopyProperties__IPropertyHolder(), null, "copyProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIPropertyHolder(), "holder", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPropertyHolder__GetAllProperties(), null, "getAllProperties", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getIProperty());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getIPropertyHolder__GetSerializedProperties(), null, "getSerializedProperties", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(iPropertyEDataType, IProperty.class, "IProperty", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dimensionEDataType, Dimension.class, "Dimension", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KGraphPackageImpl
