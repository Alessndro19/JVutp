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
public class Ejercicio14 {
    public static void main(String[] args) {
         // Variables
        int tipoAlgodon, tipoPrenda;
        double precio, descuento = 0, totalPagar;
        boolean error = false; // Inicializamos error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el tipo de algodon (1: Simple, 2: Pima):");
        tipoAlgodon = scan.nextInt();

        System.out.println("Ingrese el tipo de prenda (1: Formal, 2: Deportiva):");
        tipoPrenda = scan.nextInt();

        System.out.println("Ingrese el precio:");
        precio = scan.nextDouble();

        // Proceso (Validación de datos)
        if (tipoAlgodon != 1 && tipoAlgodon != 2) {
            System.out.println("Tipo de algodon no valido.");
            error = true; // Cambiamos error a true
        }

        if (tipoPrenda != 1 && tipoPrenda != 2) {
            System.out.println("Tipo de prenda no valido.");
            error = true; // Cambiamos error a true
        }

        if (precio <= 0) {
            System.out.println("Precio no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo de descuento)
        if (!error) { // Comprobamos si no hay errores
            switch (tipoAlgodon) {
                case 1:
                    switch (tipoPrenda) {
                        case 1:
                            descuento = precio * 0.15;
                            break;
                        case 2:
                            descuento = precio * 0.10;
                            break;
                    }
                    break;
                case 2:
                    switch (tipoPrenda) {
                        case 1:
                            descuento = precio * 0.10;
                            break;
                        case 2:
                            descuento = precio * 0.05;
                            break;
                    }
                    break;
            }
            totalPagar = precio - descuento;

            // Mostrar resultados
            System.out.println("El descuento es: S/." + descuento);
            System.out.println("El monto total a pagar es: S/." + totalPagar);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el descuento.");
        }
    }
}
