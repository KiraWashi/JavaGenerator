/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getStringType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stringName'"
 * @generated
 */
public interface StringType extends DataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name=\'string\''"
	 * @generated
	 */
	boolean stringName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StringType
