/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Class#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link ClassDiagram.Class#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueAttributeNames'"
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Interface}.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Interface#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getClass_Interfaces()
	 * @see ClassDiagram.Interface#getImplementedBy
	 * @model opposite="implementedBy"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.AssociationEnd}.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.AssociationEnd#get_class <em>class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getClass_Associations()
	 * @see ClassDiagram.AssociationEnd#get_class
	 * @model opposite="_class"
	 * @generated
	 */
	EList<AssociationEnd> getAssociations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='attributes -&gt; forAll (a1, a2 | a1 &lt;&gt; a2 implies a1.name &lt;&gt; a2.name)'"
	 * @generated
	 */
	boolean uniqueAttributeNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Class
