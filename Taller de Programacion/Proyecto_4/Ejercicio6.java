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
public class Ejercicio6 {
    public static void main(String[] args) {
        // Variables
        double montoCompra, descuento = 0, impuesto = 0, montoTotal = 0;
        char rubro;
        boolean error = false;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el monto de compra en soles (S/.): ");
        montoCompra = scan.nextDouble();

        // Validar el monto de compra
        if (montoCompra <= 0) {
            System.out.println("Monto de compra no valido.");
            error = true;
        }

        // Solicitar el rubro de la compra
        System.out.println("Ingrese el rubro de la compra (C: Comestibles, A: Artefactos): ");
        rubro = scan.next().charAt(0);

        // Calcular el descuento
        if (!error) {
            if (montoCompra >= 100 && montoCompra <= 250) {
                descuento = montoCompra * 0.03;
            } else if (montoCompra > 250 && montoCompra <= 500) {
                descuento = montoCompra * 0.05;
            } else if (montoCompra > 500) {
                descuento = montoCompra * 0.10;
            }

            // Calcular el impuesto
            switch (rubro) {
                case 'c','C':
                    impuesto = (montoCompra - descuento) * 0.15;
                    break;
                case 'A','a':
                    impuesto = (montoCompra - descuento) * 0.30;
                    break;
                default:
                    System.out.println("Rubro no valido.");
                    error = true;
            }

            // Calcular el monto total
            if (!error) {
                montoTotal = montoCompra - descuento + impuesto;

                // Mostrar resultados
                System.out.println("IMPRIMIENDO RESULTADOS");
                System.out.println("-----------------------");
                System.out.println("El descuento aplicado es: S/. " + descuento);
                System.out.println("El impuesto aplicado es: S/. " + impuesto);
                System.out.println("El monto total a pagar es: S/. " + montoTotal);
            }
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el monto.");
        }
    }
}
