/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gef4.kgraph.*;

import org.eclipse.gef4.kgraph.properties.IProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KGraphFactoryImpl extends EFactoryImpl implements KGraphFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KGraphFactory init() {
        try {
            KGraphFactory theKGraphFactory = (KGraphFactory)EPackage.Registry.INSTANCE.getEFactory(KGraphPackage.eNS_URI);
            if (theKGraphFactory != null) {
                return theKGraphFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new KGraphFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KGraphFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case KGraphPackage.KGRAPH_DATA: return (EObject)createKGraphData();
            case KGraphPackage.KNODE: return (EObject)createKNode();
            case KGraphPackage.KEDGE: return (EObject)createKEdge();
            case KGraphPackage.KPORT: return (EObject)createKPort();
            case KGraphPackage.KLABEL: return (EObject)createKLabel();
            case KGraphPackage.KPOINT: return (EObject)createKPoint();
            case KGraphPackage.IPROPERTY_TO_OBJECT_MAP: return (EObject)createIPropertyToObjectMap();
            case KGraphPackage.PROPERTY_MAPPING: return (EObject)createPropertyMapping();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case KGraphPackage.IPROPERTY:
                return createIPropertyFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case KGraphPackage.IPROPERTY:
                return convertIPropertyToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KGraphData createKGraphData() {
        KGraphDataImpl kGraphData = new KGraphDataImpl();
        return kGraphData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KNode createKNode() {
        KNodeImpl kNode = new KNodeImpl();
        return kNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEdge createKEdge() {
        KEdgeImpl kEdge = new KEdgeImpl();
        return kEdge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KPort createKPort() {
        KPortImpl kPort = new KPortImpl();
        return kPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KLabel createKLabel() {
        KLabelImpl kLabel = new KLabelImpl();
        return kLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KPoint createKPoint() {
        KPointImpl kPoint = new KPointImpl();
        return kPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<IProperty<?>, Object> createIPropertyToObjectMap() {
        IPropertyToObjectMapImpl iPropertyToObjectMap = new IPropertyToObjectMapImpl();
        return iPropertyToObjectMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyMapping createPropertyMapping() {
        PropertyMappingImpl propertyMapping = new PropertyMappingImpl();
        return propertyMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IProperty<?> createIPropertyFromString(EDataType eDataType, String initialValue) {
        return (IProperty<?>)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIPropertyToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KGraphPackage getKGraphPackage() {
        return (KGraphPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static KGraphPackage getPackage() {
        return KGraphPackage.eINSTANCE;
    }

} //KGraphFactoryImpl
