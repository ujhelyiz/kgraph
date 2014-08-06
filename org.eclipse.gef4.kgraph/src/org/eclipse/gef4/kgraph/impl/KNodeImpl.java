/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gef4.geometry.planar.Dimension;
import org.eclipse.gef4.geometry.planar.Point;
import org.eclipse.gef4.kgraph.KEdge;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KNode;
import org.eclipse.gef4.kgraph.KPort;
import org.eclipse.gef4.kgraph.KShapeLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KNodeImpl extends KLabeledGraphElementImpl implements KNode {
    /**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Point POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position = POSITION_EDEFAULT;

				/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Dimension SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size = SIZE_EDEFAULT;

				/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
    protected EList<KNode> children;

    /**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
    protected EList<KPort> ports;

    /**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
    protected EList<KEdge> outgoingEdges;

    /**
	 * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIncomingEdges()
	 * @generated
	 * @ordered
	 */
    protected EList<KEdge> incomingEdges;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KNodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KGraphPackage.Literals.KNODE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPosition() {
		return position;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Point newPosition) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__POSITION, oldPosition, position));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getSize() {
		return size;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Dimension newSize) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__SIZE, oldSize, size));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List<KNode> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<KNode>(KNode.class, this, KGraphPackage.KNODE__CHILDREN, KGraphPackage.KNODE__PARENT);
		}
		return children;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KNode getParent() {
		if (eContainerFeatureID() != KGraphPackage.KNODE__PARENT) return null;
		return (KNode)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetParent(KNode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KGraphPackage.KNODE__PARENT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParent(KNode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KGraphPackage.KNODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KGraphPackage.KNODE__CHILDREN, KNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__PARENT, newParent, newParent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List<KPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<KPort>(KPort.class, this, KGraphPackage.KNODE__PORTS, KGraphPackage.KPORT__CONTAINER);
		}
		return ports;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List<KEdge> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectContainmentWithInverseEList<KEdge>(KEdge.class, this, KGraphPackage.KNODE__OUTGOING_EDGES, KGraphPackage.KEDGE__SOURCE_NODE);
		}
		return outgoingEdges;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List<KEdge> getIncomingEdges() {
		if (incomingEdges == null) {
			incomingEdges = new EObjectWithInverseResolvingEList<KEdge>(KEdge.class, this, KGraphPackage.KNODE__INCOMING_EDGES, KGraphPackage.KEDGE__TARGET_NODE);
		}
		return incomingEdges;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KGraphPackage.KNODE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case KGraphPackage.KNODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((KNode)otherEnd, msgs);
			case KGraphPackage.KNODE__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case KGraphPackage.KNODE__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
			case KGraphPackage.KNODE__INCOMING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KGraphPackage.KNODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case KGraphPackage.KNODE__PARENT:
				return basicSetParent(null, msgs);
			case KGraphPackage.KNODE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case KGraphPackage.KNODE__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case KGraphPackage.KNODE__INCOMING_EDGES:
				return ((InternalEList<?>)getIncomingEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KGraphPackage.KNODE__PARENT:
				return eInternalContainer().eInverseRemove(this, KGraphPackage.KNODE__CHILDREN, KNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KGraphPackage.KNODE__POSITION:
				return getPosition();
			case KGraphPackage.KNODE__SIZE:
				return getSize();
			case KGraphPackage.KNODE__CHILDREN:
				return getChildren();
			case KGraphPackage.KNODE__PARENT:
				return getParent();
			case KGraphPackage.KNODE__PORTS:
				return getPorts();
			case KGraphPackage.KNODE__OUTGOING_EDGES:
				return getOutgoingEdges();
			case KGraphPackage.KNODE__INCOMING_EDGES:
				return getIncomingEdges();
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
			case KGraphPackage.KNODE__POSITION:
				setPosition((Point)newValue);
				return;
			case KGraphPackage.KNODE__SIZE:
				setSize((Dimension)newValue);
				return;
			case KGraphPackage.KNODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends KNode>)newValue);
				return;
			case KGraphPackage.KNODE__PARENT:
				setParent((KNode)newValue);
				return;
			case KGraphPackage.KNODE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends KPort>)newValue);
				return;
			case KGraphPackage.KNODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends KEdge>)newValue);
				return;
			case KGraphPackage.KNODE__INCOMING_EDGES:
				getIncomingEdges().clear();
				getIncomingEdges().addAll((Collection<? extends KEdge>)newValue);
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
			case KGraphPackage.KNODE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case KGraphPackage.KNODE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case KGraphPackage.KNODE__CHILDREN:
				getChildren().clear();
				return;
			case KGraphPackage.KNODE__PARENT:
				setParent((KNode)null);
				return;
			case KGraphPackage.KNODE__PORTS:
				getPorts().clear();
				return;
			case KGraphPackage.KNODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case KGraphPackage.KNODE__INCOMING_EDGES:
				getIncomingEdges().clear();
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
			case KGraphPackage.KNODE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case KGraphPackage.KNODE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case KGraphPackage.KNODE__CHILDREN:
				return children != null && !children.isEmpty();
			case KGraphPackage.KNODE__PARENT:
				return getParent() != null;
			case KGraphPackage.KNODE__PORTS:
				return ports != null && !ports.isEmpty();
			case KGraphPackage.KNODE__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case KGraphPackage.KNODE__INCOMING_EDGES:
				return incomingEdges != null && !incomingEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == KShapeLayout.class) {
			switch (derivedFeatureID) {
				case KGraphPackage.KNODE__POSITION: return KGraphPackage.KSHAPE_LAYOUT__POSITION;
				case KGraphPackage.KNODE__SIZE: return KGraphPackage.KSHAPE_LAYOUT__SIZE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == KShapeLayout.class) {
			switch (baseFeatureID) {
				case KGraphPackage.KSHAPE_LAYOUT__POSITION: return KGraphPackage.KNODE__POSITION;
				case KGraphPackage.KSHAPE_LAYOUT__SIZE: return KGraphPackage.KNODE__SIZE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (position: ");
		result.append(position);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //KNodeImpl
