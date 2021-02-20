package com.froi.graficador.reportes;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.froi.graficador.entidades.Figura;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ReporteAnimaciones extends ReporteNormal {

    public ReporteAnimaciones(ArrayList<Figura> workList) {
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

        tituloColumna1.setText("ANIMACION");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna2.setText("CANTIDAD DE USOS");
        tituloColumna2.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloRow.addView(tituloColumna1);
        tituloRow.addView(tituloColumna2);
        tabla.addView(tituloRow);

        String[] animationList = {"linea", "curva"};

        for(int i = 0; i < animationList.length; i++) {
            TextView animacion = new TextView(context);
            animacion.setText(animationList[i].toLowerCase());
            TextView contAnimaciones = new TextView(context);
            contAnimaciones.setText(repeatAnimation(animationList[i]));

            TableRow tabRow = new TableRow(context);
            tabRow.addView(animacion);
            tabRow.addView(contAnimaciones);
            tabla.addView(tabRow);

        }

    }

    public String repeatAnimation(String cadena) {
        int cont = 0;
        String contador = "";
        for (Figura element : getWorkList()) {
            if(element.isAnimacion() && element.getTipoAnimacion().equals(cadena)) {
                cont++;
            }
        }
        contador += cont;
        return contador;
    }

}
