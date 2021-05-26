// Generated from LingMila.g4 by ANTLR 4.7.1
package br.com.enivaldo.linguagemcearense.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LingMilaParser}.
 */
public interface LingMilaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LingMilaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LingMilaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LingMilaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LingMilaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LingMilaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LingMilaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(LingMilaParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(LingMilaParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(LingMilaParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(LingMilaParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(LingMilaParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(LingMilaParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LingMilaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LingMilaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingMilaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LingMilaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingMilaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LingMilaParser.TermoContext ctx);
}