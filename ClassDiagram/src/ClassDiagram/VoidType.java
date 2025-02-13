/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Void Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getVoidType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='voidName'"
 * @generated
 */
public interface VoidType extends DataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name=\'void\''"
	 * @generated
	 */
	boolean voidName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // VoidType
