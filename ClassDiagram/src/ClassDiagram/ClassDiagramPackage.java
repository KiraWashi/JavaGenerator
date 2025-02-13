/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface ClassDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClassDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ClassDiagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ClassDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramPackage eINSTANCE = ClassDiagram.impl.ClassDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ModelBaseImpl <em>Model Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ModelBaseImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getModelBase()
	 * @generated
	 */
	int MODEL_BASE = 0;

	/**
	 * The feature id for the '<em><b>Void T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__VOID_T = 0;

	/**
	 * The feature id for the '<em><b>String T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__STRING_T = 1;

	/**
	 * The feature id for the '<em><b>Int T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__INT_T = 2;

	/**
	 * The feature id for the '<em><b>Bool T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__BOOL_T = 3;

	/**
	 * The feature id for the '<em><b>All Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__ALL_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>All Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__ALL_INTERFACES = 5;

	/**
	 * The feature id for the '<em><b>All Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE__ALL_ASSOCIATIONS = 6;

	/**
	 * The number of structural features of the '<em>Model Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.NamedElementImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.TypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.DataTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.VoidTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = DATA_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Void Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE___VOID_NAME__DIAGNOSTICCHAIN_MAP = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.IntegerTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = DATA_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Integer Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE___INTEGER_NAME__DIAGNOSTICCHAIN_MAP = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.StringTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = DATA_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>String Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___STRING_NAME__DIAGNOSTICCHAIN_MAP = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BooleanTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = DATA_TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Boolean Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___BOOLEAN_NAME__DIAGNOSTICCHAIN_MAP = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ClassifierImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ATTRIBUTES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__METHODS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ClassImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INTERFACES = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ASSOCIATIONS = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = CLASSIFIER___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___UNIQUE_ATTRIBUTE_NAMES__DIAGNOSTICCHAIN_MAP = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AttributeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIPLICITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INITIAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Attribute Not Void</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___ATTRIBUTE_NOT_VOID__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.MethodImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAM_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Param Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAM_NAMES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Param Not Void</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___PARAM_NOT_VOID__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parameters Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___PARAMETERS_SIZE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.InterfaceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ATTRIBUTES = CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHODS = CLASSIFIER__METHODS;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPLEMENTED_BY = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Unicity Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = CLASSIFIER___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Attribute In Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___NO_ATTRIBUTE_IN_INTERFACE__DIAGNOSTICCHAIN_MAP = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AssociationEndImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CLASS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__ASSOCIATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AssociationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ExpressionElementImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getExpressionElement()
	 * @generated
	 */
	int EXPRESSION_ELEMENT = 15;

	/**
	 * The number of structural features of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.VarImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 16;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ExpressionImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LEFT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RIGHT = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERATOR = EXPRESSION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = EXPRESSION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.DataImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getData()
	 * @generated
	 */
	int DATA = 18;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BooleanDataImpl <em>Boolean Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BooleanDataImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooleanData()
	 * @generated
	 */
	int BOOLEAN_DATA = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.IntegerDataImpl <em>Integer Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.IntegerDataImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIntegerData()
	 * @generated
	 */
	int INTEGER_DATA = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA__VALUE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.VariableImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BooleanVariableImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.IntegerVariableImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.OperationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 24;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONTENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOCAL_VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AssignmentImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 25;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.VariableReferenceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__VARIABLE = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__NAME = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AttributeReferenceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAttributeReference()
	 * @generated
	 */
	int ATTRIBUTE_REFERENCE = 27;

	/**
	 * The feature id for the '<em><b>Atttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__ATTTRIBUTE = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__NAME = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.Operator
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 28;


	/**
	 * Returns the meta object for class '{@link ClassDiagram.ModelBase <em>Model Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Base</em>'.
	 * @see ClassDiagram.ModelBase
	 * @generated
	 */
	EClass getModelBase();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.ModelBase#getVoidT <em>Void T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Void T</em>'.
	 * @see ClassDiagram.ModelBase#getVoidT()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_VoidT();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.ModelBase#getStringT <em>String T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String T</em>'.
	 * @see ClassDiagram.ModelBase#getStringT()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_StringT();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.ModelBase#getIntT <em>Int T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int T</em>'.
	 * @see ClassDiagram.ModelBase#getIntT()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_IntT();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.ModelBase#getBoolT <em>Bool T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool T</em>'.
	 * @see ClassDiagram.ModelBase#getBoolT()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_BoolT();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.ModelBase#getAllClasses <em>All Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Classes</em>'.
	 * @see ClassDiagram.ModelBase#getAllClasses()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_AllClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.ModelBase#getAllInterfaces <em>All Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Interfaces</em>'.
	 * @see ClassDiagram.ModelBase#getAllInterfaces()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_AllInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.ModelBase#getAllAssociations <em>All Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Associations</em>'.
	 * @see ClassDiagram.ModelBase#getAllAssociations()
	 * @see #getModelBase()
	 * @generated
	 */
	EReference getModelBase_AllAssociations();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ClassDiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ClassDiagram.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Type#unicityTypeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unicity Type Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unicity Type Names</em>' operation.
	 * @see ClassDiagram.Type#unicityTypeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getType__UnicityTypeNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see ClassDiagram.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see ClassDiagram.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.VoidType#voidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Void Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Void Name</em>' operation.
	 * @see ClassDiagram.VoidType#voidName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVoidType__VoidName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see ClassDiagram.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IntegerType#integerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Integer Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Integer Name</em>' operation.
	 * @see ClassDiagram.IntegerType#integerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIntegerType__IntegerName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see ClassDiagram.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.StringType#stringName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>String Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>String Name</em>' operation.
	 * @see ClassDiagram.StringType#stringName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStringType__StringName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see ClassDiagram.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BooleanType#booleanName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Boolean Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Boolean Name</em>' operation.
	 * @see ClassDiagram.BooleanType#booleanName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBooleanType__BooleanName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see ClassDiagram.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.Classifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ClassDiagram.Classifier#getAttributes()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.Classifier#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see ClassDiagram.Classifier#getMethods()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Methods();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see ClassDiagram.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Class#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see ClassDiagram.Class#getInterfaces()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Class#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associations</em>'.
	 * @see ClassDiagram.Class#getAssociations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Associations();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Class#uniqueAttributeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Attribute Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Attribute Names</em>' operation.
	 * @see ClassDiagram.Class#uniqueAttributeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getClass__UniqueAttributeNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ClassDiagram.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ClassDiagram.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the container reference '{@link ClassDiagram.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ClassDiagram.Attribute#getOwner()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owner();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Attribute#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ClassDiagram.Attribute#getMultiplicity()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.Attribute#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see ClassDiagram.Attribute#getInitialValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InitialValue();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Attribute#attributeNotVoid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attribute Not Void</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attribute Not Void</em>' operation.
	 * @see ClassDiagram.Attribute#attributeNotVoid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAttribute__AttributeNotVoid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see ClassDiagram.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see ClassDiagram.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Method#getReturnVariable <em>Return Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Variable</em>'.
	 * @see ClassDiagram.Method#getReturnVariable()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ReturnVariable();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Method#getParamTypes <em>Param Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Param Types</em>'.
	 * @see ClassDiagram.Method#getParamTypes()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_ParamTypes();

	/**
	 * Returns the meta object for the attribute list '{@link ClassDiagram.Method#getParamNames <em>Param Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Param Names</em>'.
	 * @see ClassDiagram.Method#getParamNames()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ParamNames();

	/**
	 * Returns the meta object for the container reference '{@link ClassDiagram.Method#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ClassDiagram.Method#getOwner()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ClassDiagram.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Body();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Method#paramNotVoid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Param Not Void</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Param Not Void</em>' operation.
	 * @see ClassDiagram.Method#paramNotVoid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMethod__ParamNotVoid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Method#parametersSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Parameters Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parameters Size</em>' operation.
	 * @see ClassDiagram.Method#parametersSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMethod__ParametersSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ClassDiagram.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Interface#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see ClassDiagram.Interface#getImplementedBy()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ImplementedBy();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Interface#noAttributeInInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Attribute In Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Attribute In Interface</em>' operation.
	 * @see ClassDiagram.Interface#noAttributeInInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInterface__NoAttributeInInterface__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see ClassDiagram.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.AssociationEnd#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ClassDiagram.AssociationEnd#getLowerBound()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.AssociationEnd#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ClassDiagram.AssociationEnd#getUpperBound()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.AssociationEnd#get_class <em>class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>class</em>'.
	 * @see ClassDiagram.AssociationEnd#get_class()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd__class();

	/**
	 * Returns the meta object for the container reference '{@link ClassDiagram.AssociationEnd#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Association</em>'.
	 * @see ClassDiagram.AssociationEnd#getAssociation()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd_Association();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see ClassDiagram.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.Association#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ends</em>'.
	 * @see ClassDiagram.Association#getEnds()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Ends();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.ExpressionElement <em>Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Element</em>'.
	 * @see ClassDiagram.ExpressionElement
	 * @generated
	 */
	EClass getExpressionElement();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see ClassDiagram.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ClassDiagram.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.Expression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see ClassDiagram.Expression#getLeft()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.Expression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see ClassDiagram.Expression#getRight()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Expression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ClassDiagram.Expression#getOperator()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Operator();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Expression#get_name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>name</em>'.
	 * @see ClassDiagram.Expression#get_name()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression__name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see ClassDiagram.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BooleanData <em>Boolean Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Data</em>'.
	 * @see ClassDiagram.BooleanData
	 * @generated
	 */
	EClass getBooleanData();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.BooleanData#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ClassDiagram.BooleanData#isValue()
	 * @see #getBooleanData()
	 * @generated
	 */
	EAttribute getBooleanData_Value();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IntegerData <em>Integer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Data</em>'.
	 * @see ClassDiagram.IntegerData
	 * @generated
	 */
	EClass getIntegerData();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.IntegerData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ClassDiagram.IntegerData#getValue()
	 * @see #getIntegerData()
	 * @generated
	 */
	EAttribute getIntegerData_Value();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ClassDiagram.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ClassDiagram.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see ClassDiagram.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see ClassDiagram.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ClassDiagram.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.Operation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ClassDiagram.Operation#getContents()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Contents();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassDiagram.Operation#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see ClassDiagram.Operation#getLocalVariables()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_LocalVariables();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see ClassDiagram.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link ClassDiagram.Assignment#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ClassDiagram.Assignment#getExpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Expression();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ClassDiagram.Assignment#getVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Variable();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Assignment#get_name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>name</em>'.
	 * @see ClassDiagram.Assignment#get_name()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment__name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see ClassDiagram.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.VariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ClassDiagram.VariableReference#getVariable()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Variable();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.VariableReference#get_name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>name</em>'.
	 * @see ClassDiagram.VariableReference#get_name()
	 * @see #getVariableReference()
	 * @generated
	 */
	EAttribute getVariableReference__name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.AttributeReference <em>Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Reference</em>'.
	 * @see ClassDiagram.AttributeReference
	 * @generated
	 */
	EClass getAttributeReference();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.AttributeReference#getAtttribute <em>Atttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atttribute</em>'.
	 * @see ClassDiagram.AttributeReference#getAtttribute()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EReference getAttributeReference_Atttribute();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.AttributeReference#get_name <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>name</em>'.
	 * @see ClassDiagram.AttributeReference#get_name()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EAttribute getAttributeReference__name();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see ClassDiagram.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassDiagramFactory getClassDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ModelBaseImpl <em>Model Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ModelBaseImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getModelBase()
		 * @generated
		 */
		EClass MODEL_BASE = eINSTANCE.getModelBase();

		/**
		 * The meta object literal for the '<em><b>Void T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__VOID_T = eINSTANCE.getModelBase_VoidT();

		/**
		 * The meta object literal for the '<em><b>String T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__STRING_T = eINSTANCE.getModelBase_StringT();

		/**
		 * The meta object literal for the '<em><b>Int T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__INT_T = eINSTANCE.getModelBase_IntT();

		/**
		 * The meta object literal for the '<em><b>Bool T</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__BOOL_T = eINSTANCE.getModelBase_BoolT();

		/**
		 * The meta object literal for the '<em><b>All Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__ALL_CLASSES = eINSTANCE.getModelBase_AllClasses();

		/**
		 * The meta object literal for the '<em><b>All Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__ALL_INTERFACES = eINSTANCE.getModelBase_AllInterfaces();

		/**
		 * The meta object literal for the '<em><b>All Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_BASE__ALL_ASSOCIATIONS = eINSTANCE.getModelBase_AllAssociations();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.NamedElementImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.TypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Unicity Type Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___UNICITY_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getType__UnicityTypeNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.DataTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.VoidTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '<em><b>Void Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOID_TYPE___VOID_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVoidType__VoidName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.IntegerTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '<em><b>Integer Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_TYPE___INTEGER_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIntegerType__IntegerName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.StringTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>String Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_TYPE___STRING_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStringType__StringName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BooleanTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>Boolean Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_TYPE___BOOLEAN_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBooleanType__BooleanName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ClassifierImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ATTRIBUTES = eINSTANCE.getClassifier_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__METHODS = eINSTANCE.getClassifier_Methods();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ClassImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INTERFACES = eINSTANCE.getClass_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ASSOCIATIONS = eINSTANCE.getClass_Associations();

		/**
		 * The meta object literal for the '<em><b>Unique Attribute Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___UNIQUE_ATTRIBUTE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getClass__UniqueAttributeNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AttributeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__INITIAL_VALUE = eINSTANCE.getAttribute_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Attribute Not Void</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___ATTRIBUTE_NOT_VOID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAttribute__AttributeNotVoid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.MethodImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_VARIABLE = eINSTANCE.getMethod_ReturnVariable();

		/**
		 * The meta object literal for the '<em><b>Param Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAM_TYPES = eINSTANCE.getMethod_ParamTypes();

		/**
		 * The meta object literal for the '<em><b>Param Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__PARAM_NAMES = eINSTANCE.getMethod_ParamNames();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OWNER = eINSTANCE.getMethod_Owner();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Param Not Void</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METHOD___PARAM_NOT_VOID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMethod__ParamNotVoid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Parameters Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METHOD___PARAMETERS_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMethod__ParametersSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.InterfaceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__IMPLEMENTED_BY = eINSTANCE.getInterface_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>No Attribute In Interface</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFACE___NO_ATTRIBUTE_IN_INTERFACE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInterface__NoAttributeInInterface__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AssociationEndImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__LOWER_BOUND = eINSTANCE.getAssociationEnd_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__UPPER_BOUND = eINSTANCE.getAssociationEnd_UpperBound();

		/**
		 * The meta object literal for the '<em><b>class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__CLASS = eINSTANCE.getAssociationEnd__class();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__ASSOCIATION = eINSTANCE.getAssociationEnd_Association();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AssociationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ENDS = eINSTANCE.getAssociation_Ends();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ExpressionElementImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getExpressionElement()
		 * @generated
		 */
		EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.VarImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ExpressionImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression__name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.DataImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BooleanDataImpl <em>Boolean Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BooleanDataImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooleanData()
		 * @generated
		 */
		EClass BOOLEAN_DATA = eINSTANCE.getBooleanData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_DATA__VALUE = eINSTANCE.getBooleanData_Value();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.IntegerDataImpl <em>Integer Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.IntegerDataImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIntegerData()
		 * @generated
		 */
		EClass INTEGER_DATA = eINSTANCE.getIntegerData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_DATA__VALUE = eINSTANCE.getIntegerData_Value();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.VariableImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BooleanVariableImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.IntegerVariableImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.OperationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CONTENTS = eINSTANCE.getOperation_Contents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LOCAL_VARIABLES = eINSTANCE.getOperation_LocalVariables();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AssignmentImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

		/**
		 * The meta object literal for the '<em><b>name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment__name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.VariableReferenceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getVariableReference_Variable();

		/**
		 * The meta object literal for the '<em><b>name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REFERENCE__NAME = eINSTANCE.getVariableReference__name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AttributeReferenceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAttributeReference()
		 * @generated
		 */
		EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

		/**
		 * The meta object literal for the '<em><b>Atttribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFERENCE__ATTTRIBUTE = eINSTANCE.getAttributeReference_Atttribute();

		/**
		 * The meta object literal for the '<em><b>name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_REFERENCE__NAME = eINSTANCE.getAttributeReference__name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.Operator
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ClassDiagramPackage
