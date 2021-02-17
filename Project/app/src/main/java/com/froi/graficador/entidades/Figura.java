package com.froi.graficador.entidades;

public class Figura {

    private int pox;
    private int poy;
    private String color;
    private boolean animacion;
    private String descripcion;

    public Figura(int pox, int poy, String color) {
        this.pox = pox;
        this.poy = poy;
        this.color = color;
        this.animacion = false;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPox(){
        return pox;
    }

    public int getPoy() {
        return poy;
    }

    public String getColor() {
        return color;
    }

    public boolean isAnimacion() {
        return animacion;
    }

}
