/**
 */
package ClassDiagram.tests;

import ClassDiagram.AttributeReference;
import ClassDiagram.ClassDiagramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeReferenceTest extends ExpressionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeReferenceTest.class);
	}

	/**
	 * Constructs a new Attribute Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeReference getFixture() {
		return (AttributeReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassDiagramFactory.eINSTANCE.createAttributeReference());
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

} //AttributeReferenceTest
