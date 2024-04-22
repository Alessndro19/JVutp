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
public class Ejercicio4 {
    public static void main(String[] args) {
        //variables de entrada.
        int cantH, cantM;
        //variables de proceso.
        double porcenH, porcenM,total;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrada
        
        System.out.println("Ingrese la cantidad de varones en el aula: ");
        cantH = scan.nextInt();
        
        System.out.println("Ingrese la cantidad de mujeres en el aula: ");
        cantM = scan.nextInt();
        
        //proceso
        
        total = cantH+cantM;
        porcenH = (cantH/total) * 100;
        porcenM = (cantM/total) * 100;
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("El porcentaje de hombres en el aula es de: "+Math.round(porcenH) + "%");
        System.out.println("El porcentaje de mujeres en el aula es de: "+Math.round(porcenM) + "%");
    }
}
