/**
 */
package ClassDiagram.tests;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.IntegerType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ClassDiagram.IntegerType#integerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Integer Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class IntegerTypeTest extends DataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerTypeTest.class);
	}

	/**
	 * Constructs a new Integer Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerType getFixture() {
		return (IntegerType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassDiagramFactory.eINSTANCE.createIntegerType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link ClassDiagram.IntegerType#integerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Integer Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IntegerType#integerName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testIntegerName__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //IntegerTypeTest
