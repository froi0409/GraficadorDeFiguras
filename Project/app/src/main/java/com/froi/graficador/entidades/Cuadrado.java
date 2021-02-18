package com.froi.graficador.entidades;

public class Cuadrado extends Figura {

    private int tamaño;

    public Cuadrado(int pox, int poy, int tamaño, String color) {
        super(pox, poy, color);
        this.tamaño = tamaño;
        setDescripcion("CUADRADO");
    }

    public int getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "\nCuadrado\npox: " + getPox() + "\npoy: " + getPoy() + "\ntamaño: " + getTamaño() + "\ncolor: " + getColor();
    }

}
