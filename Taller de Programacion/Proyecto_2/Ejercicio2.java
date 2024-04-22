/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_2;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //Variable de Entrada
        double areac, radio;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar Datos de Entrada
        
        System.out.println("Ingrese el radio de un circulo: ");
        radio = scan.nextDouble();
        
        //Proceso
        areac = 3.14* (radio*radio);
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("El Area del circulo es: "+areac);
        
        
        }
}
