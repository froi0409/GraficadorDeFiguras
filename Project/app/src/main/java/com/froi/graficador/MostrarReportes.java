package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Freezable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;

import com.froi.graficador.entidades.Figura;
import com.froi.graficador.reportes.ReporteColores;

import java.util.ArrayList;

public class MostrarReportes extends AppCompatActivity {

    ArrayList<Figura> listaDibujos;

    private ScrollView scrollOcurrencia;
    private ScrollView scrollColores;
    private ScrollView scrollObjetos;
    private ScrollView scrollAnimaciones;

    private TableLayout tableOcurrencia;
    private TableLayout tableColores;
    private TableLayout tableObjetos;
    private TableLayout tableAnimaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_reportes);

        //Recibimos la lista de los dibujos
        listaDibujos = (ArrayList<Figura>) getIntent().getSerializableExtra("listaDibujos");

        //Inicializamos los frames
        scrollOcurrencia = (ScrollView) findViewById(R.id.scrollOcurrencia);
        scrollColores = (ScrollView) findViewById(R.id.scrollColores);
        scrollObjetos = (ScrollView) findViewById(R.id.scrollObjetos);
        scrollAnimaciones = (ScrollView) findViewById(R.id.scrollAnimaciones);
        //Inicializamos los TableLayout
        tableOcurrencia = (TableLayout) findViewById(R.id.tableOcurrencia);
        tableColores = (TableLayout) findViewById(R.id.tableColores);
        tableObjetos = (TableLayout) findViewById(R.id.tableObjetos);
        tableAnimaciones = (TableLayout) findViewById(R.id.tableAnimaciones);

        mostrarFrame(scrollOcurrencia);

        tableColores.setStretchAllColumns(true);
        tableColores.bringToFront();
        ReporteColores reporteColores = new ReporteColores(listaDibujos);
        reporteColores.hacerReporte(tableColores, this);

    }

    public void ocurrencias(View view) {
        mostrarFrame(scrollOcurrencia);
    }

    public void coloresUsados(View view) {
        mostrarFrame(scrollColores);
    }

    public void objetosUsados(View view) {
        mostrarFrame(scrollObjetos);
    }

    public void animacionesHechas(View view) {
        mostrarFrame(scrollAnimaciones);
    }

    public void regresar(View view) {
        finish();
    }

    private void mostrarFrame(FrameLayout frameMostrar) {
        scrollOcurrencia.setVisibility(View.GONE);
        scrollColores.setVisibility(View.GONE);
        scrollObjetos.setVisibility(View.GONE);
        scrollAnimaciones.setVisibility(View.GONE);

        frameMostrar.setVisibility(View.VISIBLE);
    }

}