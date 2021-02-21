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
private boolean tokenAceptable;

public GraficadorLex(java.io.Reader in, ArrayList<Advertencia> listaErrores) {
  this.zzReader = in;
  this.listaErrores = listaErrores;
  listaTokens = new ArrayList<Token>();
  this.tokenAceptable = false;
}

public ArrayList<Advertencia> getListaErrores(){
  return this.listaErrores;
}

public ArrayList<Token> getListaTokens() {
  return this.listaTokens;
}

public void agregarError(int linea, int columna) {
  if (cadenaLexica.length() > 0) {
    int column = columna - cadenaLexica.length();
    listaErrores.add(new Advertencia(cadenaLexica, linea, column, "Léxico", "Simbolo no existente en el lenguaje"));
    cadenaLexica="";
  }
}

%}

%eof{
  agregarError(yyline, yycolumn);
%eof}

NUM = [0-9]+ ( ['.'] [0-9]+ ) ?
TerminacionLinea = [\r|\n|\r\n]
Ignore = {TerminacionLinea} | [ \t\f]

%%

<YYINITIAL> {

  "graficar"      { agregarError(yyline+1,yycolumn+1); return new Symbol(GRAFICAR, yyline + 1, yycolumn + 1); }
  "circulo"       { agregarError(yyline+1,yycolumn+1); return new Symbol(CIRCULO, yyline + 1, yycolumn + 1); }
  "cuadrado"      { agregarError(yyline+1,yycolumn+1); return new Symbol(CUADRADO, yyline + 1, yycolumn + 1); }
  "rectangulo"    { agregarError(yyline+1,yycolumn+1); return new Symbol(RECTANGULO, yyline + 1, yycolumn + 1); }
  "linea"         { agregarError(yyline+1,yycolumn+1); return new Symbol(LINEA, yyline + 1, yycolumn + 1); }
  "poligono"      { agregarError(yyline+1,yycolumn+1); return new Symbol(POLIGONO, yyline + 1, yycolumn + 1); }
  "("             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token("(", yyline+1, yycolumn+1)); return new Symbol(PARA, yyline + 1, yycolumn + 1); }
  ")"             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token(")", yyline+1, yycolumn+1)); return new Symbol(PARC, yyline + 1, yycolumn + 1); }
  ","             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token(",", yyline+1, yycolumn+1));return new Symbol(COM, yyline + 1, yycolumn + 1); }
  "animar"        { agregarError(yyline+1,yycolumn+1); return new Symbol(ANIMAR, yyline + 1, yycolumn + 1); }
  "objeto"        { agregarError(yyline+1,yycolumn+1); return new Symbol(OBJETO, yyline + 1, yycolumn + 1); }
  "anterior"      { agregarError(yyline+1,yycolumn+1); return new Symbol(ANTERIOR, yyline + 1, yycolumn + 1); }
  "curva"         { agregarError(yyline+1,yycolumn+1); return new Symbol(CURVA, yyline + 1, yycolumn + 1, yytext()); }
  {NUM}           { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token(yytext(), yyline+1, yycolumn+1)); return new Symbol(NUMERO, yyline + 1, yycolumn + 1, yytext()); }
  "+"             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token("+", yyline+1, yycolumn+1)); return new Symbol(SIGSUMA, yyline + 1, yycolumn + 1); }
  "-"             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token("-", yyline+1, yycolumn+1)); return new Symbol(SIGMENOS, yyline + 1, yycolumn + 1); }
  "*"             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token("*", yyline+1, yycolumn+1)); return new Symbol(SIGMULTIPLICACION, yyline + 1, yycolumn + 1); }
  "/"             { agregarError(yyline+1,yycolumn+1); listaTokens.add(new Token("/", yyline+1, yycolumn+1)); return new Symbol(SIGDIVISION, yyline + 1, yycolumn + 1); }
  "azul"          { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "rojo"          { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "verde"         { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "amarillo"      { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "naranja"       { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "morado"        { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "cafe"          { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  "negro"         { agregarError(yyline+1,yycolumn+1); return new Symbol(COLOR, yyline + 1, yycolumn + 1, yytext()); }
  {Ignore}        { agregarError(yyline+1,yycolumn+1); /* Ignorar */ }

}

[^] { 
    cadenaLexica+=yytext();
}