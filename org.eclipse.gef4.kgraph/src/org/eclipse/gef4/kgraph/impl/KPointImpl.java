/**
 */
package org.eclipse.gef4.kgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPointImpl#getXpos <em>Xpos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KPointImpl#getYpos <em>Ypos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPointImpl extends MinimalEObjectImpl.Container implements KPoint {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KGraphPackage.Literals.KPOINT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPOINT__XPOS, oldXpos, xpos));
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
            eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KPOINT__YPOS, oldYpos, ypos));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KGraphPackage.KPOINT__XPOS:
                return getXpos();
            case KGraphPackage.KPOINT__YPOS:
                return getYpos();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case KGraphPackage.KPOINT__XPOS:
                setXpos((Double)newValue);
                return;
            case KGraphPackage.KPOINT__YPOS:
                setYpos((Double)newValue);
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
            case KGraphPackage.KPOINT__XPOS:
                setXpos(XPOS_EDEFAULT);
                return;
            case KGraphPackage.KPOINT__YPOS:
                setYpos(YPOS_EDEFAULT);
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
            case KGraphPackage.KPOINT__XPOS:
                return xpos != XPOS_EDEFAULT;
            case KGraphPackage.KPOINT__YPOS:
                return ypos != YPOS_EDEFAULT;
        }
        return super.eIsSet(featureID);
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
        result.append(')');
        return result.toString();
    }

} //KPointImpl
