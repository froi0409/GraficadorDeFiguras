import java_cup.runtime.*;
import java.util.ArrayList;
import com.froi.graficador.entidades.Advertencia;
import com.froi.graficador.entidades.Token;
import static com.froi.graficador.lexer.sym.*;

%%

// Configuramos nuestro jflex
%public
%class GraficadorLex
%cup
%unicode
%line
%column

%{

private int inicioLexema, puntero;
private String cadenaLexica = "";
private ArrayList<Advertencia> listaErrores;
private ArrayList<Token> listaTokens;

public GraficadorLex(java.io.Reader in, ArrayList<Advertencia> listaErrores) {
  this.zzReader = in;
  this.listaErrores = listaErrores;
  listaTokens = new ArrayList<Token>();
}

public ArrayList<Advertencia> getListaErrores(){
  return this.listaErrores;
}

public ArrayList<Token> getListaTokens() {
  return this.listaTokens;
}

%}

NUM = [0-9]+ ( ['.'] [0-9]+ ) ?
TerminacionLinea = [\r|\n|\r\n]
Ignore = {TerminacionLinea} | [ \t\f]

%%

<YYINITIAL> {

  "graficar"      { return new Symbol(GRAFICAR, yyline + 1, yycolumn + 1); }
  "circulo"       { return new Symbol(CIRCULO, yyline + 1, yycolumn + 1); }
  "cuadrado"      { return new Symbol(CUADRADO, yyline + 1, yycolumn + 1); }
  "rectangulo"    { return new Symbol(RECTANGULO, yyline + 1, yycolumn + 1); }
  "linea"         { return new Symbol(LINEA, yyline + 1, yycolumn + 1); }
  "poligono"      { return new Symbol(POLIGONO, yyline + 1, yycolumn + 1); }
  "("             { listaTokens.add(new Token("(", yyline+1, yycolumn+1)); return new Symbol(PARA, yyline + 1, yycolumn + 1); }
  ")"             { listaTokens.add(new Token(")", yyline+1, yycolumn+1)); return new Symbol(PARC, yyline + 1, yycolumn + 1); }
  ","             { listaTokens.add(new Token(",", yyline+1, yycolumn+1));return new Symbol(COM, yyline + 1, yycolumn + 1); }
  "animar"        { return new Symbol(ANIMAR, yyline + 1, yycolumn + 1); }
  "objeto"        { return new Symbol(OBJETO, yyline + 1, yycolumn + 1); }
  "anterior"      { return new Symbol(ANTERIOR, yyline + 1, yycolumn + 1); }
  "curva"         { return new Symbol(CURVA, yyline + 1, yycolumn + 1, yytext()); }
  {NUM}           { listaTokens.add(new Token(yytext(), yyline+1, yycolumn+1)); return new Symbol(NUMERO, yyline + 1, yycolumn + 1, yytext()); }
  "+"             { listaTokens.add(new Token("+", yyline+1, yycolumn+1)); return new Symbol(SIGSUMA, yyline + 1, yycolumn + 1); }
  "-"             { listaTokens.add(new Token("-", yyline+1, yycolumn+1)); return new Symbol(SIGMENOS, yyline + 1, yycolumn + 1); }
  "*"             { listaTokens.add(new Token("*", yyline+1, yycolumn+1)); return new Symbol(SIGMULTIPLICACION, yyline + 1, yycolumn + 1); }
  "/"             { listaTokens.add(new Token("/", yyline+1, yycolumn+1)); return new Symbol(SIGDIVISION, yyline + 1, yycolumn + 1); }
  "azul"          { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "rojo"          { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "verde"         { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "amarillo"      { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "naranja"       { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "morado"        { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "cafe"          { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "negro"         { return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  {Ignore}        { /* Ignorar */ }

}
 
[^] { 
  
  listaErrores.add(new Advertencia(yytext(), yyline+1, yycolumn+1, "Léxico", "Símbolo no existente en el lenguaje")); 
}