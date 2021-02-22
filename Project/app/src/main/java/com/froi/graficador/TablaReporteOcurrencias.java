package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TablaReporteOcurrencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_reporte_ocurrencias);

        creacionTabla();
    }

    private void creacionTabla() {
        TableLayout tablaReporte = (TableLayout) findViewById(R.id.tablaReporte);
        tablaReporte.setStretchAllColumns(true);
        tablaReporte.bringToFront();

        TableRow.LayoutParams paramTable = new TableRow.LayoutParams();
        paramTable.setMargins(12,20,2,20);

        for(int i = 0; i < 100; i++) {
            TableRow tabRow = new TableRow(this);

            TextView texto = new TextView(this);
            String textoMostrar = "Texto: " + i + " asies";
            texto.setText(textoMostrar);
            TextView columnaDos = new TextView(this);
            columnaDos.setText("jajaja, asies");
            tabRow.addView(texto);
            tabRow.addView((columnaDos));
            tablaReporte.addView(tabRow, paramTable);

        }

    }

}