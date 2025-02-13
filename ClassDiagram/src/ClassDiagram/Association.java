/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Association#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
	 * The list contents are of type {@link ClassDiagram.AssociationEnd}.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.AssociationEnd#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' containment reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getAssociation_Ends()
	 * @see ClassDiagram.AssociationEnd#getAssociation
	 * @model opposite="association" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<AssociationEnd> getEnds();

} // Association
