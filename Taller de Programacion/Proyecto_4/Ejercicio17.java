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
public class Ejercicio17 {
    public static void main(String[] args) {
        // Variables
        char plan,respuestaSeguro;
        double pagoAnual = 0;
        double pagoAdicional = 0;
        double montoFinal = 0;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario y validar el plan
        System.out.println("Seleccione su plan (B: Basico, F: Familiar, P: Premium): ");
        plan = scan.next().charAt(0);
        switch (plan) {
            case 'B','b':
                pagoAnual = 1000;
                break;
            case 'F','f':
                pagoAnual = 1600;
                break;
            case 'P','p':
                pagoAnual = 2500;
                break;
            default:
                System.out.println("Plan no valido.");
                return;
        }

        // Verificar si el socio desea adquirir un seguro contra accidentes
        System.out.println("Desea adquirir un seguro contra accidentes? (S/N): ");
        respuestaSeguro = scan.next().charAt(0);
        if (respuestaSeguro == 'S' || respuestaSeguro == 's') {
            pagoAdicional = pagoAnual * 0.04;
        } else if (respuestaSeguro != 'N' && respuestaSeguro != 'n') {
            System.out.println("Respuesta no valida.");
            return;
        }
        // Calcular el monto final
        montoFinal = pagoAnual + pagoAdicional;

        // Mostrar resultados
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("-----------------------");
        System.out.println("El pago adicional por el seguro contra accidentes es: S/. " + pagoAdicional);
        System.out.println("El monto final a pagar es: S/. " + montoFinal);
    }
}
