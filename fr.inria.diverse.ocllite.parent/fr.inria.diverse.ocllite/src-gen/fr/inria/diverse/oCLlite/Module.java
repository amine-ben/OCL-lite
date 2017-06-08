/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.oCLlite.Module#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.Module#getSource <em>Source</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.Module#getInput <em>Input</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.Module#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.oCLlite.OCLlitePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
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
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(OclLModel)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getModule_Source()
   * @model containment="true"
   * @generated
   */
  OclLModel getSource();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.Module#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(OclLModel value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(OclLModel)
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getModule_Input()
   * @model containment="true"
   * @generated
   */
  OclLModel getInput();

  /**
   * Sets the value of the '{@link fr.inria.diverse.oCLlite.Module#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(OclLModel value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.oCLlite.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getModule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.oCLlite.ModuleElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.inria.diverse.oCLlite.OCLlitePackage#getModule_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ModuleElement> getElements();

} // Module
