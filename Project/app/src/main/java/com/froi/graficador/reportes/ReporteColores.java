package com.froi.graficador.reportes;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.froi.graficador.entidades.Figura;

import java.util.ArrayList;

public class ReporteColores extends ReporteNormal {

    private ArrayList<Figura> listaDibujos;

    public ReporteColores(ArrayList<Figura> workList) {
        super(workList);
        listaDibujos = workList;
    }

    /**
     * Sirve para realizar un reporte en base al arraylist que recibió la clase
     *
     * @param tabla TableLayout en el que se mostraran los datos
     * @param context lugar donde se ubica el table layout
     */
    @Override
    public void hacerReporte(TableLayout tabla, Context context) {

        TableRow tabRow = new TableRow(context);
        //Añadimos los títulos de la tabla
        TextView tituloColumna1 = new TextView(context);
        TextView tituloColumna2 = new TextView(context);

        tituloColumna1.setText("COLOR");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna2.setText("CANTIDAD DE USOS");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tabRow.addView(tituloColumna1);
        tabRow.addView(tituloColumna2);

        TextView azul = new TextView(context); azul.setText("azul");
        TextView rojo = new TextView((context)); rojo.setText("rojo");
        TextView verde = new TextView(context); verde.setText("verde");
        TextView amarillo = new TextView(context); amarillo.setText("amarillo");
        TextView naranja = new TextView(context); naranja.setText("naranja");
        TextView morado = new TextView(context); morado.setText("morado");
        TextView cafe = new TextView(context); cafe.setText("cafe");
        TextView negro = new TextView(context); negro.setText("negro");
        TextView contAzul = new TextView(context); contAzul.setText("0");
        TextView contRojo = new TextView(context); contRojo.setText("0");
        TextView contVerde = new TextView(context); contVerde.setText("0");
        TextView contAmarillo = new TextView(context); contAmarillo.setText("0");
        TextView contNaranja = new TextView(context); contNaranja.setText("0");
        TextView contMorado = new TextView(context); contMorado.setText("0");
        TextView contCafe = new TextView(context); contCafe.setText("0");
        TextView contNegro = new TextView(context); contNegro.setText("0");

        TableRow azulRow = new TableRow(context);
        tabRow.addView(azul);
        tabRow.addView(contAzul);
        tabla.addView(azulRow);

        TableRow rojoRow = new TableRow(context);
        tabRow.addView(rojo);
        tabRow.addView(contRojo);
        tabla.addView(rojoRow);

        TableRow verdeRow = new TableRow(context);
        tabRow.addView(verde);
        tabRow.addView(contVerde);
        tabla.addView(verdeRow);

        TableRow amarilloRow = new TableRow(context);
        tabRow.addView(amarillo);
        tabRow.addView(contAmarillo);
        tabla.addView(amarilloRow);

        TableRow naranjaRow = new TableRow(context);
        tabRow.addView(naranja);
        tabRow.addView(contNaranja);
        tabla.addView(naranjaRow);

        TableRow moradoRow = new TableRow(context);
        tabRow.addView(morado);
        tabRow.addView(contMorado);
        tabla.addView(moradoRow);

        TableRow cafeRow = new TableRow(context);
        tabRow.addView(cafe);
        tabRow.addView(contCafe);
        tabla.addView(cafeRow);

        TableRow negroRow = new TableRow(context);
        tabRow.addView(negro);
        tabRow.addView(contNegro);
        tabla.addView(negroRow);

    }

    private int countRepeat(String cadena) {
        int cont = 0;
        for (Figura element: getWorkList()) {
            if(element.getColor().equals(cadena)) {
                cont++;
            }
        }
        return cont;
    }
}
