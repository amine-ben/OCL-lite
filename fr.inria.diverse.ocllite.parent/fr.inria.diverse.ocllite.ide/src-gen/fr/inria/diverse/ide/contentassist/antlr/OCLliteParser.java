/*
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.inria.diverse.ide.contentassist.antlr.internal.InternalOCLliteParser;
import fr.inria.diverse.services.OCLliteGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class OCLliteParser extends AbstractContentAssistParser {

	@Inject
	private OCLliteGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalOCLliteParser createParser() {
		InternalOCLliteParser result = new InternalOCLliteParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getMultiOperatorAccess().getAlternatives(), "rule__MultiOperator__Alternatives");
					put(grammarAccess.getAdditionOperatorAccess().getAlternatives(), "rule__AdditionOperator__Alternatives");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getBooleanOperatorAccess().getAlternatives(), "rule__BooleanOperator__Alternatives");
					put(grammarAccess.getNavigationOperatorAccess().getAlternatives(), "rule__NavigationOperator__Alternatives");
					put(grammarAccess.getCollectionOpIDAccess().getAlternatives(), "rule__CollectionOpID__Alternatives");
					put(grammarAccess.getIterativeOperationIDAccess().getAlternatives(), "rule__IterativeOperationID__Alternatives");
					put(grammarAccess.getOclLExpressionAccess().getAlternatives(), "rule__OclLExpression__Alternatives");
					put(grammarAccess.getEqOpExpAccess().getNameAlternatives_1_1_0(), "rule__EqOpExp__NameAlternatives_1_1_0");
					put(grammarAccess.getComparisonOpExpAccess().getNameAlternatives_1_1_0(), "rule__ComparisonOpExp__NameAlternatives_1_1_0");
					put(grammarAccess.getAdditionOpExpAccess().getNameAlternatives_1_1_0(), "rule__AdditionOpExp__NameAlternatives_1_1_0");
					put(grammarAccess.getMultiOpExpAccess().getNameAlternatives_1_1_0(), "rule__MultiOpExp__NameAlternatives_1_1_0");
					put(grammarAccess.getNavigationOpCallExpAccess().getAlternatives(), "rule__NavigationOpCallExp__Alternatives");
					put(grammarAccess.getPrimaryExpAccess().getAlternatives(), "rule__PrimaryExp__Alternatives");
					put(grammarAccess.getCollectionExpAccess().getAlternatives(), "rule__CollectionExp__Alternatives");
					put(grammarAccess.getPrimitiveExpAccess().getAlternatives(), "rule__PrimitiveExp__Alternatives");
					put(grammarAccess.getBooleanExpAccess().getAlternatives(), "rule__BooleanExp__Alternatives");
					put(grammarAccess.getOclLTypeAccess().getAlternatives(), "rule__OclLType__Alternatives");
					put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
					put(grammarAccess.getModuleAccess().getGroup_7(), "rule__Module__Group_7__0");
					put(grammarAccess.getModuleAccess().getGroup_8(), "rule__Module__Group_8__0");
					put(grammarAccess.getOclLModelAccess().getGroup(), "rule__OclLModel__Group__0");
					put(grammarAccess.getURI_Access().getGroup(), "rule__URI___Group__0");
					put(grammarAccess.getFRAGMENTAccess().getGroup(), "rule__FRAGMENT__Group__0");
					put(grammarAccess.getFRAGMENTAccess().getGroup_1(), "rule__FRAGMENT__Group_1__0");
					put(grammarAccess.getAUTHORITYAccess().getGroup(), "rule__AUTHORITY__Group__0");
					put(grammarAccess.getAUTHORITYAccess().getGroup_1(), "rule__AUTHORITY__Group_1__0");
					put(grammarAccess.getAUTHORITYAccess().getGroup_2(), "rule__AUTHORITY__Group_2__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
					put(grammarAccess.getLetExpAccess().getGroup(), "rule__LetExp__Group__0");
					put(grammarAccess.getUnaryOpExpAccess().getGroup(), "rule__UnaryOpExp__Group__0");
					put(grammarAccess.getImpliesOpExpAccess().getGroup(), "rule__ImpliesOpExp__Group__0");
					put(grammarAccess.getImpliesOpExpAccess().getGroup_1(), "rule__ImpliesOpExp__Group_1__0");
					put(grammarAccess.getXorOpExpAccess().getGroup(), "rule__XorOpExp__Group__0");
					put(grammarAccess.getXorOpExpAccess().getGroup_1(), "rule__XorOpExp__Group_1__0");
					put(grammarAccess.getOrOpExpAccess().getGroup(), "rule__OrOpExp__Group__0");
					put(grammarAccess.getOrOpExpAccess().getGroup_1(), "rule__OrOpExp__Group_1__0");
					put(grammarAccess.getAndOpExpAccess().getGroup(), "rule__AndOpExp__Group__0");
					put(grammarAccess.getAndOpExpAccess().getGroup_1(), "rule__AndOpExp__Group_1__0");
					put(grammarAccess.getEqOpExpAccess().getGroup(), "rule__EqOpExp__Group__0");
					put(grammarAccess.getEqOpExpAccess().getGroup_1(), "rule__EqOpExp__Group_1__0");
					put(grammarAccess.getComparisonOpExpAccess().getGroup(), "rule__ComparisonOpExp__Group__0");
					put(grammarAccess.getComparisonOpExpAccess().getGroup_1(), "rule__ComparisonOpExp__Group_1__0");
					put(grammarAccess.getAdditionOpExpAccess().getGroup(), "rule__AdditionOpExp__Group__0");
					put(grammarAccess.getAdditionOpExpAccess().getGroup_1(), "rule__AdditionOpExp__Group_1__0");
					put(grammarAccess.getMultiOpExpAccess().getGroup(), "rule__MultiOpExp__Group__0");
					put(grammarAccess.getMultiOpExpAccess().getGroup_1(), "rule__MultiOpExp__Group_1__0");
					put(grammarAccess.getNavOpExpAccess().getGroup(), "rule__NavOpExp__Group__0");
					put(grammarAccess.getNavOpExpAccess().getGroup_1(), "rule__NavOpExp__Group_1__0");
					put(grammarAccess.getCollectionOpCallAccess().getGroup(), "rule__CollectionOpCall__Group__0");
					put(grammarAccess.getCollectionOpCallAccess().getGroup_3(), "rule__CollectionOpCall__Group_3__0");
					put(grammarAccess.getCollectionOpCallAccess().getGroup_3_1(), "rule__CollectionOpCall__Group_3_1__0");
					put(grammarAccess.getIterateExpAccess().getGroup(), "rule__IterateExp__Group__0");
					put(grammarAccess.getIterateExpAccess().getGroup_4(), "rule__IterateExp__Group_4__0");
					put(grammarAccess.getIteratorAccess().getGroup(), "rule__Iterator__Group__0");
					put(grammarAccess.getIteratorAccess().getGroup_1(), "rule__Iterator__Group_1__0");
					put(grammarAccess.getIteratorExpAccess().getGroup(), "rule__IteratorExp__Group__0");
					put(grammarAccess.getIteratorExpAccess().getGroup_4(), "rule__IteratorExp__Group_4__0");
					put(grammarAccess.getNavigationOrAttributeCallAccess().getGroup(), "rule__NavigationOrAttributeCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup(), "rule__OperationCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup_3(), "rule__OperationCall__Group_3__0");
					put(grammarAccess.getOperationCallAccess().getGroup_3_1(), "rule__OperationCall__Group_3_1__0");
					put(grammarAccess.getOclLModelElementExpAccess().getGroup(), "rule__OclLModelElementExp__Group__0");
					put(grammarAccess.getOclLModelElementExpAccess().getGroup_3(), "rule__OclLModelElementExp__Group_3__0");
					put(grammarAccess.getAllInstancesOpCallAccess().getGroup(), "rule__AllInstancesOpCall__Group__0");
					put(grammarAccess.getLocalVariableAccess().getGroup(), "rule__LocalVariable__Group__0");
					put(grammarAccess.getLambdaExpAccess().getGroup(), "rule__LambdaExp__Group__0");
					put(grammarAccess.getBagExpAccess().getGroup(), "rule__BagExp__Group__0");
					put(grammarAccess.getBagExpAccess().getGroup_4(), "rule__BagExp__Group_4__0");
					put(grammarAccess.getSequenceExpAccess().getGroup(), "rule__SequenceExp__Group__0");
					put(grammarAccess.getSequenceExpAccess().getGroup_4(), "rule__SequenceExp__Group_4__0");
					put(grammarAccess.getSetExpAccess().getGroup(), "rule__SetExp__Group__0");
					put(grammarAccess.getSetExpAccess().getGroup_4(), "rule__SetExp__Group_4__0");
					put(grammarAccess.getOrderedSetExpAccess().getGroup(), "rule__OrderedSetExp__Group__0");
					put(grammarAccess.getOrderedSetExpAccess().getGroup_4(), "rule__OrderedSetExp__Group_4__0");
					put(grammarAccess.getMapExpAccess().getGroup(), "rule__MapExp__Group__0");
					put(grammarAccess.getMapExpAccess().getGroup_4(), "rule__MapExp__Group_4__0");
					put(grammarAccess.getMapElementAccess().getGroup(), "rule__MapElement__Group__0");
					put(grammarAccess.getTupleExpAccess().getGroup(), "rule__TupleExp__Group__0");
					put(grammarAccess.getTupleExpAccess().getGroup_4(), "rule__TupleExp__Group_4__0");
					put(grammarAccess.getTuplePartAccess().getGroup(), "rule__TuplePart__Group__0");
					put(grammarAccess.getTuplePartAccess().getGroup_1(), "rule__TuplePart__Group_1__0");
					put(grammarAccess.getUnlimitedNaturalExpAccess().getGroup(), "rule__UnlimitedNaturalExp__Group__0");
					put(grammarAccess.getInvalidExpAccess().getGroup(), "rule__InvalidExp__Group__0");
					put(grammarAccess.getNullExpAccess().getGroup(), "rule__NullExp__Group__0");
					put(grammarAccess.getIfExpAccess().getGroup(), "rule__IfExp__Group__0");
					put(grammarAccess.getElseIfThenExpAccess().getGroup(), "rule__ElseIfThenExp__Group__0");
					put(grammarAccess.getSeflExpAccess().getGroup(), "rule__SeflExp__Group__0");
					put(grammarAccess.getNestedExpAccess().getGroup(), "rule__NestedExp__Group__0");
					put(grammarAccess.getOclLModelElementAccess().getGroup(), "rule__OclLModelElement__Group__0");
					put(grammarAccess.getLambdaTypeAccess().getGroup(), "rule__LambdaType__Group__0");
					put(grammarAccess.getLambdaTypeAccess().getGroup_3(), "rule__LambdaType__Group_3__0");
					put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
					put(grammarAccess.getSetTypeAccess().getGroup(), "rule__SetType__Group__0");
					put(grammarAccess.getSequenceTypeAccess().getGroup(), "rule__SequenceType__Group__0");
					put(grammarAccess.getOrderedSetTypeAccess().getGroup(), "rule__OrderedSetType__Group__0");
					put(grammarAccess.getBagTypeAccess().getGroup(), "rule__BagType__Group__0");
					put(grammarAccess.getModuleAccess().getNameAssignment_2(), "rule__Module__NameAssignment_2");
					put(grammarAccess.getModuleAccess().getSourceAssignment_4(), "rule__Module__SourceAssignment_4");
					put(grammarAccess.getModuleAccess().getInputAssignment_6(), "rule__Module__InputAssignment_6");
					put(grammarAccess.getModuleAccess().getImportsAssignment_7_0(), "rule__Module__ImportsAssignment_7_0");
					put(grammarAccess.getModuleAccess().getImportsAssignment_7_1(), "rule__Module__ImportsAssignment_7_1");
					put(grammarAccess.getModuleAccess().getElementsAssignment_8_0(), "rule__Module__ElementsAssignment_8_0");
					put(grammarAccess.getModuleAccess().getElementsAssignment_8_1(), "rule__Module__ElementsAssignment_8_1");
					put(grammarAccess.getOclLModelAccess().getNameAssignment_0(), "rule__OclLModel__NameAssignment_0");
					put(grammarAccess.getOclLModelAccess().getUriAssignment_1(), "rule__OclLModel__UriAssignment_1");
					put(grammarAccess.getURI_Access().getSchemeAssignment_1(), "rule__URI___SchemeAssignment_1");
					put(grammarAccess.getURI_Access().getAuthorityAssignment_3(), "rule__URI___AuthorityAssignment_3");
					put(grammarAccess.getURI_Access().getFragment_Assignment_5(), "rule__URI___Fragment_Assignment_5");
					put(grammarAccess.getImportAccess().getNameAssignment_2(), "rule__Import__NameAssignment_2");
					put(grammarAccess.getQueryAccess().getNameAssignment_2(), "rule__Query__NameAssignment_2");
					put(grammarAccess.getQueryAccess().getBodyAssignment_4(), "rule__Query__BodyAssignment_4");
					put(grammarAccess.getLetExpAccess().getNameAssignment_0(), "rule__LetExp__NameAssignment_0");
					put(grammarAccess.getLetExpAccess().getVariableAssignment_1(), "rule__LetExp__VariableAssignment_1");
					put(grammarAccess.getLetExpAccess().getInAssignment_3(), "rule__LetExp__InAssignment_3");
					put(grammarAccess.getUnaryOpExpAccess().getNameAssignment_0(), "rule__UnaryOpExp__NameAssignment_0");
					put(grammarAccess.getUnaryOpExpAccess().getTargetAssignment_1(), "rule__UnaryOpExp__TargetAssignment_1");
					put(grammarAccess.getImpliesOpExpAccess().getNameAssignment_1_1(), "rule__ImpliesOpExp__NameAssignment_1_1");
					put(grammarAccess.getImpliesOpExpAccess().getTargetAssignment_1_2(), "rule__ImpliesOpExp__TargetAssignment_1_2");
					put(grammarAccess.getXorOpExpAccess().getNameAssignment_1_1(), "rule__XorOpExp__NameAssignment_1_1");
					put(grammarAccess.getXorOpExpAccess().getTargetAssignment_1_2(), "rule__XorOpExp__TargetAssignment_1_2");
					put(grammarAccess.getOrOpExpAccess().getNameAssignment_1_1(), "rule__OrOpExp__NameAssignment_1_1");
					put(grammarAccess.getOrOpExpAccess().getTargetAssignment_1_2(), "rule__OrOpExp__TargetAssignment_1_2");
					put(grammarAccess.getAndOpExpAccess().getNameAssignment_1_1(), "rule__AndOpExp__NameAssignment_1_1");
					put(grammarAccess.getAndOpExpAccess().getTargetAssignment_1_2(), "rule__AndOpExp__TargetAssignment_1_2");
					put(grammarAccess.getEqOpExpAccess().getNameAssignment_1_1(), "rule__EqOpExp__NameAssignment_1_1");
					put(grammarAccess.getEqOpExpAccess().getTargetAssignment_1_2(), "rule__EqOpExp__TargetAssignment_1_2");
					put(grammarAccess.getComparisonOpExpAccess().getNameAssignment_1_1(), "rule__ComparisonOpExp__NameAssignment_1_1");
					put(grammarAccess.getComparisonOpExpAccess().getTargetAssignment_1_2(), "rule__ComparisonOpExp__TargetAssignment_1_2");
					put(grammarAccess.getAdditionOpExpAccess().getNameAssignment_1_1(), "rule__AdditionOpExp__NameAssignment_1_1");
					put(grammarAccess.getAdditionOpExpAccess().getTargetAssignment_1_2(), "rule__AdditionOpExp__TargetAssignment_1_2");
					put(grammarAccess.getMultiOpExpAccess().getNameAssignment_1_1(), "rule__MultiOpExp__NameAssignment_1_1");
					put(grammarAccess.getMultiOpExpAccess().getTargetAssignment_1_2(), "rule__MultiOpExp__TargetAssignment_1_2");
					put(grammarAccess.getNavOpExpAccess().getNameAssignment_1_1(), "rule__NavOpExp__NameAssignment_1_1");
					put(grammarAccess.getNavOpExpAccess().getTargetAssignment_1_2(), "rule__NavOpExp__TargetAssignment_1_2");
					put(grammarAccess.getCollectionOpCallAccess().getNameAssignment_1(), "rule__CollectionOpCall__NameAssignment_1");
					put(grammarAccess.getCollectionOpCallAccess().getArgumentsAssignment_3_0(), "rule__CollectionOpCall__ArgumentsAssignment_3_0");
					put(grammarAccess.getCollectionOpCallAccess().getArgumentsAssignment_3_1_1(), "rule__CollectionOpCall__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getIterateExpAccess().getNameAssignment_1(), "rule__IterateExp__NameAssignment_1");
					put(grammarAccess.getIterateExpAccess().getIteratorsAssignment_3(), "rule__IterateExp__IteratorsAssignment_3");
					put(grammarAccess.getIterateExpAccess().getIteratorsAssignment_4_1(), "rule__IterateExp__IteratorsAssignment_4_1");
					put(grammarAccess.getIterateExpAccess().getResultAssignment_6(), "rule__IterateExp__ResultAssignment_6");
					put(grammarAccess.getIterateExpAccess().getBodyAssignment_8(), "rule__IterateExp__BodyAssignment_8");
					put(grammarAccess.getIteratorAccess().getNameAssignment_0(), "rule__Iterator__NameAssignment_0");
					put(grammarAccess.getIteratorAccess().getTypeAssignment_1_1(), "rule__Iterator__TypeAssignment_1_1");
					put(grammarAccess.getIteratorExpAccess().getNameAssignment_1(), "rule__IteratorExp__NameAssignment_1");
					put(grammarAccess.getIteratorExpAccess().getIteratorsAssignment_3(), "rule__IteratorExp__IteratorsAssignment_3");
					put(grammarAccess.getIteratorExpAccess().getIteratorsAssignment_4_1(), "rule__IteratorExp__IteratorsAssignment_4_1");
					put(grammarAccess.getIteratorExpAccess().getBodyAssignment_6(), "rule__IteratorExp__BodyAssignment_6");
					put(grammarAccess.getNavigationOrAttributeCallAccess().getFeatureAssignment_1(), "rule__NavigationOrAttributeCall__FeatureAssignment_1");
					put(grammarAccess.getOperationCallAccess().getNameAssignment_1(), "rule__OperationCall__NameAssignment_1");
					put(grammarAccess.getOperationCallAccess().getArgumentsAssignment_3_0(), "rule__OperationCall__ArgumentsAssignment_3_0");
					put(grammarAccess.getOperationCallAccess().getArgumentsAssignment_3_1_1(), "rule__OperationCall__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getOclLModelElementExpAccess().getModelAssignment_0(), "rule__OclLModelElementExp__ModelAssignment_0");
					put(grammarAccess.getOclLModelElementExpAccess().getNameAssignment_1(), "rule__OclLModelElementExp__NameAssignment_1");
					put(grammarAccess.getOclLModelElementExpAccess().getElementsAssignment_2(), "rule__OclLModelElementExp__ElementsAssignment_2");
					put(grammarAccess.getOclLModelElementExpAccess().getElementsAssignment_3_1(), "rule__OclLModelElementExp__ElementsAssignment_3_1");
					put(grammarAccess.getOclLModelElementExpAccess().getTargetAssignment_4(), "rule__OclLModelElementExp__TargetAssignment_4");
					put(grammarAccess.getAllInstancesOpCallAccess().getNameAssignment_2(), "rule__AllInstancesOpCall__NameAssignment_2");
					put(grammarAccess.getLocalVariableAccess().getNameAssignment_0(), "rule__LocalVariable__NameAssignment_0");
					put(grammarAccess.getLocalVariableAccess().getTypeAssignment_2(), "rule__LocalVariable__TypeAssignment_2");
					put(grammarAccess.getLocalVariableAccess().getInitExpAssignment_4(), "rule__LocalVariable__InitExpAssignment_4");
					put(grammarAccess.getLambdaExpAccess().getNameAssignment_1(), "rule__LambdaExp__NameAssignment_1");
					put(grammarAccess.getLambdaExpAccess().getExpressionAssignment_3(), "rule__LambdaExp__ExpressionAssignment_3");
					put(grammarAccess.getBagExpAccess().getPartsAssignment_3(), "rule__BagExp__PartsAssignment_3");
					put(grammarAccess.getBagExpAccess().getPartsAssignment_4_1(), "rule__BagExp__PartsAssignment_4_1");
					put(grammarAccess.getSequenceExpAccess().getNameAssignment_1(), "rule__SequenceExp__NameAssignment_1");
					put(grammarAccess.getSequenceExpAccess().getPartsAssignment_3(), "rule__SequenceExp__PartsAssignment_3");
					put(grammarAccess.getSequenceExpAccess().getPartsAssignment_4_1(), "rule__SequenceExp__PartsAssignment_4_1");
					put(grammarAccess.getSetExpAccess().getNameAssignment_1(), "rule__SetExp__NameAssignment_1");
					put(grammarAccess.getSetExpAccess().getPartsAssignment_3(), "rule__SetExp__PartsAssignment_3");
					put(grammarAccess.getSetExpAccess().getPartsAssignment_4_1(), "rule__SetExp__PartsAssignment_4_1");
					put(grammarAccess.getOrderedSetExpAccess().getNameAssignment_1(), "rule__OrderedSetExp__NameAssignment_1");
					put(grammarAccess.getOrderedSetExpAccess().getPartsAssignment_3(), "rule__OrderedSetExp__PartsAssignment_3");
					put(grammarAccess.getOrderedSetExpAccess().getPartsAssignment_4_1(), "rule__OrderedSetExp__PartsAssignment_4_1");
					put(grammarAccess.getMapExpAccess().getNameAssignment_1(), "rule__MapExp__NameAssignment_1");
					put(grammarAccess.getMapExpAccess().getMapElementsAssignment_3(), "rule__MapExp__MapElementsAssignment_3");
					put(grammarAccess.getMapExpAccess().getMapElementsAssignment_4_1(), "rule__MapExp__MapElementsAssignment_4_1");
					put(grammarAccess.getMapElementAccess().getKeyAssignment_1(), "rule__MapElement__KeyAssignment_1");
					put(grammarAccess.getMapElementAccess().getValueAssignment_3(), "rule__MapElement__ValueAssignment_3");
					put(grammarAccess.getTupleExpAccess().getNameAssignment_1(), "rule__TupleExp__NameAssignment_1");
					put(grammarAccess.getTupleExpAccess().getPartsAssignment_3(), "rule__TupleExp__PartsAssignment_3");
					put(grammarAccess.getTupleExpAccess().getPartsAssignment_4_1(), "rule__TupleExp__PartsAssignment_4_1");
					put(grammarAccess.getTuplePartAccess().getNameAssignment_0(), "rule__TuplePart__NameAssignment_0");
					put(grammarAccess.getTuplePartAccess().getTypeAssignment_1_1(), "rule__TuplePart__TypeAssignment_1_1");
					put(grammarAccess.getTuplePartAccess().getInitAssignment_3(), "rule__TuplePart__InitAssignment_3");
					put(grammarAccess.getNumberExpAccess().getSymbolAssignment(), "rule__NumberExp__SymbolAssignment");
					put(grammarAccess.getStringExpAccess().getSegmentsAssignment(), "rule__StringExp__SegmentsAssignment");
					put(grammarAccess.getBooleanExpAccess().getSymbolAssignment_0(), "rule__BooleanExp__SymbolAssignment_0");
					put(grammarAccess.getBooleanExpAccess().getSymbolAssignment_1(), "rule__BooleanExp__SymbolAssignment_1");
					put(grammarAccess.getIfExpAccess().getNameAssignment_0(), "rule__IfExp__NameAssignment_0");
					put(grammarAccess.getIfExpAccess().getConditionAssignment_1(), "rule__IfExp__ConditionAssignment_1");
					put(grammarAccess.getIfExpAccess().getThenAssignment_3(), "rule__IfExp__ThenAssignment_3");
					put(grammarAccess.getIfExpAccess().getIfThenAssignment_4(), "rule__IfExp__IfThenAssignment_4");
					put(grammarAccess.getIfExpAccess().getElseAssignment_6(), "rule__IfExp__ElseAssignment_6");
					put(grammarAccess.getElseIfThenExpAccess().getNameAssignment_1(), "rule__ElseIfThenExp__NameAssignment_1");
					put(grammarAccess.getElseIfThenExpAccess().getConditionAssignment_2(), "rule__ElseIfThenExp__ConditionAssignment_2");
					put(grammarAccess.getElseIfThenExpAccess().getThenAssignment_4(), "rule__ElseIfThenExp__ThenAssignment_4");
					put(grammarAccess.getSeflExpAccess().getNameAssignment_1(), "rule__SeflExp__NameAssignment_1");
					put(grammarAccess.getNestedExpAccess().getExpAssignment_2(), "rule__NestedExp__ExpAssignment_2");
					put(grammarAccess.getOclLModelElementAccess().getModelAssignment_0(), "rule__OclLModelElement__ModelAssignment_0");
					put(grammarAccess.getOclLModelElementAccess().getNameAssignment_2(), "rule__OclLModelElement__NameAssignment_2");
					put(grammarAccess.getEnvTypeAccess().getNameAssignment(), "rule__EnvType__NameAssignment");
					put(grammarAccess.getLambdaTypeAccess().getNameAssignment_0(), "rule__LambdaType__NameAssignment_0");
					put(grammarAccess.getLambdaTypeAccess().getArgsTypesAssignment_2(), "rule__LambdaType__ArgsTypesAssignment_2");
					put(grammarAccess.getLambdaTypeAccess().getArgsTypesAssignment_3_1(), "rule__LambdaType__ArgsTypesAssignment_3_1");
					put(grammarAccess.getLambdaTypeAccess().getReturnTypeAssignment_6(), "rule__LambdaType__ReturnTypeAssignment_6");
					put(grammarAccess.getMapTypeAccess().getNameAssignment_0(), "rule__MapType__NameAssignment_0");
					put(grammarAccess.getMapTypeAccess().getKeyTypeAssignment_2(), "rule__MapType__KeyTypeAssignment_2");
					put(grammarAccess.getMapTypeAccess().getValueTypeAssignment_4(), "rule__MapType__ValueTypeAssignment_4");
					put(grammarAccess.getOclLAnyTypeAccess().getNameAssignment(), "rule__OclLAnyType__NameAssignment");
					put(grammarAccess.getSetTypeAccess().getNameAssignment_0(), "rule__SetType__NameAssignment_0");
					put(grammarAccess.getSetTypeAccess().getElementTypeAssignment_2(), "rule__SetType__ElementTypeAssignment_2");
					put(grammarAccess.getSequenceTypeAccess().getNameAssignment_0(), "rule__SequenceType__NameAssignment_0");
					put(grammarAccess.getSequenceTypeAccess().getElementTypeAssignment_2(), "rule__SequenceType__ElementTypeAssignment_2");
					put(grammarAccess.getOrderedSetTypeAccess().getNameAssignment_0(), "rule__OrderedSetType__NameAssignment_0");
					put(grammarAccess.getOrderedSetTypeAccess().getElementTypeAssignment_2(), "rule__OrderedSetType__ElementTypeAssignment_2");
					put(grammarAccess.getBagTypeAccess().getNameAssignment_0(), "rule__BagType__NameAssignment_0");
					put(grammarAccess.getBagTypeAccess().getElementTypeAssignment_2(), "rule__BagType__ElementTypeAssignment_2");
					put(grammarAccess.getRealTypeAccess().getNameAssignment(), "rule__RealType__NameAssignment");
					put(grammarAccess.getIntegerTypeAccess().getNameAssignment(), "rule__IntegerType__NameAssignment");
					put(grammarAccess.getBooleanTypeAccess().getNameAssignment(), "rule__BooleanType__NameAssignment");
					put(grammarAccess.getStringTypeAccess().getNameAssignment(), "rule__StringType__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalOCLliteParser typedParser = (InternalOCLliteParser) parser;
			typedParser.entryRuleModule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OCLliteGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OCLliteGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
