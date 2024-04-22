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
public class Ejercicio5 {
    public static void main(String[] args) {
         // Datos de entrada
        int horasTrabajadas, Servicio, hijos;
        boolean bd = false;

        // Datos de proceso
        double sueldoBasico, gratificacion, asignacionFamiliar, sueldoFinal;
        double pagoPorHora = 30;

        Scanner scan = new Scanner(System.in);

        // Solicitar las horas trabajadas y validar la entrada
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = scan.nextInt();
       

        // Solicitar los años de servicio y validar la entrada
        System.out.println("Ingrese el periodo de servicio [anos]: ");
        Servicio = scan.nextInt();
       

        // Solicitar el número de hijos y validar la entrada
        System.out.println("Ingrese el numero de hijos: ");
        hijos = scan.nextInt();
        
        // Proceso (Vderificacion)
         if (horasTrabajadas < 0) {
            System.out.println("Error: Horas trabajadas no validas.");
            bd = true;
        }
          if (Servicio < 0) {
            System.out.println("Error: Tiempo de servicio no validos.");
            bd = true;
        }
        if (hijos < 0) {
            System.out.println("Error: Numero de hijos no valido.");
            bd = true;
        }
        // Proceso (Post Verficacion)
       
       
        
       if (!bd) { 
            sueldoBasico = horasTrabajadas * pagoPorHora; // Calcular el sueldo básico

            // Verificar años de servicio y calcular la gratificación
            if (Servicio >= 5 && Servicio <= 20) {
                gratificacion = 0.4 * sueldoBasico;
            } else if (Servicio > 20) {
                gratificacion = 0.5 * sueldoBasico;
            } else {
                gratificacion = 0;
            }
            
            asignacionFamiliar = hijos * 250;
            sueldoFinal = sueldoBasico + gratificacion + asignacionFamiliar;

            // Salida
            System.out.println("El monto de gratificacion es: S/." + gratificacion);
            System.out.println("El sueldo final del empleado es: S/." + sueldoFinal);
        }
    }
}
