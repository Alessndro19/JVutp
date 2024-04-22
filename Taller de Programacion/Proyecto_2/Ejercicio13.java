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
public class Ejercicio13 {
    public static void main(String[] args) {
        //variable de entrada
        int megabytes;
        //variable de proceso
        int kilobyte,bytes;
        double gigabyte;
    
        Scanner scan = new Scanner(System.in);
    
        //Solicitar datos de entrada
    
        System.out.println("Ingrese la capacidad del disco duro en megabytes: ");
        megabytes = scan.nextInt();
        
        //Proceso
        gigabyte = megabytes/1024;
        kilobyte = megabytes * 1024;
        bytes = kilobyte * 1024;
        
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("Megabytes convertidos a Gigabytes es: "+ Math.round(gigabyte*1000.0)/1000.0 +" GB");
        System.out.println("Megabytes convertidos a Kilobytes es: "+kilobyte +" kB");
        System.out.println("Megabytes convertidos a Bytes es: "+bytes +" bytes");
    }
}
