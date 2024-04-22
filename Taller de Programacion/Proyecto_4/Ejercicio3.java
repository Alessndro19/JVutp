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
public class Ejercicio3 {
    public static void main(String[] args) {
        // Datos
        int numCiudades, interes = 0;
        char destino;
        double costoPaquete, montoInteres, montoTotal;
        boolean datosValidos = false; // Bandera para validar los datos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el destino del paquete turistico (N: Nacional, I: Internacional): ");
        destino = scan.next().charAt(0);
        
        System.out.println("Ingrese el numero de ciudades a visitar: ");
        numCiudades = scan.nextInt();

        System.out.println("Ingrese el costo del paquete turistico: ");
        costoPaquete = scan.nextDouble();

        // Proceso (Validación de datos)
        if (!(destino == 'N' || destino == 'I')) {
            System.out.println("Destino no valido.");
            datosValidos = true;
        }

        if (numCiudades <= 0) {
            System.out.println("Numero de ciudades no valido.");
            datosValidos = true;
        }

        if (costoPaquete <= 0) {
            System.out.println("Costo del paquete no valido.");
            datosValidos = true;
        }

        // Proceso (Cálculo de intereses)
        if (datosValidos == false) {
            switch (destino) {
                case 'N','n':
                    switch (numCiudades) {
                        case 1, 2, 3 :
                            interes = 3; break;
                        case 4, 5, 6, 7, 8:
                            interes = 4; break;
                        default: interes = 8;
                    }break;
                    
                case 'I','i':
                    switch (numCiudades) {
                        case 1, 2, 3 :
                            interes = 5;break;
                        case 4, 5, 6, 7, 8:
                            interes = 6;break;
                        default: 
                            interes = 10;
                    }break;
            }
            
            montoInteres = costoPaquete * interes / 100;

            montoTotal = costoPaquete + montoInteres;

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto de interes es: S/." + montoInteres);
            System.out.println("El monto total a pagar es: S/." + montoTotal);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el monto.");
        }
    }
}
