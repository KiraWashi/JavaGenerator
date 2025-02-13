/**
 */
package ClassDiagram.tests;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.Interface;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ClassDiagram.Interface#noAttributeInInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Attribute In Interface</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InterfaceTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterfaceTest.class);
	}

	/**
	 * Constructs a new Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Interface getFixture() {
		return (Interface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassDiagramFactory.eINSTANCE.createInterface());
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
	 * Tests the '{@link ClassDiagram.Interface#noAttributeInInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Attribute In Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.Interface#noAttributeInInterface(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testNoAttributeInInterface__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //InterfaceTest
