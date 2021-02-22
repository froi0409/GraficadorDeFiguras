package com.froi.graficador.reportes;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.froi.graficador.entidades.Figura;

import java.util.ArrayList;

public class ReporteColores extends ReporteNormal {

    public ReporteColores(ArrayList<Figura> workList) {
        super(workList);
    }

    /**
     * Sirve para realizar un reporte en base al arraylist que recibió la clase
     *
     * @param tabla TableLayout en el que se mostraran los datos
     * @param context lugar donde se ubica el table layout
     */
    @Override
    public void hacerReporte(TableLayout tabla, Context context) {

        tabla.setStretchAllColumns(true);
        tabla.bringToFront();

        TableRow.LayoutParams paramTable = new TableRow.LayoutParams();
        paramTable.setMargins(12,20,2,20);

        TableRow tabRow = new TableRow(context);
        //Añadimos los títulos de la tabla
        TextView tituloColumna1 = new TextView(context);
        TextView tituloColumna2 = new TextView(context);

        tituloColumna1.setText("COLOR");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna2.setText("CANTIDAD DE USOS");
        tituloColumna2.setTypeface(null, Typeface.BOLD_ITALIC);
        tabRow.addView(tituloColumna1);
        tabRow.addView(tituloColumna2);
        tabla.addView(tabRow,paramTable);

        TextView azul = new TextView(context); azul.setText("azul");
        TextView rojo = new TextView((context)); rojo.setText("rojo");
        TextView verde = new TextView(context); verde.setText("verde");
        TextView amarillo = new TextView(context); amarillo.setText("amarillo");
        TextView naranja = new TextView(context); naranja.setText("naranja");
        TextView morado = new TextView(context); morado.setText("morado");
        TextView cafe = new TextView(context); cafe.setText("cafe");
        TextView negro = new TextView(context); negro.setText("negro");
        TextView contAzul = new TextView(context); contAzul.setText(repeatColor("azul"));
        TextView contRojo = new TextView(context); contRojo.setText(repeatColor("rojo"));
        TextView contVerde = new TextView(context); contVerde.setText(repeatColor("verde"));
        TextView contAmarillo = new TextView(context); contAmarillo.setText(repeatColor("amarillo"));
        TextView contNaranja = new TextView(context); contNaranja.setText(repeatColor("naranja"));
        TextView contMorado = new TextView(context); contMorado.setText(repeatColor("morado"));
        TextView contCafe = new TextView(context); contCafe.setText(repeatColor("cafe"));
        TextView contNegro = new TextView(context); contNegro.setText(repeatColor("negro"));

        TableRow azulRow = new TableRow(context);
        azulRow.addView(azul);
        azulRow.addView(contAzul);
        tabla.addView(azulRow,paramTable);

        TableRow rojoRow = new TableRow(context);
        rojoRow.addView(rojo);
        rojoRow.addView(contRojo);
        tabla.addView(rojoRow,paramTable);

        TableRow verdeRow = new TableRow(context);
        verdeRow.addView(verde);
        verdeRow.addView(contVerde);
        tabla.addView(verdeRow,paramTable);

        TableRow amarilloRow = new TableRow(context);
        amarilloRow.addView(amarillo);
        amarilloRow.addView(contAmarillo);
        tabla.addView(amarilloRow,paramTable);

        TableRow naranjaRow = new TableRow(context);
        naranjaRow.addView(naranja);
        naranjaRow.addView(contNaranja);
        tabla.addView(naranjaRow,paramTable);

        TableRow moradoRow = new TableRow(context);
        moradoRow.addView(morado);
        moradoRow.addView(contMorado);
        tabla.addView(moradoRow,paramTable);

        TableRow cafeRow = new TableRow(context);
        cafeRow.addView(cafe);
        cafeRow.addView(contCafe);
        tabla.addView(cafeRow,paramTable);

        TableRow negroRow = new TableRow(context);
        negroRow.addView(negro);
        negroRow.addView(contNegro);
        tabla.addView(negroRow,paramTable);

    }

    /**
     * Método que sirve para contar las veces que se repite un color
     * @param cadena color del que se quiere saber las repeticiones
     * @return Cantidad de veces que el color solicitado se repite
     */
    private String repeatColor(String cadena) {
        int cont = 0;
        String contador = "";
        for (Figura element: getWorkList()) {
            if(element.getColor().equals(cadena)) {
                cont++;
            }
        }
        contador+=cont;
        return contador;
    }
}
