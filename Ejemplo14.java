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
public class Ejemplo14 {
    public static void main(String[] args) {
        //Variables de Entrada
        int perro,gato,ave;
        //Variables de Proceso
        double pPerro, pGato, pAve;
        //Variable Auxiliar
        double totAnimal;
        
        
        Scanner scan = new Scanner(System.in);
            
        //Proceso
        System.out.println("Ingrese la cantidad de gatos: ");
        gato = scan.nextInt();
        
        System.out.println("Ingrese la cantidad de perros: ");
        perro = scan.nextInt();
        
        System.out.println("Ingrese la cantidad de aves: ");
        ave = scan.nextInt();
        
        //Variables de proceso
        totAnimal = gato+perro+ave;
        
        pGato=gato/totAnimal *100;
        pPerro=perro/totAnimal *100;
        pAve=ave/totAnimal *100;
        
        //Salida
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("El porcentaje de perros es: "+pPerro);
        System.out.println("El porcentaje de gatos es: "+pGato);
        System.out.println("El porcentaje de aves es: "+pAve);
    }   
}
