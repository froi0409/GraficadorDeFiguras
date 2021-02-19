package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.froi.graficador.entidades.Advertencia;
import com.froi.graficador.entidades.Figura;
import com.froi.graficador.lexer.GraficadorLex;
import com.froi.graficador.parser.parser;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txtArea;
    public static String prueba; //prueba

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtArea=(EditText)findViewById(R.id.txtArea);
    }

    public void compilacion(View view) {

        prueba = txtArea.getText().toString();
        ArrayList<Advertencia> listaErrores = new ArrayList<Advertencia>();
        StringReader reader = new StringReader(prueba);
        GraficadorLex lexico = new GraficadorLex(reader, listaErrores);
        parser parserPrueba = new parser(lexico);

        try {
            System.out.println(prueba);
            parserPrueba.parse();
            ArrayList<Figura> lista = parserPrueba.getGraficaciones();
            System.out.println("\n\n\nERRORES\n");
            for(Advertencia element : listaErrores){
                System.out.println(element);
            }

            recoleccionDeDatos(lista);

        } catch (Exception ex) {
            System.out.println(prueba);
            System.out.println("error: " + ex.getMessage());
        }



    }

    public void recoleccionDeDatos(ArrayList<Figura> lista) {

        Intent ventanaSecundaria = new Intent(this, Plano.class);
        ventanaSecundaria.putExtra("listaDibujos", lista);

        startActivity(ventanaSecundaria);

    }

}
