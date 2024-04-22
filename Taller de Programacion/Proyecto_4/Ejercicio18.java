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
public class Ejercicio18 {
    public static void main(String[] args) {
        // Variables
        char destino;
        int cantidadPasajes;
        double precio = 0;
        double descuento = 0;
        double totalPagar = 0;
        boolean error = false; // Bandera para validar datos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario y validar destino
        System.out.println("Ingrese el destino (A: Arequipa, M: Moquegua, T: Tacna): ");
        destino = scan.next().charAt(0);
        switch (destino) {
            case 'A', 'a':
                precio = 84.00;
                break;
            case 'M', 'm':
                precio = 96.00;
                break;
            case 'T', 't':
                precio = 125.00;
                break;
            default:
                System.out.println("Destino no valido.");
                error = true;
                break;
        }

        // Si el destino es válido, solicitar cantidad de pasajes y validar
        if (!error) {
            System.out.println("Ingrese la cantidad de pasajes comprados: ");
            cantidadPasajes = scan.nextInt();

            // Validar cantidad de pasajes y calcular descuento
            if (cantidadPasajes >= 3 && cantidadPasajes <= 10) {
                switch (destino) {
                    case 'A', 'a':
                        descuento = precio * 0.10;
                        break;
                    case 'M', 'm':
                        descuento = precio * 0.15;
                        break;
                    case 'T', 't':
                        descuento = precio * 0.20;
                        break;
                }
            } else if (cantidadPasajes >= 11) {
                switch (destino) {
                    case 'A', 'a':
                        descuento = precio * 0.15;
                        break;
                    case 'M', 'm':
                        descuento = precio * 0.20;
                        break;
                    case 'T', 't':
                        descuento = precio * 0.25;
                        break;
                }
            } else {
                System.out.println("Cantidad de pasajes no valida.");
                error = true;
            }

            // Calcular total a pagar si no hay errores
            if (!error) {
                totalPagar = precio - descuento;

                // Mostrar resultados
                System.out.println("Descuento: S/. " + descuento);
                System.out.println("Total a pagar: S/. " + totalPagar);
            }
        }
    }
}