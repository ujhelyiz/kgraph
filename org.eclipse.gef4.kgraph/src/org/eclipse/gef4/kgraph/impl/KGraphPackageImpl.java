/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef4.kgraph.EMapPropertyHolder;
import org.eclipse.gef4.kgraph.KEdge;
import org.eclipse.gef4.kgraph.KEdgeLayout;
import org.eclipse.gef4.kgraph.KGraphData;
import org.eclipse.gef4.kgraph.KGraphElement;
import org.eclipse.gef4.kgraph.KGraphFactory;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KLabel;
import org.eclipse.gef4.kgraph.KLabeledGraphElement;
import org.eclipse.gef4.kgraph.KNode;
import org.eclipse.gef4.kgraph.KPoint;
import org.eclipse.gef4.kgraph.KPort;
import org.eclipse.gef4.kgraph.KShapeLayout;
import org.eclipse.gef4.kgraph.PropertyMapping;

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
    private EClass kPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eMapPropertyHolderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iPropertyToObjectMapEClass = null;

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
    private EClass propertyMappingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iPropertyEDataType = null;

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
    public EReference getKGraphElement_Data() {
        return (EReference)kGraphElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKGraphElement_Id() {
        return (EAttribute)kGraphElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getKGraphElement__GetData__EClass() {
        return kGraphElementEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getKGraphElement__GetData__Class() {
        return kGraphElementEClass.getEOperations().get(1);
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
    public EAttribute getKShapeLayout_Xpos() {
        return (EAttribute)kShapeLayoutEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKShapeLayout_Ypos() {
        return (EAttribute)kShapeLayoutEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKShapeLayout_Width() {
        return (EAttribute)kShapeLayoutEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKShapeLayout_Height() {
        return (EAttribute)kShapeLayoutEClass.getEStructuralFeatures().get(3);
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
    public EReference getKEdgeLayout_SourcePoint() {
        return (EReference)kEdgeLayoutEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKEdgeLayout_TargetPoint() {
        return (EReference)kEdgeLayoutEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKEdgeLayout_BendPoints() {
        return (EReference)kEdgeLayoutEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKPoint() {
        return kPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKPoint_Xpos() {
        return (EAttribute)kPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKPoint_Ypos() {
        return (EAttribute)kPointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEMapPropertyHolder() {
        return eMapPropertyHolderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEMapPropertyHolder_TransientProperties() {
        return (EReference)eMapPropertyHolderEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEMapPropertyHolder_PersistentProperties() {
        return (EReference)eMapPropertyHolderEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getEMapPropertyHolder__MakePersistent() {
        return eMapPropertyHolderEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIPropertyToObjectMap() {
        return iPropertyToObjectMapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIPropertyToObjectMap_Key() {
        return (EAttribute)iPropertyToObjectMapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIPropertyToObjectMap_Value() {
        return (EAttribute)iPropertyToObjectMapEClass.getEStructuralFeatures().get(1);
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
    public EClass getPropertyMapping() {
        return propertyMappingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyMapping_Key() {
        return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyMapping_Value() {
        return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(1);
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
        createEReference(kGraphElementEClass, KGRAPH_ELEMENT__DATA);
        createEAttribute(kGraphElementEClass, KGRAPH_ELEMENT__ID);
        createEOperation(kGraphElementEClass, KGRAPH_ELEMENT___GET_DATA__ECLASS);
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
        createEAttribute(kShapeLayoutEClass, KSHAPE_LAYOUT__XPOS);
        createEAttribute(kShapeLayoutEClass, KSHAPE_LAYOUT__YPOS);
        createEAttribute(kShapeLayoutEClass, KSHAPE_LAYOUT__WIDTH);
        createEAttribute(kShapeLayoutEClass, KSHAPE_LAYOUT__HEIGHT);

        kEdgeLayoutEClass = createEClass(KEDGE_LAYOUT);
        createEReference(kEdgeLayoutEClass, KEDGE_LAYOUT__SOURCE_POINT);
        createEReference(kEdgeLayoutEClass, KEDGE_LAYOUT__TARGET_POINT);
        createEReference(kEdgeLayoutEClass, KEDGE_LAYOUT__BEND_POINTS);

        kPointEClass = createEClass(KPOINT);
        createEAttribute(kPointEClass, KPOINT__XPOS);
        createEAttribute(kPointEClass, KPOINT__YPOS);

        eMapPropertyHolderEClass = createEClass(EMAP_PROPERTY_HOLDER);
        createEReference(eMapPropertyHolderEClass, EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES);
        createEReference(eMapPropertyHolderEClass, EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES);
        createEOperation(eMapPropertyHolderEClass, EMAP_PROPERTY_HOLDER___MAKE_PERSISTENT);

        iPropertyToObjectMapEClass = createEClass(IPROPERTY_TO_OBJECT_MAP);
        createEAttribute(iPropertyToObjectMapEClass, IPROPERTY_TO_OBJECT_MAP__KEY);
        createEAttribute(iPropertyToObjectMapEClass, IPROPERTY_TO_OBJECT_MAP__VALUE);

        iPropertyHolderEClass = createEClass(IPROPERTY_HOLDER);
        createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT);
        createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY);
        createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER);
        createEOperation(iPropertyHolderEClass, IPROPERTY_HOLDER___GET_ALL_PROPERTIES);

        propertyMappingEClass = createEClass(PROPERTY_MAPPING);
        createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__KEY);
        createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__VALUE);

        // Create data types
        iPropertyEDataType = createEDataType(IPROPERTY);
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
        kGraphElementEClass.getESuperTypes().add(this.getEMapPropertyHolder());
        kLabeledGraphElementEClass.getESuperTypes().add(this.getKGraphElement());
        kGraphDataEClass.getESuperTypes().add(this.getEMapPropertyHolder());
        kNodeEClass.getESuperTypes().add(this.getKLabeledGraphElement());
        kNodeEClass.getESuperTypes().add(this.getKShapeLayout());
        kEdgeEClass.getESuperTypes().add(this.getKLabeledGraphElement());
        kEdgeEClass.getESuperTypes().add(this.getKEdgeLayout());
        kPortEClass.getESuperTypes().add(this.getKLabeledGraphElement());
        kPortEClass.getESuperTypes().add(this.getKShapeLayout());
        kLabelEClass.getESuperTypes().add(this.getKGraphElement());
        kLabelEClass.getESuperTypes().add(this.getKShapeLayout());
        eMapPropertyHolderEClass.getESuperTypes().add(this.getIPropertyHolder());

        // Initialize classes, features, and operations; add parameters
        initEClass(kGraphElementEClass, KGraphElement.class, "KGraphElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKGraphElement_Data(), ecorePackage.getEObject(), null, "data", null, 0, -1, KGraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKGraphElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, KGraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getKGraphElement__GetData__EClass(), ecorePackage.getEObject(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getKGraphElement__GetData__Class(), null, "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
        ETypeParameter t1 = addETypeParameter(op, "T");
        EGenericType g1 = createEGenericType(ecorePackage.getEObject());
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
        initEAttribute(getKShapeLayout_Xpos(), ecorePackage.getEDouble(), "xpos", null, 0, 1, KShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKShapeLayout_Ypos(), ecorePackage.getEDouble(), "ypos", null, 0, 1, KShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKShapeLayout_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, KShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKShapeLayout_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, KShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kEdgeLayoutEClass, KEdgeLayout.class, "KEdgeLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKEdgeLayout_SourcePoint(), this.getKPoint(), null, "sourcePoint", null, 0, 1, KEdgeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKEdgeLayout_TargetPoint(), this.getKPoint(), null, "targetPoint", null, 0, 1, KEdgeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKEdgeLayout_BendPoints(), this.getKPoint(), null, "bendPoints", null, 0, -1, KEdgeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kPointEClass, KPoint.class, "KPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKPoint_Xpos(), ecorePackage.getEDouble(), "xpos", null, 1, 1, KPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKPoint_Ypos(), ecorePackage.getEDouble(), "ypos", null, 1, 1, KPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eMapPropertyHolderEClass, EMapPropertyHolder.class, "EMapPropertyHolder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEMapPropertyHolder_TransientProperties(), this.getIPropertyToObjectMap(), null, "transientProperties", null, 0, -1, EMapPropertyHolder.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEMapPropertyHolder_PersistentProperties(), this.getPropertyMapping(), null, "persistentProperties", null, 0, -1, EMapPropertyHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getEMapPropertyHolder__MakePersistent(), null, "makePersistent", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(iPropertyToObjectMapEClass, Map.Entry.class, "IPropertyToObjectMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(this.getIProperty());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEAttribute(getIPropertyToObjectMap_Key(), g1, "key", null, 1, 1, Map.Entry.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIPropertyToObjectMap_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

        initEClass(propertyMappingEClass, PropertyMapping.class, "PropertyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyMapping_Key(), ecorePackage.getEString(), "key", null, 1, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertyMapping_Value(), ecorePackage.getEString(), "value", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(iPropertyEDataType, IProperty.class, "IProperty", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //KGraphPackageImpl
