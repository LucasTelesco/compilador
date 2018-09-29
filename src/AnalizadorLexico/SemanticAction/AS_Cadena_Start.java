package AnalizadorLexico.SemanticAction;

import AnalizadorLexico.LexicalAnalyzer;
import AnalizadorSintactico.Parser;
import Errors.Errors;

public class AS_Cadena_Start extends SemanticAction{

    public AS_Cadena_Start(LexicalAnalyzer lexicalAnalyzer) {
        super(lexicalAnalyzer);
    }

    @Override
    public void Action(Character symbol) {
        lexical.tokenId = Parser.CADENA_MULTILINEA;
        lexical.buffer+= symbol;
        lexical.index++;
        lexical.column++;
    }
}