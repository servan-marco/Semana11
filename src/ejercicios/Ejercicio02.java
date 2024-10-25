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
public class Ejercicio02 {

    public static void main(String[] args) {

        //declarar variables
        int compras, f, c, n;
        double tv, pv;
        int[][] mcompras = new int[4][4];
        Scanner lectura = new Scanner(System.in);

        //entrada de datos
        n = 1;
        for (f = 0; f < mcompras.length; f++) {
            for (c = 0; c < mcompras[0].length; c++) {
                System.out.print("Ingresar compra " + n++ + ": ");
                compras = lectura.nextInt();
                mcompras[f][c] = compras;
            }
        }
        //proceso de datos
        tv = 0.0;
        for (f = 0; f < mcompras.length; f++) {
            for (c = 0; c < mcompras[0].length; c++) {
                tv += mcompras[f][c];
            }
        }
        pv = tv / (mcompras.length * mcompras[0].length);

        //salida de datos
        System.out.println("");
        System.out.println("Total de comprass es: " + tv);
        System.out.println("Promedio de comprass es: " + pv);
    }
}
