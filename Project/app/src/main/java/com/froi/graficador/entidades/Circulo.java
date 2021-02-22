package com.froi.graficador.entidades;

public class Circulo extends Figura {

    private int radio;

    public Circulo(int pox, int poy, int radio, String color) {
        super(pox, poy, color);
        this.radio = radio;
        setDescripcion("CIRCULO");
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public String toString(){
        return "\nCirculo\npox: " + getPox() + "\npoy: " + getPoy() + "\nradio: " + getRadio() + "\ncolor: " + getColor();
    }

}
