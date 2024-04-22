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
public class Ejercicio9 {
    public static void main(String[] args) {
         // Datos de entrada
        int numeroPiso;
        char tipoDepartamento;
        double costoDepartamento;
        boolean bd = false; // Bandera para validar los ingresos

        // Datos de proceso
        double incremento = 0, descuento = 0, costoFinal;

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese el costo del departamento: ");
        costoDepartamento = scan.nextDouble();

        System.out.println("Ingrese el numero de piso del departamento: ");
        numeroPiso = scan.nextInt();

        System.out.println("Ingrese el tipo de departamento [B]Basico [O]Otros: ");
        tipoDepartamento = scan.next().charAt(0); // Leer el primer carácter de la entrada

        // Proceso (Validación)
        if (costoDepartamento <= 0) {
            System.out.println("Error: El costo del departamento debe ser mayor que cero.");
            bd = true;
        }

        if (numeroPiso < 2) {
            System.out.println("Error: El número de piso no puede ser menor que 2.");
            bd = true;
        }

        if (tipoDepartamento != 'B' && tipoDepartamento != 'O') {
            System.out.println("Error: Tipo de departamento no válido.");
            bd = true;
        }

        // Proceso (Cálculo de incremento)
        if (!bd) {
            if (numeroPiso >= 2 && numeroPiso <= 5) {
                incremento = 0.03;
            } else if (numeroPiso >= 6 && numeroPiso <= 8) {
                incremento = 0.05;
            } else {
                incremento = 0.07;
            }

            // Calcular el descuento solo para el tipo de departamento Básico
            if (tipoDepartamento == 'B') {
                descuento = 0.02;
            }

            // Calcular el costo final
            costoFinal = costoDepartamento * (1 + incremento) * (1 - descuento);

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto del incremento es: " + (incremento * 100) + "%");
            System.out.println("El monto del descuento es: " + (descuento * 100) + "%");
            System.out.println("El costo final del departamento es: $" + costoFinal);
        }
    }
}
