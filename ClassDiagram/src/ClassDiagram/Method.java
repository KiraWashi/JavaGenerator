/**
 */
package ClassDiagram;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ClassDiagram.Method#getReturnVariable <em>Return Variable</em>}</li>
 *   <li>{@link ClassDiagram.Method#getParams <em>Params</em>}</li>
 *   <li>{@link ClassDiagram.Method#getParamTypes <em>Param Types</em>}</li>
 *   <li>{@link ClassDiagram.Method#getParamNames <em>Param Names</em>}</li>
 *   <li>{@link ClassDiagram.Method#getOwner <em>Owner</em>}</li>
 *   <li>{@link ClassDiagram.Method#getCorps <em>Corps</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getMethod()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parametersSize'"
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Variable</em>' reference.
	 * @see #setReturnVariable(Variable)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ReturnVariable()
	 * @model
	 * @generated
	 */
	Variable getReturnVariable();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getReturnVariable <em>Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Variable</em>' reference.
	 * @see #getReturnVariable()
	 * @generated
	 */
	void setReturnVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(Parameter)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_Params()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getParams();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(Parameter value);

	/**
	 * Returns the value of the '<em><b>Param Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Types</em>' reference.
	 * @see #setParamTypes(Type)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ParamTypes()
	 * @model
	 * @generated
	 */
	Type getParamTypes();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getParamTypes <em>Param Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Types</em>' reference.
	 * @see #getParamTypes()
	 * @generated
	 */
	void setParamTypes(Type value);

	/**
	 * Returns the value of the '<em><b>Param Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Names</em>' attribute.
	 * @see #setParamNames(String)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_ParamNames()
	 * @model
	 * @generated
	 */
	String getParamNames();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getParamNames <em>Param Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Names</em>' attribute.
	 * @see #getParamNames()
	 * @generated
	 */
	void setParamNames(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ClassDiagram.Classifier#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Classifier)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_Owner()
	 * @see ClassDiagram.Classifier#getMethods
	 * @model opposite="methods" required="true" transient="false"
	 * @generated
	 */
	Classifier getOwner();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Classifier value);

	/**
	 * Returns the value of the '<em><b>Corps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corps</em>' containment reference.
	 * @see #setCorps(Operation)
	 * @see ClassDiagram.ClassDiagramPackage#getMethod_Corps()
	 * @model containment="true"
	 * @generated
	 */
	Operation getCorps();

	/**
	 * Sets the value of the '{@link ClassDiagram.Method#getCorps <em>Corps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corps</em>' containment reference.
	 * @see #getCorps()
	 * @generated
	 */
	void setCorps(Operation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.paramTypes -&gt; exists (t : Type | t.oclIsTypeOf(VoidType))'"
	 * @generated
	 */
	boolean paramNotVoid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.params -&gt; size() = self.params -&gt; size()'"
	 * @generated
	 */
	boolean parametersSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Method
