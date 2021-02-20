package com.froi.graficador.reportes;

import android.widget.TableLayout;

import com.froi.graficador.entidades.Figura;

import java.util.ArrayList;

public class ReporteObjetos extends ReporteNormal {

    public ReporteObjetos(ArrayList<Figura> workList) {
        super(workList);
    }

    /**
     * Sirve para realizar un reporte en base al arraylist que recibió la clase
     *
     * @param tabla TableLayout en el que se mostraran los datos
     */
    @Override
    public void hacerReporte(TableLayout tabla) {

    }
}
