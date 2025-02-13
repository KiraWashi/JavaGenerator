/**
 */
package ClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.VariableReference#getVariable <em>Variable</em>}</li>
 *   <li>{@link ClassDiagram.VariableReference#get_name <em>name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ClassDiagram.ClassDiagramPackage#getVariableReference_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ClassDiagram.VariableReference#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>name</em>' attribute.
	 * @see #set_name(String)
	 * @see ClassDiagram.ClassDiagramPackage#getVariableReference__name()
	 * @model
	 * @generated
	 */
	String get_name();

	/**
	 * Sets the value of the '{@link ClassDiagram.VariableReference#get_name <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>name</em>' attribute.
	 * @see #get_name()
	 * @generated
	 */
	void set_name(String value);

} // VariableReference
