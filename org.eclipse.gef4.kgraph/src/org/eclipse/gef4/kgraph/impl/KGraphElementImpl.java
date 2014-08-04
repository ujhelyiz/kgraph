/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.gef4.kgraph.KGraphElement;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.properties.IProperty;
import org.eclipse.gef4.kgraph.properties.IPropertyHolder;
import org.eclipse.gef4.kgraph.properties.MapPropertyHolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KGraph Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KGraphElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KGraphElementImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KGraphElementImpl extends MinimalEObjectImpl.Container implements KGraphElement {
	
	private MapPropertyHolder propertyHolder = new MapPropertyHolder();
	
    /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected String id = ID_EDEFAULT;

				/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
    protected EList<Object> data;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KGraphElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KGraphPackage.Literals.KGRAPH_ELEMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List<Object> getData() {
		if (data == null) {
			data = new EDataTypeUniqueEList<Object>(Object.class, this, KGraphPackage.KGRAPH_ELEMENT__DATA);
		}
		return data;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return id;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KGRAPH_ELEMENT__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Object> T getData(Class<T> type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <T> void setProperty(IProperty<? super T> property, T value) {
		propertyHolder.setProperty(property, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <T> T getProperty(IProperty<T> property) {
		return propertyHolder.getProperty(property);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void copyProperties(IPropertyHolder holder) {
		propertyHolder.copyProperties(holder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<IProperty<?>, Object> getAllProperties() {
		return propertyHolder.getAllProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, String> getSerializedProperties() {
		return propertyHolder.getSerializedProperties();
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KGraphPackage.KGRAPH_ELEMENT__ID:
				return getId();
			case KGraphPackage.KGRAPH_ELEMENT__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KGraphPackage.KGRAPH_ELEMENT__ID:
				setId((String)newValue);
				return;
			case KGraphPackage.KGRAPH_ELEMENT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Object>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case KGraphPackage.KGRAPH_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case KGraphPackage.KGRAPH_ELEMENT__DATA:
				getData().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KGraphPackage.KGRAPH_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case KGraphPackage.KGRAPH_ELEMENT__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    @SuppressWarnings({"rawtypes", "unchecked" })
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KGraphPackage.KGRAPH_ELEMENT___GET_DATA__CLASS:
				return getData((Class)arguments.get(0));
			case KGraphPackage.KGRAPH_ELEMENT___SET_PROPERTY__IPROPERTY_OBJECT:
				setProperty((IProperty)arguments.get(0), arguments.get(1));
				return null;
			case KGraphPackage.KGRAPH_ELEMENT___GET_PROPERTY__IPROPERTY:
				return getProperty((IProperty)arguments.get(0));
			case KGraphPackage.KGRAPH_ELEMENT___COPY_PROPERTIES__IPROPERTYHOLDER:
				copyProperties((IPropertyHolder)arguments.get(0));
				return null;
			case KGraphPackage.KGRAPH_ELEMENT___GET_ALL_PROPERTIES:
				return getAllProperties();
			case KGraphPackage.KGRAPH_ELEMENT___GET_SERIALIZED_PROPERTIES:
				return getSerializedProperties();
		}
		return super.eInvoke(operationID, arguments);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //KGraphElementImpl
