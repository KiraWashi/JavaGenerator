/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Interface#getImplementedBy <em>Implemented By</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noAttributeInInterface'"
 * @generated
 */
public interface Interface extends Classifier {
	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Class}.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Class#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getInterface_ImplementedBy()
	 * @see ClassDiagram.Class#getInterfaces
	 * @model opposite="interfaces"
	 * @generated
	 */
	EList<ClassDiagram.Class> getImplementedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.attributes -&gt; isEmpty()'"
	 * @generated
	 */
	boolean noAttributeInInterface(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Interface
