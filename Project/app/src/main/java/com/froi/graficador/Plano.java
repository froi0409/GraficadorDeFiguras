package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.froi.graficador.entidades.Figura;
import com.froi.graficador.entidades.Token;
import com.froi.graficador.herramientas.Lienzo;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Plano extends AppCompatActivity {

    private ArrayList<Figura> listaDibujos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano);

        try {
            recepcionDatos();;
        } catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        FrameLayout layoutEspacioDubujo = (FrameLayout) findViewById((R.id.layoutEspacioDubujo));
        Lienzo fondo = new Lienzo(this, listaDibujos);
        layoutEspacioDubujo.addView(fondo);

    }

    public void recepcionDatos() throws NoSuchAlgorithmException {
        listaDibujos = (ArrayList<Figura>) getIntent().getSerializableExtra("listaDibujos");
    }

    public void mostrarReportePrueba(View view) {
        Intent reportes = new Intent(this, MostrarReportes.class);
        reportes.putExtra("listaDibujos", listaDibujos);

        //Enviamos los tokens a los reportes
        ArrayList<Token> listaTokens = (ArrayList<Token>) getIntent().getSerializableExtra("listaTokens");
        reportes.putExtra("listaTokens", listaTokens);

        startActivity(reportes);
    }

    public void regresar(View view) {
        finish();
    }

}