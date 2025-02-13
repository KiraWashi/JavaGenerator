/**
 */
package ClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.AssociationEnd#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link ClassDiagram.AssociationEnd#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ClassDiagram.AssociationEnd#get_class <em>class</em>}</li>
 *   <li>{@link ClassDiagram.AssociationEnd#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see ClassDiagram.ClassDiagramPackage#getAssociationEnd_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link ClassDiagram.AssociationEnd#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see ClassDiagram.ClassDiagramPackage#getAssociationEnd_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link ClassDiagram.AssociationEnd#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Class#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>class</em>' reference.
	 * @see #set_class(ClassDiagram.Class)
	 * @see ClassDiagram.ClassDiagramPackage#getAssociationEnd__class()
	 * @see ClassDiagram.Class#getAssociations
	 * @model opposite="associations" required="true"
	 * @generated
	 */
	ClassDiagram.Class get_class();

	/**
	 * Sets the value of the '{@link ClassDiagram.AssociationEnd#get_class <em>class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>class</em>' reference.
	 * @see #get_class()
	 * @generated
	 */
	void set_class(ClassDiagram.Class value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Association#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' container reference.
	 * @see #setAssociation(Association)
	 * @see ClassDiagram.ClassDiagramPackage#getAssociationEnd_Association()
	 * @see ClassDiagram.Association#getEnds
	 * @model opposite="ends" required="true" transient="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link ClassDiagram.AssociationEnd#getAssociation <em>Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' container reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

} // AssociationEnd
