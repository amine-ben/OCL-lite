/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite.impl;

import fr.inria.diverse.oCLlite.LambdaType;
import fr.inria.diverse.oCLlite.OCLlitePackage;
import fr.inria.diverse.oCLlite.OclLType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.oCLlite.impl.LambdaTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.impl.LambdaTypeImpl#getArgsTypes <em>Args Types</em>}</li>
 *   <li>{@link fr.inria.diverse.oCLlite.impl.LambdaTypeImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaTypeImpl extends OclLTypeImpl implements LambdaType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgsTypes() <em>Args Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgsTypes()
   * @generated
   * @ordered
   */
  protected EList<OclLType> argsTypes;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected OclLType returnType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LambdaTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OCLlitePackage.Literals.LAMBDA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OCLlitePackage.LAMBDA_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OclLType> getArgsTypes()
  {
    if (argsTypes == null)
    {
      argsTypes = new EObjectContainmentEList<OclLType>(OclLType.class, this, OCLlitePackage.LAMBDA_TYPE__ARGS_TYPES);
    }
    return argsTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(OclLType newReturnType, NotificationChain msgs)
  {
    OclLType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(OclLType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OCLlitePackage.LAMBDA_TYPE__ARGS_TYPES:
        return ((InternalEList<?>)getArgsTypes()).basicRemove(otherEnd, msgs);
      case OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OCLlitePackage.LAMBDA_TYPE__NAME:
        return getName();
      case OCLlitePackage.LAMBDA_TYPE__ARGS_TYPES:
        return getArgsTypes();
      case OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OCLlitePackage.LAMBDA_TYPE__NAME:
        setName((String)newValue);
        return;
      case OCLlitePackage.LAMBDA_TYPE__ARGS_TYPES:
        getArgsTypes().clear();
        getArgsTypes().addAll((Collection<? extends OclLType>)newValue);
        return;
      case OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE:
        setReturnType((OclLType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OCLlitePackage.LAMBDA_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OCLlitePackage.LAMBDA_TYPE__ARGS_TYPES:
        getArgsTypes().clear();
        return;
      case OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE:
        setReturnType((OclLType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OCLlitePackage.LAMBDA_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OCLlitePackage.LAMBDA_TYPE__ARGS_TYPES:
        return argsTypes != null && !argsTypes.isEmpty();
      case OCLlitePackage.LAMBDA_TYPE__RETURN_TYPE:
        return returnType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LambdaTypeImpl
