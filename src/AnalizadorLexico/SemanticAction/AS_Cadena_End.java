package AnalizadorLexico.SemanticAction;

import AnalizadorLexico.LexicalAnalyzer;
import AnalizadorSintactico.Parser;
import AnalizadorSintactico.ParserVal;
import Errors.Errors;

public class AS_Cadena_End extends SemanticAction{

    public AS_Cadena_End(LexicalAnalyzer lexicalAnalyzer) {
        super(lexicalAnalyzer);
    }

    @Override
    public void Action(Character symbol) {
        lexical.symbolTable.setSymbol(lexical.buffer, Parser.CADENA);
        lexical.symbolTable.setAtributo(lexical.buffer,"=>","CADENA");
        //System.out.println(lexical.buffer);
        lexical.lastSymbol=lexical.buffer; // guardo el simbolo viejo

   // ######## ASEGURARNOS DE QUE ESTAMOS CONSTRUYENDO EL PARSER VAL CON UN PUNTERO A LA TABLA DE SYMBOLOS
        lexical.yylval = new ParserVal(lexical.symbolTable.getSymbol(lexical.buffer));
        lexical.yylval.setColumna(lexical.column);
        lexical.yylval.setFila(lexical.row);
        lexical.buffer = "";
        lexical.index++;
        lexical.column++;
    }
}