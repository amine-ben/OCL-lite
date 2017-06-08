/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl LModel Element Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.oCLlite.OclLModelElementExp#getModel <em>Model</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.OclLModelElementExp#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.oCLlite.OCLlitePackage#getOclLModelElementExp()
 * @model
 * @generated
 */
public interface OclLModelElementExp extends OclLType
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference.
   * @see #setModel(OclLModel)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getOclLModelElementExp_Model()
   * @model containment="true"
   * @generated
   */
  OclLModel getModel();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.OclLModelElementExp#getModel <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' containment reference.
   * @see #getModel()
   * @generated
   */
  void setModel(OclLModel value);

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
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getOclLModelElementExp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.OclLModelElementExp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // OclLModelElementExp