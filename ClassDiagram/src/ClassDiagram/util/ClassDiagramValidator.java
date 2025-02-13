/**
 */
package ClassDiagram.util;

import ClassDiagram.Assignment;
import ClassDiagram.Association;
import ClassDiagram.AssociationEnd;
import ClassDiagram.Attribute;
import ClassDiagram.AttributeReference;
import ClassDiagram.BooleanData;
import ClassDiagram.BooleanType;
import ClassDiagram.BooleanVariable;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Classifier;
import ClassDiagram.Data;
import ClassDiagram.DataType;
import ClassDiagram.Expression;
import ClassDiagram.ExpressionElement;
import ClassDiagram.IntegerData;
import ClassDiagram.IntegerType;
import ClassDiagram.IntegerVariable;
import ClassDiagram.Interface;
import ClassDiagram.Method;
import ClassDiagram.ModelBase;
import ClassDiagram.NamedElement;
import ClassDiagram.Operation;
import ClassDiagram.Operator;
import ClassDiagram.StringType;
import ClassDiagram.Type;
import ClassDiagram.Var;
import ClassDiagram.Variable;
import ClassDiagram.VariableReference;
import ClassDiagram.VoidType;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage
 * @generated
 */
public class ClassDiagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ClassDiagramValidator INSTANCE = new ClassDiagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ClassDiagram";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unicity Type Names' of 'Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TYPE__UNICITY_TYPE_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Void Name' of 'Void Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOID_TYPE__VOID_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Integer Name' of 'Integer Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTEGER_TYPE__INTEGER_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'String Name' of 'String Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_TYPE__STRING_NAME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Boolean Name' of 'Boolean Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOOLEAN_TYPE__BOOLEAN_NAME = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Attribute Names' of 'Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASS__UNIQUE_ATTRIBUTE_NAMES = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attribute Not Void' of 'Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE__ATTRIBUTE_NOT_VOID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Param Not Void' of 'Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHOD__PARAM_NOT_VOID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Parameters Size' of 'Method'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METHOD__PARAMETERS_SIZE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Attribute In Interface' of 'Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERFACE__NO_ATTRIBUTE_IN_INTERFACE = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ClassDiagramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ClassDiagramPackage.MODEL_BASE:
				return validateModelBase((ModelBase)value, diagnostics, context);
			case ClassDiagramPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case ClassDiagramPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case ClassDiagramPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case ClassDiagramPackage.VOID_TYPE:
				return validateVoidType((VoidType)value, diagnostics, context);
			case ClassDiagramPackage.INTEGER_TYPE:
				return validateIntegerType((IntegerType)value, diagnostics, context);
			case ClassDiagramPackage.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case ClassDiagramPackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case ClassDiagramPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case ClassDiagramPackage.CLASS:
				return validateClass((ClassDiagram.Class)value, diagnostics, context);
			case ClassDiagramPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case ClassDiagramPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case ClassDiagramPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case ClassDiagramPackage.ASSOCIATION_END:
				return validateAssociationEnd((AssociationEnd)value, diagnostics, context);
			case ClassDiagramPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case ClassDiagramPackage.EXPRESSION_ELEMENT:
				return validateExpressionElement((ExpressionElement)value, diagnostics, context);
			case ClassDiagramPackage.VAR:
				return validateVar((Var)value, diagnostics, context);
			case ClassDiagramPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case ClassDiagramPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case ClassDiagramPackage.BOOLEAN_DATA:
				return validateBooleanData((BooleanData)value, diagnostics, context);
			case ClassDiagramPackage.INTEGER_DATA:
				return validateIntegerData((IntegerData)value, diagnostics, context);
			case ClassDiagramPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case ClassDiagramPackage.BOOLEAN_VARIABLE:
				return validateBooleanVariable((BooleanVariable)value, diagnostics, context);
			case ClassDiagramPackage.INTEGER_VARIABLE:
				return validateIntegerVariable((IntegerVariable)value, diagnostics, context);
			case ClassDiagramPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case ClassDiagramPackage.ASSIGNMENT:
				return validateAssignment((Assignment)value, diagnostics, context);
			case ClassDiagramPackage.VARIABLE_REFERENCE:
				return validateVariableReference((VariableReference)value, diagnostics, context);
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE:
				return validateAttributeReference((AttributeReference)value, diagnostics, context);
			case ClassDiagramPackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelBase(ModelBase modelBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the unicityTypeNames constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_unicityTypeNames(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return type.unicityTypeNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoidType(VoidType voidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(voidType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(voidType, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoidType_voidName(voidType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the voidName constraint of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoidType_voidName(VoidType voidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return voidType.voidName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType(IntegerType integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(integerType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerType_integerName(integerType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the integerName constraint of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType_integerName(IntegerType integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return integerType.integerName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStringType_stringName(stringType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the stringName constraint of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType_stringName(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stringType.stringName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validateBooleanType_booleanName(booleanType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the booleanName constraint of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType_booleanName(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return booleanType.booleanName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(classifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(ClassDiagram.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_uniqueAttributeNames(class_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueAttributeNames constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_uniqueAttributeNames(ClassDiagram.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return class_.uniqueAttributeNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_attributeNotVoid(attribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the attributeNotVoid constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_attributeNotVoid(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attribute.attributeNotVoid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(method, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateMethod_parametersSize(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateMethod_paramNotVoid(method, diagnostics, context);
		return result;
	}

	/**
	 * Validates the parametersSize constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod_parametersSize(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return method.parametersSize(diagnostics, context);
	}

	/**
	 * Validates the paramNotVoid constraint of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod_paramNotVoid(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return method.paramNotVoid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_unicityTypeNames(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_noAttributeInInterface(interface_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noAttributeInInterface constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface_noAttributeInInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interface_.noAttributeInInterface(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnd(AssociationEnd associationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(association, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionElement(ExpressionElement expressionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVar(Var var, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(var, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanData(BooleanData booleanData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerData(IntegerData integerData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanVariable(BooleanVariable booleanVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerVariable(IntegerVariable integerVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableReference(VariableReference variableReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeReference(AttributeReference attributeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ClassDiagramValidator
