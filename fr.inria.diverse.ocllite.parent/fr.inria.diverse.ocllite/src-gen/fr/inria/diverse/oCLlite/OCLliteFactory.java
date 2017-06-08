/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.oCLlite.OCLlitePackage
 * @generated
 */
public interface OCLliteFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OCLliteFactory eINSTANCE = fr.inria.diverse.oCLlite.impl.OCLliteFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Ocl LModel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl LModel</em>'.
   * @generated
   */
  OclLModel createOclLModel();

  /**
   * Returns a new object of class '<em>URI </em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI </em>'.
   * @generated
   */
  URI_ createURI_();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Module Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Element</em>'.
   * @generated
   */
  ModuleElement createModuleElement();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Ocl LExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl LExpression</em>'.
   * @generated
   */
  OclLExpression createOclLExpression();

  /**
   * Returns a new object of class '<em>Iterator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterator</em>'.
   * @generated
   */
  Iterator createIterator();

  /**
   * Returns a new object of class '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable</em>'.
   * @generated
   */
  LocalVariable createLocalVariable();

  /**
   * Returns a new object of class '<em>Collection Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Exp</em>'.
   * @generated
   */
  CollectionExp createCollectionExp();

  /**
   * Returns a new object of class '<em>Bag Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bag Exp</em>'.
   * @generated
   */
  BagExp createBagExp();

  /**
   * Returns a new object of class '<em>Sequence Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Exp</em>'.
   * @generated
   */
  SequenceExp createSequenceExp();

  /**
   * Returns a new object of class '<em>Set Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Exp</em>'.
   * @generated
   */
  SetExp createSetExp();

  /**
   * Returns a new object of class '<em>Ordered Set Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Set Exp</em>'.
   * @generated
   */
  OrderedSetExp createOrderedSetExp();

  /**
   * Returns a new object of class '<em>Map Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Exp</em>'.
   * @generated
   */
  MapExp createMapExp();

  /**
   * Returns a new object of class '<em>Map Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Element</em>'.
   * @generated
   */
  MapElement createMapElement();

  /**
   * Returns a new object of class '<em>Tuple Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Part</em>'.
   * @generated
   */
  TuplePart createTuplePart();

  /**
   * Returns a new object of class '<em>Primitive Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Exp</em>'.
   * @generated
   */
  PrimitiveExp createPrimitiveExp();

  /**
   * Returns a new object of class '<em>Number Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal Exp</em>'.
   * @generated
   */
  NumberLiteralExp createNumberLiteralExp();

  /**
   * Returns a new object of class '<em>String Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal Exp</em>'.
   * @generated
   */
  StringLiteralExp createStringLiteralExp();

  /**
   * Returns a new object of class '<em>Boolean Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal Exp</em>'.
   * @generated
   */
  BooleanLiteralExp createBooleanLiteralExp();

  /**
   * Returns a new object of class '<em>Unlimited Natural Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unlimited Natural Literal Exp</em>'.
   * @generated
   */
  UnlimitedNaturalLiteralExp createUnlimitedNaturalLiteralExp();

  /**
   * Returns a new object of class '<em>Invalid Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invalid Literal Exp</em>'.
   * @generated
   */
  InvalidLiteralExp createInvalidLiteralExp();

  /**
   * Returns a new object of class '<em>Null Literal Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal Exp</em>'.
   * @generated
   */
  NullLiteralExp createNullLiteralExp();

  /**
   * Returns a new object of class '<em>If Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Exp</em>'.
   * @generated
   */
  IfExp createIfExp();

  /**
   * Returns a new object of class '<em>Ocl LType</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl LType</em>'.
   * @generated
   */
  OclLType createOclLType();

  /**
   * Returns a new object of class '<em>Ocl LModel Element Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl LModel Element Exp</em>'.
   * @generated
   */
  OclLModelElementExp createOclLModelElementExp();

  /**
   * Returns a new object of class '<em>Env Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Env Type</em>'.
   * @generated
   */
  EnvType createEnvType();

  /**
   * Returns a new object of class '<em>Lambda Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lambda Type</em>'.
   * @generated
   */
  LambdaType createLambdaType();

  /**
   * Returns a new object of class '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Type</em>'.
   * @generated
   */
  MapType createMapType();

  /**
   * Returns a new object of class '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type</em>'.
   * @generated
   */
  TupleType createTupleType();

  /**
   * Returns a new object of class '<em>Ocl LAny Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ocl LAny Type</em>'.
   * @generated
   */
  OclLAnyType createOclLAnyType();

  /**
   * Returns a new object of class '<em>Set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Type</em>'.
   * @generated
   */
  SetType createSetType();

  /**
   * Returns a new object of class '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Type</em>'.
   * @generated
   */
  SequenceType createSequenceType();

  /**
   * Returns a new object of class '<em>Ordered Set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Set Type</em>'.
   * @generated
   */
  OrderedSetType createOrderedSetType();

  /**
   * Returns a new object of class '<em>Bag Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bag Type</em>'.
   * @generated
   */
  BagType createBagType();

  /**
   * Returns a new object of class '<em>Real Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Type</em>'.
   * @generated
   */
  RealType createRealType();

  /**
   * Returns a new object of class '<em>Integer Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Type</em>'.
   * @generated
   */
  IntegerType createIntegerType();

  /**
   * Returns a new object of class '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Type</em>'.
   * @generated
   */
  BooleanType createBooleanType();

  /**
   * Returns a new object of class '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Type</em>'.
   * @generated
   */
  StringType createStringType();

  /**
   * Returns a new object of class '<em>Bool Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Op Call Exp</em>'.
   * @generated
   */
  BoolOpCallExp createBoolOpCallExp();

  /**
   * Returns a new object of class '<em>Eq Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eq Op Call Exp</em>'.
   * @generated
   */
  EqOpCallExp createEqOpCallExp();

  /**
   * Returns a new object of class '<em>Com Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Com Op Call Exp</em>'.
   * @generated
   */
  ComOpCallExp createComOpCallExp();

  /**
   * Returns a new object of class '<em>Add Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Op Call Exp</em>'.
   * @generated
   */
  AddOpCallExp createAddOpCallExp();

  /**
   * Returns a new object of class '<em>Mul Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Op Call Exp</em>'.
   * @generated
   */
  MulOpCallExp createMulOpCallExp();

  /**
   * Returns a new object of class '<em>Navigation Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation Exp</em>'.
   * @generated
   */
  NavigationExp createNavigationExp();

  /**
   * Returns a new object of class '<em>Collection Op Call Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Op Call Exp</em>'.
   * @generated
   */
  CollectionOpCallExp createCollectionOpCallExp();

  /**
   * Returns a new object of class '<em>Iterate Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterate Exp</em>'.
   * @generated
   */
  IterateExp createIterateExp();

  /**
   * Returns a new object of class '<em>Iterator Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterator Exp</em>'.
   * @generated
   */
  IteratorExp createIteratorExp();

  /**
   * Returns a new object of class '<em>Navigation Or Attribute Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation Or Attribute Call</em>'.
   * @generated
   */
  NavigationOrAttributeCall createNavigationOrAttributeCall();

  /**
   * Returns a new object of class '<em>Operation Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Call</em>'.
   * @generated
   */
  OperationCall createOperationCall();

  /**
   * Returns a new object of class '<em>Lambda Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lambda Exp</em>'.
   * @generated
   */
  LambdaExp createLambdaExp();

  /**
   * Returns a new object of class '<em>Tuple Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Exp</em>'.
   * @generated
   */
  TupleExp createTupleExp();

  /**
   * Returns a new object of class '<em>Else If Then Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else If Then Exp</em>'.
   * @generated
   */
  ElseIfThenExp createElseIfThenExp();

  /**
   * Returns a new object of class '<em>Self Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Exp</em>'.
   * @generated
   */
  SelfExp createSelfExp();

  /**
   * Returns a new object of class '<em>Nested Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Exp</em>'.
   * @generated
   */
  NestedExp createNestedExp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OCLlitePackage getOCLlitePackage();

} //OCLliteFactory