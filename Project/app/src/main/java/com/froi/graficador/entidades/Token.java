package com.froi.graficador.entidades;

import java.io.Serializable;

public class Token implements Serializable {

    private String lexema;
    private String linea = "";
    private String columna = "";

    public Token(String lexema, int linea, int columna) {
        this.lexema = lexema;
        this.linea += linea;
        this.columna += columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getLinea() {
        return linea;
    }

    public String getColumna() {
        return columna;
    }
}
