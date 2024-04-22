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
public class Ejercicio15 {
    public static void main(String[] args) {
         //variables de entrada
        int numero;
        //variables de proceso
        int n1,n2,n3,n4,n5;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrada
        
        System.out.println("Ingrese el numero de 5 cifras: ");
        numero= scan.nextInt();
        
        //Proceso
        n1=numero % 10;
        n2=numero % 100 /10;
        n3=numero % 1000/100;
        n4=numero % 10000/1000;
        n5=numero % 100000/10000;
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("La suma del primer y ultimo digido del numero "+numero+" es: " + (n1+n5));
    }
}
