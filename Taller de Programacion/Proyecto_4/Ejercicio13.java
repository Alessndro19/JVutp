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
public class Ejercicio13 {
    public static void main(String[] args) {
          // Variables
        char tipoDeporte;
        int vecesPorSemana;
        double incremento = 0;
        double pagoMensual;
        double montoTotal;
        boolean error = false; // Bandera para validar los datos

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el tipo de deporte (I: Individual, G: Grupal, A: Aventura): ");
        tipoDeporte = scan.next().charAt(0);

        System.out.println("Ingrese la cantidad de veces por semana que practica el deporte: ");
        vecesPorSemana = scan.nextInt();

        System.out.println("Ingrese el pago mensual: ");
        pagoMensual = scan.nextDouble();

        // Proceso (Validación de datos)
        if (!(tipoDeporte == 'I' || tipoDeporte == 'G' || tipoDeporte == 'A')) {
            System.out.println("Tipo de deporte no valido.");
            error = true; // Cambiamos error a true
        }

        if (vecesPorSemana <= 0) {
            System.out.println("Cantidad de veces por semana no valida.");
            error = true; // Cambiamos error a true
        }

        if (pagoMensual <= 0) {
            System.out.println("Pago mensual no valido.");
            error = true; // Cambiamos error a true
        }

        // Proceso (Cálculo de incremento)
        if (!error) { // Comprobamos si no hay errores
            switch (tipoDeporte) {
                case 'I','i':
                    incremento = 0.02;
                    break;
                case 'G','g':
                    incremento = 0.03;
                    break;
                case 'A','a':
                    incremento = 0.05;
                    break;
            }

            if (vecesPorSemana > 3) {
                incremento += 0.01;
            }

            montoTotal = pagoMensual * (1 + incremento);

            // Mostrar resultados
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto total del incremento es: S/." + (montoTotal - pagoMensual));
            System.out.println("El total a pagar por el socio es: S/." + montoTotal);
        } else {
            System.out.println("Error en los datos ingresados. No se puede calcular el monto.");
        }
    }
}
