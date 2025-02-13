/**
 */
package ClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.IntegerData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getIntegerData()
 * @model
 * @generated
 */
public interface IntegerData extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ClassDiagram.ClassDiagramPackage#getIntegerData_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ClassDiagram.IntegerData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerData
