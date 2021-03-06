/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.oCLlite.URI_#getScheme <em>Scheme</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.URI_#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.URI_#getFragment_ <em>Fragment </em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.oCLlite.OCLlitePackage#getURI_()
 * @model
 * @generated
 */
public interface URI_ extends EObject
{
  /**
   * Returns the value of the '<em><b>Scheme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheme</em>' attribute.
   * @see #setScheme(String)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getURI__Scheme()
   * @model
   * @generated
   */
  String getScheme();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.URI_#getScheme <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheme</em>' attribute.
   * @see #getScheme()
   * @generated
   */
  void setScheme(String value);

  /**
   * Returns the value of the '<em><b>Authority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authority</em>' attribute.
   * @see #setAuthority(String)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getURI__Authority()
   * @model
   * @generated
   */
  String getAuthority();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.URI_#getAuthority <em>Authority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Authority</em>' attribute.
   * @see #getAuthority()
   * @generated
   */
  void setAuthority(String value);

  /**
   * Returns the value of the '<em><b>Fragment </b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragment </em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragment </em>' attribute.
   * @see #setFragment_(String)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getURI__Fragment_()
   * @model
   * @generated
   */
  String getFragment_();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.URI_#getFragment_ <em>Fragment </em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fragment </em>' attribute.
   * @see #getFragment_()
   * @generated
   */
  void setFragment_(String value);

} // URI_
