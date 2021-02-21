package com.froi.graficador.reportes;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.froi.graficador.entidades.Advertencia;

import java.util.ArrayList;

public class ReporteErrores {

    private ArrayList<Advertencia> listaErrores;

    public ReporteErrores(ArrayList<Advertencia> listaErrores) {
        this.listaErrores = listaErrores;
    }

    public void hacerReporte(TableLayout tabla, Context context) {
        tabla.setStretchAllColumns(true);
        tabla.bringToFront();

        TableRow tituloRow = new TableRow(context);
        TextView tituloColumna1 = new TextView(context);
        TextView tituloColumna2 = new TextView(context);
        TextView tituloColumna3 = new TextView(context);
        TextView tituloColumna4 = new TextView(context);
        TextView tituloColumna5 = new TextView(context);

        tituloColumna1.setText("   LEXEMA   ");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna1.setGravity(Gravity.CENTER_HORIZONTAL);
        tituloColumna2.setText("   LINEA   ");
        tituloColumna2.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna2.setGravity(Gravity.CENTER_HORIZONTAL);
        tituloColumna3.setText("   COLUMNA   ");
        tituloColumna3.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna3.setGravity(Gravity.CENTER_HORIZONTAL);
        tituloColumna4.setText("   TIPO   ");
        tituloColumna4.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna4.setGravity(Gravity.CENTER_HORIZONTAL);
        tituloColumna5.setText("   DESCRIPCION   ");
        tituloColumna5.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna5.setGravity(Gravity.CENTER_HORIZONTAL);

        tituloRow.addView(tituloColumna1);
        tituloRow.addView(tituloColumna2);
        tituloRow.addView(tituloColumna3);
        tituloRow.addView(tituloColumna4);
        tituloRow.addView(tituloColumna5);
        tabla.addView(tituloRow);

        //Creamos las filas
        for(Advertencia element : listaErrores) {
            TextView lexema = new TextView(context);
            TextView linea = new TextView(context);
            TextView columna = new TextView(context);
            TextView tipo = new TextView(context);
            TextView descripcion = new TextView(context);

            lexema.setText(element.getLexema());
            lexema.setGravity(Gravity.CENTER_HORIZONTAL);
            linea.setText(element.getLinea());
            linea.setGravity(Gravity.CENTER_HORIZONTAL);
            columna.setText(element.getColumna());
            columna.setGravity(Gravity.CENTER_HORIZONTAL);
            tipo.setText(element.getTipo());
            tipo.setGravity(Gravity.CENTER_HORIZONTAL);
            descripcion.setText(element.getDescripcion());
            descripcion.setGravity(Gravity.CENTER_HORIZONTAL);

            TableRow tabRow = new TableRow(context);
            tabRow.addView(lexema);
            tabRow.addView(linea);
            tabRow.addView(columna);
            tabRow.addView(tipo);
            tabRow.addView(descripcion);
            tabla.addView(tabRow);

        }

    }

}
