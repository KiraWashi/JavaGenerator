/**
 */
package ClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.AttributeReference#getAtttribute <em>Atttribute</em>}</li>
 *   <li>{@link ClassDiagram.AttributeReference#get_name <em>name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Atttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atttribute</em>' reference.
	 * @see #setAtttribute(Attribute)
	 * @see ClassDiagram.ClassDiagramPackage#getAttributeReference_Atttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAtttribute();

	/**
	 * Sets the value of the '{@link ClassDiagram.AttributeReference#getAtttribute <em>Atttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atttribute</em>' reference.
	 * @see #getAtttribute()
	 * @generated
	 */
	void setAtttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>name</em>' attribute.
	 * @see #set_name(String)
	 * @see ClassDiagram.ClassDiagramPackage#getAttributeReference__name()
	 * @model
	 * @generated
	 */
	String get_name();

	/**
	 * Sets the value of the '{@link ClassDiagram.AttributeReference#get_name <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>name</em>' attribute.
	 * @see #get_name()
	 * @generated
	 */
	void set_name(String value);

} // AttributeReference
