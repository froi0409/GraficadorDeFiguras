package com.froi.graficador.entidades;

import java.io.Serializable;

public class Advertencia implements Serializable {

    private String tipo;
    private String lexema;
    private String linea = "";
    private String columna = "";
    private String descripcion;

    public Advertencia(String lexema, int linea, int columna, String tipo, String descripcion) {
        this.lexema = lexema;
        this.linea += linea;
        this.columna += columna;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Lexema: " + lexema + "  Linea: " + linea + "    Columna: " + columna + "    Tipo: " + tipo + "  Descripcion: " + descripcion + "\n";
    }

    public String getTipo() {
        return tipo;
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

    public String getDescripcion() {
        return descripcion;
    }
}
