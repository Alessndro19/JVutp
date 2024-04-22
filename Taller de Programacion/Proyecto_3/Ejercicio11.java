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
public class Ejercicio11 {
    public static void main(String[] args) {
        // Datos de entrada
        double montoMensual;
        int edad;
        boolean bd = false; // Bandera para validar los ingresos

        // Datos de proceso
        double incremento = 0, descuento = 0, totalPagar;

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese el monto mensual a pagar: ");
        montoMensual = scan.nextDouble();

        System.out.println("Ingrese la edad del socio: ");
        edad = scan.nextInt();

        // Proceso (Validación)
        if (montoMensual <= 0) {
            System.out.println("Error: El monto mensual debe ser mayor que cero.");
            bd = true;
        }

        if (edad <= 0) {
            System.out.println("Error: La edad del socio debe ser mayor que cero.");
            bd = true;
        }

        // Proceso (Cálculo de incremento)
        if (!bd) {
            if (edad > 60) {
                descuento = 0.02;
            }

            // Calcular el incremento según el servicio
            System.out.println("Seleccione el servicio: ");
            System.out.println("[1] Comidas");
            System.out.println("[2] Sauna");
            System.out.println("[3] Hospedaje");
            int opcion = scan.nextInt();

            if (opcion == 1) {
                incremento = 0.05;
            } else if (opcion == 2) {
                incremento = 0.07;
            } else if (opcion == 3) {
                incremento = 0.09;
            } else {
                System.out.println("Error: Opción no válida.");
                bd = true;
            }

            if (!bd) {
                // Calcular el total a pagar
                totalPagar = montoMensual * (1 + incremento) * (1 - descuento);

                // Mostrar resultados
                System.out.println("IMPRIMIENDO RESULTADOS");
                System.out.println("-----------------------");
                System.out.println("El monto del incremento es: " + (incremento * 100.0) + "%");
                System.out.println("El monto del descuento es: " + (descuento * 100) + "%");
                System.out.println("El total a pagar por el socio es: $" + (totalPagar*100.0/100.0));
            }
        }
    }
}
