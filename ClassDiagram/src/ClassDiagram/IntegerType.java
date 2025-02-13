/**
 */
package ClassDiagram;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIntegerType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='integerName'"
 * @generated
 */
public interface IntegerType extends DataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name=\'integer\''"
	 * @generated
	 */
	boolean integerName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IntegerType
