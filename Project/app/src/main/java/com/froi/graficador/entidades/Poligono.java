package com.froi.graficador.entidades;

public class Poligono extends Figura {

    private int alto;
    private int ancho;
    private int lados;

    public Poligono(int pox, int poy, int alto, int ancho, int lados, String color) {
        super(pox, poy, color);
        this.alto = alto;
        this.ancho = ancho;
        this.lados = lados;
        setDescripcion("POLIGONO");
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLados() {
        return lados;
    }

    public String toString() {
        return "\nPoligono\npox: " + getPox() + "\npoy: " + getPoy()  + "\nalto:_" + getAlto()+ "\nancho: " + getAncho() + "\ncolor: " + getColor();
    }

}
