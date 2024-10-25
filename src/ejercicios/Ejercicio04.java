/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author serva
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //declarar variables
        int venta, f, c;
        double prom, sventas;
        int[][] mventas = new int[5][5];

        //Generador de números aleatorios
        Random generadorAleatorios = new Random();

        //entrada de datos
        for (f = 0; f < mventas.length; f++) {
            for (c = 0; c < mventas[0].length; c++) {
                do {
                    venta = 1000 + generadorAleatorios.nextInt(10000);
                } while (venta <= 1000 || venta > 10000);

                mventas[f][c] = venta;
            }
        }

        sventas = 0.0;
        prom = 0.0;

        //proceso de datos
        System.out.println("Los ventas son: ");
        for (f = 0; f < mventas.length; f++) {
            for (c = 0; c < mventas[0].length; c++) {
                System.out.print(mventas[f][c] + "  ");
                sventas += mventas[f][c];
            }
            System.out.println("");
        }

        prom = sventas / (mventas.length * mventas[0].length);
        //salida de datos
        System.out.println("");
        System.out.println("El total de ventas es: " + sventas);
        System.out.println("El promedio de ventas es: " + prom);
    }
}
