/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.ClassDiagramTables;
import ClassDiagram.Classifier;
import ClassDiagram.Method;
import ClassDiagram.Operation;
import ClassDiagram.Parameter;
import ClassDiagram.Type;

import ClassDiagram.Var;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getReturnVariable <em>Return Variable</em>}</li>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getParamTypes <em>Param Types</em>}</li>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getParamNames <em>Param Names</em>}</li>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ClassDiagram.impl.MethodImpl#getCorps <em>Corps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends NamedElementImpl implements Method {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getReturnVariable() <em>Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVariable()
	 * @generated
	 * @ordered
	 */
	protected Var returnVariable;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getParamTypes() <em>Param Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> paramTypes;

	/**
	 * The cached value of the '{@link #getParamNames() <em>Param Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paramNames;

	/**
	 * The cached value of the '{@link #getCorps() <em>Corps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorps()
	 * @generated
	 * @ordered
	 */
	protected Operation corps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Var getReturnVariable() {
		if (returnVariable != null && returnVariable.eIsProxy()) {
			InternalEObject oldReturnVariable = (InternalEObject)returnVariable;
			returnVariable = (Var)eResolveProxy(oldReturnVariable);
			if (returnVariable != oldReturnVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.METHOD__RETURN_VARIABLE, oldReturnVariable, returnVariable));
			}
		}
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var basicGetReturnVariable() {
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnVariable(Var newReturnVariable) {
		Var oldReturnVariable = returnVariable;
		returnVariable = newReturnVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.METHOD__RETURN_VARIABLE, oldReturnVariable, returnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, ClassDiagramPackage.METHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getParamTypes() {
		if (paramTypes == null) {
			paramTypes = new EObjectResolvingEList<Type>(Type.class, this, ClassDiagramPackage.METHOD__PARAM_TYPES);
		}
		return paramTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParamNames() {
		if (paramNames == null) {
			paramNames = new EDataTypeUniqueEList<String>(String.class, this, ClassDiagramPackage.METHOD__PARAM_NAMES);
		}
		return paramNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getOwner() {
		if (eContainerFeatureID() != ClassDiagramPackage.METHOD__OWNER) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Classifier newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, ClassDiagramPackage.METHOD__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Classifier newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != ClassDiagramPackage.METHOD__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, ClassDiagramPackage.CLASSIFIER__METHODS, Classifier.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.METHOD__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getCorps() {
		return corps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorps(Operation newCorps, NotificationChain msgs) {
		Operation oldCorps = corps;
		corps = newCorps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.METHOD__CORPS, oldCorps, newCorps);
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
	public void setCorps(Operation newCorps) {
		if (newCorps != corps) {
			NotificationChain msgs = null;
			if (corps != null)
				msgs = ((InternalEObject)corps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.METHOD__CORPS, null, msgs);
			if (newCorps != null)
				msgs = ((InternalEObject)newCorps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassDiagramPackage.METHOD__CORPS, null, msgs);
			msgs = basicSetCorps(newCorps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.METHOD__CORPS, newCorps, newCorps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean paramNotVoid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Method::paramNotVoid";
		try {
			/**
			 *
			 * inv paramNotVoid:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.paramTypes->exists(t |
			 *           t.oclIsTypeOf(VoidType))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ClassDiagramPackage.Literals.METHOD___PARAM_NOT_VOID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ClassDiagramTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						final /*@NonInvalid*/ List<Type> paramTypes = this.getParamTypes();
						final /*@NonInvalid*/ OrderedSetValue BOXED_paramTypes = idResolver.createOrderedSetOfAll(ClassDiagramTables.ORD_CLSSid_Type, paramTypes);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_t = BOXED_paramTypes.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_t.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Type t = (Type)ITERATOR_t.next();
							/**
							 * t.oclIsTypeOf(VoidType)
							 */
							/*@Caught*/ Object CAUGHT_oclIsTypeOf;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ClassDiagram_c_c_VoidType_0 = idResolver.getClass(ClassDiagramTables.CLSSid_VoidType, null);
								final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, t, TYP_ClassDiagram_c_c_VoidType_0).booleanValue();
								CAUGHT_oclIsTypeOf = oclIsTypeOf;
							}
							catch (Exception e) {
								CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_oclIsTypeOf == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break;														// Stop immediately
							}
							else if (CAUGHT_oclIsTypeOf == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
								;															// Carry on
							}
							else if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {		// Abnormal exception evaluation result
								accumulator = CAUGHT_oclIsTypeOf;									// Cache an exception failure
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					}
					catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists instanceof InvalidValueException) {
						throw (InvalidValueException)CAUGHT_exists;
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							result = null;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ClassDiagramTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean parametersSize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Method::parametersSize";
		try {
			/**
			 *
			 * inv parametersSize:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.params->size() = self.params->size()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ClassDiagramPackage.Literals.METHOD___PARAMETERS_SIZE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ClassDiagramTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Parameter> params_0 = this.getParams();
				final /*@NonInvalid*/ OrderedSetValue BOXED_params_0 = idResolver.createOrderedSetOfAll(ClassDiagramTables.ORD_CLSSid_Parameter, params_0);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_params_0);
				final /*@NonInvalid*/ boolean result = true;
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ClassDiagramTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassDiagramPackage.METHOD__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Classifier)otherEnd, msgs);
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
			case ClassDiagramPackage.METHOD__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case ClassDiagramPackage.METHOD__OWNER:
				return basicSetOwner(null, msgs);
			case ClassDiagramPackage.METHOD__CORPS:
				return basicSetCorps(null, msgs);
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
			case ClassDiagramPackage.METHOD__OWNER:
				return eInternalContainer().eInverseRemove(this, ClassDiagramPackage.CLASSIFIER__METHODS, Classifier.class, msgs);
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
			case ClassDiagramPackage.METHOD__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case ClassDiagramPackage.METHOD__RETURN_VARIABLE:
				if (resolve) return getReturnVariable();
				return basicGetReturnVariable();
			case ClassDiagramPackage.METHOD__PARAMS:
				return getParams();
			case ClassDiagramPackage.METHOD__PARAM_TYPES:
				return getParamTypes();
			case ClassDiagramPackage.METHOD__PARAM_NAMES:
				return getParamNames();
			case ClassDiagramPackage.METHOD__OWNER:
				return getOwner();
			case ClassDiagramPackage.METHOD__CORPS:
				return getCorps();
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
			case ClassDiagramPackage.METHOD__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case ClassDiagramPackage.METHOD__RETURN_VARIABLE:
				setReturnVariable((Var)newValue);
				return;
			case ClassDiagramPackage.METHOD__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ClassDiagramPackage.METHOD__PARAM_TYPES:
				getParamTypes().clear();
				getParamTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ClassDiagramPackage.METHOD__PARAM_NAMES:
				getParamNames().clear();
				getParamNames().addAll((Collection<? extends String>)newValue);
				return;
			case ClassDiagramPackage.METHOD__OWNER:
				setOwner((Classifier)newValue);
				return;
			case ClassDiagramPackage.METHOD__CORPS:
				setCorps((Operation)newValue);
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
			case ClassDiagramPackage.METHOD__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case ClassDiagramPackage.METHOD__RETURN_VARIABLE:
				setReturnVariable((Var)null);
				return;
			case ClassDiagramPackage.METHOD__PARAMS:
				getParams().clear();
				return;
			case ClassDiagramPackage.METHOD__PARAM_TYPES:
				getParamTypes().clear();
				return;
			case ClassDiagramPackage.METHOD__PARAM_NAMES:
				getParamNames().clear();
				return;
			case ClassDiagramPackage.METHOD__OWNER:
				setOwner((Classifier)null);
				return;
			case ClassDiagramPackage.METHOD__CORPS:
				setCorps((Operation)null);
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
			case ClassDiagramPackage.METHOD__RETURN_TYPE:
				return returnType != null;
			case ClassDiagramPackage.METHOD__RETURN_VARIABLE:
				return returnVariable != null;
			case ClassDiagramPackage.METHOD__PARAMS:
				return params != null && !params.isEmpty();
			case ClassDiagramPackage.METHOD__PARAM_TYPES:
				return paramTypes != null && !paramTypes.isEmpty();
			case ClassDiagramPackage.METHOD__PARAM_NAMES:
				return paramNames != null && !paramNames.isEmpty();
			case ClassDiagramPackage.METHOD__OWNER:
				return getOwner() != null;
			case ClassDiagramPackage.METHOD__CORPS:
				return corps != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.METHOD___PARAM_NOT_VOID__DIAGNOSTICCHAIN_MAP:
				return paramNotVoid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ClassDiagramPackage.METHOD___PARAMETERS_SIZE__DIAGNOSTICCHAIN_MAP:
				return parametersSize((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (paramNames: ");
		result.append(paramNames);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
