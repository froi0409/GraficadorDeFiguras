package com.froi.graficador.entidades;

public class Advertencia {

    private String tipo;
    private String lexema;
    private int linea;
    private int columna;
    private String descripcion;

    public Advertencia(String lexema, int linea, int columna, String tipo, String descripcion) {
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Lexema: " + lexema + "  Linea: " + linea + "    Columna: " + columna + "    Tipo: " + tipo + "  Descripcion: " + descripcion + "\n";
    }

}
