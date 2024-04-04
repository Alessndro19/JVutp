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
public class Ejemplo10 {
    public static void main(String[] args) {
        //Variables de entrada.
        double donacion;
        //Variable de Proceso
        double mg, pedia, cardio, trauma;
        
        Scanner scan= new Scanner(System.in);
        
        //Solicitar Datos de Entrada
        
        System.out.println("Ingres el monto de donaciòn: ");
        donacion = scan.nextDouble();
        
        //Proceso
        
        mg = donacion * 0.45;
        pedia = donacion * 0.15;
        cardio = donacion * 0.30;
        trauma = donacion * 0.1;
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("A medicina general le correspoinde el: "+mg);
        System.out.println("A pediatria le correspoinde el: "+pedia);
        System.out.println("A cardiologiqa le correspoinde el: "+cardio);
        System.out.println("A traumatologia le correspoinde el: "+trauma);
        
    }
}
