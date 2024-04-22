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
public class Ejercicio6 {
    public static void main(String[] args) {
        //Datos de entrada
        int numero;
        //Datos de proceso
        int n1,n2,n3,n4;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrada
        
        System.out.println("Ingrese el numero de 4 cifras: ");
        numero= scan.nextInt();
        
        //Proceso
        //AL ser datos tipo entero solo dnos dara el primer numero
        n1=numero % 10;
        n2=numero % 100 /10;
        n3=numero % 1000/100;
        n4=numero % 10000/1000;
        
         //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("El numero "+numero+" escrito al revez seria: " + n1 + n2 + n3 + n4);
        
    }
}
