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
public class Programa02 {

    public static void main(String[] args) {

        //declarar variables
        int numero = 0, f, c;
        double promedio = 0.0, suma = 0.0;
        int[][] mnumeros = new int[3][4];
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
        for (f = 0; f < mnumeros.length; f++) {
            for (c = 0; c < mnumeros[0].length; c++) {
                suma += mnumeros[f][c];
            }
        }
        promedio = suma / (mnumeros.length * mnumeros[0].length);

        //salida de datos
        System.out.println("");
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
}
