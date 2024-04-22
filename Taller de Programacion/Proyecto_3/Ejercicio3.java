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
public class Ejercicio3 {
    public static void main(String[] args) {
        //Datos de entrada
        double pension, promedion;
        int elenco;
        boolean bd = false;
        //Datos de proceso
        double descuento1 = 0,descuento2=0, descuentototal=0 , pensionfinal = 0 ;
        
        Scanner scan = new Scanner(System.in);
        //Solicitar datos de entrada
        System.out.println("Ingrese la pension mensual del alumno: ");
        pension = scan.nextDouble();
        
        System.out.println("Ingrese su promedio de nota: ");
        promedion = scan.nextDouble();
        
        System.out.println("El alumno pertenece a un elenco [1]Si [2]No: ");
        elenco = scan.nextInt();
        
        //Proceso
        if (promedion>=16 && promedion<=20) {
            descuento1 = pension * 0.20;
        }else{
            descuento1 = 0;
        }
        
        if (elenco == 1) {
            descuento2 = pension * 0.05;
        }else if (elenco == 2) {
            descuento2 = 0;
        }
        else{
            System.out.println("No existe la opcion");
            bd = true;
        }
        
        descuentototal = descuento1 + descuento2;
        pensionfinal = pension - descuento1 - descuento2;
        //Salida
        if (!bd) {
        //Salidas
          
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("-----------------------");
        System.out.println("El descuento total es: " + descuentototal);
        System.out.println("La pension final del alumno es: " + pensionfinal);
      }
    }    
}
