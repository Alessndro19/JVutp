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
public class Ejercicio10 {
    public static void main(String[] args) {
      // Datos de entrada
        int mesesDeposito;
        char tipoMoneda;
        double montoDeposito;
        boolean bd = false; // Bandera para validar los ingresos

        // Datos de proceso
        double interesTotal = 0, montoTotal;

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese el monto del deposito: ");
        montoDeposito = scan.nextDouble();

        System.out.println("Ingrese el numero de meses del deposito: ");
        mesesDeposito = scan.nextInt();

        System.out.println("Ingrese el tipo de moneda [S]Soles [D]Dolares: ");
        tipoMoneda = scan.next().charAt(0); // Leer el primer carácter de la entrada

        // Proceso (Validación)
        if (montoDeposito <= 0) {
            System.out.println("Error: El monto del deposito debe ser mayor que cero.");
            bd = true;
        }

        if (mesesDeposito <= 0) {
            System.out.println("Error: El numero de meses debe ser mayor que cero.");
            bd = true;
        }

        if (tipoMoneda != 'S' && tipoMoneda != 'D') {
            System.out.println("Error: Tipo de moneda no valido.");
            bd = true;
        }

        // Proceso (Cálculo de intereses)
        if (!bd) {
            // Calcular el interés según el número de meses
            if (mesesDeposito >= 1 && mesesDeposito <= 12) {
                interesTotal = 0.03;
            } else if (mesesDeposito >= 13 && mesesDeposito <= 24) {
                interesTotal = 0.05;
            } else {
                interesTotal = 0.07;
            }

            // Aplicar interés adicional según la moneda
            if (tipoMoneda == 'S') {
                interesTotal += 0.04;
            } else {
                interesTotal += 0.02;
            }

            // Calcular el monto total
            montoTotal = montoDeposito * (1 + interesTotal);

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto total del interes ganado es: S/." + (montoTotal - montoDeposito));
            System.out.println("El total a recibir al retirar todo el dinero es: S/." + montoTotal);
        }  
    }
}
