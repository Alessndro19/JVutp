/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_4;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio2 {
    public static void main(String[] args) {
       // Datos
        int mes, lapso, dias = 0;
        boolean bisiesto = false;

        Scanner scan = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("Ingrese el numero del mes (1-12): ");
        mes = scan.nextInt();

        // Proceso + Validacion
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;

            case 4, 6, 9, 11:
                dias = 30;
                break;

            case 2:
                System.out.println("Ingrese el ano: ");
                lapso = scan.nextInt();

                if (lapso % 4 == 0 && (lapso % 100 != 0 || lapso % 400 == 0)) {
                    bisiesto = true;
                }
                if (bisiesto) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            default:
                System.out.println("Numero de mes invalido");
        }

        // Resultado
        System.out.println("El mes " + mes + " tiene " + dias + " dias.");
    }
}

