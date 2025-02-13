/**
 */
package ClassDiagram.impl;

import ClassDiagram.Association;
import ClassDiagram.AssociationEnd;
import ClassDiagram.ClassDiagramPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.AssociationEndImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ClassDiagram.impl.AssociationEndImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ClassDiagram.impl.AssociationEndImpl#get_class <em>class</em>}</li>
 *   <li>{@link ClassDiagram.impl.AssociationEndImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationEndImpl extends NamedElementImpl implements AssociationEnd {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #get_class() <em>class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_class()
	 * @generated
	 * @ordered
	 */
	protected ClassDiagram.Class _class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSOCIATION_END__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSOCIATION_END__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDiagram.Class get_class() {
		if (_class != null && _class.eIsProxy()) {
			InternalEObject old_class = (InternalEObject)_class;
			_class = (ClassDiagram.Class)eResolveProxy(old_class);
			if (_class != old_class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ASSOCIATION_END__CLASS, old_class, _class));
			}
		}
		return _class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram.Class basicGet_class() {
		return _class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_class(ClassDiagram.Class new_class, NotificationChain msgs) {
		ClassDiagram.Class old_class = _class;
		_class = new_class;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSOCIATION_END__CLASS, old_class, new_class);
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
	public void set_class(ClassDiagram.Class new_class) {
		if (new_class != _class) {
			NotificationChain msgs = null;
			if (_class != null)
				msgs = ((InternalEObject)_class).eInverseRemove(this, ClassDiagramPackage.CLASS__ASSOCIATIONS, ClassDiagram.Class.class, msgs);
			if (new_class != null)
				msgs = ((InternalEObject)new_class).eInverseAdd(this, ClassDiagramPackage.CLASS__ASSOCIATIONS, ClassDiagram.Class.class, msgs);
			msgs = basicSet_class(new_class, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSOCIATION_END__CLASS, new_class, new_class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getAssociation() {
		if (eContainerFeatureID() != ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION) return null;
		return (Association)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociation, ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(Association newAssociation) {
		if (newAssociation != eInternalContainer() || (eContainerFeatureID() != ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION && newAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newAssociation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, ClassDiagramPackage.ASSOCIATION__ENDS, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassDiagramPackage.ASSOCIATION_END__CLASS:
				if (_class != null)
					msgs = ((InternalEObject)_class).eInverseRemove(this, ClassDiagramPackage.CLASS__ASSOCIATIONS, ClassDiagram.Class.class, msgs);
				return basicSet_class((ClassDiagram.Class)otherEnd, msgs);
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
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
			case ClassDiagramPackage.ASSOCIATION_END__CLASS:
				return basicSet_class(null, msgs);
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				return basicSetAssociation(null, msgs);
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
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				return eInternalContainer().eInverseRemove(this, ClassDiagramPackage.ASSOCIATION__ENDS, Association.class, msgs);
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
			case ClassDiagramPackage.ASSOCIATION_END__LOWER_BOUND:
				return getLowerBound();
			case ClassDiagramPackage.ASSOCIATION_END__UPPER_BOUND:
				return getUpperBound();
			case ClassDiagramPackage.ASSOCIATION_END__CLASS:
				if (resolve) return get_class();
				return basicGet_class();
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				return getAssociation();
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
			case ClassDiagramPackage.ASSOCIATION_END__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case ClassDiagramPackage.ASSOCIATION_END__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case ClassDiagramPackage.ASSOCIATION_END__CLASS:
				set_class((ClassDiagram.Class)newValue);
				return;
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				setAssociation((Association)newValue);
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
			case ClassDiagramPackage.ASSOCIATION_END__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case ClassDiagramPackage.ASSOCIATION_END__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case ClassDiagramPackage.ASSOCIATION_END__CLASS:
				set_class((ClassDiagram.Class)null);
				return;
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				setAssociation((Association)null);
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
			case ClassDiagramPackage.ASSOCIATION_END__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case ClassDiagramPackage.ASSOCIATION_END__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case ClassDiagramPackage.ASSOCIATION_END__CLASS:
				return _class != null;
			case ClassDiagramPackage.ASSOCIATION_END__ASSOCIATION:
				return getAssociation() != null;
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //AssociationEndImpl
