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
public class Ejercicio8 {
    public static void main(String[] args) {
        // Variables
        char tipoVehiculo,respuesta;
        double descuento = 0;
        double totalPagar = 0;
        boolean error = false; // Inicializamos la bandera de error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar y validar el tipo de vehículo
        System.out.println("Seleccione el tipo de vehiculo (M: Moto, A: Automovil, C: Camion): ");
        tipoVehiculo = scan.next().charAt(0);

        switch (tipoVehiculo) {
            case 'M', 'm':
                descuento = 10;
                break;
            case 'A', 'a':
                descuento = 20;
                break;
            case 'C', 'c':
                descuento = 30;
                break;
            default:
                System.out.println("Tipo de vehiculo no valido.");
                error = true;
                break;
        }

        // Verificar si el cliente es antiguo para aplicar descuento adicional
        if (!error) {
            System.out.println("Es cliente antiguo? (S/N): ");
            respuesta = scan.next().charAt(0);
            if (respuesta == 'S' || respuesta == 's') {
                descuento += 15;
            } else if (respuesta != 'N' && respuesta != 'n') {
                System.out.println("Respuesta no valida.");
                error = true;
            }
        }

        // Calcular el total a pagar
        if (!error) {
            totalPagar = descuento;
            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El descuento aplicado es: S/. " + descuento);
            System.out.println("El total a pagar por la reparacion es: S/. " + totalPagar);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el total a pagar.");
        }
    }
}
