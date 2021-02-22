package com.froi.graficador.entidades;

import java.io.Serializable;

public class Figura implements Serializable {

    private int pox;
    private int poy;
    private int pax;
    private int pay;
    private String color;
    private boolean animacion;
    private String descripcion;
    private String tipoAnimacion;

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

    public void setAnimacion(boolean animacion) {
        this.animacion = animacion;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getTipoAnimacion() {
        return tipoAnimacion;
    }

    public void setTipoAnimacion(String tipoAnimacion) {
        this.tipoAnimacion = tipoAnimacion;
    }
}
