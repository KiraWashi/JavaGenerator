/**
 */
package ClassDiagram.impl;

import ClassDiagram.Assignment;
import ClassDiagram.Association;
import ClassDiagram.AssociationEnd;
import ClassDiagram.Attribute;
import ClassDiagram.AttributeReference;
import ClassDiagram.BooleanData;
import ClassDiagram.BooleanType;
import ClassDiagram.BooleanVariable;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Expression;
import ClassDiagram.IntegerData;
import ClassDiagram.IntegerType;
import ClassDiagram.IntegerVariable;
import ClassDiagram.Interface;
import ClassDiagram.Method;
import ClassDiagram.ModelBase;
import ClassDiagram.Operation;
import ClassDiagram.Operator;
import ClassDiagram.StringType;
import ClassDiagram.Variable;
import ClassDiagram.VariableReference;
import ClassDiagram.VoidType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagramFactoryImpl extends EFactoryImpl implements ClassDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassDiagramFactory init() {
		try {
			ClassDiagramFactory theClassDiagramFactory = (ClassDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ClassDiagramPackage.eNS_URI);
			if (theClassDiagramFactory != null) {
				return theClassDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassDiagramPackage.MODEL_BASE: return createModelBase();
			case ClassDiagramPackage.VOID_TYPE: return createVoidType();
			case ClassDiagramPackage.INTEGER_TYPE: return createIntegerType();
			case ClassDiagramPackage.STRING_TYPE: return createStringType();
			case ClassDiagramPackage.BOOLEAN_TYPE: return createBooleanType();
			case ClassDiagramPackage.CLASS: return createClass();
			case ClassDiagramPackage.ATTRIBUTE: return createAttribute();
			case ClassDiagramPackage.METHOD: return createMethod();
			case ClassDiagramPackage.INTERFACE: return createInterface();
			case ClassDiagramPackage.ASSOCIATION_END: return createAssociationEnd();
			case ClassDiagramPackage.ASSOCIATION: return createAssociation();
			case ClassDiagramPackage.EXPRESSION: return createExpression();
			case ClassDiagramPackage.BOOLEAN_DATA: return createBooleanData();
			case ClassDiagramPackage.INTEGER_DATA: return createIntegerData();
			case ClassDiagramPackage.VARIABLE: return createVariable();
			case ClassDiagramPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case ClassDiagramPackage.INTEGER_VARIABLE: return createIntegerVariable();
			case ClassDiagramPackage.OPERATION: return createOperation();
			case ClassDiagramPackage.ASSIGNMENT: return createAssignment();
			case ClassDiagramPackage.VARIABLE_REFERENCE: return createVariableReference();
			case ClassDiagramPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClassDiagramPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClassDiagramPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelBase createModelBase() {
		ModelBaseImpl modelBase = new ModelBaseImpl();
		return modelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDiagram.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationEnd createAssociationEnd() {
		AssociationEndImpl associationEnd = new AssociationEndImpl();
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanData createBooleanData() {
		BooleanDataImpl booleanData = new BooleanDataImpl();
		return booleanData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerData createIntegerData() {
		IntegerDataImpl integerData = new IntegerDataImpl();
		return integerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeReference createAttributeReference() {
		AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
		return attributeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDiagramPackage getClassDiagramPackage() {
		return (ClassDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassDiagramPackage getPackage() {
		return ClassDiagramPackage.eINSTANCE;
	}

} //ClassDiagramFactoryImpl
