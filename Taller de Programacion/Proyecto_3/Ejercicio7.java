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
public class Ejercicio7 {
    public static void main(String[] args) {
        // Variables de entrada
        int toneladasProduccion, esZonaRural;
        double preciotonelada;
        boolean bd = false; // Bandera para validar los ingresos

        // Datos de proceso
        double descuentoTotal = 0, impuestosTotal=0;

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese la cantidad de toneladas producidas: ");
        toneladasProduccion = scan.nextInt();
       
        System.out.println("Es usted agricultor de una zona rural? [1]Si [2]No: ");
        esZonaRural = scan.nextInt();
        
          System.out.println("Ingrese el precio por tonelada: ");
        double precioPorTonelada = scan.nextDouble();

        // Proceo (Validacion)
        
         if (toneladasProduccion < 1) {
            System.out.println("Error: La cantidad de toneladas producidas debe ser mayor o igual a 1.");
            bd = true;
        }
         if (esZonaRural!=1 && esZonaRural != 2){
            System.out.println("Error: No existe la respuesta");
            bd = true;
         }
         
          if (precioPorTonelada <= 0) {
            System.out.println("Error: El precio por tonelada debe ser mayor que cero.");
            bd = true;
        }
        
        //Proceso (Post Validacion)
        if (!bd) {
            // Calcular el descuento total
            if (toneladasProduccion >= 1 && toneladasProduccion <= 18) {
                descuentoTotal = 0.08;
            } else if (toneladasProduccion >= 19 && toneladasProduccion <= 35) {
                descuentoTotal = 0.10;
            } else {
                descuentoTotal = 0.12;
            }

            // Aplicar descuento adicional para zona rural
            if (esZonaRural ==1) {
                descuentoTotal += 0.03;
            }else{
                descuentoTotal += 0;
            }

           
            impuestosTotal = toneladasProduccion * precioPorTonelada  * (1 - descuentoTotal);

            // Resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El total de descuento es: " + (descuentoTotal * 100) + " %");
            System.out.println("El monto total de impuestos a pagar es: S/." + impuestosTotal);
        }
    }
}
    
