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
public class Ejercicio5 {
    public static void main(String[] args) {
        // Variables
        char sabor;
        double descuento = 0;
        double precioHelado=0;
        double precioFinal;
        boolean error = false; // Bandera para validar los datos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario y validar el sabor del helado
        System.out.println("Seleccione el sabor del helado (F: Fresa, L: Lucuma, C: Chocolate): ");
        sabor = scan.next().charAt(0);

        // Proceso (Validación de datos y cálculo del descuento)
        if (!(sabor == 'F' || sabor == 'L' || sabor == 'C')) {
            System.out.println("Sabor de helado no valido.");
            error = true; // Cambiamos error a true
        } else {
            // Solicitar precio del helado
            System.out.println("Ingrese el precio del helado: ");
            precioHelado = scan.nextDouble();

            // Proceso (Cálculo del descuento)
            switch (sabor) {
                case 'F', 'f':
                    descuento = precioHelado * 0.01;
                    break;
                case 'L', 'l':
                    descuento = precioHelado * 0.03;
                    break;
                case 'C', 'c':
                    descuento = precioHelado * 0.05;
                    break;
            }
        }

        // Calcular el precio final
        precioFinal = precioHelado - descuento;

        // Mostrar resultados
        
        if (!error) {
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El descuento aplicado es: S/. " + descuento);
            System.out.println("El precio final del helado es: S/. " + precioFinal);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el precio final del helado.");
        }
    }
}
