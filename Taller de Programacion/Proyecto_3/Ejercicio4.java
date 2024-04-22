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
public class Ejercicio4 {
    public static void main(String[] args) {
         // Datos de entrada
        int piso, montoAlquiler, tieneCochera;
        boolean bd = false;

        // Datos de proceso
        int montoTotal = 0, adicion1=0, adicion2=0 ;

        Scanner scan = new Scanner(System.in);

         //Solicitar datos de entrada
        System.out.println("Ingrese el numero de piso donde se encuentra el departamento: ");
        piso = scan.nextInt();
        
        System.out.println("Ingrese el monto de alquiler mensual: ");
        montoAlquiler = scan.nextInt();
 
        System.out.println("Cuentas con cochera [1]Si [2]No: ");
        tieneCochera = scan.nextInt();
        
        //Proceso (Verificacion)

        if (piso < 1 || piso > 10) {
            System.out.println("Error: Numero de piso no valido.");
            bd = true;
        }
        
        if (montoAlquiler < 0) {
            System.out.println("Error: Monto de alquiler no valido.");
            bd = true;
        }
        if (tieneCochera != 1 && tieneCochera != 2)  {
            System.out.println("Error: Respuesta no valida.");
            bd = true;
        }
        
        //Proceso (Post verficacion)
        
        if (!bd) { // Si no hay errores en los ingresos
            if (piso >= 3 && piso <= 8) {
                adicion1 += 100;             
            }
            if (tieneCochera == 1) { // Compara con 1 en lugar de '1'
                adicion2 += 45;             
            }
        }
        
        montoTotal = montoAlquiler + adicion1 + adicion2;
        
        // Salida
        if (!bd) {  
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("-----------------------");
        System.out.println("El monto de alquiler final es: S/." + montoTotal);
        
        }
    }
}
