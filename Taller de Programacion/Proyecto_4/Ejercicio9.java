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
public class Ejercicio9 {
    public static void main(String[] args) {
        // Variables
        char diaFuncion;
        int cantidadEntradas;
        double tarifaEntrada = 0;
        double descuento = 0;
        double totalPagar = 0;
        boolean error = false; // Bandera para validar datos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar el día de la función
        System.out.println("Ingrese el dia de la funcion (V: Viernes, S: Sabado, D: Domingo): ");
        diaFuncion = scan.next().charAt(0);

        // Validar el día de la función
        switch (diaFuncion) {
            case 'V','v', 'S','s','D','d':
                // Asignar tarifa de entrada según el día de la función
                switch (diaFuncion) {
                    case 'V','v':
                        tarifaEntrada = 23.50;
                        break;
                    case 'S','s':
                        tarifaEntrada = 33.50;
                        break;
                    case 'D', 'd':
                        tarifaEntrada = 38.50;
                        break;
                }
                break;
            default:
                System.out.println("Día de funcion no valido.");
                error = true;
        }

        // Si el día de la función es válido, continuar con la entrada de datos
        if (!error) {
            // Solicitar la cantidad de entradas
            System.out.println("Ingrese la cantidad de entradas: ");
            cantidadEntradas = scan.nextInt();

            // Validar la cantidad de entradas
            if (cantidadEntradas <= 0) {
                System.out.println("Cantidad de entradas no valida.");
                error = true;
            }

            // Calcular el total a pagar si no hay errores
            if (!error) {
                totalPagar = tarifaEntrada * cantidadEntradas;
                // Aplicar descuento si se compran 15 o más entradas
                if (cantidadEntradas >= 15) {
                    descuento = totalPagar * 0.02;
                    totalPagar -= descuento;
                }

                // Mostrar resultados
                System.out.println("IMPRIMIENDO RESULTADOS");
                System.out.println("-----------------------");
                System.out.println("El descuento aplicado es: S/. " + descuento);
                System.out.println("El total a pagar por todas las entradas es: S/. " + totalPagar);
            }
        }
    }
}
