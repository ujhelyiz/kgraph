/**
 */
package org.eclipse.gef4.kgraph.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gef4.kgraph.KEdge;
import org.eclipse.gef4.kgraph.KEdgeLayout;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KNode;
import org.eclipse.gef4.kgraph.KPoint;
import org.eclipse.gef4.kgraph.KPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KEdge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getSourcePoint <em>Source Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getTargetPoint <em>Target Point</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KEdgeImpl#getBendPoints <em>Bend Points</em>}</li>
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
     * The cached value of the '{@link #getSourcePoint() <em>Source Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourcePoint()
     * @generated
     * @ordered
     */
    protected KPoint sourcePoint;

    /**
     * The cached value of the '{@link #getTargetPoint() <em>Target Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPoint()
     * @generated
     * @ordered
     */
    protected KPoint targetPoint;

    /**
     * The cached value of the '{@link #getBendPoints() <em>Bend Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBendPoints()
     * @generated
     * @ordered
     */
    protected EList<KPoint> bendPoints;

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
    public KPoint getSourcePoint() {
        return sourcePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourcePoint(KPoint newSourcePoint, NotificationChain msgs) {
        KPoint oldSourcePoint = sourcePoint;
        sourcePoint = newSourcePoint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__SOURCE_POINT, oldSourcePoint, newSourcePoint);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourcePoint(KPoint newSourcePoint) {
        if (newSourcePoint != sourcePoint) {
            NotificationChain msgs = null;
            if (sourcePoint != null)
                msgs = ((InternalEObject)sourcePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KGraphPackage.KEDGE__SOURCE_POINT, null, msgs);
            if (newSourcePoint != null)
                msgs = ((InternalEObject)newSourcePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KGraphPackage.KEDGE__SOURCE_POINT, null, msgs);
            msgs = basicSetSourcePoint(newSourcePoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__SOURCE_POINT, newSourcePoint, newSourcePoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KPoint getTargetPoint() {
        return targetPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTargetPoint(KPoint newTargetPoint, NotificationChain msgs) {
        KPoint oldTargetPoint = targetPoint;
        targetPoint = newTargetPoint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__TARGET_POINT, oldTargetPoint, newTargetPoint);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetPoint(KPoint newTargetPoint) {
        if (newTargetPoint != targetPoint) {
            NotificationChain msgs = null;
            if (targetPoint != null)
                msgs = ((InternalEObject)targetPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KGraphPackage.KEDGE__TARGET_POINT, null, msgs);
            if (newTargetPoint != null)
                msgs = ((InternalEObject)newTargetPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KGraphPackage.KEDGE__TARGET_POINT, null, msgs);
            msgs = basicSetTargetPoint(newTargetPoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KEDGE__TARGET_POINT, newTargetPoint, newTargetPoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KPoint> getBendPoints() {
        if (bendPoints == null) {
            bendPoints = new EObjectContainmentEList<KPoint>(KPoint.class, this, KGraphPackage.KEDGE__BEND_POINTS);
        }
        return bendPoints;
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
            if (EcoreUtil.isAncestor(this, newSourceNode))
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
        if (targetNode != null && targetNode.eIsProxy()) {
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
        if (sourcePort != null && sourcePort.eIsProxy()) {
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
        if (targetPort != null && targetPort.eIsProxy()) {
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
            case KGraphPackage.KEDGE__SOURCE_POINT:
                return basicSetSourcePoint(null, msgs);
            case KGraphPackage.KEDGE__TARGET_POINT:
                return basicSetTargetPoint(null, msgs);
            case KGraphPackage.KEDGE__BEND_POINTS:
                return ((InternalEList<?>)getBendPoints()).basicRemove(otherEnd, msgs);
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
            case KGraphPackage.KEDGE__SOURCE_POINT:
                return getSourcePoint();
            case KGraphPackage.KEDGE__TARGET_POINT:
                return getTargetPoint();
            case KGraphPackage.KEDGE__BEND_POINTS:
                return getBendPoints();
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
            case KGraphPackage.KEDGE__SOURCE_POINT:
                setSourcePoint((KPoint)newValue);
                return;
            case KGraphPackage.KEDGE__TARGET_POINT:
                setTargetPoint((KPoint)newValue);
                return;
            case KGraphPackage.KEDGE__BEND_POINTS:
                getBendPoints().clear();
                getBendPoints().addAll((Collection<? extends KPoint>)newValue);
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
            case KGraphPackage.KEDGE__SOURCE_POINT:
                setSourcePoint((KPoint)null);
                return;
            case KGraphPackage.KEDGE__TARGET_POINT:
                setTargetPoint((KPoint)null);
                return;
            case KGraphPackage.KEDGE__BEND_POINTS:
                getBendPoints().clear();
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
            case KGraphPackage.KEDGE__SOURCE_POINT:
                return sourcePoint != null;
            case KGraphPackage.KEDGE__TARGET_POINT:
                return targetPoint != null;
            case KGraphPackage.KEDGE__BEND_POINTS:
                return bendPoints != null && !bendPoints.isEmpty();
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
                case KGraphPackage.KEDGE__SOURCE_POINT: return KGraphPackage.KEDGE_LAYOUT__SOURCE_POINT;
                case KGraphPackage.KEDGE__TARGET_POINT: return KGraphPackage.KEDGE_LAYOUT__TARGET_POINT;
                case KGraphPackage.KEDGE__BEND_POINTS: return KGraphPackage.KEDGE_LAYOUT__BEND_POINTS;
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
                case KGraphPackage.KEDGE_LAYOUT__SOURCE_POINT: return KGraphPackage.KEDGE__SOURCE_POINT;
                case KGraphPackage.KEDGE_LAYOUT__TARGET_POINT: return KGraphPackage.KEDGE__TARGET_POINT;
                case KGraphPackage.KEDGE_LAYOUT__BEND_POINTS: return KGraphPackage.KEDGE__BEND_POINTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //KEdgeImpl
