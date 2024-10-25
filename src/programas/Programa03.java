/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Programa03 {

    public static void main(String[] args) {

        //declarar variables
        int numero, f, c, dmy, dmn;
        int[][] mnumeros = new int[3][3];
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                System.out.print("Ingresar numero: ");
                numero = lectura.nextInt();
                mnumeros[f][c] = numero;
            }
        }

        dmy = 0;
        dmn = mnumeros[0][0];

        //proceso de datos
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {

                if (mnumeros[f][c] > dmy) {
                    dmy = mnumeros[f][c];
                }

                if (mnumeros[f][c] < dmn) {
                    dmn = mnumeros[f][c];
                }
            }
        }
        //salida de datos
        System.out.println("");
        System.out.println("El numero mayor es: " + dmy);
        System.out.println("El numero menor es: " + dmn);
    }
}
