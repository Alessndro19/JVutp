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
public class Ejercicio8 {
    public static void main(String[] args) {
        //variables de entrada
        int numero;
        //variables de proceso
        int n1,n2,n3;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrada
        
        System.out.println("Ingrese un numero de 3 cifras: ");
        numero = scan.nextInt();
        
        //Proceso
        n1= numero % 10;
        n2= numero %100/10;
        n3= numero %1000/100;
        
          //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("La multiplicacion de cifras del"+numero+" es: " + (n1*n2*n3));
    }
}
