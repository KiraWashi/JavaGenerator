/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Classifier#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ClassDiagram.Classifier#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Type {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ClassDiagram.Attribute}.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getClassifier_Attributes()
	 * @see ClassDiagram.Attribute#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link ClassDiagram.Method}.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Method#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getClassifier_Methods()
	 * @see ClassDiagram.Method#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

} // Classifier
