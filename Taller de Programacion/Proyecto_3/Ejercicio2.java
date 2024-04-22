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
public class Ejercicio2 {
    public static void main(String[] args) {
        // Variables de entrada
        int costoAuto;
        char marcaAuto;
        boolean bd = false; // Bandera para validar los ingresos

        // Variables de proceso
        double impuesto = 0, descuento = 0, montoFinal = 0;

        Scanner scan = new Scanner(System.in);

        // Solicitar el costo del auto y validar la entrada
        System.out.println("Ingrese el costo del auto: ");
        costoAuto = scan.nextInt();
        if (costoAuto < 0) {
           
        }

        // Solicitar la marca del auto y validar la entrada
        System.out.println("Ingrese la marca del auto [T] para Toyota, [F] para Ferrari: ");
        marcaAuto = scan.next().charAt(0);

        // Proceso
        if (!bd) { // Si no hay errores en los ingresos
            if (costoAuto >= 5000) {
                impuesto = costoAuto * 0.08; // Impuesto del 8% si el costo es $5000 o más
            }
            
            if (marcaAuto == 'T' || marcaAuto == 't') {
                descuento = costoAuto * 0.06; // Descuento del 6% si la marca es Toyota
            }else if (marcaAuto == 'F' || marcaAuto == 'f'){
                descuento = 0;
            }else{
                System.out.println("Error marca de auto no valido.");
                bd = true;
            }

            // Calcular el monto final
            montoFinal = costoAuto + impuesto - descuento;

            // Salida
            if(!bd){
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto final del auto es: " + montoFinal);
            }
            }
    }
}
