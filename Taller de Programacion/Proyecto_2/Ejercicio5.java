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
public class Ejercicio5 {
    public static void main(String[] args) {
        //Variables de Entrada
        int medida;
        //variables de proceso
        double cent, kilom,pulg;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrdada
        
        System.out.println("Ingrese la medida(m): ");
        medida = scan.nextInt();
        
        //Proceso
        
        cent = medida *100;
        //Para este caso si se divide el dato medida tiene que ser tipo double
        //Sin embargo tambien podemos colocarle el .0 para volver el numero fijo entero a decimal
        kilom = medida/1000.0;
        pulg = (medida * 100)/2.54 ;
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("Su medida equivalente a centimetros es: "+cent +" cm");
        System.out.println("Su medida equivalente a Kilómetros es: "+kilom +" km");
        System.out.println("Su medida equivalente a pulgadas es: "+Math.round(pulg*100.0)/100.0 +" pulgada");
    }
}
