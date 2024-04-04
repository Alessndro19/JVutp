/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-ICA
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        int edad;
        String nombre, apellido;
        double peso;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su Nombre");
        nombre = scan.next();
        
        System.out.println("Ingrese su Apellido");
        apellido = scan.next();
        
        System.out.println("Ingrese su Edad");
        edad = scan.nextInt();
        
        System.out.println("Ingrese su Peso");
        peso = scan.nextDouble();
        
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("-----------------------");
        
        System.out.println("El Nombre es:"+nombre);
        System.out.println("El Apellido es:"+apellido);
        System.out.println("Su edad es:"+edad);
        System.out.println("El peso es:"+peso);
        
    }
 
}
