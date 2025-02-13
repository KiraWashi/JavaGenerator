/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ClassDiagram/model/ClassDiagram.ecore
 * using:
 *   /ClassDiagram/model/ClassDiagram.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ClassDiagram;

// import ClassDiagram.ClassDiagramPackage;
// import ClassDiagram.ClassDiagramTables;
import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * ClassDiagramTables provides the dispatch tables for the ClassDiagram for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ClassDiagramTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ClassDiagramPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_ClassDiagram_s_1_0 = IdManager.getNsURIPackageId("http://ClassDiagram/1.0", null, ClassDiagramPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Assignment = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Assignment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Association = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Association", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssociationEnd = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("AssociationEnd", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AttributeReference = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("AttributeReference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BooleanType = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("BooleanType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class_0 = ClassDiagramTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Classifier = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Classifier", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Data = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Data", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Expression = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ExpressionElement = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("ExpressionElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IntegerType = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("IntegerType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Interface = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Interface", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Method = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Method", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ModelBase = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("ModelBase", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Operation = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Operation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StringType = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("StringType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Type = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Type", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Var = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Var", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VariableReference = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("VariableReference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_VoidType = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getClassId("VoidType", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ClassDiagramTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Operator = ClassDiagramTables.PACKid_http_c_s_s_ClassDiagram_s_1_0.getEnumerationId("Operator");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR_boolean = "boolean";
	public static final /*@NonInvalid*/ String STR_integer = "integer";
	public static final /*@NonInvalid*/ String STR_string = "string";
	public static final /*@NonInvalid*/ String STR_void = "void";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Assignment = TypeId.BAG.getSpecializedId(ClassDiagramTables.CLSSid_Assignment, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Attribute = TypeId.BAG.getSpecializedId(ClassDiagramTables.CLSSid_Attribute, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AttributeReference = TypeId.BAG.getSpecializedId(ClassDiagramTables.CLSSid_AttributeReference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Method = TypeId.BAG.getSpecializedId(ClassDiagramTables.CLSSid_Method, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_VariableReference = TypeId.BAG.getSpecializedId(ClassDiagramTables.CLSSid_VariableReference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Assignment = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Assignment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Association = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Association, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssociationEnd = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_AssociationEnd, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssociationEnd_0 = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_AssociationEnd, true, ValueUtil.integerValueOf(2), ValueUtil.integerValueOf(2));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Attribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Class = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Class, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Interface = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Interface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Method = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Method, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Type = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Type, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Variable = TypeId.ORDERED_SET.getSpecializedId(ClassDiagramTables.CLSSid_Variable, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Type = TypeId.SET.getSpecializedId(ClassDiagramTables.CLSSid_Type, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ClassDiagramTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Assignment = new EcoreExecutorType(ClassDiagramPackage.Literals.ASSIGNMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Association = new EcoreExecutorType(ClassDiagramPackage.Literals.ASSOCIATION, PACKAGE, 0);
		public static final EcoreExecutorType _AssociationEnd = new EcoreExecutorType(ClassDiagramPackage.Literals.ASSOCIATION_END, PACKAGE, 0);
		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(ClassDiagramPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _AttributeReference = new EcoreExecutorType(ClassDiagramPackage.Literals.ATTRIBUTE_REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanData = new EcoreExecutorType(ClassDiagramPackage.Literals.BOOLEAN_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanType = new EcoreExecutorType(ClassDiagramPackage.Literals.BOOLEAN_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanVariable = new EcoreExecutorType(ClassDiagramPackage.Literals.BOOLEAN_VARIABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Class = new EcoreExecutorType(ClassDiagramPackage.Literals.CLASS, PACKAGE, 0);
		public static final EcoreExecutorType _Classifier = new EcoreExecutorType(ClassDiagramPackage.Literals.CLASSIFIER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Data = new EcoreExecutorType(ClassDiagramPackage.Literals.DATA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DataType = new EcoreExecutorType(ClassDiagramPackage.Literals.DATA_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Expression = new EcoreExecutorType(ClassDiagramPackage.Literals.EXPRESSION, PACKAGE, 0);
		public static final EcoreExecutorType _ExpressionElement = new EcoreExecutorType(ClassDiagramPackage.Literals.EXPRESSION_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _IntegerData = new EcoreExecutorType(ClassDiagramPackage.Literals.INTEGER_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerType = new EcoreExecutorType(ClassDiagramPackage.Literals.INTEGER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerVariable = new EcoreExecutorType(ClassDiagramPackage.Literals.INTEGER_VARIABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Interface = new EcoreExecutorType(ClassDiagramPackage.Literals.INTERFACE, PACKAGE, 0);
		public static final EcoreExecutorType _Method = new EcoreExecutorType(ClassDiagramPackage.Literals.METHOD, PACKAGE, 0);
		public static final EcoreExecutorType _ModelBase = new EcoreExecutorType(ClassDiagramPackage.Literals.MODEL_BASE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(ClassDiagramPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Operation = new EcoreExecutorType(ClassDiagramPackage.Literals.OPERATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Operator = new EcoreExecutorEnumeration(ClassDiagramPackage.Literals.OPERATOR, PACKAGE, 0);
		public static final EcoreExecutorType _StringType = new EcoreExecutorType(ClassDiagramPackage.Literals.STRING_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Type = new EcoreExecutorType(ClassDiagramPackage.Literals.TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Var = new EcoreExecutorType(ClassDiagramPackage.Literals.VAR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Variable = new EcoreExecutorType(ClassDiagramPackage.Literals.VARIABLE, PACKAGE, 0);
		public static final EcoreExecutorType _VariableReference = new EcoreExecutorType(ClassDiagramPackage.Literals.VARIABLE_REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorType _VoidType = new EcoreExecutorType(ClassDiagramPackage.Literals.VOID_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Assignment,
			_Association,
			_AssociationEnd,
			_Attribute,
			_AttributeReference,
			_BooleanData,
			_BooleanType,
			_BooleanVariable,
			_Class,
			_Classifier,
			_Data,
			_DataType,
			_Expression,
			_ExpressionElement,
			_IntegerData,
			_IntegerType,
			_IntegerVariable,
			_Interface,
			_Method,
			_ModelBase,
			_NamedElement,
			_Operation,
			_Operator,
			_StringType,
			_Type,
			_Var,
			_Variable,
			_VariableReference,
			_VoidType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Assignment__Assignment = new ExecutorFragment(Types._Assignment, ClassDiagramTables.Types._Assignment);
		private static final ExecutorFragment _Assignment__OclAny = new ExecutorFragment(Types._Assignment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assignment__OclElement = new ExecutorFragment(Types._Assignment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Association__Association = new ExecutorFragment(Types._Association, ClassDiagramTables.Types._Association);
		private static final ExecutorFragment _Association__NamedElement = new ExecutorFragment(Types._Association, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Association__OclAny = new ExecutorFragment(Types._Association, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Association__OclElement = new ExecutorFragment(Types._Association, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssociationEnd__AssociationEnd = new ExecutorFragment(Types._AssociationEnd, ClassDiagramTables.Types._AssociationEnd);
		private static final ExecutorFragment _AssociationEnd__NamedElement = new ExecutorFragment(Types._AssociationEnd, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _AssociationEnd__OclAny = new ExecutorFragment(Types._AssociationEnd, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssociationEnd__OclElement = new ExecutorFragment(Types._AssociationEnd, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, ClassDiagramTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__NamedElement = new ExecutorFragment(Types._Attribute, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Attribute__Var = new ExecutorFragment(Types._Attribute, ClassDiagramTables.Types._Var);

		private static final ExecutorFragment _AttributeReference__AttributeReference = new ExecutorFragment(Types._AttributeReference, ClassDiagramTables.Types._AttributeReference);
		private static final ExecutorFragment _AttributeReference__ExpressionElement = new ExecutorFragment(Types._AttributeReference, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _AttributeReference__OclAny = new ExecutorFragment(Types._AttributeReference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AttributeReference__OclElement = new ExecutorFragment(Types._AttributeReference, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BooleanData__BooleanData = new ExecutorFragment(Types._BooleanData, ClassDiagramTables.Types._BooleanData);
		private static final ExecutorFragment _BooleanData__Data = new ExecutorFragment(Types._BooleanData, ClassDiagramTables.Types._Data);
		private static final ExecutorFragment _BooleanData__ExpressionElement = new ExecutorFragment(Types._BooleanData, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _BooleanData__OclAny = new ExecutorFragment(Types._BooleanData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanData__OclElement = new ExecutorFragment(Types._BooleanData, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BooleanType__BooleanType = new ExecutorFragment(Types._BooleanType, ClassDiagramTables.Types._BooleanType);
		private static final ExecutorFragment _BooleanType__DataType = new ExecutorFragment(Types._BooleanType, ClassDiagramTables.Types._DataType);
		private static final ExecutorFragment _BooleanType__NamedElement = new ExecutorFragment(Types._BooleanType, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _BooleanType__OclAny = new ExecutorFragment(Types._BooleanType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanType__OclElement = new ExecutorFragment(Types._BooleanType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanType__Type = new ExecutorFragment(Types._BooleanType, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _BooleanVariable__BooleanVariable = new ExecutorFragment(Types._BooleanVariable, ClassDiagramTables.Types._BooleanVariable);
		private static final ExecutorFragment _BooleanVariable__OclAny = new ExecutorFragment(Types._BooleanVariable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanVariable__OclElement = new ExecutorFragment(Types._BooleanVariable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanVariable__Var = new ExecutorFragment(Types._BooleanVariable, ClassDiagramTables.Types._Var);
		private static final ExecutorFragment _BooleanVariable__Variable = new ExecutorFragment(Types._BooleanVariable, ClassDiagramTables.Types._Variable);

		private static final ExecutorFragment _Class__Class = new ExecutorFragment(Types._Class, ClassDiagramTables.Types._Class);
		private static final ExecutorFragment _Class__Classifier = new ExecutorFragment(Types._Class, ClassDiagramTables.Types._Classifier);
		private static final ExecutorFragment _Class__NamedElement = new ExecutorFragment(Types._Class, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Class__OclAny = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Class__OclElement = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Class__Type = new ExecutorFragment(Types._Class, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _Classifier__Classifier = new ExecutorFragment(Types._Classifier, ClassDiagramTables.Types._Classifier);
		private static final ExecutorFragment _Classifier__NamedElement = new ExecutorFragment(Types._Classifier, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Classifier__OclAny = new ExecutorFragment(Types._Classifier, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Classifier__OclElement = new ExecutorFragment(Types._Classifier, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Classifier__Type = new ExecutorFragment(Types._Classifier, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _Data__Data = new ExecutorFragment(Types._Data, ClassDiagramTables.Types._Data);
		private static final ExecutorFragment _Data__ExpressionElement = new ExecutorFragment(Types._Data, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _Data__OclAny = new ExecutorFragment(Types._Data, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Data__OclElement = new ExecutorFragment(Types._Data, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, ClassDiagramTables.Types._DataType);
		private static final ExecutorFragment _DataType__NamedElement = new ExecutorFragment(Types._DataType, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__Type = new ExecutorFragment(Types._DataType, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _Expression__Expression = new ExecutorFragment(Types._Expression, ClassDiagramTables.Types._Expression);
		private static final ExecutorFragment _Expression__ExpressionElement = new ExecutorFragment(Types._Expression, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _Expression__OclAny = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Expression__OclElement = new ExecutorFragment(Types._Expression, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ExpressionElement__ExpressionElement = new ExecutorFragment(Types._ExpressionElement, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _ExpressionElement__OclAny = new ExecutorFragment(Types._ExpressionElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ExpressionElement__OclElement = new ExecutorFragment(Types._ExpressionElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IntegerData__Data = new ExecutorFragment(Types._IntegerData, ClassDiagramTables.Types._Data);
		private static final ExecutorFragment _IntegerData__ExpressionElement = new ExecutorFragment(Types._IntegerData, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _IntegerData__IntegerData = new ExecutorFragment(Types._IntegerData, ClassDiagramTables.Types._IntegerData);
		private static final ExecutorFragment _IntegerData__OclAny = new ExecutorFragment(Types._IntegerData, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerData__OclElement = new ExecutorFragment(Types._IntegerData, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IntegerType__DataType = new ExecutorFragment(Types._IntegerType, ClassDiagramTables.Types._DataType);
		private static final ExecutorFragment _IntegerType__IntegerType = new ExecutorFragment(Types._IntegerType, ClassDiagramTables.Types._IntegerType);
		private static final ExecutorFragment _IntegerType__NamedElement = new ExecutorFragment(Types._IntegerType, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _IntegerType__OclAny = new ExecutorFragment(Types._IntegerType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerType__OclElement = new ExecutorFragment(Types._IntegerType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerType__Type = new ExecutorFragment(Types._IntegerType, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _IntegerVariable__IntegerVariable = new ExecutorFragment(Types._IntegerVariable, ClassDiagramTables.Types._IntegerVariable);
		private static final ExecutorFragment _IntegerVariable__OclAny = new ExecutorFragment(Types._IntegerVariable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerVariable__OclElement = new ExecutorFragment(Types._IntegerVariable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerVariable__Var = new ExecutorFragment(Types._IntegerVariable, ClassDiagramTables.Types._Var);
		private static final ExecutorFragment _IntegerVariable__Variable = new ExecutorFragment(Types._IntegerVariable, ClassDiagramTables.Types._Variable);

		private static final ExecutorFragment _Interface__Classifier = new ExecutorFragment(Types._Interface, ClassDiagramTables.Types._Classifier);
		private static final ExecutorFragment _Interface__Interface = new ExecutorFragment(Types._Interface, ClassDiagramTables.Types._Interface);
		private static final ExecutorFragment _Interface__NamedElement = new ExecutorFragment(Types._Interface, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Interface__OclAny = new ExecutorFragment(Types._Interface, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Interface__OclElement = new ExecutorFragment(Types._Interface, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Interface__Type = new ExecutorFragment(Types._Interface, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _Method__Method = new ExecutorFragment(Types._Method, ClassDiagramTables.Types._Method);
		private static final ExecutorFragment _Method__NamedElement = new ExecutorFragment(Types._Method, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Method__OclAny = new ExecutorFragment(Types._Method, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Method__OclElement = new ExecutorFragment(Types._Method, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ModelBase__ModelBase = new ExecutorFragment(Types._ModelBase, ClassDiagramTables.Types._ModelBase);
		private static final ExecutorFragment _ModelBase__OclAny = new ExecutorFragment(Types._ModelBase, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ModelBase__OclElement = new ExecutorFragment(Types._ModelBase, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, ClassDiagramTables.Types._Operation);

		private static final ExecutorFragment _Operator__OclAny = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operator__OclElement = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operator__OclEnumeration = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Operator__OclType = new ExecutorFragment(Types._Operator, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Operator__Operator = new ExecutorFragment(Types._Operator, ClassDiagramTables.Types._Operator);

		private static final ExecutorFragment _StringType__DataType = new ExecutorFragment(Types._StringType, ClassDiagramTables.Types._DataType);
		private static final ExecutorFragment _StringType__NamedElement = new ExecutorFragment(Types._StringType, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _StringType__OclAny = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringType__OclElement = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringType__StringType = new ExecutorFragment(Types._StringType, ClassDiagramTables.Types._StringType);
		private static final ExecutorFragment _StringType__Type = new ExecutorFragment(Types._StringType, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _Type__NamedElement = new ExecutorFragment(Types._Type, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, ClassDiagramTables.Types._Type);

		private static final ExecutorFragment _Var__OclAny = new ExecutorFragment(Types._Var, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Var__OclElement = new ExecutorFragment(Types._Var, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Var__Var = new ExecutorFragment(Types._Var, ClassDiagramTables.Types._Var);

		private static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Variable__Var = new ExecutorFragment(Types._Variable, ClassDiagramTables.Types._Var);
		private static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, ClassDiagramTables.Types._Variable);

		private static final ExecutorFragment _VariableReference__ExpressionElement = new ExecutorFragment(Types._VariableReference, ClassDiagramTables.Types._ExpressionElement);
		private static final ExecutorFragment _VariableReference__OclAny = new ExecutorFragment(Types._VariableReference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VariableReference__OclElement = new ExecutorFragment(Types._VariableReference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VariableReference__VariableReference = new ExecutorFragment(Types._VariableReference, ClassDiagramTables.Types._VariableReference);

		private static final ExecutorFragment _VoidType__DataType = new ExecutorFragment(Types._VoidType, ClassDiagramTables.Types._DataType);
		private static final ExecutorFragment _VoidType__NamedElement = new ExecutorFragment(Types._VoidType, ClassDiagramTables.Types._NamedElement);
		private static final ExecutorFragment _VoidType__OclAny = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _VoidType__OclElement = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _VoidType__Type = new ExecutorFragment(Types._VoidType, ClassDiagramTables.Types._Type);
		private static final ExecutorFragment _VoidType__VoidType = new ExecutorFragment(Types._VoidType, ClassDiagramTables.Types._VoidType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Assignment___name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSIGNMENT__NAME, Types._Assignment, 0);
		public static final ExecutorProperty _Assignment__expression = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSIGNMENT__EXPRESSION, Types._Assignment, 1);
		public static final ExecutorProperty _Assignment__variable = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSIGNMENT__VARIABLE, Types._Assignment, 2);
		public static final ExecutorProperty _Assignment__Operation__contents = new ExecutorPropertyWithImplementation("Operation", Types._Assignment, 3, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.OPERATION__CONTENTS));

		public static final ExecutorProperty _Association__ends = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSOCIATION__ENDS, Types._Association, 0);
		public static final ExecutorProperty _Association__ModelBase__allAssociations = new ExecutorPropertyWithImplementation("ModelBase", Types._Association, 1, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__ALL_ASSOCIATIONS));

		public static final ExecutorProperty _AssociationEnd___class = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSOCIATION_END__CLASS, Types._AssociationEnd, 0);
		public static final ExecutorProperty _AssociationEnd__association = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSOCIATION_END__ASSOCIATION, Types._AssociationEnd, 1);
		public static final ExecutorProperty _AssociationEnd__lowerBound = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSOCIATION_END__LOWER_BOUND, Types._AssociationEnd, 2);
		public static final ExecutorProperty _AssociationEnd__upperBound = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ASSOCIATION_END__UPPER_BOUND, Types._AssociationEnd, 3);

		public static final ExecutorProperty _Attribute__initialValue = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ATTRIBUTE__INITIAL_VALUE, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__multiplicity = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ATTRIBUTE__MULTIPLICITY, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__owner = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ATTRIBUTE__OWNER, Types._Attribute, 2);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 3);
		public static final ExecutorProperty _Attribute__AttributeReference__atttribute = new ExecutorPropertyWithImplementation("AttributeReference", Types._Attribute, 4, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.ATTRIBUTE_REFERENCE__ATTTRIBUTE));

		public static final ExecutorProperty _AttributeReference___name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ATTRIBUTE_REFERENCE__NAME, Types._AttributeReference, 0);
		public static final ExecutorProperty _AttributeReference__atttribute = new EcoreExecutorProperty(ClassDiagramPackage.Literals.ATTRIBUTE_REFERENCE__ATTTRIBUTE, Types._AttributeReference, 1);

		public static final ExecutorProperty _BooleanData__value = new EcoreExecutorProperty(ClassDiagramPackage.Literals.BOOLEAN_DATA__VALUE, Types._BooleanData, 0);

		public static final ExecutorProperty _BooleanType__ModelBase__boolT = new ExecutorPropertyWithImplementation("ModelBase", Types._BooleanType, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__BOOL_T));

		public static final ExecutorProperty _Class__associations = new EcoreExecutorProperty(ClassDiagramPackage.Literals.CLASS__ASSOCIATIONS, Types._Class, 0);
		public static final ExecutorProperty _Class__interfaces = new EcoreExecutorProperty(ClassDiagramPackage.Literals.CLASS__INTERFACES, Types._Class, 1);
		public static final ExecutorProperty _Class__ModelBase__allClasses = new ExecutorPropertyWithImplementation("ModelBase", Types._Class, 2, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__ALL_CLASSES));

		public static final ExecutorProperty _Classifier__attributes = new EcoreExecutorProperty(ClassDiagramPackage.Literals.CLASSIFIER__ATTRIBUTES, Types._Classifier, 0);
		public static final ExecutorProperty _Classifier__methods = new EcoreExecutorProperty(ClassDiagramPackage.Literals.CLASSIFIER__METHODS, Types._Classifier, 1);

		public static final ExecutorProperty _Data__Attribute__initialValue = new ExecutorPropertyWithImplementation("Attribute", Types._Data, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.ATTRIBUTE__INITIAL_VALUE));
		public static final ExecutorProperty _Data__Variable__value = new ExecutorPropertyWithImplementation("Variable", Types._Data, 1, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.VARIABLE__VALUE));

		public static final ExecutorProperty _Expression___name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.EXPRESSION__NAME, Types._Expression, 0);
		public static final ExecutorProperty _Expression__left = new EcoreExecutorProperty(ClassDiagramPackage.Literals.EXPRESSION__LEFT, Types._Expression, 1);
		public static final ExecutorProperty _Expression__operator = new EcoreExecutorProperty(ClassDiagramPackage.Literals.EXPRESSION__OPERATOR, Types._Expression, 2);
		public static final ExecutorProperty _Expression__right = new EcoreExecutorProperty(ClassDiagramPackage.Literals.EXPRESSION__RIGHT, Types._Expression, 3);

		public static final ExecutorProperty _ExpressionElement__Assignment__expression = new ExecutorPropertyWithImplementation("Assignment", Types._ExpressionElement, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.ASSIGNMENT__EXPRESSION));
		public static final ExecutorProperty _ExpressionElement__Expression__left = new ExecutorPropertyWithImplementation("Expression", Types._ExpressionElement, 1, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.EXPRESSION__LEFT));
		public static final ExecutorProperty _ExpressionElement__Expression__right = new ExecutorPropertyWithImplementation("Expression", Types._ExpressionElement, 2, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.EXPRESSION__RIGHT));

		public static final ExecutorProperty _IntegerData__value = new EcoreExecutorProperty(ClassDiagramPackage.Literals.INTEGER_DATA__VALUE, Types._IntegerData, 0);

		public static final ExecutorProperty _IntegerType__ModelBase__intT = new ExecutorPropertyWithImplementation("ModelBase", Types._IntegerType, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__INT_T));

		public static final ExecutorProperty _Interface__implementedBy = new EcoreExecutorProperty(ClassDiagramPackage.Literals.INTERFACE__IMPLEMENTED_BY, Types._Interface, 0);
		public static final ExecutorProperty _Interface__ModelBase__allInterfaces = new ExecutorPropertyWithImplementation("ModelBase", Types._Interface, 1, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__ALL_INTERFACES));

		public static final ExecutorProperty _Method__body = new EcoreExecutorProperty(ClassDiagramPackage.Literals.METHOD__BODY, Types._Method, 0);
		public static final ExecutorProperty _Method__owner = new EcoreExecutorProperty(ClassDiagramPackage.Literals.METHOD__OWNER, Types._Method, 1);
		public static final ExecutorProperty _Method__paramNames = new EcoreExecutorProperty(ClassDiagramPackage.Literals.METHOD__PARAM_NAMES, Types._Method, 2);
		public static final ExecutorProperty _Method__paramTypes = new EcoreExecutorProperty(ClassDiagramPackage.Literals.METHOD__PARAM_TYPES, Types._Method, 3);
		public static final ExecutorProperty _Method__returnType = new EcoreExecutorProperty(ClassDiagramPackage.Literals.METHOD__RETURN_TYPE, Types._Method, 4);
		public static final ExecutorProperty _Method__returnVariable = new EcoreExecutorProperty(ClassDiagramPackage.Literals.METHOD__RETURN_VARIABLE, Types._Method, 5);

		public static final ExecutorProperty _ModelBase__allAssociations = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__ALL_ASSOCIATIONS, Types._ModelBase, 0);
		public static final ExecutorProperty _ModelBase__allClasses = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__ALL_CLASSES, Types._ModelBase, 1);
		public static final ExecutorProperty _ModelBase__allInterfaces = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__ALL_INTERFACES, Types._ModelBase, 2);
		public static final ExecutorProperty _ModelBase__boolT = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__BOOL_T, Types._ModelBase, 3);
		public static final ExecutorProperty _ModelBase__intT = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__INT_T, Types._ModelBase, 4);
		public static final ExecutorProperty _ModelBase__stringT = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__STRING_T, Types._ModelBase, 5);
		public static final ExecutorProperty _ModelBase__voidT = new EcoreExecutorProperty(ClassDiagramPackage.Literals.MODEL_BASE__VOID_T, Types._ModelBase, 6);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Operation__contents = new EcoreExecutorProperty(ClassDiagramPackage.Literals.OPERATION__CONTENTS, Types._Operation, 0);
		public static final ExecutorProperty _Operation__localVariables = new EcoreExecutorProperty(ClassDiagramPackage.Literals.OPERATION__LOCAL_VARIABLES, Types._Operation, 1);
		public static final ExecutorProperty _Operation__name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.OPERATION__NAME, Types._Operation, 2);
		public static final ExecutorProperty _Operation__Method__body = new ExecutorPropertyWithImplementation("Method", Types._Operation, 3, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.METHOD__BODY));

		public static final ExecutorProperty _StringType__ModelBase__stringT = new ExecutorPropertyWithImplementation("ModelBase", Types._StringType, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__STRING_T));

		public static final ExecutorProperty _Type__Attribute__type = new ExecutorPropertyWithImplementation("Attribute", Types._Type, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.ATTRIBUTE__TYPE));
		public static final ExecutorProperty _Type__Method__paramTypes = new ExecutorPropertyWithImplementation("Method", Types._Type, 1, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.METHOD__PARAM_TYPES));
		public static final ExecutorProperty _Type__Method__returnType = new ExecutorPropertyWithImplementation("Method", Types._Type, 2, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.METHOD__RETURN_TYPE));

		public static final ExecutorProperty _Var__Assignment__variable = new ExecutorPropertyWithImplementation("Assignment", Types._Var, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.ASSIGNMENT__VARIABLE));

		public static final ExecutorProperty _Variable__name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.VARIABLE__NAME, Types._Variable, 0);
		public static final ExecutorProperty _Variable__value = new EcoreExecutorProperty(ClassDiagramPackage.Literals.VARIABLE__VALUE, Types._Variable, 1);
		public static final ExecutorProperty _Variable__Method__returnVariable = new ExecutorPropertyWithImplementation("Method", Types._Variable, 2, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.METHOD__RETURN_VARIABLE));
		public static final ExecutorProperty _Variable__Operation__localVariables = new ExecutorPropertyWithImplementation("Operation", Types._Variable, 3, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.OPERATION__LOCAL_VARIABLES));
		public static final ExecutorProperty _Variable__VariableReference__variable = new ExecutorPropertyWithImplementation("VariableReference", Types._Variable, 4, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.VARIABLE_REFERENCE__VARIABLE));

		public static final ExecutorProperty _VariableReference___name = new EcoreExecutorProperty(ClassDiagramPackage.Literals.VARIABLE_REFERENCE__NAME, Types._VariableReference, 0);
		public static final ExecutorProperty _VariableReference__variable = new EcoreExecutorProperty(ClassDiagramPackage.Literals.VARIABLE_REFERENCE__VARIABLE, Types._VariableReference, 1);

		public static final ExecutorProperty _VoidType__ModelBase__voidT = new ExecutorPropertyWithImplementation("ModelBase", Types._VoidType, 0, new EcoreLibraryOppositeProperty(ClassDiagramPackage.Literals.MODEL_BASE__VOID_T));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Assignment =
			{
				Fragments._Assignment__OclAny /* 0 */,
				Fragments._Assignment__OclElement /* 1 */,
				Fragments._Assignment__Assignment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Assignment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Association =
			{
				Fragments._Association__OclAny /* 0 */,
				Fragments._Association__OclElement /* 1 */,
				Fragments._Association__NamedElement /* 2 */,
				Fragments._Association__Association /* 3 */
			};
		private static final int /*@NonNull*/ [] __Association = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssociationEnd =
			{
				Fragments._AssociationEnd__OclAny /* 0 */,
				Fragments._AssociationEnd__OclElement /* 1 */,
				Fragments._AssociationEnd__NamedElement /* 2 */,
				Fragments._AssociationEnd__AssociationEnd /* 3 */
			};
		private static final int /*@NonNull*/ [] __AssociationEnd = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__NamedElement /* 2 */,
				Fragments._Attribute__Var /* 2 */,
				Fragments._Attribute__Attribute /* 3 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,2,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AttributeReference =
			{
				Fragments._AttributeReference__OclAny /* 0 */,
				Fragments._AttributeReference__OclElement /* 1 */,
				Fragments._AttributeReference__ExpressionElement /* 2 */,
				Fragments._AttributeReference__AttributeReference /* 3 */
			};
		private static final int /*@NonNull*/ [] __AttributeReference = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanData =
			{
				Fragments._BooleanData__OclAny /* 0 */,
				Fragments._BooleanData__OclElement /* 1 */,
				Fragments._BooleanData__ExpressionElement /* 2 */,
				Fragments._BooleanData__Data /* 3 */,
				Fragments._BooleanData__BooleanData /* 4 */
			};
		private static final int /*@NonNull*/ [] __BooleanData = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanType =
			{
				Fragments._BooleanType__OclAny /* 0 */,
				Fragments._BooleanType__OclElement /* 1 */,
				Fragments._BooleanType__NamedElement /* 2 */,
				Fragments._BooleanType__Type /* 3 */,
				Fragments._BooleanType__DataType /* 4 */,
				Fragments._BooleanType__BooleanType /* 5 */
			};
		private static final int /*@NonNull*/ [] __BooleanType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanVariable =
			{
				Fragments._BooleanVariable__OclAny /* 0 */,
				Fragments._BooleanVariable__OclElement /* 1 */,
				Fragments._BooleanVariable__Var /* 2 */,
				Fragments._BooleanVariable__Variable /* 3 */,
				Fragments._BooleanVariable__BooleanVariable /* 4 */
			};
		private static final int /*@NonNull*/ [] __BooleanVariable = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Class =
			{
				Fragments._Class__OclAny /* 0 */,
				Fragments._Class__OclElement /* 1 */,
				Fragments._Class__NamedElement /* 2 */,
				Fragments._Class__Type /* 3 */,
				Fragments._Class__Classifier /* 4 */,
				Fragments._Class__Class /* 5 */
			};
		private static final int /*@NonNull*/ [] __Class = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Classifier =
			{
				Fragments._Classifier__OclAny /* 0 */,
				Fragments._Classifier__OclElement /* 1 */,
				Fragments._Classifier__NamedElement /* 2 */,
				Fragments._Classifier__Type /* 3 */,
				Fragments._Classifier__Classifier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Classifier = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Data =
			{
				Fragments._Data__OclAny /* 0 */,
				Fragments._Data__OclElement /* 1 */,
				Fragments._Data__ExpressionElement /* 2 */,
				Fragments._Data__Data /* 3 */
			};
		private static final int /*@NonNull*/ [] __Data = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__NamedElement /* 2 */,
				Fragments._DataType__Type /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Expression =
			{
				Fragments._Expression__OclAny /* 0 */,
				Fragments._Expression__OclElement /* 1 */,
				Fragments._Expression__ExpressionElement /* 2 */,
				Fragments._Expression__Expression /* 3 */
			};
		private static final int /*@NonNull*/ [] __Expression = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ExpressionElement =
			{
				Fragments._ExpressionElement__OclAny /* 0 */,
				Fragments._ExpressionElement__OclElement /* 1 */,
				Fragments._ExpressionElement__ExpressionElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __ExpressionElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerData =
			{
				Fragments._IntegerData__OclAny /* 0 */,
				Fragments._IntegerData__OclElement /* 1 */,
				Fragments._IntegerData__ExpressionElement /* 2 */,
				Fragments._IntegerData__Data /* 3 */,
				Fragments._IntegerData__IntegerData /* 4 */
			};
		private static final int /*@NonNull*/ [] __IntegerData = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerType =
			{
				Fragments._IntegerType__OclAny /* 0 */,
				Fragments._IntegerType__OclElement /* 1 */,
				Fragments._IntegerType__NamedElement /* 2 */,
				Fragments._IntegerType__Type /* 3 */,
				Fragments._IntegerType__DataType /* 4 */,
				Fragments._IntegerType__IntegerType /* 5 */
			};
		private static final int /*@NonNull*/ [] __IntegerType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerVariable =
			{
				Fragments._IntegerVariable__OclAny /* 0 */,
				Fragments._IntegerVariable__OclElement /* 1 */,
				Fragments._IntegerVariable__Var /* 2 */,
				Fragments._IntegerVariable__Variable /* 3 */,
				Fragments._IntegerVariable__IntegerVariable /* 4 */
			};
		private static final int /*@NonNull*/ [] __IntegerVariable = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Interface =
			{
				Fragments._Interface__OclAny /* 0 */,
				Fragments._Interface__OclElement /* 1 */,
				Fragments._Interface__NamedElement /* 2 */,
				Fragments._Interface__Type /* 3 */,
				Fragments._Interface__Classifier /* 4 */,
				Fragments._Interface__Interface /* 5 */
			};
		private static final int /*@NonNull*/ [] __Interface = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Method =
			{
				Fragments._Method__OclAny /* 0 */,
				Fragments._Method__OclElement /* 1 */,
				Fragments._Method__NamedElement /* 2 */,
				Fragments._Method__Method /* 3 */
			};
		private static final int /*@NonNull*/ [] __Method = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ModelBase =
			{
				Fragments._ModelBase__OclAny /* 0 */,
				Fragments._ModelBase__OclElement /* 1 */,
				Fragments._ModelBase__ModelBase /* 2 */
			};
		private static final int /*@NonNull*/ [] __ModelBase = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operation =
			{
				Fragments._Operation__OclAny /* 0 */,
				Fragments._Operation__OclElement /* 1 */,
				Fragments._Operation__Operation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Operation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operator =
			{
				Fragments._Operator__OclAny /* 0 */,
				Fragments._Operator__OclElement /* 1 */,
				Fragments._Operator__OclType /* 2 */,
				Fragments._Operator__OclEnumeration /* 3 */,
				Fragments._Operator__Operator /* 4 */
			};
		private static final int /*@NonNull*/ [] __Operator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringType =
			{
				Fragments._StringType__OclAny /* 0 */,
				Fragments._StringType__OclElement /* 1 */,
				Fragments._StringType__NamedElement /* 2 */,
				Fragments._StringType__Type /* 3 */,
				Fragments._StringType__DataType /* 4 */,
				Fragments._StringType__StringType /* 5 */
			};
		private static final int /*@NonNull*/ [] __StringType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__NamedElement /* 2 */,
				Fragments._Type__Type /* 3 */
			};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Var =
			{
				Fragments._Var__OclAny /* 0 */,
				Fragments._Var__OclElement /* 1 */,
				Fragments._Var__Var /* 2 */
			};
		private static final int /*@NonNull*/ [] __Var = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Variable =
			{
				Fragments._Variable__OclAny /* 0 */,
				Fragments._Variable__OclElement /* 1 */,
				Fragments._Variable__Var /* 2 */,
				Fragments._Variable__Variable /* 3 */
			};
		private static final int /*@NonNull*/ [] __Variable = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VariableReference =
			{
				Fragments._VariableReference__OclAny /* 0 */,
				Fragments._VariableReference__OclElement /* 1 */,
				Fragments._VariableReference__ExpressionElement /* 2 */,
				Fragments._VariableReference__VariableReference /* 3 */
			};
		private static final int /*@NonNull*/ [] __VariableReference = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _VoidType =
			{
				Fragments._VoidType__OclAny /* 0 */,
				Fragments._VoidType__OclElement /* 1 */,
				Fragments._VoidType__NamedElement /* 2 */,
				Fragments._VoidType__Type /* 3 */,
				Fragments._VoidType__DataType /* 4 */,
				Fragments._VoidType__VoidType /* 5 */
			};
		private static final int /*@NonNull*/ [] __VoidType = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Assignment.initFragments(_Assignment, __Assignment);
			Types._Association.initFragments(_Association, __Association);
			Types._AssociationEnd.initFragments(_AssociationEnd, __AssociationEnd);
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._AttributeReference.initFragments(_AttributeReference, __AttributeReference);
			Types._BooleanData.initFragments(_BooleanData, __BooleanData);
			Types._BooleanType.initFragments(_BooleanType, __BooleanType);
			Types._BooleanVariable.initFragments(_BooleanVariable, __BooleanVariable);
			Types._Class.initFragments(_Class, __Class);
			Types._Classifier.initFragments(_Classifier, __Classifier);
			Types._Data.initFragments(_Data, __Data);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Expression.initFragments(_Expression, __Expression);
			Types._ExpressionElement.initFragments(_ExpressionElement, __ExpressionElement);
			Types._IntegerData.initFragments(_IntegerData, __IntegerData);
			Types._IntegerType.initFragments(_IntegerType, __IntegerType);
			Types._IntegerVariable.initFragments(_IntegerVariable, __IntegerVariable);
			Types._Interface.initFragments(_Interface, __Interface);
			Types._Method.initFragments(_Method, __Method);
			Types._ModelBase.initFragments(_ModelBase, __ModelBase);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._Operator.initFragments(_Operator, __Operator);
			Types._StringType.initFragments(_StringType, __StringType);
			Types._Type.initFragments(_Type, __Type);
			Types._Var.initFragments(_Var, __Var);
			Types._Variable.initFragments(_Variable, __Variable);
			Types._VariableReference.initFragments(_VariableReference, __VariableReference);
			Types._VoidType.initFragments(_VoidType, __VoidType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Assignment__Assignment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assignment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assignment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Association__Association = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Association__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Association__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Association__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AssociationEnd__AssociationEnd = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssociationEnd__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssociationEnd__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssociationEnd__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Var = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AttributeReference__AttributeReference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeReference__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeReference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AttributeReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__BooleanData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__BooleanType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__BooleanVariable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__Var = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanVariable__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Class__Class = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Class__Classifier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Class__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Class__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Class__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Class__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__Classifier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Data__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Expression__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Expression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ExpressionElement__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ExpressionElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ExpressionElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__IntegerData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerData__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerType__IntegerType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__IntegerVariable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__Var = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerVariable__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Interface__Interface = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__Classifier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Interface__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Method__Method = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Method__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Method__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Method__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ModelBase__ModelBase = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ModelBase__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ModelBase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Operation__Operation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Operator__Operator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operator__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StringType__StringType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__Type = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Var__Var = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Var__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Var__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Variable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Var = {};

		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__VariableReference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__ExpressionElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VariableReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__VoidType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _VoidType__Type = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assignment__Assignment.initOperations(_Assignment__Assignment);
			Fragments._Assignment__OclAny.initOperations(_Assignment__OclAny);
			Fragments._Assignment__OclElement.initOperations(_Assignment__OclElement);

			Fragments._Association__Association.initOperations(_Association__Association);
			Fragments._Association__NamedElement.initOperations(_Association__NamedElement);
			Fragments._Association__OclAny.initOperations(_Association__OclAny);
			Fragments._Association__OclElement.initOperations(_Association__OclElement);

			Fragments._AssociationEnd__AssociationEnd.initOperations(_AssociationEnd__AssociationEnd);
			Fragments._AssociationEnd__NamedElement.initOperations(_AssociationEnd__NamedElement);
			Fragments._AssociationEnd__OclAny.initOperations(_AssociationEnd__OclAny);
			Fragments._AssociationEnd__OclElement.initOperations(_AssociationEnd__OclElement);

			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__NamedElement.initOperations(_Attribute__NamedElement);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);
			Fragments._Attribute__Var.initOperations(_Attribute__Var);

			Fragments._AttributeReference__AttributeReference.initOperations(_AttributeReference__AttributeReference);
			Fragments._AttributeReference__ExpressionElement.initOperations(_AttributeReference__ExpressionElement);
			Fragments._AttributeReference__OclAny.initOperations(_AttributeReference__OclAny);
			Fragments._AttributeReference__OclElement.initOperations(_AttributeReference__OclElement);

			Fragments._BooleanData__BooleanData.initOperations(_BooleanData__BooleanData);
			Fragments._BooleanData__Data.initOperations(_BooleanData__Data);
			Fragments._BooleanData__ExpressionElement.initOperations(_BooleanData__ExpressionElement);
			Fragments._BooleanData__OclAny.initOperations(_BooleanData__OclAny);
			Fragments._BooleanData__OclElement.initOperations(_BooleanData__OclElement);

			Fragments._BooleanType__BooleanType.initOperations(_BooleanType__BooleanType);
			Fragments._BooleanType__DataType.initOperations(_BooleanType__DataType);
			Fragments._BooleanType__NamedElement.initOperations(_BooleanType__NamedElement);
			Fragments._BooleanType__OclAny.initOperations(_BooleanType__OclAny);
			Fragments._BooleanType__OclElement.initOperations(_BooleanType__OclElement);
			Fragments._BooleanType__Type.initOperations(_BooleanType__Type);

			Fragments._BooleanVariable__BooleanVariable.initOperations(_BooleanVariable__BooleanVariable);
			Fragments._BooleanVariable__OclAny.initOperations(_BooleanVariable__OclAny);
			Fragments._BooleanVariable__OclElement.initOperations(_BooleanVariable__OclElement);
			Fragments._BooleanVariable__Var.initOperations(_BooleanVariable__Var);
			Fragments._BooleanVariable__Variable.initOperations(_BooleanVariable__Variable);

			Fragments._Class__Class.initOperations(_Class__Class);
			Fragments._Class__Classifier.initOperations(_Class__Classifier);
			Fragments._Class__NamedElement.initOperations(_Class__NamedElement);
			Fragments._Class__OclAny.initOperations(_Class__OclAny);
			Fragments._Class__OclElement.initOperations(_Class__OclElement);
			Fragments._Class__Type.initOperations(_Class__Type);

			Fragments._Classifier__Classifier.initOperations(_Classifier__Classifier);
			Fragments._Classifier__NamedElement.initOperations(_Classifier__NamedElement);
			Fragments._Classifier__OclAny.initOperations(_Classifier__OclAny);
			Fragments._Classifier__OclElement.initOperations(_Classifier__OclElement);
			Fragments._Classifier__Type.initOperations(_Classifier__Type);

			Fragments._Data__Data.initOperations(_Data__Data);
			Fragments._Data__ExpressionElement.initOperations(_Data__ExpressionElement);
			Fragments._Data__OclAny.initOperations(_Data__OclAny);
			Fragments._Data__OclElement.initOperations(_Data__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__NamedElement.initOperations(_DataType__NamedElement);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__Type.initOperations(_DataType__Type);

			Fragments._Expression__Expression.initOperations(_Expression__Expression);
			Fragments._Expression__ExpressionElement.initOperations(_Expression__ExpressionElement);
			Fragments._Expression__OclAny.initOperations(_Expression__OclAny);
			Fragments._Expression__OclElement.initOperations(_Expression__OclElement);

			Fragments._ExpressionElement__ExpressionElement.initOperations(_ExpressionElement__ExpressionElement);
			Fragments._ExpressionElement__OclAny.initOperations(_ExpressionElement__OclAny);
			Fragments._ExpressionElement__OclElement.initOperations(_ExpressionElement__OclElement);

			Fragments._IntegerData__Data.initOperations(_IntegerData__Data);
			Fragments._IntegerData__ExpressionElement.initOperations(_IntegerData__ExpressionElement);
			Fragments._IntegerData__IntegerData.initOperations(_IntegerData__IntegerData);
			Fragments._IntegerData__OclAny.initOperations(_IntegerData__OclAny);
			Fragments._IntegerData__OclElement.initOperations(_IntegerData__OclElement);

			Fragments._IntegerType__DataType.initOperations(_IntegerType__DataType);
			Fragments._IntegerType__IntegerType.initOperations(_IntegerType__IntegerType);
			Fragments._IntegerType__NamedElement.initOperations(_IntegerType__NamedElement);
			Fragments._IntegerType__OclAny.initOperations(_IntegerType__OclAny);
			Fragments._IntegerType__OclElement.initOperations(_IntegerType__OclElement);
			Fragments._IntegerType__Type.initOperations(_IntegerType__Type);

			Fragments._IntegerVariable__IntegerVariable.initOperations(_IntegerVariable__IntegerVariable);
			Fragments._IntegerVariable__OclAny.initOperations(_IntegerVariable__OclAny);
			Fragments._IntegerVariable__OclElement.initOperations(_IntegerVariable__OclElement);
			Fragments._IntegerVariable__Var.initOperations(_IntegerVariable__Var);
			Fragments._IntegerVariable__Variable.initOperations(_IntegerVariable__Variable);

			Fragments._Interface__Classifier.initOperations(_Interface__Classifier);
			Fragments._Interface__Interface.initOperations(_Interface__Interface);
			Fragments._Interface__NamedElement.initOperations(_Interface__NamedElement);
			Fragments._Interface__OclAny.initOperations(_Interface__OclAny);
			Fragments._Interface__OclElement.initOperations(_Interface__OclElement);
			Fragments._Interface__Type.initOperations(_Interface__Type);

			Fragments._Method__Method.initOperations(_Method__Method);
			Fragments._Method__NamedElement.initOperations(_Method__NamedElement);
			Fragments._Method__OclAny.initOperations(_Method__OclAny);
			Fragments._Method__OclElement.initOperations(_Method__OclElement);

			Fragments._ModelBase__ModelBase.initOperations(_ModelBase__ModelBase);
			Fragments._ModelBase__OclAny.initOperations(_ModelBase__OclAny);
			Fragments._ModelBase__OclElement.initOperations(_ModelBase__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);

			Fragments._Operator__OclAny.initOperations(_Operator__OclAny);
			Fragments._Operator__OclElement.initOperations(_Operator__OclElement);
			Fragments._Operator__OclEnumeration.initOperations(_Operator__OclEnumeration);
			Fragments._Operator__OclType.initOperations(_Operator__OclType);
			Fragments._Operator__Operator.initOperations(_Operator__Operator);

			Fragments._StringType__DataType.initOperations(_StringType__DataType);
			Fragments._StringType__NamedElement.initOperations(_StringType__NamedElement);
			Fragments._StringType__OclAny.initOperations(_StringType__OclAny);
			Fragments._StringType__OclElement.initOperations(_StringType__OclElement);
			Fragments._StringType__StringType.initOperations(_StringType__StringType);
			Fragments._StringType__Type.initOperations(_StringType__Type);

			Fragments._Type__NamedElement.initOperations(_Type__NamedElement);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._Var__OclAny.initOperations(_Var__OclAny);
			Fragments._Var__OclElement.initOperations(_Var__OclElement);
			Fragments._Var__Var.initOperations(_Var__Var);

			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__Var.initOperations(_Variable__Var);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);

			Fragments._VariableReference__ExpressionElement.initOperations(_VariableReference__ExpressionElement);
			Fragments._VariableReference__OclAny.initOperations(_VariableReference__OclAny);
			Fragments._VariableReference__OclElement.initOperations(_VariableReference__OclElement);
			Fragments._VariableReference__VariableReference.initOperations(_VariableReference__VariableReference);

			Fragments._VoidType__DataType.initOperations(_VoidType__DataType);
			Fragments._VoidType__NamedElement.initOperations(_VoidType__NamedElement);
			Fragments._VoidType__OclAny.initOperations(_VoidType__OclAny);
			Fragments._VoidType__OclElement.initOperations(_VoidType__OclElement);
			Fragments._VoidType__Type.initOperations(_VoidType__Type);
			Fragments._VoidType__VoidType.initOperations(_VoidType__VoidType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Assignment = {
			ClassDiagramTables.Properties._Assignment___name,
			ClassDiagramTables.Properties._Assignment__expression,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Assignment__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Association = {
			ClassDiagramTables.Properties._Association__ends,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssociationEnd = {
			ClassDiagramTables.Properties._AssociationEnd___class,
			ClassDiagramTables.Properties._AssociationEnd__association,
			ClassDiagramTables.Properties._AssociationEnd__lowerBound,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._AssociationEnd__upperBound
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			ClassDiagramTables.Properties._Attribute__initialValue,
			ClassDiagramTables.Properties._Attribute__multiplicity,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Attribute__owner,
			ClassDiagramTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AttributeReference = {
			ClassDiagramTables.Properties._AttributeReference___name,
			ClassDiagramTables.Properties._AttributeReference__atttribute,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanData = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._BooleanData__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanType = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanVariable = {
			ClassDiagramTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Variable__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Class = {
			ClassDiagramTables.Properties._Class__associations,
			ClassDiagramTables.Properties._Classifier__attributes,
			ClassDiagramTables.Properties._Class__interfaces,
			ClassDiagramTables.Properties._Classifier__methods,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Classifier = {
			ClassDiagramTables.Properties._Classifier__attributes,
			ClassDiagramTables.Properties._Classifier__methods,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Data = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Expression = {
			ClassDiagramTables.Properties._Expression___name,
			ClassDiagramTables.Properties._Expression__left,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Expression__operator,
			ClassDiagramTables.Properties._Expression__right
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ExpressionElement = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerData = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._IntegerData__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerType = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerVariable = {
			ClassDiagramTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Variable__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Interface = {
			ClassDiagramTables.Properties._Classifier__attributes,
			ClassDiagramTables.Properties._Interface__implementedBy,
			ClassDiagramTables.Properties._Classifier__methods,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Method = {
			ClassDiagramTables.Properties._Method__body,
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Method__owner,
			ClassDiagramTables.Properties._Method__paramNames,
			ClassDiagramTables.Properties._Method__paramTypes,
			ClassDiagramTables.Properties._Method__returnType,
			ClassDiagramTables.Properties._Method__returnVariable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ModelBase = {
			ClassDiagramTables.Properties._ModelBase__allAssociations,
			ClassDiagramTables.Properties._ModelBase__allClasses,
			ClassDiagramTables.Properties._ModelBase__allInterfaces,
			ClassDiagramTables.Properties._ModelBase__boolT,
			ClassDiagramTables.Properties._ModelBase__intT,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._ModelBase__stringT,
			ClassDiagramTables.Properties._ModelBase__voidT
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operation = {
			ClassDiagramTables.Properties._Operation__contents,
			ClassDiagramTables.Properties._Operation__localVariables,
			ClassDiagramTables.Properties._Operation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operator = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringType = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Type = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Var = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Variable = {
			ClassDiagramTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._Variable__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VariableReference = {
			ClassDiagramTables.Properties._VariableReference___name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ClassDiagramTables.Properties._VariableReference__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _VoidType = {
			ClassDiagramTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assignment__Assignment.initProperties(_Assignment);
			Fragments._Association__Association.initProperties(_Association);
			Fragments._AssociationEnd__AssociationEnd.initProperties(_AssociationEnd);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._AttributeReference__AttributeReference.initProperties(_AttributeReference);
			Fragments._BooleanData__BooleanData.initProperties(_BooleanData);
			Fragments._BooleanType__BooleanType.initProperties(_BooleanType);
			Fragments._BooleanVariable__BooleanVariable.initProperties(_BooleanVariable);
			Fragments._Class__Class.initProperties(_Class);
			Fragments._Classifier__Classifier.initProperties(_Classifier);
			Fragments._Data__Data.initProperties(_Data);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._Expression__Expression.initProperties(_Expression);
			Fragments._ExpressionElement__ExpressionElement.initProperties(_ExpressionElement);
			Fragments._IntegerData__IntegerData.initProperties(_IntegerData);
			Fragments._IntegerType__IntegerType.initProperties(_IntegerType);
			Fragments._IntegerVariable__IntegerVariable.initProperties(_IntegerVariable);
			Fragments._Interface__Interface.initProperties(_Interface);
			Fragments._Method__Method.initProperties(_Method);
			Fragments._ModelBase__ModelBase.initProperties(_ModelBase);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._Operator__Operator.initProperties(_Operator);
			Fragments._StringType__StringType.initProperties(_StringType);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._Var__Var.initProperties(_Var);
			Fragments._Variable__Variable.initProperties(_Variable);
			Fragments._VariableReference__VariableReference.initProperties(_VariableReference);
			Fragments._VoidType__VoidType.initProperties(_VoidType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Operator__add = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("add"), Types._Operator, 0);
		public static final EcoreExecutorEnumerationLiteral _Operator__sub = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("sub"), Types._Operator, 1);
		public static final EcoreExecutorEnumerationLiteral _Operator__eq = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("eq"), Types._Operator, 2);
		public static final EcoreExecutorEnumerationLiteral _Operator__mul = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("mul"), Types._Operator, 3);
		public static final EcoreExecutorEnumerationLiteral _Operator__gt = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("gt"), Types._Operator, 4);
		public static final EcoreExecutorEnumerationLiteral _Operator__lt = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("lt"), Types._Operator, 5);
		public static final EcoreExecutorEnumerationLiteral _Operator__lte = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("lte"), Types._Operator, 6);
		public static final EcoreExecutorEnumerationLiteral _Operator__gte = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("gte"), Types._Operator, 7);
		public static final EcoreExecutorEnumerationLiteral _Operator__div = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("div"), Types._Operator, 8);
		public static final EcoreExecutorEnumerationLiteral _Operator__and = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("and"), Types._Operator, 9);
		public static final EcoreExecutorEnumerationLiteral _Operator__neq = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("neq"), Types._Operator, 10);
		public static final EcoreExecutorEnumerationLiteral _Operator__or = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("or"), Types._Operator, 11);
		public static final EcoreExecutorEnumerationLiteral _Operator__not = new EcoreExecutorEnumerationLiteral(ClassDiagramPackage.Literals.OPERATOR.getEEnumLiteral("not"), Types._Operator, 12);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Operator = {
			_Operator__add,
			_Operator__sub,
			_Operator__eq,
			_Operator__mul,
			_Operator__gt,
			_Operator__lt,
			_Operator__lte,
			_Operator__gte,
			_Operator__div,
			_Operator__and,
			_Operator__neq,
			_Operator__or,
			_Operator__not
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Operator.initLiterals(_Operator);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ClassDiagramTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ClassDiagramTables();
	}

	private ClassDiagramTables() {
		super(ClassDiagramPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ClassDiagramPackage.Literals.TYPE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
