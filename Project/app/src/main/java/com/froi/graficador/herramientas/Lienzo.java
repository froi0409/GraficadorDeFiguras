package com.froi.graficador.herramientas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import com.froi.graficador.entidades.Circulo;
import com.froi.graficador.entidades.Cuadrado;
import com.froi.graficador.entidades.Figura;
import com.froi.graficador.entidades.Linea;
import com.froi.graficador.entidades.Poligono;
import com.froi.graficador.entidades.Rectangulo;

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
            setBrushColor(brush, element.getColor()); //Le damos color a la brocha
            if(element.getDescripcion().equals("CIRCULO")) {
                Circulo circle = (Circulo) element;
                canvas.drawCircle(circle.getPox(), circle.getPoy(), circle.getRadio(), brush);
            } else if (element.getDescripcion().equals("CUADRADO")) {
                Cuadrado square = (Cuadrado) element;
                int tamañoX = square.getPox() + square.getTamaño();
                int tamañoY = square.getPoy() + square.getTamaño();
                canvas.drawRect(square.getPox(), square.getPoy(), tamañoX, tamañoY, brush);
            } else if (element.getDescripcion().equals("RECTANGULO")) {
                Rectangulo rect = (Rectangulo) element;
                int altoRect = rect.getPoy() + rect.getAlto();
                int anchoRect = rect.getPox() + rect.getAncho();
                canvas.drawRect(rect.getPox(), rect.getPoy(), anchoRect, altoRect, brush);
            } else if (element.getDescripcion().equals("LINEA")) {
                Linea line = (Linea) element;
                canvas.drawLine(line.getPox(), line.getPoy(), line.getPfx(), line.getPfy(), brush);
            } else if (element.getDescripcion().equals("POLIGONO")) {
                Poligono polig = (Poligono) element;
                brush.setStyle(Paint.Style.FILL);
                Path path = new Path();
                int numeroLados = polig.getLados();
                double seccion = (float) (2* Math.PI / numeroLados);
                int radio = polig.getAncho()/2;

                path.reset(); // reseteamos el path
                path.moveTo((polig.getPox() + radio *(float) Math.cos(0)), (polig.getPoy()+radio*(float)Math.sin(0)));

                for (int i = 1; i < numeroLados; i++) {
                    //obtenemos las coordenadas de los vertices del poligono
                    float coordX = polig.getPox() + radio * (float)Math.cos(seccion*i);
                    float coordY = polig.getPoy() + radio * (float)Math.sin(seccion*i);
                    //Establecemos las coordenadas de los vertices del poligono en el path
                    path.lineTo(coordX, coordY); //
                }
                //Cerramos el path
                path.close();
                canvas.drawPath(path, brush);
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
