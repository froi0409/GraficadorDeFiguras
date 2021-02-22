package com.froi.graficador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.froi.graficador.entidades.Advertencia;
import com.froi.graficador.entidades.Figura;
import com.froi.graficador.entidades.Token;
import com.froi.graficador.lexer.GraficadorLex;
import com.froi.graficador.parser.parser;

import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txtArea;
    private String entradaTexto; //prueba
    private ArrayList<Figura> listaDibujos;
    private ArrayList<Advertencia> listaErrores;
    private ArrayList<String> lexemasEntrantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtArea=(EditText)findViewById(R.id.txtArea);
        lexemasEntrantes = new ArrayList<>();
    }

    public void compilacion(View view) {

        listaErrores = new ArrayList<Advertencia>(); //Listado de errores encontrados
        entradaTexto = txtArea.getText().toString();
        StringReader reader = new StringReader(entradaTexto);

        GraficadorLex lexico = new GraficadorLex(reader, listaErrores);
        parser parserPrueba = new parser(lexico, listaErrores);

        try {
            System.out.println("\n\nPARSER SIN PASAR\n\n");
            parserPrueba.parse();
            listaDibujos = parserPrueba.getGraficaciones();
            System.out.println("\n\nPARSER PASADO: " + listaErrores.size() +"\n\n");
            if(listaErrores.size() > 0) {
                // Si hubieron errores de algún tipo durante el análisis léxico o sintáctico , en vez de graficar nos tira al reporte de errores
                Intent ventanaErrores = new Intent(this, TablaReporteErrores.class);
                /* DEBEMOS REVISAR ESTO */
                ventanaErrores.putExtra("listaErrores", listaErrores); //Enviamos los errores a la ventana del reporte de errores

                startActivity(ventanaErrores);
            } else if(listaDibujos.size() == 0) {
                Toast advertencia = Toast.makeText(this, "Ingrese texto para compilar", Toast.LENGTH_SHORT);
                advertencia.show();
            } else {
                //Si no hay errores durante el análisis léxico y sintáctico, nos dirigimos a la graficadora
                Intent ventanaSecundaria = new Intent(this, Plano.class);
                ventanaSecundaria.putExtra("listaDibujos", listaDibujos); // Enviamos la lista de figuras a graficar

                //Obtenemos los tokens
                ArrayList<Token> listaTokens = new ArrayList<>();
                listaTokens = lexico.getListaTokens();
                ventanaSecundaria.putExtra("listaTokens", listaTokens);

                startActivity(ventanaSecundaria);
            }

        } catch (Exception ex) {
            System.out.println("error IRRECUPERABLE: " + ex.getMessage());
            ex.printStackTrace();
        }



    }

}
