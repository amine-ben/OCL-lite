/**
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.oCLlite.impl;

import fr.inria.diverse.oCLlite.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCLliteFactoryImpl extends EFactoryImpl implements OCLliteFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OCLliteFactory init()
  {
    try
    {
      OCLliteFactory theOCLliteFactory = (OCLliteFactory)EPackage.Registry.INSTANCE.getEFactory(OCLlitePackage.eNS_URI);
      if (theOCLliteFactory != null)
      {
        return theOCLliteFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OCLliteFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLliteFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OCLlitePackage.MODULE: return createModule();
      case OCLlitePackage.OCL_LMODEL: return createOclLModel();
      case OCLlitePackage.URI_: return createURI_();
      case OCLlitePackage.IMPORT: return createImport();
      case OCLlitePackage.MODULE_ELEMENT: return createModuleElement();
      case OCLlitePackage.QUERY: return createQuery();
      case OCLlitePackage.OCL_LEXPRESSION: return createOclLExpression();
      case OCLlitePackage.ITERATOR: return createIterator();
      case OCLlitePackage.LOCAL_VARIABLE: return createLocalVariable();
      case OCLlitePackage.COLLECTION_EXP: return createCollectionExp();
      case OCLlitePackage.BAG_EXP: return createBagExp();
      case OCLlitePackage.SEQUENCE_EXP: return createSequenceExp();
      case OCLlitePackage.SET_EXP: return createSetExp();
      case OCLlitePackage.ORDERED_SET_EXP: return createOrderedSetExp();
      case OCLlitePackage.MAP_EXP: return createMapExp();
      case OCLlitePackage.MAP_ELEMENT: return createMapElement();
      case OCLlitePackage.TUPLE_PART: return createTuplePart();
      case OCLlitePackage.PRIMITIVE_EXP: return createPrimitiveExp();
      case OCLlitePackage.NUMBER_LITERAL_EXP: return createNumberLiteralExp();
      case OCLlitePackage.STRING_LITERAL_EXP: return createStringLiteralExp();
      case OCLlitePackage.BOOLEAN_LITERAL_EXP: return createBooleanLiteralExp();
      case OCLlitePackage.UNLIMITED_NATURAL_LITERAL_EXP: return createUnlimitedNaturalLiteralExp();
      case OCLlitePackage.INVALID_LITERAL_EXP: return createInvalidLiteralExp();
      case OCLlitePackage.NULL_LITERAL_EXP: return createNullLiteralExp();
      case OCLlitePackage.IF_EXP: return createIfExp();
      case OCLlitePackage.OCL_LTYPE: return createOclLType();
      case OCLlitePackage.OCL_LMODEL_ELEMENT_EXP: return createOclLModelElementExp();
      case OCLlitePackage.ENV_TYPE: return createEnvType();
      case OCLlitePackage.LAMBDA_TYPE: return createLambdaType();
      case OCLlitePackage.MAP_TYPE: return createMapType();
      case OCLlitePackage.TUPLE_TYPE: return createTupleType();
      case OCLlitePackage.OCL_LANY_TYPE: return createOclLAnyType();
      case OCLlitePackage.SET_TYPE: return createSetType();
      case OCLlitePackage.SEQUENCE_TYPE: return createSequenceType();
      case OCLlitePackage.ORDERED_SET_TYPE: return createOrderedSetType();
      case OCLlitePackage.BAG_TYPE: return createBagType();
      case OCLlitePackage.REAL_TYPE: return createRealType();
      case OCLlitePackage.INTEGER_TYPE: return createIntegerType();
      case OCLlitePackage.BOOLEAN_TYPE: return createBooleanType();
      case OCLlitePackage.STRING_TYPE: return createStringType();
      case OCLlitePackage.BOOL_OP_CALL_EXP: return createBoolOpCallExp();
      case OCLlitePackage.EQ_OP_CALL_EXP: return createEqOpCallExp();
      case OCLlitePackage.COM_OP_CALL_EXP: return createComOpCallExp();
      case OCLlitePackage.ADD_OP_CALL_EXP: return createAddOpCallExp();
      case OCLlitePackage.MUL_OP_CALL_EXP: return createMulOpCallExp();
      case OCLlitePackage.NAVIGATION_EXP: return createNavigationExp();
      case OCLlitePackage.COLLECTION_OP_CALL_EXP: return createCollectionOpCallExp();
      case OCLlitePackage.ITERATE_EXP: return createIterateExp();
      case OCLlitePackage.ITERATOR_EXP: return createIteratorExp();
      case OCLlitePackage.NAVIGATION_OR_ATTRIBUTE_CALL: return createNavigationOrAttributeCall();
      case OCLlitePackage.OPERATION_CALL: return createOperationCall();
      case OCLlitePackage.LAMBDA_EXP: return createLambdaExp();
      case OCLlitePackage.TUPLE_EXP: return createTupleExp();
      case OCLlitePackage.ELSE_IF_THEN_EXP: return createElseIfThenExp();
      case OCLlitePackage.SELF_EXP: return createSelfExp();
      case OCLlitePackage.NESTED_EXP: return createNestedExp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLModel createOclLModel()
  {
    OclLModelImpl oclLModel = new OclLModelImpl();
    return oclLModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI_ createURI_()
  {
    URI_Impl urI_ = new URI_Impl();
    return urI_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleElement createModuleElement()
  {
    ModuleElementImpl moduleElement = new ModuleElementImpl();
    return moduleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLExpression createOclLExpression()
  {
    OclLExpressionImpl oclLExpression = new OclLExpressionImpl();
    return oclLExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iterator createIterator()
  {
    IteratorImpl iterator = new IteratorImpl();
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionExp createCollectionExp()
  {
    CollectionExpImpl collectionExp = new CollectionExpImpl();
    return collectionExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BagExp createBagExp()
  {
    BagExpImpl bagExp = new BagExpImpl();
    return bagExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceExp createSequenceExp()
  {
    SequenceExpImpl sequenceExp = new SequenceExpImpl();
    return sequenceExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetExp createSetExp()
  {
    SetExpImpl setExp = new SetExpImpl();
    return setExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedSetExp createOrderedSetExp()
  {
    OrderedSetExpImpl orderedSetExp = new OrderedSetExpImpl();
    return orderedSetExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapExp createMapExp()
  {
    MapExpImpl mapExp = new MapExpImpl();
    return mapExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapElement createMapElement()
  {
    MapElementImpl mapElement = new MapElementImpl();
    return mapElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuplePart createTuplePart()
  {
    TuplePartImpl tuplePart = new TuplePartImpl();
    return tuplePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveExp createPrimitiveExp()
  {
    PrimitiveExpImpl primitiveExp = new PrimitiveExpImpl();
    return primitiveExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteralExp createNumberLiteralExp()
  {
    NumberLiteralExpImpl numberLiteralExp = new NumberLiteralExpImpl();
    return numberLiteralExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteralExp createStringLiteralExp()
  {
    StringLiteralExpImpl stringLiteralExp = new StringLiteralExpImpl();
    return stringLiteralExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralExp createBooleanLiteralExp()
  {
    BooleanLiteralExpImpl booleanLiteralExp = new BooleanLiteralExpImpl();
    return booleanLiteralExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnlimitedNaturalLiteralExp createUnlimitedNaturalLiteralExp()
  {
    UnlimitedNaturalLiteralExpImpl unlimitedNaturalLiteralExp = new UnlimitedNaturalLiteralExpImpl();
    return unlimitedNaturalLiteralExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvalidLiteralExp createInvalidLiteralExp()
  {
    InvalidLiteralExpImpl invalidLiteralExp = new InvalidLiteralExpImpl();
    return invalidLiteralExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteralExp createNullLiteralExp()
  {
    NullLiteralExpImpl nullLiteralExp = new NullLiteralExpImpl();
    return nullLiteralExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExp createIfExp()
  {
    IfExpImpl ifExp = new IfExpImpl();
    return ifExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLType createOclLType()
  {
    OclLTypeImpl oclLType = new OclLTypeImpl();
    return oclLType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLModelElementExp createOclLModelElementExp()
  {
    OclLModelElementExpImpl oclLModelElementExp = new OclLModelElementExpImpl();
    return oclLModelElementExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvType createEnvType()
  {
    EnvTypeImpl envType = new EnvTypeImpl();
    return envType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LambdaType createLambdaType()
  {
    LambdaTypeImpl lambdaType = new LambdaTypeImpl();
    return lambdaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType createMapType()
  {
    MapTypeImpl mapType = new MapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleType createTupleType()
  {
    TupleTypeImpl tupleType = new TupleTypeImpl();
    return tupleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclLAnyType createOclLAnyType()
  {
    OclLAnyTypeImpl oclLAnyType = new OclLAnyTypeImpl();
    return oclLAnyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetType createSetType()
  {
    SetTypeImpl setType = new SetTypeImpl();
    return setType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceType createSequenceType()
  {
    SequenceTypeImpl sequenceType = new SequenceTypeImpl();
    return sequenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedSetType createOrderedSetType()
  {
    OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
    return orderedSetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BagType createBagType()
  {
    BagTypeImpl bagType = new BagTypeImpl();
    return bagType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealType createRealType()
  {
    RealTypeImpl realType = new RealTypeImpl();
    return realType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerType createIntegerType()
  {
    IntegerTypeImpl integerType = new IntegerTypeImpl();
    return integerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolOpCallExp createBoolOpCallExp()
  {
    BoolOpCallExpImpl boolOpCallExp = new BoolOpCallExpImpl();
    return boolOpCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqOpCallExp createEqOpCallExp()
  {
    EqOpCallExpImpl eqOpCallExp = new EqOpCallExpImpl();
    return eqOpCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComOpCallExp createComOpCallExp()
  {
    ComOpCallExpImpl comOpCallExp = new ComOpCallExpImpl();
    return comOpCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddOpCallExp createAddOpCallExp()
  {
    AddOpCallExpImpl addOpCallExp = new AddOpCallExpImpl();
    return addOpCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOpCallExp createMulOpCallExp()
  {
    MulOpCallExpImpl mulOpCallExp = new MulOpCallExpImpl();
    return mulOpCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigationExp createNavigationExp()
  {
    NavigationExpImpl navigationExp = new NavigationExpImpl();
    return navigationExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionOpCallExp createCollectionOpCallExp()
  {
    CollectionOpCallExpImpl collectionOpCallExp = new CollectionOpCallExpImpl();
    return collectionOpCallExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterateExp createIterateExp()
  {
    IterateExpImpl iterateExp = new IterateExpImpl();
    return iterateExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IteratorExp createIteratorExp()
  {
    IteratorExpImpl iteratorExp = new IteratorExpImpl();
    return iteratorExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigationOrAttributeCall createNavigationOrAttributeCall()
  {
    NavigationOrAttributeCallImpl navigationOrAttributeCall = new NavigationOrAttributeCallImpl();
    return navigationOrAttributeCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationCall createOperationCall()
  {
    OperationCallImpl operationCall = new OperationCallImpl();
    return operationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LambdaExp createLambdaExp()
  {
    LambdaExpImpl lambdaExp = new LambdaExpImpl();
    return lambdaExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleExp createTupleExp()
  {
    TupleExpImpl tupleExp = new TupleExpImpl();
    return tupleExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseIfThenExp createElseIfThenExp()
  {
    ElseIfThenExpImpl elseIfThenExp = new ElseIfThenExpImpl();
    return elseIfThenExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfExp createSelfExp()
  {
    SelfExpImpl selfExp = new SelfExpImpl();
    return selfExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedExp createNestedExp()
  {
    NestedExpImpl nestedExp = new NestedExpImpl();
    return nestedExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLlitePackage getOCLlitePackage()
  {
    return (OCLlitePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OCLlitePackage getPackage()
  {
    return OCLlitePackage.eINSTANCE;
  }

} //OCLliteFactoryImpl
