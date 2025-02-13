/**
 */
package ClassDiagram.tests;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.StringType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ClassDiagram.StringType#stringName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>String Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StringTypeTest extends DataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringTypeTest.class);
	}

	/**
	 * Constructs a new String Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringType getFixture() {
		return (StringType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassDiagramFactory.eINSTANCE.createStringType());
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
	 * Tests the '{@link ClassDiagram.StringType#stringName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>String Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.StringType#stringName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testStringName__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StringTypeTest
