/**
 */
package ClassDiagram.tests;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.IntegerData;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerDataTest extends DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerDataTest.class);
	}

	/**
	 * Constructs a new Integer Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerData getFixture() {
		return (IntegerData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassDiagramFactory.eINSTANCE.createIntegerData());
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

} //IntegerDataTest
