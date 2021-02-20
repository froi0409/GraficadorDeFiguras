package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Freezable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TableLayout;

public class MostrarReportes extends AppCompatActivity {

    private FrameLayout frameOcurrencia;
    private FrameLayout frameColores;
    private FrameLayout frameObjetos;
    private FrameLayout frameAnimaciones;

    private TableLayout tableOcurrencia;
    private TableLayout tableColores;
    private TableLayout tableObjetos;
    private TableLayout tableAnimaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_reportes);
        //Inicializamos los frames
        frameOcurrencia = (FrameLayout) findViewById(R.id.frameOcurrencia);
        frameColores = (FrameLayout) findViewById(R.id.frameColores);
        frameObjetos = (FrameLayout) findViewById(R.id.frameObjetos);
        frameAnimaciones = (FrameLayout) findViewById(R.id.frameAnimaciones);
        //Inicializamos los TableLayout
        tableOcurrencia = (TableLayout) findViewById(R.id.tableOcurrencias);
        tableColores = (TableLayout) findViewById(R.id.tableColores);
        tableObjetos = (TableLayout) findViewById(R.id.tableObjetos);
        tableAnimaciones = (TableLayout) findViewById(R.id.tableAnimaciones);

        mostrarFrame(frameOcurrencia);

    }

    public void ocurrencias(View view) {
        mostrarFrame(frameOcurrencia);
    }

    public void coloresUsados(View view) {
        mostrarFrame(frameColores);
    }

    public void objetosUsados(View view) {
        mostrarFrame(frameObjetos);
    }

    public void animacionesHechas(View view) {
        mostrarFrame(frameAnimaciones);
    }

    public void regresar(View view) {
        finish();
    }

    private void mostrarFrame(FrameLayout frameMostrar) {
        frameOcurrencia.setVisibility(View.GONE);
        frameColores.setVisibility(View.GONE);
        frameObjetos.setVisibility(View.GONE);
        frameAnimaciones.setVisibility(View.GONE);

        frameMostrar.setVisibility(View.VISIBLE);
    }

}