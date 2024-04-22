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
public class Ejercicio12 {
     public static void main(String[] args) {
        //Variables de Entrada
        double produccion;
        //Variables de Proceso
        double Asia, Europa, AmericaL, Africa;
        
         Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de Entrada
        
        System.out.println("Ingrese la cantidad total de Producción:");
        produccion = scan.nextDouble();
        
        //Proceso
        
        Asia = produccion*0.35;
        Europa = produccion*0.27;
        AmericaL = produccion*0.19;
        Africa = produccion*0.19;
        
        //Salidas
        
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("======================");
        
        System.out.println("La produccion exportada a Asia es: "+Asia);
        System.out.println("La produccion exportada a Europa es: "+Europa);
        System.out.println("La produccion exportada a Amercia Latina es: "+AmericaL);
        System.out.println("La produccion exportada a Africa es: "+Africa);
    }
}     
