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
    int IPROPERTY_HOLDER = 9;

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
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_HOLDER___GET_SERIALIZED_PROPERTIES = 4;

				/**
	 * The number of operations of the '<em>IProperty Holder</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IPROPERTY_HOLDER_OPERATION_COUNT = 5;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT__ID = IPROPERTY_HOLDER_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT__DATA = IPROPERTY_HOLDER_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT_FEATURE_COUNT = IPROPERTY_HOLDER_FEATURE_COUNT + 2;

    /**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT = IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT___GET_PROPERTY__IPROPERTY = IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY;

    /**
	 * The operation id for the '<em>Copy Properties</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER = IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
	 * The operation id for the '<em>Get All Properties</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT___GET_ALL_PROPERTIES = IPROPERTY_HOLDER___GET_ALL_PROPERTIES;

    /**
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KGRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES = IPROPERTY_HOLDER___GET_SERIALIZED_PROPERTIES;

				/**
	 * The operation id for the '<em>Get Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KGRAPH_ELEMENT___GET_DATA__CLASS = IPROPERTY_HOLDER_OPERATION_COUNT + 0;

				/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_ELEMENT_OPERATION_COUNT = IPROPERTY_HOLDER_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KLABELED_GRAPH_ELEMENT__ID = KGRAPH_ELEMENT__ID;

				/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KLABELED_GRAPH_ELEMENT__DATA = KGRAPH_ELEMENT__DATA;

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
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLABELED_GRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES = KGRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES;

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
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_DATA_FEATURE_COUNT = IPROPERTY_HOLDER_FEATURE_COUNT + 0;

    /**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_DATA___SET_PROPERTY__IPROPERTY_OBJECT = IPROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT;

    /**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_DATA___GET_PROPERTY__IPROPERTY = IPROPERTY_HOLDER___GET_PROPERTY__IPROPERTY;

    /**
	 * The operation id for the '<em>Copy Properties</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_DATA___COPY_PROPERTIES__IPROPERTYHOLDER = IPROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER;

    /**
	 * The operation id for the '<em>Get All Properties</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_DATA___GET_ALL_PROPERTIES = IPROPERTY_HOLDER___GET_ALL_PROPERTIES;

    /**
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KGRAPH_DATA___GET_SERIALIZED_PROPERTIES = IPROPERTY_HOLDER___GET_SERIALIZED_PROPERTIES;

				/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KGRAPH_DATA_OPERATION_COUNT = IPROPERTY_HOLDER_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNODE__ID = KLABELED_GRAPH_ELEMENT__ID;

				/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNODE__DATA = KLABELED_GRAPH_ELEMENT__DATA;

    /**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNODE__LABELS = KLABELED_GRAPH_ELEMENT__LABELS;

    /**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNODE__POSITION = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNODE___GET_SERIALIZED_PROPERTIES = KLABELED_GRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KEDGE__ID = KLABELED_GRAPH_ELEMENT__ID;

				/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KEDGE__DATA = KLABELED_GRAPH_ELEMENT__DATA;

    /**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KEDGE__LABELS = KLABELED_GRAPH_ELEMENT__LABELS;

    /**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE__START_POINT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 0;

				/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE__END_POINT = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 1;

				/**
	 * The feature id for the '<em><b>Way Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE__WAY_POINTS = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 2;

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
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE___GET_SERIALIZED_PROPERTIES = KLABELED_GRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KPORT__ID = KLABELED_GRAPH_ELEMENT__ID;

				/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KPORT__DATA = KLABELED_GRAPH_ELEMENT__DATA;

    /**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KPORT__LABELS = KLABELED_GRAPH_ELEMENT__LABELS;

    /**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPORT__POSITION = KLABELED_GRAPH_ELEMENT_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPORT___GET_SERIALIZED_PROPERTIES = KLABELED_GRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KLABEL__ID = KGRAPH_ELEMENT__ID;

				/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KLABEL__DATA = KGRAPH_ELEMENT__DATA;

    /**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLABEL__POSITION = KGRAPH_ELEMENT_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get Serialized Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLABEL___GET_SERIALIZED_PROPERTIES = KGRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES;

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
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KSHAPE_LAYOUT__POSITION = 0;

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
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE_LAYOUT__START_POINT = 0;

				/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE_LAYOUT__END_POINT = 1;

				/**
	 * The feature id for the '<em><b>Way Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEDGE_LAYOUT__WAY_POINTS = 2;

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
	 * The meta object id for the '<em>IProperty</em>' data type.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.gef4.kgraph.properties.IProperty
	 * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIProperty()
	 * @generated
	 */
    int IPROPERTY = 10;


    /**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gef4.geometry.planar.Point
	 * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 11;


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
	 * Returns the meta object for the attribute list '{@link org.eclipse.gef4.kgraph.KGraphElement#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.eclipse.gef4.kgraph.KGraphElement#getData()
	 * @see #getKGraphElement()
	 * @generated
	 */
    EAttribute getKGraphElement_Data();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KShapeLayout#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.eclipse.gef4.kgraph.KShapeLayout#getPosition()
	 * @see #getKShapeLayout()
	 * @generated
	 */
	EAttribute getKShapeLayout_Position();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point</em>'.
	 * @see org.eclipse.gef4.kgraph.KEdgeLayout#getStartPoint()
	 * @see #getKEdgeLayout()
	 * @generated
	 */
	EAttribute getKEdgeLayout_StartPoint();

				/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see org.eclipse.gef4.kgraph.KEdgeLayout#getEndPoint()
	 * @see #getKEdgeLayout()
	 * @generated
	 */
	EAttribute getKEdgeLayout_EndPoint();

				/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gef4.kgraph.KEdgeLayout#getWayPoints <em>Way Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Way Points</em>'.
	 * @see org.eclipse.gef4.kgraph.KEdgeLayout#getWayPoints()
	 * @see #getKEdgeLayout()
	 * @generated
	 */
	EAttribute getKEdgeLayout_WayPoints();

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
	 * Returns the meta object for the '{@link org.eclipse.gef4.kgraph.properties.IPropertyHolder#getSerializedProperties() <em>Get Serialized Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Serialized Properties</em>' operation.
	 * @see org.eclipse.gef4.kgraph.properties.IPropertyHolder#getSerializedProperties()
	 * @generated
	 */
	EOperation getIPropertyHolder__GetSerializedProperties();

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
	 * Returns the meta object for data type '{@link org.eclipse.gef4.geometry.planar.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.gef4.geometry.planar.Point
	 * @model instanceClass="org.eclipse.gef4.geometry.planar.Point"
	 * @generated
	 */
	EDataType getPoint();

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
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KGRAPH_ELEMENT__DATA = eINSTANCE.getKGraphElement_Data();

        /**
		 * The meta object literal for the '<em><b>Get Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KGRAPH_ELEMENT___GET_DATA__CLASS = eINSTANCE.getKGraphElement__GetData__Class();

								/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KGRAPH_ELEMENT__ID = eINSTANCE.getKGraphElement_Id();

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
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KSHAPE_LAYOUT__POSITION = eINSTANCE.getKShapeLayout_Position();

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
		 * The meta object literal for the '<em><b>Start Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEDGE_LAYOUT__START_POINT = eINSTANCE.getKEdgeLayout_StartPoint();

								/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEDGE_LAYOUT__END_POINT = eINSTANCE.getKEdgeLayout_EndPoint();

								/**
		 * The meta object literal for the '<em><b>Way Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEDGE_LAYOUT__WAY_POINTS = eINSTANCE.getKEdgeLayout_WayPoints();

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
		 * The meta object literal for the '<em><b>Get Serialized Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY_HOLDER___GET_SERIALIZED_PROPERTIES = eINSTANCE.getIPropertyHolder__GetSerializedProperties();

								/**
		 * The meta object literal for the '<em>IProperty</em>' data type.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.gef4.kgraph.properties.IProperty
		 * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getIProperty()
		 * @generated
		 */
        EDataType IPROPERTY = eINSTANCE.getIProperty();

								/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gef4.geometry.planar.Point
		 * @see org.eclipse.gef4.kgraph.impl.KGraphPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

    }

} //KGraphPackage
