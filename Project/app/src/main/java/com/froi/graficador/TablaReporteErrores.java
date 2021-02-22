package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.froi.graficador.entidades.Advertencia;
import com.froi.graficador.reportes.ReporteErrores;

import java.util.ArrayList;

public class TablaReporteErrores extends AppCompatActivity {

    private ScrollView scrollErrores;
    private TableLayout tableErrores;
    private ArrayList<Advertencia> listaErrores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_reporte_errores);

        //Obtenemos los errores
        listaErrores = (ArrayList<Advertencia>) getIntent().getSerializableExtra("listaErrores");

        ScrollView scrollErrores = (ScrollView) findViewById(R.id.scrollErrores);
        TableLayout tableErrores = (TableLayout) findViewById(R.id.tableErrores);

        ReporteErrores reporteErrores = new ReporteErrores(listaErrores);
        reporteErrores.hacerReporte(tableErrores, this);

    }

    public void regresar(View view) {
        finish();
    }

}