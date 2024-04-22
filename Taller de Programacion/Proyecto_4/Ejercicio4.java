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
public class Ejercicio4 {
    public static void main(String[] args) {
         // Variables
        char categoria;
        double pensionActual=0, descuento = 0, nuevaPension;
        boolean error = false; // Bandera para validar los datos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario y validar la categoría
        System.out.println("Ingrese la categoria del estudiante (A, B, C): ");
        categoria = scan.next().charAt(0);

        switch (categoria) {
            case 'A', 'a':
                descuento = 0.02;
                break;
            case 'B', 'b':
                descuento = 0.03;
                break;
            case 'C', 'c':
                descuento = 0.04;
                break;
            default:
                System.out.println("Categoria no valida.");
                error = true; // Cambiamos error a true si la categoria no es válida
        }

        // Solicitar y validar la pensión actual
        if (!error) {
            System.out.println("Ingrese la pension actual del estudiante: ");
            pensionActual = scan.nextDouble();

            if (pensionActual <= 0) {
                System.out.println("Pension actual no valida.");
                error = true; // Cambiamos error a true si la pensión no es válida
            }
        }

        // Calcular la nueva pensión si no hubo errores
        if (!error) {
            nuevaPension = pensionActual - (pensionActual * descuento);

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
            System.out.println("La nueva pension a pagar es: S/. " + nuevaPension);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular la nueva pension.");
        }
    }
}
