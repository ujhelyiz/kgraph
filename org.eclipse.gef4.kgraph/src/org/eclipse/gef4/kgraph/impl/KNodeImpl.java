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
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getYpos <em>Ypos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KNodeImpl#getHeight <em>Height</em>}</li>
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
	protected static final double POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected double position = POSITION_EDEFAULT;

				/**
	 * The default value of the '{@link #getYpos() <em>Ypos</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getYpos()
	 * @generated
	 * @ordered
	 */
    protected static final double YPOS_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getYpos() <em>Ypos</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getYpos()
	 * @generated
	 * @ordered
	 */
    protected double ypos = YPOS_EDEFAULT;

    /**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
    protected static final double WIDTH_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
    protected double width = WIDTH_EDEFAULT;

    /**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
    protected static final double HEIGHT_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
    protected double height = HEIGHT_EDEFAULT;

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
	public double getPosition() {
		return position;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(double newPosition) {
		double oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__POSITION, oldPosition, position));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getYpos() {
		return ypos;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setYpos(double newYpos) {
		double oldYpos = ypos;
		ypos = newYpos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__YPOS, oldYpos, ypos));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getWidth() {
		return width;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__WIDTH, oldWidth, width));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getHeight() {
		return height;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KNODE__HEIGHT, oldHeight, height));
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
			case KGraphPackage.KNODE__YPOS:
				return getYpos();
			case KGraphPackage.KNODE__WIDTH:
				return getWidth();
			case KGraphPackage.KNODE__HEIGHT:
				return getHeight();
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
				setPosition((Double)newValue);
				return;
			case KGraphPackage.KNODE__YPOS:
				setYpos((Double)newValue);
				return;
			case KGraphPackage.KNODE__WIDTH:
				setWidth((Double)newValue);
				return;
			case KGraphPackage.KNODE__HEIGHT:
				setHeight((Double)newValue);
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
			case KGraphPackage.KNODE__YPOS:
				setYpos(YPOS_EDEFAULT);
				return;
			case KGraphPackage.KNODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case KGraphPackage.KNODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
				return position != POSITION_EDEFAULT;
			case KGraphPackage.KNODE__YPOS:
				return ypos != YPOS_EDEFAULT;
			case KGraphPackage.KNODE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case KGraphPackage.KNODE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
				case KGraphPackage.KNODE__YPOS: return KGraphPackage.KSHAPE_LAYOUT__YPOS;
				case KGraphPackage.KNODE__WIDTH: return KGraphPackage.KSHAPE_LAYOUT__WIDTH;
				case KGraphPackage.KNODE__HEIGHT: return KGraphPackage.KSHAPE_LAYOUT__HEIGHT;
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
				case KGraphPackage.KSHAPE_LAYOUT__YPOS: return KGraphPackage.KNODE__YPOS;
				case KGraphPackage.KSHAPE_LAYOUT__WIDTH: return KGraphPackage.KNODE__WIDTH;
				case KGraphPackage.KSHAPE_LAYOUT__HEIGHT: return KGraphPackage.KNODE__HEIGHT;
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
		result.append(", ypos: ");
		result.append(ypos);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //KNodeImpl
