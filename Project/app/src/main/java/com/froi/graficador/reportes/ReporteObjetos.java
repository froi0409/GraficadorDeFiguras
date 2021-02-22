package com.froi.graficador.reportes;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.froi.graficador.entidades.Figura;
import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

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
    public void hacerReporte(TableLayout tabla, Context context) {
        tabla.setStretchAllColumns(true);
        tabla.bringToFront();

        TableRow tituloRow = new TableRow(context);
        TextView tituloColumna1 = new TextView(context);
        TextView tituloColumna2 = new TextView(context);

        tituloColumna1.setText("OBJETO");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna2.setText("CANTIDAD DE USOS");
        tituloColumna2.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloRow.addView(tituloColumna1);
        tituloRow.addView(tituloColumna2);
        tabla.addView(tituloRow);

        String[] objects = {"CIRCULO", "CUADRADO", "RECTANGULO", "LINEA", "POLIGONO"};

        for(int i = 0; i < objects.length; i++) {
            TextView forma = new TextView(context);
            forma.setText(objects[i].toLowerCase()); //Agregamos el nombre de cada figura a un text view
            TextView contForma = new TextView((context));
            contForma.setText(repeatObject(objects[i]));

            TableRow tabRow = new TableRow(context);
            tabRow.addView(forma);
            tabRow.addView(contForma);
            tabla.addView(tabRow);

        }
    }

    /**
     * Obtiene la cantidad de veces que se repite una figura
     * @param cadena Nombre de la figura de la que se quiere averiguar la cantidad de repeticiones
     * @return cantidad de veces que la figura ingresada se repite
     */
    public String repeatObject(String cadena) {
        int cont = 0;
        String contador = "";
        for (Figura element : getWorkList()) {
            if(element.getDescripcion().equals(cadena)) {
                cont++;
            }
        }
        contador += cont;
        return contador;
    }

}
