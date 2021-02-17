import java_cup.runtime.*;
import sym.*;

%%

// Configuramos nuestro jflex
%public
%class GraficadorLex
%cup
%unicode
%line
%column

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
  "("             { return new Symbol(PARA, yyline + 1, yycolumn + 1); }
  ")"             { return new Symbol(PARC, yyline + 1, yycolumn + 1); }
  ","             { return new Symbol(COM, yyline + 1, yycolumn + 1); }
  "animar"        { return new Symbol(ANIMAR, yyline + 1, yycolumn + 1); }
  "objeto"        { return new Symbol(OBJETO, yyline + 1, yycolumn + 1); }
  "anterior"      { return new Symbol(ANTERIOR, yyline + 1, yycolumn + 1); }
  "linea"         { return new Symbol(TIPOANIMACION, yyline + 1, yycolumn + 1); }
  "curva"         { return new Symbol(TIPOANIMACION, yyline + 1, yycolumn + 1); }
  {NUM}           { return new Symbol(NUMERO, yyline + 1, yycolumn + 1); }
  "+"             { return new Symbol(SIGSUMA, yyline + 1, yycolumn + 1); }
  "-"             { return new Symbol(SIGMENOS, yyline + 1, yycolumn + 1); }
  "*"             { return new Symbol(SIGMULTIPLICACION, yyline + 1, yycolumn + 1); }
  "/"             { return new Symbol(SIGDIVISION, yyline + 1, yycolumn + 1); }
  "azul"          { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "rojo"          { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "verde"         { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "amarillo"      { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "naranja"       { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "morado"        { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "cafe"          { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  "negro"         { return new Symbol(COLOR, yyline + 1, yycolumn + 1); }
  {Ignore}        { /* Ignorar */ }

}

[^] { }