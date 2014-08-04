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
 * An implementation of the model object '<em><b>KPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getXpos <em>Xpos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getYpos <em>Ypos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPortImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPortImpl extends KLabeledGraphElementImpl implements KPort {
    /**
	 * The default value of the '{@link #getXpos() <em>Xpos</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getXpos()
	 * @generated
	 * @ordered
	 */
    protected static final double XPOS_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getXpos() <em>Xpos</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getXpos()
	 * @generated
	 * @ordered
	 */
    protected double xpos = XPOS_EDEFAULT;

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
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
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
    protected KPortImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KGraphPackage.Literals.KPORT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getXpos() {
		return xpos;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setXpos(double newXpos) {
		double oldXpos = xpos;
		xpos = newXpos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPORT__XPOS, oldXpos, xpos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPORT__YPOS, oldYpos, ypos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPORT__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPORT__HEIGHT, oldHeight, height));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KNode getContainer() {
		if (eContainerFeatureID() != KGraphPackage.KPORT__CONTAINER) return null;
		return (KNode)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetContainer(KNode newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, KGraphPackage.KPORT__CONTAINER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContainer(KNode newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != KGraphPackage.KPORT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, KGraphPackage.KNODE__PORTS, KNode.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPORT__CONTAINER, newContainer, newContainer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List<KEdge> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectWithInverseResolvingEList<KEdge>(KEdge.class, this, KGraphPackage.KPORT__OUTGOING_EDGES, KGraphPackage.KEDGE__SOURCE_PORT);
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
			incomingEdges = new EObjectWithInverseResolvingEList<KEdge>(KEdge.class, this, KGraphPackage.KPORT__INCOMING_EDGES, KGraphPackage.KEDGE__TARGET_PORT);
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
			case KGraphPackage.KPORT__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((KNode)otherEnd, msgs);
			case KGraphPackage.KPORT__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
			case KGraphPackage.KPORT__INCOMING_EDGES:
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
			case KGraphPackage.KPORT__CONTAINER:
				return basicSetContainer(null, msgs);
			case KGraphPackage.KPORT__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case KGraphPackage.KPORT__INCOMING_EDGES:
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
			case KGraphPackage.KPORT__CONTAINER:
				return eInternalContainer().eInverseRemove(this, KGraphPackage.KNODE__PORTS, KNode.class, msgs);
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
			case KGraphPackage.KPORT__XPOS:
				return getXpos();
			case KGraphPackage.KPORT__YPOS:
				return getYpos();
			case KGraphPackage.KPORT__WIDTH:
				return getWidth();
			case KGraphPackage.KPORT__HEIGHT:
				return getHeight();
			case KGraphPackage.KPORT__CONTAINER:
				return getContainer();
			case KGraphPackage.KPORT__OUTGOING_EDGES:
				return getOutgoingEdges();
			case KGraphPackage.KPORT__INCOMING_EDGES:
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
			case KGraphPackage.KPORT__XPOS:
				setXpos((Double)newValue);
				return;
			case KGraphPackage.KPORT__YPOS:
				setYpos((Double)newValue);
				return;
			case KGraphPackage.KPORT__WIDTH:
				setWidth((Double)newValue);
				return;
			case KGraphPackage.KPORT__HEIGHT:
				setHeight((Double)newValue);
				return;
			case KGraphPackage.KPORT__CONTAINER:
				setContainer((KNode)newValue);
				return;
			case KGraphPackage.KPORT__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends KEdge>)newValue);
				return;
			case KGraphPackage.KPORT__INCOMING_EDGES:
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
			case KGraphPackage.KPORT__XPOS:
				setXpos(XPOS_EDEFAULT);
				return;
			case KGraphPackage.KPORT__YPOS:
				setYpos(YPOS_EDEFAULT);
				return;
			case KGraphPackage.KPORT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case KGraphPackage.KPORT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case KGraphPackage.KPORT__CONTAINER:
				setContainer((KNode)null);
				return;
			case KGraphPackage.KPORT__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case KGraphPackage.KPORT__INCOMING_EDGES:
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
			case KGraphPackage.KPORT__XPOS:
				return xpos != XPOS_EDEFAULT;
			case KGraphPackage.KPORT__YPOS:
				return ypos != YPOS_EDEFAULT;
			case KGraphPackage.KPORT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case KGraphPackage.KPORT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case KGraphPackage.KPORT__CONTAINER:
				return getContainer() != null;
			case KGraphPackage.KPORT__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case KGraphPackage.KPORT__INCOMING_EDGES:
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
				case KGraphPackage.KPORT__XPOS: return KGraphPackage.KSHAPE_LAYOUT__XPOS;
				case KGraphPackage.KPORT__YPOS: return KGraphPackage.KSHAPE_LAYOUT__YPOS;
				case KGraphPackage.KPORT__WIDTH: return KGraphPackage.KSHAPE_LAYOUT__WIDTH;
				case KGraphPackage.KPORT__HEIGHT: return KGraphPackage.KSHAPE_LAYOUT__HEIGHT;
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
				case KGraphPackage.KSHAPE_LAYOUT__XPOS: return KGraphPackage.KPORT__XPOS;
				case KGraphPackage.KSHAPE_LAYOUT__YPOS: return KGraphPackage.KPORT__YPOS;
				case KGraphPackage.KSHAPE_LAYOUT__WIDTH: return KGraphPackage.KPORT__WIDTH;
				case KGraphPackage.KSHAPE_LAYOUT__HEIGHT: return KGraphPackage.KPORT__HEIGHT;
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
		result.append(" (xpos: ");
		result.append(xpos);
		result.append(", ypos: ");
		result.append(ypos);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //KPortImpl
