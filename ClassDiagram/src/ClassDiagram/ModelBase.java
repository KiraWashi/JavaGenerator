/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.ModelBase#getVoidT <em>Void T</em>}</li>
 *   <li>{@link ClassDiagram.ModelBase#getStringT <em>String T</em>}</li>
 *   <li>{@link ClassDiagram.ModelBase#getIntT <em>Int T</em>}</li>
 *   <li>{@link ClassDiagram.ModelBase#getBoolT <em>Bool T</em>}</li>
 *   <li>{@link ClassDiagram.ModelBase#getAllClasses <em>All Classes</em>}</li>
 *   <li>{@link ClassDiagram.ModelBase#getAllInterfaces <em>All Interfaces</em>}</li>
 *   <li>{@link ClassDiagram.ModelBase#getAllAssociations <em>All Associations</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getModelBase()
 * @model
 * @generated
 */
public interface ModelBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Void T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Void T</em>' containment reference.
	 * @see #setVoidT(VoidType)
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_VoidT()
	 * @model containment="true"
	 * @generated
	 */
	VoidType getVoidT();

	/**
	 * Sets the value of the '{@link ClassDiagram.ModelBase#getVoidT <em>Void T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Void T</em>' containment reference.
	 * @see #getVoidT()
	 * @generated
	 */
	void setVoidT(VoidType value);

	/**
	 * Returns the value of the '<em><b>String T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String T</em>' containment reference.
	 * @see #setStringT(StringType)
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_StringT()
	 * @model containment="true"
	 * @generated
	 */
	StringType getStringT();

	/**
	 * Sets the value of the '{@link ClassDiagram.ModelBase#getStringT <em>String T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String T</em>' containment reference.
	 * @see #getStringT()
	 * @generated
	 */
	void setStringT(StringType value);

	/**
	 * Returns the value of the '<em><b>Int T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int T</em>' containment reference.
	 * @see #setIntT(IntegerType)
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_IntT()
	 * @model containment="true"
	 * @generated
	 */
	IntegerType getIntT();

	/**
	 * Sets the value of the '{@link ClassDiagram.ModelBase#getIntT <em>Int T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int T</em>' containment reference.
	 * @see #getIntT()
	 * @generated
	 */
	void setIntT(IntegerType value);

	/**
	 * Returns the value of the '<em><b>Bool T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool T</em>' containment reference.
	 * @see #setBoolT(BooleanType)
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_BoolT()
	 * @model containment="true"
	 * @generated
	 */
	BooleanType getBoolT();

	/**
	 * Sets the value of the '{@link ClassDiagram.ModelBase#getBoolT <em>Bool T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool T</em>' containment reference.
	 * @see #getBoolT()
	 * @generated
	 */
	void setBoolT(BooleanType value);

	/**
	 * Returns the value of the '<em><b>All Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ClassDiagram.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Classes</em>' containment reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_AllClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDiagram.Class> getAllClasses();

	/**
	 * Returns the value of the '<em><b>All Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ClassDiagram.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Interfaces</em>' containment reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_AllInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getAllInterfaces();

	/**
	 * Returns the value of the '<em><b>All Associations</b></em>' containment reference list.
	 * The list contents are of type {@link ClassDiagram.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Associations</em>' containment reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getModelBase_AllAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAllAssociations();

} // ModelBase
