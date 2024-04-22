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
public class Ejercicio16 {
    public static void main(String[] args) {
         // Variables
        int tipoTarjeta, cuotas;
        double montoOriginal, interes, montoCuota;
        boolean error = false; // Inicializamos error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Seleccione el tipo de tarjeta de crEdito:");
        System.out.println("1. Visa");
        System.out.println("2. Premium");
        System.out.println("3. Electron");
        tipoTarjeta = scan.nextInt();

        System.out.println("Ingrese el monto original de la deuda: ");
        montoOriginal = scan.nextDouble();

        System.out.println("Ingrese el numero de cuotas (maximo 8): ");
        cuotas = scan.nextInt();

        // Proceso (Validación de datos)
        if (cuotas <= 0 || cuotas > 8) {
            System.out.println("Numero de cuotas no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo del monto de la cuota)
        if (!error) { // Comprobamos si no hay errores
            switch (tipoTarjeta) {
                case 1:
                    interes = 5;
                    break;
                case 2:
                    interes = 3;
                    break;
                case 3:
                    interes = 1;
                    break;
                default:
                    interes = 0; // Esto no debería ocurrir
            }

            montoCuota = montoOriginal * (1 + (interes / 100)) / cuotas;

            // Mostrar resultado
            System.out.println("El monto de la cuota es: S/." + montoCuota);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el monto de la cuota.");
        }
    }
}
