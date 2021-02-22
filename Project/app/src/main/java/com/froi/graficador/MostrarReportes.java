package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Freezable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;

import com.froi.graficador.entidades.Figura;
import com.froi.graficador.entidades.Token;
import com.froi.graficador.reportes.ReporteAnimaciones;
import com.froi.graficador.reportes.ReporteColores;
import com.froi.graficador.reportes.ReporteObjetos;
import com.froi.graficador.reportes.ReporteOcurrencias;

import java.util.ArrayList;

public class MostrarReportes extends AppCompatActivity {

    private ArrayList<Figura> listaDibujos;
    private ArrayList<Token> listaTokens;

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
        //Recibimos la lista de los tokens
        listaTokens = (ArrayList<Token>) getIntent().getSerializableExtra("listaTokens");

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
        //Creamos los reportes para ser mostrados en su respectiva tabla
        ReporteOcurrencias reporteOcurrencias = new ReporteOcurrencias(listaDibujos, listaTokens);
        ReporteColores reporteColores = new ReporteColores(listaDibujos);
        ReporteObjetos reporteObjetos = new ReporteObjetos(listaDibujos);
        ReporteAnimaciones reporteAnimaciones = new ReporteAnimaciones(listaDibujos);
        reporteOcurrencias.hacerReporte(tableOcurrencia, this);
        reporteColores.hacerReporte(tableColores, this);
        reporteObjetos.hacerReporte(tableObjetos, this);
        reporteAnimaciones.hacerReporte(tableAnimaciones, this);

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

    private void mostrarFrame(ScrollView frameMostrar) {
        scrollOcurrencia.setVisibility(View.GONE);
        scrollColores.setVisibility(View.GONE);
        scrollObjetos.setVisibility(View.GONE);
        scrollAnimaciones.setVisibility(View.GONE);

        frameMostrar.setVisibility(View.VISIBLE);
    }

}