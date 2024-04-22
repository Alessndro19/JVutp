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
public class Ejercicio11{
    public static void main(String[] args) {
         // Variables
        int meses;
        double montoDeposito, interes = 0, montoTotal, montoInteres;
        boolean error = false; // Inicializamos error en false

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el monto depositado: ");
        montoDeposito = scan.nextDouble();

        System.out.println("Ingrese el numero de meses: ");
        meses = scan.nextInt();

        // Proceso (Validación de datos)
        if (montoDeposito <= 0) {
            System.out.println("Monto depositado no valido.");
            error = true; // Cambiamos error a true
        }

        if (!(meses == 6 || meses == 12 || meses == 18)) {
            System.out.println("Numero de meses no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo de intereses)
        if (!error) { // Comprobamos si no hay errores
            switch (meses) {
                case 6:
                    interes = 0.03;
                    break;
                case 12:
                    interes = 0.05;
                    break;
                case 18:
                    interes = 0.07;
                    break;
            }

            montoInteres = montoDeposito * interes;
            montoTotal = montoDeposito + montoInteres;

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto del interes ganado es: S/." + montoInteres);
            System.out.println("El total a recibir al retirar el dinero es: S/." + montoTotal);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el interes y el monto total.");
        }
    }
}
