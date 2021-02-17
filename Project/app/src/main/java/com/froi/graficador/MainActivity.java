package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.froi.graficador.entidades.Figura;
import com.froi.graficador.lexer.GraficadorLex;
import com.froi.graficador.parser.parser;

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
        StringReader reader = new StringReader(prueba);
        GraficadorLex lexico = new GraficadorLex(reader);
        parser parserPrueba = new parser(lexico);

        try {
            System.out.println(prueba);
            parserPrueba.parse();
            ArrayList<Figura> lista = parserPrueba.getGraficaciones();
            for(Figura element : lista){
                System.out.println(element);
            }

        } catch (Exception ex) {
            System.out.println(prueba);
            System.out.println("error: " + ex.getMessage());
        }

    }

}
