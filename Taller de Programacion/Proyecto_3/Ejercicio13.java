/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        // Datos de entrada
        int antiguedad;
        String marca;
        double costo, impuesto = 0, costoFinal;
        boolean bd = false; // Bandera para validar los ingresos

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese el numero de anos de antiguedad del vehiculo: ");
        antiguedad = scan.nextInt();

        System.out.println("Ingrese la marca del vehiculo: ");
        marca = scan.next();

        System.out.println("Ingrese el costo del vehiculo: ");
        costo = scan.nextDouble();

        // Proceso (Validación)
        if (antiguedad <= 0) {
            System.out.println("Error: La antiguedad del vehiculo debe ser mayor que cero.");
            bd = true;
        }

        if (costo <= 0) {
            System.out.println("Error: El costo del vehiculo debe ser mayor que cero.");
            bd = true;
        }

        // Proceso (Cálculo de impuesto)
        if (!bd) {
            if (antiguedad >= 5 && antiguedad <= 9) {
                impuesto = 0.02;
            } else if (antiguedad >= 10 && antiguedad <= 15) {
                impuesto = 0.04;
            } else if (antiguedad >= 16) {
                impuesto = 0.06;
            }

            // Aplicar descuento para la marca Nissan
            if (marca.equalsIgnoreCase("Nissan")) {
                costoFinal = costo * (1 + impuesto) - 200;
            } else {
                costoFinal = costo * (1 + impuesto);
            }

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto del impuesto es: " + (impuesto * 100) + "%");
            System.out.println("El costo final del vehiculo es: S/." + costoFinal);
        }
    }
}
