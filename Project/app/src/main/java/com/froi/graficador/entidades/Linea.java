package com.froi.graficador.entidades;

public class Linea extends Figura {

    private int pfx;
    private int pfy;

    public Linea(int pox, int poy, int pfx, int pfy, String color) {
        super(pox, poy, color);
        this.pfx = pfx;
        this.pfy = pfy;
        setDescripcion("LINEA");
    }

    public int getPfx() {
        return pfx;
    }

    public int getPfy() {
        return pfy;
    }

    @Override
    public String toString() {
        return "\nLinea\npox: " + getPox() + "\npoy: " + getPoy()  + "\npfx_ " + getPfx() + "\npfy: " + getPfy() + "\ncolor: " + getColor();
    }

}
