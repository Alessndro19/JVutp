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
public class Ejercicio7 {
    public static void main(String[] args) {
        // Variables
        double costoVehiculo, impuesto = 0, descuento = 0, costoFinal = 0;
        int antiguedad;
        char marca;
        boolean error = false;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el costo del vehiculo en soles (S/.): ");
        costoVehiculo = scan.nextDouble();

        System.out.println("Ingrese el numero de anos de antiguedad del vehiculo: ");
        antiguedad = scan.nextInt();

        System.out.println("Ingrese la marca del vehiculo [N]Nissan [T]Toyota: ");
        marca = scan.next().charAt(0);

        // Validar los datos
        if (costoVehiculo <= 0 || antiguedad <= 0) {
            System.out.println("Error: El costo del vehiculo y la antiguedad deben ser mayores que cero.");
            error = true;
        }

        // Calcular el impuesto
        if (!error) {
            switch (antiguedad) {
                case 5:
                    impuesto = costoVehiculo * 0.03;
                    break;
                case 7:
                    impuesto = costoVehiculo * 0.05;
                    break;
                case 10:
                    impuesto = costoVehiculo * 0.07;
                    break;
                default:
                    System.out.println("Error: La antiguedad del vehiculo no esta dentro de los valores permitidos.");
                    error = true;
                    break;
            }

            // Aplicar descuento según la marca del vehículo
            if (!error) {
                switch (marca) {
                    case 'N','n':
                        descuento = 200;
                        break;
                    case 'T','t':
                        descuento = 100;
                        break;
                    default:
                        System.out.println("Advertencia: No se aplicara descuento para otras marcas.");
                        break;
                }

                // Calcular el costo final
                costoFinal = costoVehiculo + impuesto - descuento;

                // Mostrar resultados
                System.out.println("IMPRIMIENDO RESULTADOS");
                System.out.println("-----------------------");
                System.out.println("El impuesto aplicado es: S/. " + impuesto);
                System.out.println("El descuento aplicado es: S/. " + descuento);
                System.out.println("El costo final del vehiculo es: S/. " + costoFinal);
            } else {
                System.out.println("Error en los datos ingresados. No se puede calcular el costo final.");
            }
        }
    }
}
