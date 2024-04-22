/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio8 {
    public static void main(String[] args) {
         // Datos de entrada
        char tipoSabor;
        int cantidadHelados;
        double precioHelado;
        boolean bd = false; // Bandera para validar los ingresos

        // Datos de proceso
        double descuentoTotal = 0, montoFinal=0;
         double precioTotal =0;

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese el tipo de sabor [C]Clasico [M]Mezclado [S]Supremo: ");
        tipoSabor = scan.next().charAt(0); 
        
        System.out.println("Ingrese el precio de cada helado: ");
        precioHelado = scan.nextDouble();

        System.out.println("Ingrese la cantidad de helados comprados: ");
        cantidadHelados = scan.nextInt();

        // Proceso (Validación)
        if (tipoSabor != 'C' && tipoSabor != 'M' && tipoSabor != 'S') {
            System.out.println("Error: Tipo de sabor no valido.");
            bd = true;
        }

        if (cantidadHelados <= 0) {
            System.out.println("Error: La cantidad de helados debe ser mayor que cero.");
            bd = true;
        }

        if (precioHelado <= 0) {
            System.out.println("Error: El precio de cada helado debe ser mayor que cero.");
            bd = true;
        }

        // Proceso (Cálculo de descuentos)
        if (!bd) {
            // Calcular descuento según el tipo de sabor
            if (tipoSabor == 'C') {
                descuentoTotal = 0.02;
            } else if (tipoSabor == 'M') {
                descuentoTotal = 0.03;
            } else if (tipoSabor == 'S') {
                descuentoTotal = 0.04;
            }

            // Aplicar descuento adicional si se compran más de 5 helados
            if (cantidadHelados > 5) {
                descuentoTotal += 0.01 * (cantidadHelados-5);
            }

            // Calcular el monto final
            precioTotal= precioHelado * cantidadHelados;
            montoFinal = precioTotal * (1 - descuentoTotal);

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El total de descuento es: " + Math.round(descuentoTotal * 100.) + "%");
            System.out.println("El monto total a pagar es: $" + montoFinal);
        }
    }
}
