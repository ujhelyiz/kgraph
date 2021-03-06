/**
 */
package org.eclipse.gef4.kgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gef4.kgraph.KGraphFactory
 * @model kind="package"
 * @generated
 */
public interface KGraphPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "kgraph";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://eclipse.org/gef/KGraph";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "kgraph";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KGraphPackage eINSTANCE = org.eclipse.gef4.kgraph.impl.KGraphPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder <em>IProperty Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIPropertyHolder()
     * @generated
     */
    int IPROPERTY_HOLDER = 12;

    /**
     * The number of structural features of the '<em>IProperty Holder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_HOLDER_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT = 0;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY = 1;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER = 2;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_HOLDER___GET_ALL_PROPERTIES = 3;

    /**
     * The number of operations of the '<em>IProperty Holder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_HOLDER_OPERATION_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.EMapPropertyHolderImpl <em>EMap Property Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.EMapPropertyHolderImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getEMapPropertyHolder()
     * @generated
     */
    int EMAP_PROPERTY_HOLDER = 10;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES = IPROPERTY_HOLDER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES = IPROPERTY_HOLDER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>EMap Property Holder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER_FEATURE_COUNT = IPROPERTY_HOLDER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT = IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER___GET_PROPERTY__IPROPERTY = IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER = IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER___GET_ALL_PROPERTIES = IPROPERTY_HOLDER___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER___MAKE_PERSISTENT = IPROPERTY_HOLDER_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>EMap Property Holder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMAP_PROPERTY_HOLDER_OPERATION_COUNT = IPROPERTY_HOLDER_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KGraphElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KGraphElementImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKGraphElement()
     * @generated
     */
    int KGRAPH_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT__TRANSIENT_PROPERTIES = EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT__PERSISTENT_PROPERTIES = EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT__DATA = EMAP_PROPERTY_HOLDER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT__ID = EMAP_PROPERTY_HOLDER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT_FEATURE_COUNT = EMAP_PROPERTY_HOLDER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT = EMAP_PROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___GET_PROPERTY__IPROPERTY = EMAP_PROPERTY_HOLDER___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER = EMAP_PROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___GET_ALL_PROPERTIES = EMAP_PROPERTY_HOLDER___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___MAKE_PERSISTENT = EMAP_PROPERTY_HOLDER___MAKE_PERSISTENT;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___GET_DATA__ECLASS = EMAP_PROPERTY_HOLDER_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT___GET_DATA__CLASS = EMAP_PROPERTY_HOLDER_OPERATION_COUNT + 1;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_ELEMENT_OPERATION_COUNT = EMAP_PROPERTY_HOLDER_OPERATION_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KLabeledGraphElementImpl <em>KLabeled Graph Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KLabeledGraphElementImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKLabeledGraphElement()
     * @generated
     */
    int KLABELED_GRAPH_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT__TRANSIENT_PROPERTIES = KGRAPH_ELEMENT__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT__PERSISTENT_PROPERTIES = KGRAPH_ELEMENT__PERSISTENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT__DATA = KGRAPH_ELEMENT__DATA;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT__ID = KGRAPH_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT__LABELS = KGRAPH_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>KLabeled Graph Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT_FEATURE_COUNT = KGRAPH_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT = KGRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___GET_PROPERTY__IPROPERTY = KGRAPH_ELEMENT___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER = KGRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___GET_ALL_PROPERTIES = KGRAPH_ELEMENT___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___MAKE_PERSISTENT = KGRAPH_ELEMENT___MAKE_PERSISTENT;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___GET_DATA__ECLASS = KGRAPH_ELEMENT___GET_DATA__ECLASS;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT___GET_DATA__CLASS = KGRAPH_ELEMENT___GET_DATA__CLASS;

    /**
     * The number of operations of the '<em>KLabeled Graph Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABELED_GRAPH_ELEMENT_OPERATION_COUNT = KGRAPH_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KGraphDataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KGraphDataImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKGraphData()
     * @generated
     */
    int KGRAPH_DATA = 2;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA__TRANSIENT_PROPERTIES = EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA__PERSISTENT_PROPERTIES = EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES;

    /**
     * The number of structural features of the '<em>Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA_FEATURE_COUNT = EMAP_PROPERTY_HOLDER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA___SET_PROPERTY__IPROPERTY_OBJECT = EMAP_PROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA___GET_PROPERTY__IPROPERTY = EMAP_PROPERTY_HOLDER___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA___COPY_PROPERTIES__IPROPERTYHOLDER = EMAP_PROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA___GET_ALL_PROPERTIES = EMAP_PROPERTY_HOLDER___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA___MAKE_PERSISTENT = EMAP_PROPERTY_HOLDER___MAKE_PERSISTENT;

    /**
     * The number of operations of the '<em>Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KGRAPH_DATA_OPERATION_COUNT = EMAP_PROPERTY_HOLDER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KNodeImpl <em>KNode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KNodeImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKNode()
     * @generated
     */
    int KNODE = 3;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__TRANSIENT_PROPERTIES = KLABELED_GRAPH_ELEMENT__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__PERSISTENT_PROPERTIES = KLABELED_GRAPH_ELEMENT__PERSISTENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__DATA = KLABELED_GRAPH_ELEMENT__DATA;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__ID = KLABELED_GRAPH_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__LABELS = KLABELED_GRAPH_ELEMENT__LABELS;

    /**
     * The feature id for the '<em><b>Xpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__XPOS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ypos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__YPOS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__WIDTH = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__HEIGHT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__CHILDREN = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__PARENT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__PORTS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Outgoing Edges</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__OUTGOING_EDGES = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE__INCOMING_EDGES = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>KNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE_FEATURE_COUNT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___SET_PROPERTY__IPROPERTY_OBJECT = KLABELED_GRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___GET_PROPERTY__IPROPERTY = KLABELED_GRAPH_ELEMENT___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___COPY_PROPERTIES__IPROPERTYHOLDER = KLABELED_GRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___GET_ALL_PROPERTIES = KLABELED_GRAPH_ELEMENT___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___MAKE_PERSISTENT = KLABELED_GRAPH_ELEMENT___MAKE_PERSISTENT;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___GET_DATA__ECLASS = KLABELED_GRAPH_ELEMENT___GET_DATA__ECLASS;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE___GET_DATA__CLASS = KLABELED_GRAPH_ELEMENT___GET_DATA__CLASS;

    /**
     * The number of operations of the '<em>KNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KNODE_OPERATION_COUNT = KLABELED_GRAPH_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl <em>KEdge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KEdgeImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKEdge()
     * @generated
     */
    int KEDGE = 4;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__TRANSIENT_PROPERTIES = KLABELED_GRAPH_ELEMENT__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__PERSISTENT_PROPERTIES = KLABELED_GRAPH_ELEMENT__PERSISTENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__DATA = KLABELED_GRAPH_ELEMENT__DATA;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__ID = KLABELED_GRAPH_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__LABELS = KLABELED_GRAPH_ELEMENT__LABELS;

    /**
     * The feature id for the '<em><b>Source Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__SOURCE_POINT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__TARGET_POINT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Bend Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__BEND_POINTS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source Node</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__SOURCE_NODE = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Target Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__TARGET_NODE = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Source Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__SOURCE_PORT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Target Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE__TARGET_PORT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>KEdge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_FEATURE_COUNT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___SET_PROPERTY__IPROPERTY_OBJECT = KLABELED_GRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___GET_PROPERTY__IPROPERTY = KLABELED_GRAPH_ELEMENT___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___COPY_PROPERTIES__IPROPERTYHOLDER = KLABELED_GRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___GET_ALL_PROPERTIES = KLABELED_GRAPH_ELEMENT___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___MAKE_PERSISTENT = KLABELED_GRAPH_ELEMENT___MAKE_PERSISTENT;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___GET_DATA__ECLASS = KLABELED_GRAPH_ELEMENT___GET_DATA__ECLASS;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE___GET_DATA__CLASS = KLABELED_GRAPH_ELEMENT___GET_DATA__CLASS;

    /**
     * The number of operations of the '<em>KEdge</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_OPERATION_COUNT = KLABELED_GRAPH_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KPortImpl <em>KPort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KPortImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKPort()
     * @generated
     */
    int KPORT = 5;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__TRANSIENT_PROPERTIES = KLABELED_GRAPH_ELEMENT__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__PERSISTENT_PROPERTIES = KLABELED_GRAPH_ELEMENT__PERSISTENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__DATA = KLABELED_GRAPH_ELEMENT__DATA;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__ID = KLABELED_GRAPH_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__LABELS = KLABELED_GRAPH_ELEMENT__LABELS;

    /**
     * The feature id for the '<em><b>Xpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__XPOS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ypos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__YPOS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__WIDTH = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__HEIGHT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__CONTAINER = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__OUTGOING_EDGES = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT__INCOMING_EDGES = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>KPort</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT_FEATURE_COUNT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___SET_PROPERTY__IPROPERTY_OBJECT = KLABELED_GRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___GET_PROPERTY__IPROPERTY = KLABELED_GRAPH_ELEMENT___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___COPY_PROPERTIES__IPROPERTYHOLDER = KLABELED_GRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___GET_ALL_PROPERTIES = KLABELED_GRAPH_ELEMENT___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___MAKE_PERSISTENT = KLABELED_GRAPH_ELEMENT___MAKE_PERSISTENT;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___GET_DATA__ECLASS = KLABELED_GRAPH_ELEMENT___GET_DATA__ECLASS;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT___GET_DATA__CLASS = KLABELED_GRAPH_ELEMENT___GET_DATA__CLASS;

    /**
     * The number of operations of the '<em>KPort</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPORT_OPERATION_COUNT = KLABELED_GRAPH_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KLabelImpl <em>KLabel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KLabelImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKLabel()
     * @generated
     */
    int KLABEL = 6;

    /**
     * The feature id for the '<em><b>Transient Properties</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__TRANSIENT_PROPERTIES = KGRAPH_ELEMENT__TRANSIENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Persistent Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__PERSISTENT_PROPERTIES = KGRAPH_ELEMENT__PERSISTENT_PROPERTIES;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__DATA = KGRAPH_ELEMENT__DATA;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__ID = KGRAPH_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Xpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__XPOS = KGRAPH_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ypos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__YPOS = KGRAPH_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__WIDTH = KGRAPH_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__HEIGHT = KGRAPH_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__TEXT = KGRAPH_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL__CONTAINER = KGRAPH_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>KLabel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL_FEATURE_COUNT = KGRAPH_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Set Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___SET_PROPERTY__IPROPERTY_OBJECT = KGRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
     * The operation id for the '<em>Get Property</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___GET_PROPERTY__IPROPERTY = KGRAPH_ELEMENT___GET_PROPERTY__IPROPERTY;

    /**
     * The operation id for the '<em>Copy Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___COPY_PROPERTIES__IPROPERTYHOLDER = KGRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
     * The operation id for the '<em>Get All Properties</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___GET_ALL_PROPERTIES = KGRAPH_ELEMENT___GET_ALL_PROPERTIES;

    /**
     * The operation id for the '<em>Make Persistent</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___MAKE_PERSISTENT = KGRAPH_ELEMENT___MAKE_PERSISTENT;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___GET_DATA__ECLASS = KGRAPH_ELEMENT___GET_DATA__ECLASS;

    /**
     * The operation id for the '<em>Get Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL___GET_DATA__CLASS = KGRAPH_ELEMENT___GET_DATA__CLASS;

    /**
     * The number of operations of the '<em>KLabel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KLABEL_OPERATION_COUNT = KGRAPH_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.KShapeLayout <em>KShape Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.KShapeLayout
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKShapeLayout()
     * @generated
     */
    int KSHAPE_LAYOUT = 7;

    /**
     * The feature id for the '<em><b>Xpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KSHAPE_LAYOUT__XPOS = 0;

    /**
     * The feature id for the '<em><b>Ypos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KSHAPE_LAYOUT__YPOS = 1;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KSHAPE_LAYOUT__WIDTH = 2;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KSHAPE_LAYOUT__HEIGHT = 3;

    /**
     * The number of structural features of the '<em>KShape Layout</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KSHAPE_LAYOUT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>KShape Layout</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KSHAPE_LAYOUT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.KEdgeLayout <em>KEdge Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.KEdgeLayout
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKEdgeLayout()
     * @generated
     */
    int KEDGE_LAYOUT = 8;

    /**
     * The feature id for the '<em><b>Source Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_LAYOUT__SOURCE_POINT = 0;

    /**
     * The feature id for the '<em><b>Target Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_LAYOUT__TARGET_POINT = 1;

    /**
     * The feature id for the '<em><b>Bend Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_LAYOUT__BEND_POINTS = 2;

    /**
     * The number of structural features of the '<em>KEdge Layout</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_LAYOUT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>KEdge Layout</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEDGE_LAYOUT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.KPointImpl <em>KPoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.KPointImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKPoint()
     * @generated
     */
    int KPOINT = 9;

    /**
     * The feature id for the '<em><b>Xpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPOINT__XPOS = 0;

    /**
     * The feature id for the '<em><b>Ypos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPOINT__YPOS = 1;

    /**
     * The number of structural features of the '<em>KPoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPOINT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>KPoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPOINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.IPropertyToObjectMapImpl <em>IProperty To Object Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.IPropertyToObjectMapImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIPropertyToObjectMap()
     * @generated
     */
    int IPROPERTY_TO_OBJECT_MAP = 11;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_TO_OBJECT_MAP__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_TO_OBJECT_MAP__VALUE = 1;

    /**
     * The number of structural features of the '<em>IProperty To Object Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_TO_OBJECT_MAP_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>IProperty To Object Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IPROPERTY_TO_OBJECT_MAP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.gef4.kgraph.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.impl.PropertyMappingImpl
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getPropertyMapping()
     * @generated
     */
    int PROPERTY_MAPPING = 13;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAPPING__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAPPING__VALUE = 1;

    /**
     * The number of structural features of the '<em>Property Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAPPING_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Property Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_MAPPING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>IProperty</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef4.kgraph.properties.IProperty
     * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIProperty()
     * @generated
     */
    int IPROPERTY = 14;


    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KGraphElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.eclipse.gef4.kgraph.KGraphElement
     * @generated
     */
    EClass getKGraphElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.KGraphElement#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data</em>'.
     * @see org.eclipse.gef4.kgraph.KGraphElement#getData()
     * @see #getKGraphElement()
     * @generated
     */
    EReference getKGraphElement_Data();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KGraphElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.gef4.kgraph.KGraphElement#getId()
     * @see #getKGraphElement()
     * @generated
     */
    EAttribute getKGraphElement_Id();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.KGraphElement#getData(org.eclipse.emf.ecore.EClass) <em>Get Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Data</em>' operation.
     * @see org.eclipse.gef4.kgraph.KGraphElement#getData(org.eclipse.emf.ecore.EClass)
     * @generated
     */
    EOperation getKGraphElement__GetData__EClass();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.KGraphElement#getData(java.lang.Class) <em>Get Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Data</em>' operation.
     * @see org.eclipse.gef4.kgraph.KGraphElement#getData(java.lang.Class)
     * @generated
     */
    EOperation getKGraphElement__GetData__Class();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KLabeledGraphElement <em>KLabeled Graph Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KLabeled Graph Element</em>'.
     * @see org.eclipse.gef4.kgraph.KLabeledGraphElement
     * @generated
     */
    EClass getKLabeledGraphElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.KLabeledGraphElement#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Labels</em>'.
     * @see org.eclipse.gef4.kgraph.KLabeledGraphElement#getLabels()
     * @see #getKLabeledGraphElement()
     * @generated
     */
    EReference getKLabeledGraphElement_Labels();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KGraphData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data</em>'.
     * @see org.eclipse.gef4.kgraph.KGraphData
     * @generated
     */
    EClass getKGraphData();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KNode <em>KNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KNode</em>'.
     * @see org.eclipse.gef4.kgraph.KNode
     * @generated
     */
    EClass getKNode();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.KNode#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.eclipse.gef4.kgraph.KNode#getChildren()
     * @see #getKNode()
     * @generated
     */
    EReference getKNode_Children();

    /**
     * Returns the meta object for the container reference '{@link org.eclipse.gef4.kgraph.KNode#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent</em>'.
     * @see org.eclipse.gef4.kgraph.KNode#getParent()
     * @see #getKNode()
     * @generated
     */
    EReference getKNode_Parent();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.KNode#getPorts <em>Ports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ports</em>'.
     * @see org.eclipse.gef4.kgraph.KNode#getPorts()
     * @see #getKNode()
     * @generated
     */
    EReference getKNode_Ports();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.KNode#getOutgoingEdges <em>Outgoing Edges</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Edges</em>'.
     * @see org.eclipse.gef4.kgraph.KNode#getOutgoingEdges()
     * @see #getKNode()
     * @generated
     */
    EReference getKNode_OutgoingEdges();

    /**
     * Returns the meta object for the reference list '{@link org.eclipse.gef4.kgraph.KNode#getIncomingEdges <em>Incoming Edges</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Edges</em>'.
     * @see org.eclipse.gef4.kgraph.KNode#getIncomingEdges()
     * @see #getKNode()
     * @generated
     */
    EReference getKNode_IncomingEdges();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KEdge <em>KEdge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KEdge</em>'.
     * @see org.eclipse.gef4.kgraph.KEdge
     * @generated
     */
    EClass getKEdge();

    /**
     * Returns the meta object for the container reference '{@link org.eclipse.gef4.kgraph.KEdge#getSourceNode <em>Source Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Source Node</em>'.
     * @see org.eclipse.gef4.kgraph.KEdge#getSourceNode()
     * @see #getKEdge()
     * @generated
     */
    EReference getKEdge_SourceNode();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.gef4.kgraph.KEdge#getTargetNode <em>Target Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Node</em>'.
     * @see org.eclipse.gef4.kgraph.KEdge#getTargetNode()
     * @see #getKEdge()
     * @generated
     */
    EReference getKEdge_TargetNode();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.gef4.kgraph.KEdge#getSourcePort <em>Source Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Port</em>'.
     * @see org.eclipse.gef4.kgraph.KEdge#getSourcePort()
     * @see #getKEdge()
     * @generated
     */
    EReference getKEdge_SourcePort();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.gef4.kgraph.KEdge#getTargetPort <em>Target Port</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target Port</em>'.
     * @see org.eclipse.gef4.kgraph.KEdge#getTargetPort()
     * @see #getKEdge()
     * @generated
     */
    EReference getKEdge_TargetPort();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KPort <em>KPort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KPort</em>'.
     * @see org.eclipse.gef4.kgraph.KPort
     * @generated
     */
    EClass getKPort();

    /**
     * Returns the meta object for the container reference '{@link org.eclipse.gef4.kgraph.KPort#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container</em>'.
     * @see org.eclipse.gef4.kgraph.KPort#getContainer()
     * @see #getKPort()
     * @generated
     */
    EReference getKPort_Container();

    /**
     * Returns the meta object for the reference list '{@link org.eclipse.gef4.kgraph.KPort#getOutgoingEdges <em>Outgoing Edges</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
     * @see org.eclipse.gef4.kgraph.KPort#getOutgoingEdges()
     * @see #getKPort()
     * @generated
     */
    EReference getKPort_OutgoingEdges();

    /**
     * Returns the meta object for the reference list '{@link org.eclipse.gef4.kgraph.KPort#getIncomingEdges <em>Incoming Edges</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Edges</em>'.
     * @see org.eclipse.gef4.kgraph.KPort#getIncomingEdges()
     * @see #getKPort()
     * @generated
     */
    EReference getKPort_IncomingEdges();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KLabel <em>KLabel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KLabel</em>'.
     * @see org.eclipse.gef4.kgraph.KLabel
     * @generated
     */
    EClass getKLabel();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KLabel#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see org.eclipse.gef4.kgraph.KLabel#getText()
     * @see #getKLabel()
     * @generated
     */
    EAttribute getKLabel_Text();

    /**
     * Returns the meta object for the container reference '{@link org.eclipse.gef4.kgraph.KLabel#getContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container</em>'.
     * @see org.eclipse.gef4.kgraph.KLabel#getContainer()
     * @see #getKLabel()
     * @generated
     */
    EReference getKLabel_Container();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KShapeLayout <em>KShape Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KShape Layout</em>'.
     * @see org.eclipse.gef4.kgraph.KShapeLayout
     * @generated
     */
    EClass getKShapeLayout();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KShapeLayout#getXpos <em>Xpos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpos</em>'.
     * @see org.eclipse.gef4.kgraph.KShapeLayout#getXpos()
     * @see #getKShapeLayout()
     * @generated
     */
    EAttribute getKShapeLayout_Xpos();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KShapeLayout#getYpos <em>Ypos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ypos</em>'.
     * @see org.eclipse.gef4.kgraph.KShapeLayout#getYpos()
     * @see #getKShapeLayout()
     * @generated
     */
    EAttribute getKShapeLayout_Ypos();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KShapeLayout#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see org.eclipse.gef4.kgraph.KShapeLayout#getWidth()
     * @see #getKShapeLayout()
     * @generated
     */
    EAttribute getKShapeLayout_Width();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KShapeLayout#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see org.eclipse.gef4.kgraph.KShapeLayout#getHeight()
     * @see #getKShapeLayout()
     * @generated
     */
    EAttribute getKShapeLayout_Height();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KEdgeLayout <em>KEdge Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KEdge Layout</em>'.
     * @see org.eclipse.gef4.kgraph.KEdgeLayout
     * @generated
     */
    EClass getKEdgeLayout();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getSourcePoint <em>Source Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Source Point</em>'.
     * @see org.eclipse.gef4.kgraph.KEdgeLayout#getSourcePoint()
     * @see #getKEdgeLayout()
     * @generated
     */
    EReference getKEdgeLayout_SourcePoint();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getTargetPoint <em>Target Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Target Point</em>'.
     * @see org.eclipse.gef4.kgraph.KEdgeLayout#getTargetPoint()
     * @see #getKEdgeLayout()
     * @generated
     */
    EReference getKEdgeLayout_TargetPoint();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getBendPoints <em>Bend Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Bend Points</em>'.
     * @see org.eclipse.gef4.kgraph.KEdgeLayout#getBendPoints()
     * @see #getKEdgeLayout()
     * @generated
     */
    EReference getKEdgeLayout_BendPoints();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.KPoint <em>KPoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KPoint</em>'.
     * @see org.eclipse.gef4.kgraph.KPoint
     * @generated
     */
    EClass getKPoint();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KPoint#getXpos <em>Xpos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xpos</em>'.
     * @see org.eclipse.gef4.kgraph.KPoint#getXpos()
     * @see #getKPoint()
     * @generated
     */
    EAttribute getKPoint_Xpos();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KPoint#getYpos <em>Ypos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ypos</em>'.
     * @see org.eclipse.gef4.kgraph.KPoint#getYpos()
     * @see #getKPoint()
     * @generated
     */
    EAttribute getKPoint_Ypos();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.EMapPropertyHolder <em>EMap Property Holder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMap Property Holder</em>'.
     * @see org.eclipse.gef4.kgraph.EMapPropertyHolder
     * @generated
     */
    EClass getEMapPropertyHolder();

    /**
     * Returns the meta object for the map '{@link org.eclipse.gef4.kgraph.EMapPropertyHolder#getTransientProperties <em>Transient Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Transient Properties</em>'.
     * @see org.eclipse.gef4.kgraph.EMapPropertyHolder#getTransientProperties()
     * @see #getEMapPropertyHolder()
     * @generated
     */
    EReference getEMapPropertyHolder_TransientProperties();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.gef4.kgraph.EMapPropertyHolder#getPersistentProperties <em>Persistent Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Persistent Properties</em>'.
     * @see org.eclipse.gef4.kgraph.EMapPropertyHolder#getPersistentProperties()
     * @see #getEMapPropertyHolder()
     * @generated
     */
    EReference getEMapPropertyHolder_PersistentProperties();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.EMapPropertyHolder#makePersistent() <em>Make Persistent</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Make Persistent</em>' operation.
     * @see org.eclipse.gef4.kgraph.EMapPropertyHolder#makePersistent()
     * @generated
     */
    EOperation getEMapPropertyHolder__MakePersistent();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>IProperty To Object Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IProperty To Object Map</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="org.eclipse.gef4.kgraph.IProperty<?>" keyRequired="true" keyTransient="true"
     *        valueDataType="org.eclipse.emf.ecore.EJavaObject" valueTransient="true"
     * @generated
     */
    EClass getIPropertyToObjectMap();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getIPropertyToObjectMap()
     * @generated
     */
    EAttribute getIPropertyToObjectMap_Key();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getIPropertyToObjectMap()
     * @generated
     */
    EAttribute getIPropertyToObjectMap_Value();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder <em>IProperty Holder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IProperty Holder</em>'.
     * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder
     * @model instanceClass="org.eclipse.gef4.kgraph.properties.IPropertyHolder"
     * @generated
     */
    EClass getIPropertyHolder();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder#setProperty(org.eclipse.gef4.kgraph.properties.IProperty, java.lang.Object) <em>Set Property</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Property</em>' operation.
     * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder#setProperty(org.eclipse.gef4.kgraph.properties.IProperty, java.lang.Object)
     * @generated
     */
    EOperation getIPropertyHolder__SetProperty__IProperty_Object();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder#getProperty(org.eclipse.gef4.kgraph.properties.IProperty) <em>Get Property</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Property</em>' operation.
     * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder#getProperty(org.eclipse.gef4.kgraph.properties.IProperty)
     * @generated
     */
    EOperation getIPropertyHolder__GetProperty__IProperty();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder#copyProperties(org.eclipse.gef4.kgraph.properties.IPropertyHolder) <em>Copy Properties</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Copy Properties</em>' operation.
     * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder#copyProperties(org.eclipse.gef4.kgraph.properties.IPropertyHolder)
     * @generated
     */
    EOperation getIPropertyHolder__CopyProperties__IPropertyHolder();

    /**
     * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder#getAllProperties() <em>Get All Properties</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get All Properties</em>' operation.
     * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder#getAllProperties()
     * @generated
     */
    EOperation getIPropertyHolder__GetAllProperties();

    /**
     * Returns the meta object for class '{@link org.eclipse.gef4.kgraph.PropertyMapping <em>Property Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Mapping</em>'.
     * @see org.eclipse.gef4.kgraph.PropertyMapping
     * @generated
     */
    EClass getPropertyMapping();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.PropertyMapping#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see org.eclipse.gef4.kgraph.PropertyMapping#getKey()
     * @see #getPropertyMapping()
     * @generated
     */
    EAttribute getPropertyMapping_Key();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.PropertyMapping#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.gef4.kgraph.PropertyMapping#getValue()
     * @see #getPropertyMapping()
     * @generated
     */
    EAttribute getPropertyMapping_Value();

    /**
     * Returns the meta object for data type '{@link org.eclipse.gef4.kgraph.properties.IProperty <em>IProperty</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IProperty</em>'.
     * @see org.eclipse.gef4.kgraph.properties.IProperty
     * @model instanceClass="org.eclipse.gef4.kgraph.properties.IProperty" typeParameters="T"
     * @generated
     */
    EDataType getIProperty();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KGraphFactory getKGraphFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KGraphElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KGraphElementImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKGraphElement()
         * @generated
         */
        EClass KGRAPH_ELEMENT = eINSTANCE.getKGraphElement();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KGRAPH_ELEMENT__DATA = eINSTANCE.getKGraphElement_Data();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KGRAPH_ELEMENT__ID = eINSTANCE.getKGraphElement_Id();

        /**
         * The meta object literal for the '<em><b>Get Data</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation KGRAPH_ELEMENT___GET_DATA__ECLASS = eINSTANCE.getKGraphElement__GetData__EClass();

        /**
         * The meta object literal for the '<em><b>Get Data</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation KGRAPH_ELEMENT___GET_DATA__CLASS = eINSTANCE.getKGraphElement__GetData__Class();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KLabeledGraphElementImpl <em>KLabeled Graph Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KLabeledGraphElementImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKLabeledGraphElement()
         * @generated
         */
        EClass KLABELED_GRAPH_ELEMENT = eINSTANCE.getKLabeledGraphElement();

        /**
         * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KLABELED_GRAPH_ELEMENT__LABELS = eINSTANCE.getKLabeledGraphElement_Labels();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KGraphDataImpl <em>Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KGraphDataImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKGraphData()
         * @generated
         */
        EClass KGRAPH_DATA = eINSTANCE.getKGraphData();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KNodeImpl <em>KNode</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KNodeImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKNode()
         * @generated
         */
        EClass KNODE = eINSTANCE.getKNode();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KNODE__CHILDREN = eINSTANCE.getKNode_Children();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KNODE__PARENT = eINSTANCE.getKNode_Parent();

        /**
         * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KNODE__PORTS = eINSTANCE.getKNode_Ports();

        /**
         * The meta object literal for the '<em><b>Outgoing Edges</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KNODE__OUTGOING_EDGES = eINSTANCE.getKNode_OutgoingEdges();

        /**
         * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KNODE__INCOMING_EDGES = eINSTANCE.getKNode_IncomingEdges();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl <em>KEdge</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KEdgeImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKEdge()
         * @generated
         */
        EClass KEDGE = eINSTANCE.getKEdge();

        /**
         * The meta object literal for the '<em><b>Source Node</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE__SOURCE_NODE = eINSTANCE.getKEdge_SourceNode();

        /**
         * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE__TARGET_NODE = eINSTANCE.getKEdge_TargetNode();

        /**
         * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE__SOURCE_PORT = eINSTANCE.getKEdge_SourcePort();

        /**
         * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE__TARGET_PORT = eINSTANCE.getKEdge_TargetPort();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KPortImpl <em>KPort</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KPortImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKPort()
         * @generated
         */
        EClass KPORT = eINSTANCE.getKPort();

        /**
         * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KPORT__CONTAINER = eINSTANCE.getKPort_Container();

        /**
         * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KPORT__OUTGOING_EDGES = eINSTANCE.getKPort_OutgoingEdges();

        /**
         * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KPORT__INCOMING_EDGES = eINSTANCE.getKPort_IncomingEdges();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KLabelImpl <em>KLabel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KLabelImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKLabel()
         * @generated
         */
        EClass KLABEL = eINSTANCE.getKLabel();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KLABEL__TEXT = eINSTANCE.getKLabel_Text();

        /**
         * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KLABEL__CONTAINER = eINSTANCE.getKLabel_Container();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.KShapeLayout <em>KShape Layout</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.KShapeLayout
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKShapeLayout()
         * @generated
         */
        EClass KSHAPE_LAYOUT = eINSTANCE.getKShapeLayout();

        /**
         * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KSHAPE_LAYOUT__XPOS = eINSTANCE.getKShapeLayout_Xpos();

        /**
         * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KSHAPE_LAYOUT__YPOS = eINSTANCE.getKShapeLayout_Ypos();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KSHAPE_LAYOUT__WIDTH = eINSTANCE.getKShapeLayout_Width();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KSHAPE_LAYOUT__HEIGHT = eINSTANCE.getKShapeLayout_Height();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.KEdgeLayout <em>KEdge Layout</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.KEdgeLayout
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKEdgeLayout()
         * @generated
         */
        EClass KEDGE_LAYOUT = eINSTANCE.getKEdgeLayout();

        /**
         * The meta object literal for the '<em><b>Source Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE_LAYOUT__SOURCE_POINT = eINSTANCE.getKEdgeLayout_SourcePoint();

        /**
         * The meta object literal for the '<em><b>Target Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE_LAYOUT__TARGET_POINT = eINSTANCE.getKEdgeLayout_TargetPoint();

        /**
         * The meta object literal for the '<em><b>Bend Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEDGE_LAYOUT__BEND_POINTS = eINSTANCE.getKEdgeLayout_BendPoints();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.KPointImpl <em>KPoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.KPointImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getKPoint()
         * @generated
         */
        EClass KPOINT = eINSTANCE.getKPoint();

        /**
         * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KPOINT__XPOS = eINSTANCE.getKPoint_Xpos();

        /**
         * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KPOINT__YPOS = eINSTANCE.getKPoint_Ypos();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.EMapPropertyHolderImpl <em>EMap Property Holder</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.EMapPropertyHolderImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getEMapPropertyHolder()
         * @generated
         */
        EClass EMAP_PROPERTY_HOLDER = eINSTANCE.getEMapPropertyHolder();

        /**
         * The meta object literal for the '<em><b>Transient Properties</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES = eINSTANCE.getEMapPropertyHolder_TransientProperties();

        /**
         * The meta object literal for the '<em><b>Persistent Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES = eINSTANCE.getEMapPropertyHolder_PersistentProperties();

        /**
         * The meta object literal for the '<em><b>Make Persistent</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EMAP_PROPERTY_HOLDER___MAKE_PERSISTENT = eINSTANCE.getEMapPropertyHolder__MakePersistent();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.IPropertyToObjectMapImpl <em>IProperty To Object Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.IPropertyToObjectMapImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIPropertyToObjectMap()
         * @generated
         */
        EClass IPROPERTY_TO_OBJECT_MAP = eINSTANCE.getIPropertyToObjectMap();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IPROPERTY_TO_OBJECT_MAP__KEY = eINSTANCE.getIPropertyToObjectMap_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IPROPERTY_TO_OBJECT_MAP__VALUE = eINSTANCE.getIPropertyToObjectMap_Value();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder <em>IProperty Holder</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIPropertyHolder()
         * @generated
         */
        EClass IPROPERTY_HOLDER = eINSTANCE.getIPropertyHolder();

        /**
         * The meta object literal for the '<em><b>Set Property</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT = eINSTANCE.getIPropertyHolder__SetProperty__IProperty_Object();

        /**
         * The meta object literal for the '<em><b>Get Property</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY = eINSTANCE.getIPropertyHolder__GetProperty__IProperty();

        /**
         * The meta object literal for the '<em><b>Copy Properties</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER = eINSTANCE.getIPropertyHolder__CopyProperties__IPropertyHolder();

        /**
         * The meta object literal for the '<em><b>Get All Properties</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation IPROPERTY_HOLDER___GET_ALL_PROPERTIES = eINSTANCE.getIPropertyHolder__GetAllProperties();

        /**
         * The meta object literal for the '{@link org.eclipse.gef4.kgraph.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.impl.PropertyMappingImpl
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getPropertyMapping()
         * @generated
         */
        EClass PROPERTY_MAPPING = eINSTANCE.getPropertyMapping();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_MAPPING__KEY = eINSTANCE.getPropertyMapping_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_MAPPING__VALUE = eINSTANCE.getPropertyMapping_Value();

        /**
         * The meta object literal for the '<em>IProperty</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.gef4.kgraph.properties.IProperty
         * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIProperty()
         * @generated
         */
        EDataType IPROPERTY = eINSTANCE.getIProperty();

    }

} //KGraphPackage
