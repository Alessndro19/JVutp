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
public class Ejercicio10 {
    public static void main(String[] args) {
        // Variables
        char medioTransporte, destino;
        double tarifa = 0;
        double pesoCarga;
        double costoEnvio;
        boolean error = false; // Inicializamos error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el medio de transporte (A: Aereo, M: Maritimo): ");
        medioTransporte = scan.next().charAt(0);

        System.out.println("Ingrese el destino (N: Norte, S: Sur, C: Centro): ");
        destino = scan.next().charAt(0);

        System.out.println("Ingrese el peso de la carga en toneladas: ");
        pesoCarga = scan.nextDouble();

        // Proceso (Validación de datos)
        if (!(medioTransporte == 'A' || medioTransporte == 'M')) {
            System.out.println("Medio de transporte no valido.");
            error = true; // Cambiamos error a true
        }

        if (!(destino=='N' || destino=='S' || destino=='C')) {
            System.out.println("Destino no valido.");
            error = true; // Cambiamos error a true
        }

        if (pesoCarga <= 0) {
            System.out.println("Peso de la carga no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo de costo de envío)
        if (!error) { // Comprobamos si no hay errores
            switch (medioTransporte) {
                case 'A','a':
                    switch (destino) {
                        case 'N','n':
                            tarifa = 30;
                            break;
                        case 'S','s':
                            tarifa = 25;
                            break;
                        case 'C','c':
                            tarifa = 20;
                            break;
                    }
                    break;
                case 'M':
                    switch (destino) {
                        case 'N','n':
                            tarifa = 25;
                            break;
                        case 'S','s':
                            tarifa = 20;
                            break;
                        case 'C','c':
                            tarifa = 15;
                            break;
                    }
                    break;
            }

            costoEnvio = pesoCarga * tarifa;

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El costo de envio es: S/. " + costoEnvio);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el costo de envio.");
        }
    }
}
