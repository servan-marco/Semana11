/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Random;

/**
 *
 * @author serva
 */
public class Programa04 {

    public static void main(String[] args) {

        //declarar variables
        int sueldo, f, c;
        double prom, ssueldos;
        int[][] msueldos = new int[5][5];

        //Generador de números aleatorios
        Random generadorAleatorios = new Random();

        //entrada de datos
        for (f = 0; f < msueldos.length; f++) {
            for (c = 0; c < msueldos[0].length; c++) {
                do {
                    sueldo = 1025 + generadorAleatorios.nextInt(10000);
                } while (sueldo <= 1025 || sueldo > 10000);

                msueldos[f][c] = sueldo;
            }
        }

        ssueldos = 0.0;
        prom = 0.0;

        //proceso de datos
        System.out.println("Los sueldos son: ");
        for (f = 0; f < msueldos.length; f++) {
            for (c = 0; c < msueldos[0].length; c++) {
                System.out.print(msueldos[f][c] + "  ");
                ssueldos += msueldos[f][c];
            }
            System.out.println("");
        }

        prom = ssueldos / (msueldos.length * msueldos[0].length);
        //salida de datos
        System.out.println("");
        System.out.println("La suma de sueldos es: " + ssueldos);
        System.out.println("El promedio de sueldos es: " + prom);
    }
}
