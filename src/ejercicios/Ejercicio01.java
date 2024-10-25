/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author serva
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        //declarar variables
        int venta, f, c;
        double tv;
        int[][] mventas = new int[4][4];
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        for (f = 0; f < mventas.length; f++) {
            for (c = 0; c < mventas[0].length; c++) {
                System.out.print("Ingresar venta: ");
                venta = lectura.nextInt();
                mventas[f][c] = venta;
            }
        }
        //proceso de datos
        tv = 0.0;
        for (f = 0; f < mventas.length; f++) {
            for (c = 0; c < mventas[0].length; c++) {
                tv += mventas[f][c];
            }
        }
        //salida de datos
        System.out.println("");
        System.out.println("Total de ventas es: " + tv);
    }
}
