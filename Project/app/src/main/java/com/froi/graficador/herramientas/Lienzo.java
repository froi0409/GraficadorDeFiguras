package com.froi.graficador.herramientas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.froi.graficador.entidades.Circulo;
import com.froi.graficador.entidades.Figura;
import com.froi.graficador.entidades.Linea;

import java.util.ArrayList;

public class Lienzo extends View {

    private ArrayList<Figura> listaDibujos;

    /**
     * Constructor que nos perminte recibir la lista de los dibujos válidos que debe tener la aplicación
     * @param context Contexto que nos pide el constructror de la clase View
     * @param listaDibujos Lista de los dibujos que se deben graficar
     */
    public Lienzo(Context context, ArrayList<Figura> listaDibujos) {
        super(context);
        this.listaDibujos = listaDibujos;
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawARGB(100, 254, 249, 231);
        int ancho = canvas.getWidth();
        Paint brush = new Paint();
        brush.setARGB(255,0,0,0); //Le damos color al pincel
        brush.setStrokeWidth(4); //Le damos tamaño al pinncel
        //Foreach que nos servirá para reconocer cada dibujo
        for(Figura element : listaDibujos) {
            if(element.getDescripcion().equals("CIRCULO")) {

            } else if (element.getDescripcion().equals("CUADRADO")) {

            } else if (element.getDescripcion().equals("RECTANGULO")) {

            } else if (element.getDescripcion().equals("LINEA")) {
                Linea line = (Linea) element;
                setBrushColor(brush, line.getColor());
                canvas.drawLine(line.getPox(), line.getPoy(), line.getPfx(), line.getPfy(), brush);
            }
        }

    }

    private void setBrushColor(Paint brush, String color) {
        switch(color) {
            case "azul":
                brush.setARGB(255, 0, 102, 204);
                break;
            case "rojo":
                brush.setARGB(255, 255, 0, 0);
                break;
            case  "verde":
                brush.setARGB(255, 102, 2014, 0);
                break;
            case "amarillo":
                brush.setARGB(255, 255, 255, 0);
                break;
            case "naranja":
                brush.setARGB(255, 255, 153, 51);
                break;
            case "morado":
                brush.setARGB(255, 102, 0, 204);
                break;
            case "cafe":
                brush.setARGB(255, 153, 76, 0);
                break;
            case "negro":
                brush.setARGB(255, 0, 0, 0);
                break;
            default:
                brush.setARGB(255, 204, 255, 229);
                break;
        }
    }

}
