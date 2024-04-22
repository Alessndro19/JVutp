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
public class Ejercicio11 {
    public static void main(String[] args) {
        //variable de entrada
        int cantG;
        //variables de proceso
        double litro, mcubico, pcubico;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrada
        
        System.out.println("Ingrese la cantidad de Galones: ");
        cantG = scan.nextInt();
        
        //Proceso
        litro = cantG * 3.79;
        mcubico = litro/1000;
        pcubico = mcubico * 35.315;
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("El galon equivalente a litros es: "+litro +" L");
        System.out.println("El galon equivalente a metros cubicos es: "+Math.round(mcubico*1000.0)/1000.0  +" m3");
        System.out.println("El galon equivalente a pie cubico es: "+Math.round(pcubico*100.0)/100.0 +" ft3");
    }
}
