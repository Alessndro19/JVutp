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
public class Ejercicio15 {
    public static void main(String[] args) {
        // Variables
        int tipoSeguro;
        double pagoMensual, montoAnual;
        boolean error = false; // Inicializamos error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Seleccione el tipo de seguro medico:");
        System.out.println("1. Contra accidentes");
        System.out.println("2. Salud");
        System.out.println("3. Discapacidad");
        tipoSeguro = scan.nextInt();

        // Proceso (Validación de datos)
        if (tipoSeguro < 1 || tipoSeguro > 3) {
            System.out.println("Tipo de seguro medico no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo del monto anual)
        if (!error) { // Comprobamos si no hay errores
            switch (tipoSeguro) {
                case 1:
                    pagoMensual = 50;
                    break;
                case 2:
                    pagoMensual = 60;
                    break;
                case 3:
                    pagoMensual = 70;
                    break;
                default:
                    pagoMensual = 0; // Esto no debería ocurrir
            }
            
            // Si el cliente desea médico a domicilio, se le agrega 10 soles al pago mensual
            System.out.println("Desea el servicio de un medico a domicilio (S/N)");
            char respuesta = scan.next().charAt(0);
            if (respuesta == 'S' || respuesta == 's') {
                pagoMensual += 10;
            }

            montoAnual = pagoMensual * 12;

            // Mostrar resultados
            System.out.println("El monto anual a pagar es: S/." + montoAnual);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el monto anual.");
        }
    }
}
