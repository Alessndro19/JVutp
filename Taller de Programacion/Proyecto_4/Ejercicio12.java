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
public class Ejercicio12 {
    public static void main(String[] args) {
        // Variables
        char destino, modalidad;
        double incremento = 0,tarifaKilo = 0, montoIncremento, pagoFinal, pesoCarga, pagoBasico;
        boolean error = false; // Inicializamos error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el destino (T: Tarapoto, J: Jaen, C: Chachapoyas): ");
        destino = scan.next().charAt(0);

        System.out.println("Ingrese el peso de la carga en kilogramos: ");
        pesoCarga = scan.nextDouble();

        System.out.println("Ingrese la modalidad de servicio (A: agencia-agencia, B: agencia-domicilio, C: domicilio-domicilio): ");
        modalidad = scan.next().charAt(0);

        // Proceso (Validación de datos)
        if (!(destino == 'T' || destino == 'J' || destino == 'C')) {
            System.out.println("Destino no valido.");
            error = true; // Cambiamos error a true
        }

        if (!(modalidad == 'A' || modalidad == 'B' || modalidad == 'C')) {
            System.out.println("Modalidad de servicio no valida.");
            error = true; // Cambiamos error a true
        }

        if (pesoCarga <= 0) {
            System.out.println("Peso de la carga no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo del pago básico)
        if (!error) { // Comprobamos si no hay errores
            switch (destino) {
                case 'T', 't':
                    tarifaKilo = 15.00;
                    break;
                case 'J', 'j':
                    tarifaKilo = 20.00;
                    break;
                case 'C', 'c':
                    tarifaKilo = 10.00;
                    break;
            }

            switch (modalidad) {
                case 'A', 'a':
                    incremento = 0;
                    break;
                case 'B', 'b':
                    incremento = 25;
                    break;
                case 'C', 'c':
                    incremento = 45;
                    break;
            }

            pagoBasico = pesoCarga * tarifaKilo;
            montoIncremento = pagoBasico * incremento / 100;
            pagoFinal = pagoBasico + montoIncremento;

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El pago basico por el servicio de transporte es: S/. " + pagoBasico);
            System.out.println("El monto del incremento es: S/. " + montoIncremento);
            System.out.println("El pago final por el servicio de transporte es: S/. " + pagoFinal);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el pago basico.");
        }
    }
}
