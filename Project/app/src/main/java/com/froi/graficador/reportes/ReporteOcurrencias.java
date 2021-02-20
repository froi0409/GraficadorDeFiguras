package com.froi.graficador.reportes;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.froi.graficador.entidades.Figura;
import com.froi.graficador.entidades.Token;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ReporteOcurrencias extends ReporteNormal {

    private ArrayList<Token> listaTokens;

    public ReporteOcurrencias(ArrayList<Figura> workList, ArrayList<Token> listaTokens) {
        super(workList);
        this.listaTokens = listaTokens;
    }

    /**
     * Sirve para realizar un reporte en base al arraylist que recibió la clase
     * @param tabla TableLayout en el que se mostraran los datos
     */
    @Override
    public void hacerReporte(TableLayout tabla, Context context) {

        tabla.setStretchAllColumns(true);
        tabla.bringToFront();

        TableRow tituloRow = new TableRow(context);
        TextView tituloColumna1 = new TextView(context);
        TextView tituloColumna2 = new TextView(context);
        TextView tituloColumna3 = new TextView(context);
        TextView tituloColumna4 = new TextView(context);

        tituloColumna1.setText("operador");
        tituloColumna1.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna2.setText("linea");
        tituloColumna2.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna3.setText("columna");
        tituloColumna3.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloColumna4.setText("ocurrencia");
        tituloColumna4.setTypeface(null, Typeface.BOLD_ITALIC);
        tituloRow.addView(tituloColumna1);
        tituloRow.addView(tituloColumna2);
        tituloRow.addView(tituloColumna3);
        tituloRow.addView(tituloColumna4);
        tabla.addView(tituloRow);

        String[] signos = {"+","-","*","-"};

        for(int i = 1; i < listaTokens.size()-1; i++) {
            Token tokenAnterior = listaTokens.get(i-1);
            Token tokenAnalizado = listaTokens.get(i);
            Token tokenDespues = listaTokens.get(i+1);

            TextView operador = new TextView(context);
            TextView linea = new TextView(context);
            TextView columna = new TextView(context);
            TextView ocurrencia = new TextView(context);

            linea.setText(tokenAnalizado.getLinea());
            columna.setText(tokenAnalizado.getColumna());
            String textoOcurrencia = tokenAnterior.getLexema() + " " + tokenAnalizado.getLexema() + " " + tokenDespues.getLexema();
            ocurrencia.setText(textoOcurrencia);

            if(tokenAnalizado.getLexema().equals("-") && ( isSigno(tokenAnterior.getLexema()) || tokenAnterior.getLexema().equals("(")) ) {
                operador.setText("unario");
                addRow(context,tabla,operador,linea,columna,ocurrencia);
            } else if (tokenAnalizado.getLexema().equals("*")) {
                operador.setText("multiplicacion");
                addRow(context,tabla,operador,linea,columna,ocurrencia);
            } else if (tokenAnalizado.getLexema().equals("/")) {
                operador.setText("division");
                addRow(context,tabla,operador,linea,columna,ocurrencia);
            } else if (tokenAnalizado.getLexema().equals("+")) {
                operador.setText("suma");
                addRow(context,tabla,operador,linea,columna,ocurrencia);
            } else if (tokenAnalizado.getLexema().equals("-")) {
                operador.setText("resta");
                addRow(context,tabla,operador,linea,columna,ocurrencia);
            }
        }

    }

    public boolean isSigno (String cadena) {
        return cadena == "+" || cadena == "-" || cadena == "*" || cadena=="/";
    }

    private void addRow(Context context, TableLayout tabla, TextView operador, TextView linea, TextView columna, TextView ocurrencia) {
        TableRow tabRow = new TableRow(context);
        tabRow.addView(operador);
        tabRow.addView(linea);
        tabRow.addView(columna);
        tabRow.addView(ocurrencia);
        tabla.addView(tabRow);
    }

}
