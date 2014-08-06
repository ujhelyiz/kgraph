/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gef4.kgraph.KGraphData;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.properties.IProperty;
import org.eclipse.gef4.kgraph.properties.IPropertyHolder;
import org.eclipse.gef4.kgraph.properties.MapPropertyHolder;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KGraphDataImpl extends MinimalEObjectImpl.Container implements
		KGraphData {

	private MapPropertyHolder propertyHolder = new MapPropertyHolder();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected KGraphDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KGraphPackage.Literals.KGRAPH_DATA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public <T> void setProperty(IProperty<? super T> property, T value) {
		propertyHolder.setProperty(property, value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public <T> T getProperty(IProperty<T> property) {
		return propertyHolder.getProperty(property);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void copyProperties(IPropertyHolder holder) {
		propertyHolder.copyProperties(holder);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case KGraphPackage.KGRAPH_DATA___SET_PROPERTY__IPROPERTY_OBJECT:
				setProperty((IProperty)arguments.get(0), arguments.get(1));
				return null;
			case KGraphPackage.KGRAPH_DATA___GET_PROPERTY__IPROPERTY:
				return getProperty((IProperty)arguments.get(0));
			case KGraphPackage.KGRAPH_DATA___COPY_PROPERTIES__IPROPERTYHOLDER:
				copyProperties((IPropertyHolder)arguments.get(0));
				return null;
			case KGraphPackage.KGRAPH_DATA___GET_ALL_PROPERTIES:
				return getAllProperties();
			case KGraphPackage.KGRAPH_DATA___GET_SERIALIZED_PROPERTIES:
				return getSerializedProperties();
		}
		return super.eInvoke(operationID, arguments);
	}

} // KGraphDataImpl
