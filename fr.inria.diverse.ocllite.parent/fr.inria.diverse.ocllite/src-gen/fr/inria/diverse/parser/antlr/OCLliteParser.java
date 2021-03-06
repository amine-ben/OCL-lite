/*
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.parser.antlr;

import com.google.inject.Inject;
import fr.inria.diverse.parser.antlr.internal.InternalOCLliteParser;
import fr.inria.diverse.services.OCLliteGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OCLliteParser extends AbstractAntlrParser {

	@Inject
	private OCLliteGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOCLliteParser createParser(XtextTokenStream stream) {
		return new InternalOCLliteParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}

	public OCLliteGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OCLliteGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
