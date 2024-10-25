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
public class Programa01 {

    public static void main(String[] args) {
        //declarar variables
        int sp, ci, r, numero, c, f;
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

        //proceso de datos
        sp = 0;
        ci = 0;
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                r = mnumeros[f][c] % 2;
                if (r == 0) {
                    sp += mnumeros[f][c];
                } else {
                    ci++;
                }
            }
        }
        //salida de datos
        System.out.println("La suma de los digitos pares es: " + sp);
        System.out.println("La cantidad de digos impares es: " + ci);
    }

}
