/**
 */
package ClassDiagram.impl;

import ClassDiagram.Attribute;
import ClassDiagram.AttributeReference;
import ClassDiagram.ClassDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.AttributeReferenceImpl#getAtttribute <em>Atttribute</em>}</li>
 *   <li>{@link ClassDiagram.impl.AttributeReferenceImpl#get_name <em>name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeReferenceImpl extends ExpressionElementImpl implements AttributeReference {
	/**
	 * The cached value of the '{@link #getAtttribute() <em>Atttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute atttribute;

	/**
	 * The default value of the '{@link #get_name() <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_name()
	 * @generated
	 * @ordered
	 */
	protected static final String _NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_name() <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_name()
	 * @generated
	 * @ordered
	 */
	protected String _name = _NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ATTRIBUTE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAtttribute() {
		if (atttribute != null && atttribute.eIsProxy()) {
			InternalEObject oldAtttribute = (InternalEObject)atttribute;
			atttribute = (Attribute)eResolveProxy(oldAtttribute);
			if (atttribute != oldAtttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ATTRIBUTE_REFERENCE__ATTTRIBUTE, oldAtttribute, atttribute));
			}
		}
		return atttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAtttribute() {
		return atttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtttribute(Attribute newAtttribute) {
		Attribute oldAtttribute = atttribute;
		atttribute = newAtttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTRIBUTE_REFERENCE__ATTTRIBUTE, oldAtttribute, atttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String get_name() {
		return _name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set_name(String new_name) {
		String old_name = _name;
		_name = new_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTRIBUTE_REFERENCE__NAME, old_name, _name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__ATTTRIBUTE:
				if (resolve) return getAtttribute();
				return basicGetAtttribute();
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__NAME:
				return get_name();
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
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__ATTTRIBUTE:
				setAtttribute((Attribute)newValue);
				return;
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__NAME:
				set_name((String)newValue);
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
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__ATTTRIBUTE:
				setAtttribute((Attribute)null);
				return;
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__NAME:
				set_name(_NAME_EDEFAULT);
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
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__ATTTRIBUTE:
				return atttribute != null;
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE__NAME:
				return _NAME_EDEFAULT == null ? _name != null : !_NAME_EDEFAULT.equals(_name);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (_name: ");
		result.append(_name);
		result.append(')');
		return result.toString();
	}

} //AttributeReferenceImpl
