/**
 */
package ClassDiagram.impl;

import ClassDiagram.Association;
import ClassDiagram.BooleanType;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.IntegerType;
import ClassDiagram.Interface;
import ClassDiagram.ModelBase;
import ClassDiagram.StringType;
import ClassDiagram.VoidType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getVoidT <em>Void T</em>}</li>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getStringT <em>String T</em>}</li>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getIntT <em>Int T</em>}</li>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getBoolT <em>Bool T</em>}</li>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getAllClasses <em>All Classes</em>}</li>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getAllInterfaces <em>All Interfaces</em>}</li>
 *   <li>{@link ClassDiagram.impl.ModelBaseImpl#getAllAssociations <em>All Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelBaseImpl extends MinimalEObjectImpl.Container implements ModelBase {
	/**
	 * The cached value of the '{@link #getVoidT() <em>Void T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoidT()
	 * @generated
	 * @ordered
	 */
	protected VoidType voidT;

	/**
	 * The cached value of the '{@link #getStringT() <em>String T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringT()
	 * @generated
	 * @ordered
	 */
	protected StringType stringT;

	/**
	 * The cached value of the '{@link #getIntT() <em>Int T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntT()
	 * @generated
	 * @ordered
	 */
	protected IntegerType intT;

	/**
	 * The cached value of the '{@link #getBoolT() <em>Bool T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolT()
	 * @generated
	 * @ordered
	 */
	protected BooleanType boolT;

	/**
	 * The cached value of the '{@link #getAllClasses() <em>All Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDiagram.Class> allClasses;

	/**
	 * The cached value of the '{@link #getAllInterfaces() <em>All Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> allInterfaces;

	/**
	 * The cached value of the '{@link #getAllAssociations() <em>All Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> allAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.MODEL_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType getVoidT() {
		return voidT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoidT(VoidType newVoidT, NotificationChain msgs) {
		VoidType oldVoidT = voidT;
		voidT = newVoidT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__VOID_T, oldVoidT, newVoidT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoidT(VoidType newVoidT) {
		if (newVoidT != voidT) {
			NotificationChain msgs = null;
			if (voidT != null)
				msgs = ((InternalEObject)voidT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__VOID_T, null, msgs);
			if (newVoidT != null)
				msgs = ((InternalEObject)newVoidT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__VOID_T, null, msgs);
			msgs = basicSetVoidT(newVoidT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__VOID_T, newVoidT, newVoidT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringType getStringT() {
		return stringT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringT(StringType newStringT, NotificationChain msgs) {
		StringType oldStringT = stringT;
		stringT = newStringT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__STRING_T, oldStringT, newStringT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringT(StringType newStringT) {
		if (newStringT != stringT) {
			NotificationChain msgs = null;
			if (stringT != null)
				msgs = ((InternalEObject)stringT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__STRING_T, null, msgs);
			if (newStringT != null)
				msgs = ((InternalEObject)newStringT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__STRING_T, null, msgs);
			msgs = basicSetStringT(newStringT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__STRING_T, newStringT, newStringT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerType getIntT() {
		return intT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntT(IntegerType newIntT, NotificationChain msgs) {
		IntegerType oldIntT = intT;
		intT = newIntT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__INT_T, oldIntT, newIntT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntT(IntegerType newIntT) {
		if (newIntT != intT) {
			NotificationChain msgs = null;
			if (intT != null)
				msgs = ((InternalEObject)intT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__INT_T, null, msgs);
			if (newIntT != null)
				msgs = ((InternalEObject)newIntT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__INT_T, null, msgs);
			msgs = basicSetIntT(newIntT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__INT_T, newIntT, newIntT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanType getBoolT() {
		return boolT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolT(BooleanType newBoolT, NotificationChain msgs) {
		BooleanType oldBoolT = boolT;
		boolT = newBoolT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__BOOL_T, oldBoolT, newBoolT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoolT(BooleanType newBoolT) {
		if (newBoolT != boolT) {
			NotificationChain msgs = null;
			if (boolT != null)
				msgs = ((InternalEObject)boolT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__BOOL_T, null, msgs);
			if (newBoolT != null)
				msgs = ((InternalEObject)newBoolT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.MODEL_BASE__BOOL_T, null, msgs);
			msgs = basicSetBoolT(newBoolT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MODEL_BASE__BOOL_T, newBoolT, newBoolT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDiagram.Class> getAllClasses() {
		if (allClasses == null) {
			allClasses = new EObjectContainmentEList<ClassDiagram.Class>(ClassDiagram.Class.class, this, ClassDiagramPackage.MODEL_BASE__ALL_CLASSES);
		}
		return allClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getAllInterfaces() {
		if (allInterfaces == null) {
			allInterfaces = new EObjectContainmentEList<Interface>(Interface.class, this, ClassDiagramPackage.MODEL_BASE__ALL_INTERFACES);
		}
		return allInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAllAssociations() {
		if (allAssociations == null) {
			allAssociations = new EObjectContainmentEList<Association>(Association.class, this, ClassDiagramPackage.MODEL_BASE__ALL_ASSOCIATIONS);
		}
		return allAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassDiagramPackage.MODEL_BASE__VOID_T:
				return basicSetVoidT(null, msgs);
			case ClassDiagramPackage.MODEL_BASE__STRING_T:
				return basicSetStringT(null, msgs);
			case ClassDiagramPackage.MODEL_BASE__INT_T:
				return basicSetIntT(null, msgs);
			case ClassDiagramPackage.MODEL_BASE__BOOL_T:
				return basicSetBoolT(null, msgs);
			case ClassDiagramPackage.MODEL_BASE__ALL_CLASSES:
				return ((InternalEList<?>)getAllClasses()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.MODEL_BASE__ALL_INTERFACES:
				return ((InternalEList<?>)getAllInterfaces()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.MODEL_BASE__ALL_ASSOCIATIONS:
				return ((InternalEList<?>)getAllAssociations()).basicRemove(otherEnd, msgs);
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
			case ClassDiagramPackage.MODEL_BASE__VOID_T:
				return getVoidT();
			case ClassDiagramPackage.MODEL_BASE__STRING_T:
				return getStringT();
			case ClassDiagramPackage.MODEL_BASE__INT_T:
				return getIntT();
			case ClassDiagramPackage.MODEL_BASE__BOOL_T:
				return getBoolT();
			case ClassDiagramPackage.MODEL_BASE__ALL_CLASSES:
				return getAllClasses();
			case ClassDiagramPackage.MODEL_BASE__ALL_INTERFACES:
				return getAllInterfaces();
			case ClassDiagramPackage.MODEL_BASE__ALL_ASSOCIATIONS:
				return getAllAssociations();
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
			case ClassDiagramPackage.MODEL_BASE__VOID_T:
				setVoidT((VoidType)newValue);
				return;
			case ClassDiagramPackage.MODEL_BASE__STRING_T:
				setStringT((StringType)newValue);
				return;
			case ClassDiagramPackage.MODEL_BASE__INT_T:
				setIntT((IntegerType)newValue);
				return;
			case ClassDiagramPackage.MODEL_BASE__BOOL_T:
				setBoolT((BooleanType)newValue);
				return;
			case ClassDiagramPackage.MODEL_BASE__ALL_CLASSES:
				getAllClasses().clear();
				getAllClasses().addAll((Collection<? extends ClassDiagram.Class>)newValue);
				return;
			case ClassDiagramPackage.MODEL_BASE__ALL_INTERFACES:
				getAllInterfaces().clear();
				getAllInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ClassDiagramPackage.MODEL_BASE__ALL_ASSOCIATIONS:
				getAllAssociations().clear();
				getAllAssociations().addAll((Collection<? extends Association>)newValue);
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
			case ClassDiagramPackage.MODEL_BASE__VOID_T:
				setVoidT((VoidType)null);
				return;
			case ClassDiagramPackage.MODEL_BASE__STRING_T:
				setStringT((StringType)null);
				return;
			case ClassDiagramPackage.MODEL_BASE__INT_T:
				setIntT((IntegerType)null);
				return;
			case ClassDiagramPackage.MODEL_BASE__BOOL_T:
				setBoolT((BooleanType)null);
				return;
			case ClassDiagramPackage.MODEL_BASE__ALL_CLASSES:
				getAllClasses().clear();
				return;
			case ClassDiagramPackage.MODEL_BASE__ALL_INTERFACES:
				getAllInterfaces().clear();
				return;
			case ClassDiagramPackage.MODEL_BASE__ALL_ASSOCIATIONS:
				getAllAssociations().clear();
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
			case ClassDiagramPackage.MODEL_BASE__VOID_T:
				return voidT != null;
			case ClassDiagramPackage.MODEL_BASE__STRING_T:
				return stringT != null;
			case ClassDiagramPackage.MODEL_BASE__INT_T:
				return intT != null;
			case ClassDiagramPackage.MODEL_BASE__BOOL_T:
				return boolT != null;
			case ClassDiagramPackage.MODEL_BASE__ALL_CLASSES:
				return allClasses != null && !allClasses.isEmpty();
			case ClassDiagramPackage.MODEL_BASE__ALL_INTERFACES:
				return allInterfaces != null && !allInterfaces.isEmpty();
			case ClassDiagramPackage.MODEL_BASE__ALL_ASSOCIATIONS:
				return allAssociations != null && !allAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelBaseImpl
