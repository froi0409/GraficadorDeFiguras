package com.froi.graficador.reportes;

import android.content.Context;
import android.widget.TableLayout;

import com.froi.graficador.entidades.Advertencia;
import com.froi.graficador.entidades.Figura;

import java.util.ArrayList;

public abstract class ReporteNormal {

    private ArrayList<Figura> workList;

    /**
     * Inicializa el objeto
     * @param workList Lista que servirá para uso de la clase
     */
    public ReporteNormal(ArrayList<Figura> workList) {
        this.workList = workList;
    }

    public ArrayList<Figura> getWorkList() {
        return workList;
    }

    /**
     * Sirve para realizar un reporte en base al arraylist que recibió la clase
     * @param tabla TableLayout en el que se mostraran los datos
     */
    public abstract void hacerReporte(TableLayout tabla, Context context);

}
