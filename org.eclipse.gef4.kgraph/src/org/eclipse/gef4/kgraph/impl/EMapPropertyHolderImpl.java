/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gef4.kgraph.EMapPropertyHolder;
import org.eclipse.gef4.kgraph.KGraphFactory;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.PropertyMapping;
import org.eclipse.gef4.kgraph.properties.IProperty;
import org.eclipse.gef4.kgraph.properties.IPropertyHolder;
import org.eclipse.gef4.kgraph.properties.IPropertyValueProxy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMap Property Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.EMapPropertyHolderImpl#getTransientProperties <em>Transient Properties</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.EMapPropertyHolderImpl#getPersistentProperties <em>Persistent Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EMapPropertyHolderImpl extends MinimalEObjectImpl.Container implements EMapPropertyHolder {
    /**
     * The cached value of the '{@link #getTransientProperties() <em>Transient Properties</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransientProperties()
     * @generated
     * @ordered
     */
    protected EMap<IProperty<?>, Object> transientProperties;

    /**
     * The cached value of the '{@link #getPersistentProperties() <em>Persistent Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistentProperties()
     * @generated
     * @ordered
     */
    protected EList<PropertyMapping> persistentProperties;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EMapPropertyHolderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KGraphPackage.Literals.EMAP_PROPERTY_HOLDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<IProperty<?>, Object> getTransientProperties() {
        if (transientProperties == null) {
            transientProperties = new EcoreEMap<IProperty<?>,Object>(KGraphPackage.Literals.IPROPERTY_TO_OBJECT_MAP, IPropertyToObjectMapImpl.class, this, KGraphPackage.EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES);
        }
        return transientProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PropertyMapping> getPersistentProperties() {
        if (persistentProperties == null) {
            persistentProperties = new EObjectContainmentEList<PropertyMapping>(PropertyMapping.class, this, KGraphPackage.EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES);
        }
        return persistentProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void makePersistent() {
        boolean deliver = this.eDeliver();
        this.eSetDeliver(false);
        
        int i = 0;
        List<PropertyMapping> persisEntries = getPersistentProperties();
        for (Entry<IProperty<?>, Object> entry : getTransientProperties()) {
            IProperty<?> key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                PropertyMapping propMapping;
                if (i >= persisEntries.size()) {
                    propMapping = KGraphFactory.eINSTANCE.createPropertyMapping();
                    persisEntries.add(propMapping);
                    i++;
                } else {
                    propMapping = persisEntries.get(i++);
                }
                
                boolean pEdeliver = propMapping.eDeliver();
                propMapping.eSetDeliver(false);
                propMapping.setKey(key.getId());
                propMapping.setValue(value.toString());
                propMapping.eSetDeliver(pEdeliver);
            }
        }
        
        this.eSetDeliver(deliver);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public <T> void setProperty(IProperty<? super T> property, T value) {
        if (value == null) {
            getTransientProperties().removeKey(property);
        } else {
            getTransientProperties().put(property, value);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @SuppressWarnings("unchecked")
    public <T> T getProperty(IProperty<T> property) {
        Object value = getTransientProperties().get(property);
        if (value instanceof IPropertyValueProxy) {
            value = ((IPropertyValueProxy) value).resolveValue(property);
            if (value != null) {
                getTransientProperties().put(property, value);
                return (T) value;
            }
        } else if (value != null) {
            return (T) value;
        }
        
        T defaultValue = property.getDefault();
        if (defaultValue instanceof Cloneable) {
            setProperty(property, defaultValue);
        }
        
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void copyProperties(IPropertyHolder holder) {
        if (holder instanceof EMapPropertyHolder) {
            EMapPropertyHolder other = (EMapPropertyHolder) holder;
            EMap<IProperty<?>, Object> ourProps = this.getTransientProperties();
            for (Map.Entry<IProperty<?>, Object> entry : other.getTransientProperties()) {
                Object value = entry.getValue();
                if (value instanceof IPropertyValueProxy) {
                    IPropertyValueProxy proxy = (IPropertyValueProxy) value;
                    Object newValue = proxy.resolveValue(entry.getKey());
                    if (newValue != null) {
                        entry.setValue(newValue);
                        value = newValue;
                    }
                }
                ourProps.put(entry.getKey(), value);
            }
        } else {
            this.getTransientProperties().putAll(holder.getAllProperties());
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Map<IProperty<?>, Object> getAllProperties() {
        EMap<IProperty<?>, Object> props = getTransientProperties();
        // check for unresolved properties
        for (Map.Entry<IProperty<?>, Object> entry : props) {
            if (entry.getValue() instanceof IPropertyValueProxy) {
                IPropertyValueProxy proxy = (IPropertyValueProxy) entry.getValue();
                entry.setValue(proxy.resolveValue(entry.getKey()));
            }
        }
        return props.map();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KGraphPackage.EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES:
                return ((InternalEList<?>)getTransientProperties()).basicRemove(otherEnd, msgs);
            case KGraphPackage.EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES:
                return ((InternalEList<?>)getPersistentProperties()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KGraphPackage.EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES:
                if (coreType) return getTransientProperties();
                else return getTransientProperties().map();
            case KGraphPackage.EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES:
                return getPersistentProperties();
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
            case KGraphPackage.EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES:
                ((EStructuralFeature.Setting)getTransientProperties()).set(newValue);
                return;
            case KGraphPackage.EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES:
                getPersistentProperties().clear();
                getPersistentProperties().addAll((Collection<? extends PropertyMapping>)newValue);
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
            case KGraphPackage.EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES:
                getTransientProperties().clear();
                return;
            case KGraphPackage.EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES:
                getPersistentProperties().clear();
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
            case KGraphPackage.EMAP_PROPERTY_HOLDER__TRANSIENT_PROPERTIES:
                return transientProperties != null && !transientProperties.isEmpty();
            case KGraphPackage.EMAP_PROPERTY_HOLDER__PERSISTENT_PROPERTIES:
                return persistentProperties != null && !persistentProperties.isEmpty();
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
            case KGraphPackage.EMAP_PROPERTY_HOLDER___MAKE_PERSISTENT:
                makePersistent();
                return null;
            case KGraphPackage.EMAP_PROPERTY_HOLDER___SET_PROPERTY__IPROPERTY_OBJECT:
                setProperty((IProperty)arguments.get(0), arguments.get(1));
                return null;
            case KGraphPackage.EMAP_PROPERTY_HOLDER___GET_PROPERTY__IPROPERTY:
                return getProperty((IProperty)arguments.get(0));
            case KGraphPackage.EMAP_PROPERTY_HOLDER___COPY_PROPERTIES__IPROPERTYHOLDER:
                copyProperties((IPropertyHolder)arguments.get(0));
                return null;
            case KGraphPackage.EMAP_PROPERTY_HOLDER___GET_ALL_PROPERTIES:
                return getAllProperties();
        }
        return super.eInvoke(operationID, arguments);
    }

} //EMapPropertyHolderImpl
