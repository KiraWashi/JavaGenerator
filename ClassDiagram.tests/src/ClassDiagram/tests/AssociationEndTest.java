/**
 */
package ClassDiagram.tests;

import ClassDiagram.AssociationEnd;
import ClassDiagram.ClassDiagramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationEndTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationEndTest.class);
	}

	/**
	 * Constructs a new Association End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssociationEnd getFixture() {
		return (AssociationEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassDiagramFactory.eINSTANCE.createAssociationEnd());
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

} //AssociationEndTest
