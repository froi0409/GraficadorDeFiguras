package com.froi.graficador.entidades;

public class Rectangulo extends Figura {

    private int alto;
    private int ancho;

    public Rectangulo(int pox, int poy, int alto, int ancho, String color) {
        super(pox, poy, color);
        this.alto = alto;
        this.ancho = ancho;
        setDescripcion("RECTANGULO");
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

}
