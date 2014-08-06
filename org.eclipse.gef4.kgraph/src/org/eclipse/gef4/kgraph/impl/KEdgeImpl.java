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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef4.geometry.planar.Point;
import org.eclipse.gef4.kgraph.KEdge;
import org.eclipse.gef4.kgraph.KEdgeLayout;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KNode;
import org.eclipse.gef4.kgraph.KPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KEdge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getWayPoints <em>Way Points</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KEdgeImpl extends KLabeledGraphElementImpl implements KEdge {
    /**
	 * The default value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point START_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPoint() <em>Start Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPoint()
	 * @generated
	 * @ordered
	 */
	protected Point startPoint = START_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Point END_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected Point endPoint = END_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWayPoints() <em>Way Points</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> wayPoints;

				/**
	 * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTargetNode()
	 * @generated
	 * @ordered
	 */
    protected KNode targetNode;

    /**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
    protected KPort sourcePort;

    /**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
    protected KPort targetPort;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KEdgeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KGraphPackage.Literals.KEDGE;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getStartPoint() {
		return startPoint;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPoint(Point newStartPoint) {
		Point oldStartPoint = startPoint;
		startPoint = newStartPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__START_POINT, oldStartPoint, startPoint));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getEndPoint() {
		return endPoint;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPoint(Point newEndPoint) {
		Point oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__END_POINT, oldEndPoint, endPoint));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Point> getWayPoints() {
		if (wayPoints == null) {
			wayPoints = new EDataTypeUniqueEList<Point>(Point.class, this, KGraphPackage.KEDGE__WAY_POINTS);
		}
		return wayPoints;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KNode getSourceNode() {
		if (eContainerFeatureID() != KGraphPackage.KEDGE__SOURCE_NODE) return null;
		return (KNode)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSourceNode(KNode newSourceNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceNode, KGraphPackage.KEDGE__SOURCE_NODE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSourceNode(KNode newSourceNode) {
		if (newSourceNode != eInternalContainer() || (eContainerFeatureID() != KGraphPackage.KEDGE__SOURCE_NODE && newSourceNode != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newSourceNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceNode != null)
				msgs = ((InternalEObject)newSourceNode).eInverseAdd(this, KGraphPackage.KNODE__OUTGOING_EDGES, KNode.class, msgs);
			msgs = basicSetSourceNode(newSourceNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__SOURCE_NODE, newSourceNode, newSourceNode));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KNode getTargetNode() {
		if (targetNode != null && ((EObject)targetNode).eIsProxy()) {
			InternalEObject oldTargetNode = (InternalEObject)targetNode;
			targetNode = (KNode)eResolveProxy(oldTargetNode);
			if (targetNode != oldTargetNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KGraphPackage.KEDGE__TARGET_NODE, oldTargetNode, targetNode));
			}
		}
		return targetNode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KNode basicGetTargetNode() {
		return targetNode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTargetNode(KNode newTargetNode, NotificationChain msgs) {
		KNode oldTargetNode = targetNode;
		targetNode = newTargetNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__TARGET_NODE, oldTargetNode, newTargetNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTargetNode(KNode newTargetNode) {
		if (newTargetNode != targetNode) {
			NotificationChain msgs = null;
			if (targetNode != null)
				msgs = ((InternalEObject)targetNode).eInverseRemove(this, KGraphPackage.KNODE__INCOMING_EDGES, KNode.class, msgs);
			if (newTargetNode != null)
				msgs = ((InternalEObject)newTargetNode).eInverseAdd(this, KGraphPackage.KNODE__INCOMING_EDGES, KNode.class, msgs);
			msgs = basicSetTargetNode(newTargetNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__TARGET_NODE, newTargetNode, newTargetNode));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KPort getSourcePort() {
		if (sourcePort != null && ((EObject)sourcePort).eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (KPort)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KGraphPackage.KEDGE__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KPort basicGetSourcePort() {
		return sourcePort;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSourcePort(KPort newSourcePort, NotificationChain msgs) {
		KPort oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__SOURCE_PORT, oldSourcePort, newSourcePort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSourcePort(KPort newSourcePort) {
		if (newSourcePort != sourcePort) {
			NotificationChain msgs = null;
			if (sourcePort != null)
				msgs = ((InternalEObject)sourcePort).eInverseRemove(this, KGraphPackage.KPORT__OUTGOING_EDGES, KPort.class, msgs);
			if (newSourcePort != null)
				msgs = ((InternalEObject)newSourcePort).eInverseAdd(this, KGraphPackage.KPORT__OUTGOING_EDGES, KPort.class, msgs);
			msgs = basicSetSourcePort(newSourcePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__SOURCE_PORT, newSourcePort, newSourcePort));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KPort getTargetPort() {
		if (targetPort != null && ((EObject)targetPort).eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (KPort)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KGraphPackage.KEDGE__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KPort basicGetTargetPort() {
		return targetPort;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTargetPort(KPort newTargetPort, NotificationChain msgs) {
		KPort oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__TARGET_PORT, oldTargetPort, newTargetPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTargetPort(KPort newTargetPort) {
		if (newTargetPort != targetPort) {
			NotificationChain msgs = null;
			if (targetPort != null)
				msgs = ((InternalEObject)targetPort).eInverseRemove(this, KGraphPackage.KPORT__INCOMING_EDGES, KPort.class, msgs);
			if (newTargetPort != null)
				msgs = ((InternalEObject)newTargetPort).eInverseAdd(this, KGraphPackage.KPORT__INCOMING_EDGES, KPort.class, msgs);
			msgs = basicSetTargetPort(newTargetPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__TARGET_PORT, newTargetPort, newTargetPort));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KGraphPackage.KEDGE__SOURCE_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceNode((KNode)otherEnd, msgs);
			case KGraphPackage.KEDGE__TARGET_NODE:
				if (targetNode != null)
					msgs = ((InternalEObject)targetNode).eInverseRemove(this, KGraphPackage.KNODE__INCOMING_EDGES, KNode.class, msgs);
				return basicSetTargetNode((KNode)otherEnd, msgs);
			case KGraphPackage.KEDGE__SOURCE_PORT:
				if (sourcePort != null)
					msgs = ((InternalEObject)sourcePort).eInverseRemove(this, KGraphPackage.KPORT__OUTGOING_EDGES, KPort.class, msgs);
				return basicSetSourcePort((KPort)otherEnd, msgs);
			case KGraphPackage.KEDGE__TARGET_PORT:
				if (targetPort != null)
					msgs = ((InternalEObject)targetPort).eInverseRemove(this, KGraphPackage.KPORT__INCOMING_EDGES, KPort.class, msgs);
				return basicSetTargetPort((KPort)otherEnd, msgs);
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
			case KGraphPackage.KEDGE__SOURCE_NODE:
				return basicSetSourceNode(null, msgs);
			case KGraphPackage.KEDGE__TARGET_NODE:
				return basicSetTargetNode(null, msgs);
			case KGraphPackage.KEDGE__SOURCE_PORT:
				return basicSetSourcePort(null, msgs);
			case KGraphPackage.KEDGE__TARGET_PORT:
				return basicSetTargetPort(null, msgs);
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
			case KGraphPackage.KEDGE__SOURCE_NODE:
				return eInternalContainer().eInverseRemove(this, KGraphPackage.KNODE__OUTGOING_EDGES, KNode.class, msgs);
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
			case KGraphPackage.KEDGE__START_POINT:
				return getStartPoint();
			case KGraphPackage.KEDGE__END_POINT:
				return getEndPoint();
			case KGraphPackage.KEDGE__WAY_POINTS:
				return getWayPoints();
			case KGraphPackage.KEDGE__SOURCE_NODE:
				return getSourceNode();
			case KGraphPackage.KEDGE__TARGET_NODE:
				if (resolve) return getTargetNode();
				return basicGetTargetNode();
			case KGraphPackage.KEDGE__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case KGraphPackage.KEDGE__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
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
			case KGraphPackage.KEDGE__START_POINT:
				setStartPoint((Point)newValue);
				return;
			case KGraphPackage.KEDGE__END_POINT:
				setEndPoint((Point)newValue);
				return;
			case KGraphPackage.KEDGE__WAY_POINTS:
				getWayPoints().clear();
				getWayPoints().addAll((Collection<? extends Point>)newValue);
				return;
			case KGraphPackage.KEDGE__SOURCE_NODE:
				setSourceNode((KNode)newValue);
				return;
			case KGraphPackage.KEDGE__TARGET_NODE:
				setTargetNode((KNode)newValue);
				return;
			case KGraphPackage.KEDGE__SOURCE_PORT:
				setSourcePort((KPort)newValue);
				return;
			case KGraphPackage.KEDGE__TARGET_PORT:
				setTargetPort((KPort)newValue);
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
			case KGraphPackage.KEDGE__START_POINT:
				setStartPoint(START_POINT_EDEFAULT);
				return;
			case KGraphPackage.KEDGE__END_POINT:
				setEndPoint(END_POINT_EDEFAULT);
				return;
			case KGraphPackage.KEDGE__WAY_POINTS:
				getWayPoints().clear();
				return;
			case KGraphPackage.KEDGE__SOURCE_NODE:
				setSourceNode((KNode)null);
				return;
			case KGraphPackage.KEDGE__TARGET_NODE:
				setTargetNode((KNode)null);
				return;
			case KGraphPackage.KEDGE__SOURCE_PORT:
				setSourcePort((KPort)null);
				return;
			case KGraphPackage.KEDGE__TARGET_PORT:
				setTargetPort((KPort)null);
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
			case KGraphPackage.KEDGE__START_POINT:
				return START_POINT_EDEFAULT == null ? startPoint != null : !START_POINT_EDEFAULT.equals(startPoint);
			case KGraphPackage.KEDGE__END_POINT:
				return END_POINT_EDEFAULT == null ? endPoint != null : !END_POINT_EDEFAULT.equals(endPoint);
			case KGraphPackage.KEDGE__WAY_POINTS:
				return wayPoints != null && !wayPoints.isEmpty();
			case KGraphPackage.KEDGE__SOURCE_NODE:
				return getSourceNode() != null;
			case KGraphPackage.KEDGE__TARGET_NODE:
				return targetNode != null;
			case KGraphPackage.KEDGE__SOURCE_PORT:
				return sourcePort != null;
			case KGraphPackage.KEDGE__TARGET_PORT:
				return targetPort != null;
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
		if (baseClass == KEdgeLayout.class) {
			switch (derivedFeatureID) {
				case KGraphPackage.KEDGE__START_POINT: return KGraphPackage.KEDGE_LAYOUT__START_POINT;
				case KGraphPackage.KEDGE__END_POINT: return KGraphPackage.KEDGE_LAYOUT__END_POINT;
				case KGraphPackage.KEDGE__WAY_POINTS: return KGraphPackage.KEDGE_LAYOUT__WAY_POINTS;
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
		if (baseClass == KEdgeLayout.class) {
			switch (baseFeatureID) {
				case KGraphPackage.KEDGE_LAYOUT__START_POINT: return KGraphPackage.KEDGE__START_POINT;
				case KGraphPackage.KEDGE_LAYOUT__END_POINT: return KGraphPackage.KEDGE__END_POINT;
				case KGraphPackage.KEDGE_LAYOUT__WAY_POINTS: return KGraphPackage.KEDGE__WAY_POINTS;
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
		result.append(" (startPoint: ");
		result.append(startPoint);
		result.append(", endPoint: ");
		result.append(endPoint);
		result.append(", wayPoints: ");
		result.append(wayPoints);
		result.append(')');
		return result.toString();
	}

} //KEdgeImpl
