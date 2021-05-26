package br.com.enivaldo.linguagemcearense.main;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.com.enivaldo.linguagemcearense.parser.LingMilaLexer;
import br.com.enivaldo.linguagemcearense.parser.LingMilaParser;

/* Classe responsavel por criar a inteação com o usuario
 * instanciando o parser e apontando para o arquivo fonte.
 * 
 * Arquivo fonte: extensao .mila
 * 
 */  
public class MainClass {

	public static void main(String[] args) {
		try {
			LingMilaLexer lexer;
			LingMilaParser parser;
			
			// Leitura do arquivo "input.mila" para o Analisador Lexico
			lexer = new LingMilaLexer(CharStreams.fromFileName("input.mila"));
			
			// Cria o fluxo de tokens para passar para o PARSER
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// Cria o parser a partir desse tokenStream
			parser = new LingMilaParser(tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
		} catch (Exception ex) {
			System.err.println("ERROR"+ex.getMessage());
		}

	}

}
