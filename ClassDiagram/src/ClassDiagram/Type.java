/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getType()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unicityTypeNames'"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Type.allInstances() -&gt; forAll(t1, t2 | t1 &lt;&gt; t2 implies t1.name &lt;&gt; t2.name)'"
	 * @generated
	 */
	boolean unicityTypeNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Type
