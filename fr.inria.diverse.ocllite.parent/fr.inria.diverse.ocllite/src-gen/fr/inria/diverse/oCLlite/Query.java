/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.oCLlite.Query#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.Query#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.oCLlite.OCLlitePackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends ModuleElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getQuery_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.Query#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(OclLExpression)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getQuery_Body()
   * @model containment="true"
   * @generated
   */
  OclLExpression getBody();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.Query#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(OclLExpression value);

} // Query
