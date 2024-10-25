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
public class Ejercicio03 {

    public static void main(String[] args) {

        //declarar variables
        int venta, f, c, vmn, vmy;
        int[][] mventas = new int[4][4];

        //Generador de números aleatorios
        Random generadorAleatorios = new Random();

        //entrada de datos
        for (f = 0; f < mventas.length; f++) {
            for (c = 0; c < mventas[0].length; c++) {
                do {
                    venta = 10 + generadorAleatorios.nextInt(5000);
                } while (venta <= 10 || venta > 5000);

                mventas[f][c] = venta;
            }
        }

        vmy = 0;
        vmn = mventas[0][0];

        //proceso de datos
        System.out.println("Los ventas son: ");
        for (f = 0; f < mventas.length; f++) {
            for (c = 0; c < mventas[0].length; c++) {
                System.out.print(mventas[f][c] + "  ");
                if (mventas[f][c] > vmy) {
                    vmy = mventas[f][c];
                }

                if (mventas[f][c] < vmn) {
                    vmn = mventas[f][c];
                }
            }
            System.out.println("");
        }

        //salida de datos
        System.out.println("");
        System.out.println("La venta menor es: " + vmn);
        System.out.println("La venta mayor es: " + vmy);
    }
}
