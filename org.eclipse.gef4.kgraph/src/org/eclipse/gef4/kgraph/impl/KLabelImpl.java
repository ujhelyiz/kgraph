/**
 */
package org.eclipse.gef4.kgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef4.kgraph.KGraphPackage;
import org.eclipse.gef4.kgraph.KLabel;
import org.eclipse.gef4.kgraph.KLabeledGraphElement;
import org.eclipse.gef4.kgraph.KShapeLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KLabel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KLabelImpl#getXpos <em>Xpos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KLabelImpl#getYpos <em>Ypos</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KLabelImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KLabelImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KLabelImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gef4.kgraph.impl.KLabelImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KLabelImpl extends KGraphElementImpl implements KLabel {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
    protected static final String TEXT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
    protected String text = TEXT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KLabelImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return KGraphPackage.Literals.KLABEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KLABEL__XPOS, oldXpos, xpos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KLABEL__YPOS, oldYpos, ypos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KLABEL__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KLABEL__HEIGHT, oldHeight, height));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getText() {
		return text;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KLABEL__TEXT, oldText, text));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KLabeledGraphElement getContainer() {
		if (eContainerFeatureID() != KGraphPackage.KLABEL__CONTAINER) return null;
		return (KLabeledGraphElement)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetContainer(KLabeledGraphElement newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, KGraphPackage.KLABEL__CONTAINER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContainer(KLabeledGraphElement newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != KGraphPackage.KLABEL__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, KGraphPackage.KLABELED_GRAPH_ELEMENT__LABELS, KLabeledGraphElement.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KGraphPackage.KLABEL__CONTAINER, newContainer, newContainer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KGraphPackage.KLABEL__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((KLabeledGraphElement)otherEnd, msgs);
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
			case KGraphPackage.KLABEL__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case KGraphPackage.KLABEL__CONTAINER:
				return eInternalContainer().eInverseRemove(this, KGraphPackage.KLABELED_GRAPH_ELEMENT__LABELS, KLabeledGraphElement.class, msgs);
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
			case KGraphPackage.KLABEL__XPOS:
				return getXpos();
			case KGraphPackage.KLABEL__YPOS:
				return getYpos();
			case KGraphPackage.KLABEL__WIDTH:
				return getWidth();
			case KGraphPackage.KLABEL__HEIGHT:
				return getHeight();
			case KGraphPackage.KLABEL__TEXT:
				return getText();
			case KGraphPackage.KLABEL__CONTAINER:
				return getContainer();
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
			case KGraphPackage.KLABEL__XPOS:
				setXpos((Double)newValue);
				return;
			case KGraphPackage.KLABEL__YPOS:
				setYpos((Double)newValue);
				return;
			case KGraphPackage.KLABEL__WIDTH:
				setWidth((Double)newValue);
				return;
			case KGraphPackage.KLABEL__HEIGHT:
				setHeight((Double)newValue);
				return;
			case KGraphPackage.KLABEL__TEXT:
				setText((String)newValue);
				return;
			case KGraphPackage.KLABEL__CONTAINER:
				setContainer((KLabeledGraphElement)newValue);
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
			case KGraphPackage.KLABEL__XPOS:
				setXpos(XPOS_EDEFAULT);
				return;
			case KGraphPackage.KLABEL__YPOS:
				setYpos(YPOS_EDEFAULT);
				return;
			case KGraphPackage.KLABEL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case KGraphPackage.KLABEL__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case KGraphPackage.KLABEL__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case KGraphPackage.KLABEL__CONTAINER:
				setContainer((KLabeledGraphElement)null);
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
			case KGraphPackage.KLABEL__XPOS:
				return xpos != XPOS_EDEFAULT;
			case KGraphPackage.KLABEL__YPOS:
				return ypos != YPOS_EDEFAULT;
			case KGraphPackage.KLABEL__WIDTH:
				return width != WIDTH_EDEFAULT;
			case KGraphPackage.KLABEL__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case KGraphPackage.KLABEL__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case KGraphPackage.KLABEL__CONTAINER:
				return getContainer() != null;
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
				case KGraphPackage.KLABEL__XPOS: return KGraphPackage.KSHAPE_LAYOUT__XPOS;
				case KGraphPackage.KLABEL__YPOS: return KGraphPackage.KSHAPE_LAYOUT__YPOS;
				case KGraphPackage.KLABEL__WIDTH: return KGraphPackage.KSHAPE_LAYOUT__WIDTH;
				case KGraphPackage.KLABEL__HEIGHT: return KGraphPackage.KSHAPE_LAYOUT__HEIGHT;
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
				case KGraphPackage.KSHAPE_LAYOUT__XPOS: return KGraphPackage.KLABEL__XPOS;
				case KGraphPackage.KSHAPE_LAYOUT__YPOS: return KGraphPackage.KLABEL__YPOS;
				case KGraphPackage.KSHAPE_LAYOUT__WIDTH: return KGraphPackage.KLABEL__WIDTH;
				case KGraphPackage.KSHAPE_LAYOUT__HEIGHT: return KGraphPackage.KLABEL__HEIGHT;
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
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //KLabelImpl
