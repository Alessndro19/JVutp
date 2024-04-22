/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int tp, cant,mc=0;
        boolean error = false;
        double des, pf;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indica el tipo de pantalon [1] Deportivo [2]Casual [3]Elegante: ");
        tp = scan.nextInt();
        
        System.out.println("Ingrese cantidad de pantalones: ");
        cant = scan.nextInt();
        
        if (tp==1){
            mc = cant*50;
        }   else if (tp ==2){
            mc = cant*60;
        }   else if (tp ==3){
            mc = cant*70;
        } else {
            System.out.println("Tipo de pantalon incorrecto");
            error = true;
        }
        
        if (cant <= 10) {
            des = mc * 0.03;
        }else if (cant <= 16){
            des = mc * 0.05;
        }else{
            des = mc * 0.07;
        }
        
        pf = mc - des;
        
        // Mostrar resultados
        if(!error) {    
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("-----------------------");
        System.out.println("El monto de descuento es: " + des + " soles");
        System.out.println("El total a pagar es: " + pf + " soles");
        }
    }
}
