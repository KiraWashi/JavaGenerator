/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Assignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link ClassDiagram.Assignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link ClassDiagram.Assignment#get_name <em>name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionElement)
	 * @see ClassDiagram.ClassDiagramPackage#getAssignment_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionElement getExpression();

	/**
	 * Sets the value of the '{@link ClassDiagram.Assignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Var)
	 * @see ClassDiagram.ClassDiagramPackage#getAssignment_Variable()
	 * @model required="true"
	 * @generated
	 */
	Var getVariable();

	/**
	 * Sets the value of the '{@link ClassDiagram.Assignment#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Var value);

	/**
	 * Returns the value of the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>name</em>' attribute.
	 * @see #set_name(String)
	 * @see ClassDiagram.ClassDiagramPackage#getAssignment__name()
	 * @model
	 * @generated
	 */
	String get_name();

	/**
	 * Sets the value of the '{@link ClassDiagram.Assignment#get_name <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>name</em>' attribute.
	 * @see #get_name()
	 * @generated
	 */
	void set_name(String value);

} // Assignment
