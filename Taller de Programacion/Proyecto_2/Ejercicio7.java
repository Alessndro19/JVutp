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
public class Ejercicio7 {
    public static void main(String[] args) {
        //variable de entrada
        double montoE;
        int ncuotas;
        //Variable de proceso
        double montoC;
        
        Scanner scan = new Scanner(System.in);
        
        //Solicitar datos de entrada
        
        System.out.println("Ingrese el monto del equipo de sonido: ");
        montoE=scan.nextDouble();
        
        System.out.println("Ingrese el numero de cuotas: ");
        ncuotas=scan.nextInt();
        
        //Proceso
        /*Usamos la formula de interes compuesto A=P×(1+r)^n
        A representa el monto total a pagar en cada cuota.
        P es el monto inicial del equipo de sonido.
        r es la tasa de interés por período (en este caso, 0.05 para el 5%).
        n es el número de cuotas.
        */
        montoC = montoE * Math.pow(1.05, ncuotas);
        
        //Salidas
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("=======================");
        
        System.out.println("El monto de cada cuota es:  S/." +Math.round(montoC*100.0)/100.0);
        
    }
}
