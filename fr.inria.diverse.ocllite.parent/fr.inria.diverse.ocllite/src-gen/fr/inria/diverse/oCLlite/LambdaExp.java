/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.oCLlite.LambdaExp#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.oCLlite.OCLlitePackage#getLambdaExp()
 * @model
 * @generated
 */
public interface LambdaExp extends OclLExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(OclLExpression)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getLambdaExp_Expression()
   * @model containment="true"
   * @generated
   */
  OclLExpression getExpression();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.LambdaExp#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(OclLExpression value);

} // LambdaExp
