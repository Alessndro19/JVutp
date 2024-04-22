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
public class Ejercicio9 {
    public static void main(String[] args) {
    //Variables de Enrada
    int numero1, numero2;
    //variables de proceso
    int nuevon1, nuevon2, u1,u2;
    
    Scanner scan = new Scanner(System.in);
    
    //Solicitar datos de entrada
        System.out.println("Ingrese el primer numero: ");
        numero1=scan.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        numero2=scan.nextInt();
    
        //proceso
        u1=numero1 % 10;
        u2=numero2 % 10;
       
        nuevon1 = numero1-u1+u2;
        nuevon2 = numero2-u2+u1;
        
        //Salidas
         System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("Al intercambiar las cifras de unidades de ambos numeros obtenemos: ");
        System.out.println("El primer numero intercambiado es:" + nuevon1);
        System.out.println("El segundo numero intercambiado es:" + nuevon2);
    }
}
