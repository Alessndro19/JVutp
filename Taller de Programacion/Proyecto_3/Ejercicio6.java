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
public class Ejercicio6 {
    public static void main(String[] args) {
        double pm, exc=0, pfs;
        int cant, preg, adic=0;
        boolean error=false;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar el pago mensual: ");
        pm = scan.nextDouble();
        
        System.out.println("Ingresar cantidad de personas: ");
        cant = scan.nextInt();
        
        System.out.println("¿Desea el seguro contra accidentes? [1]Si [2]No: ");
        preg = scan.nextInt();
        
        if (preg == 1) {
            adic = 80;
        }else if( preg == 2) {
            adic = 0;
        }else{
            System.out.println("Respuesta incorrecta");
            error = true;
        }
        
        
        if (cant > 3) {
            exc = (cant-3) * 0.01 * pm;
        }
        
        pfs = (pm + adic + exc) * 12;
        
        if (!error) {
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("-----------------------");
            System.out.println("El monto adicional es: "+adic);
            System.out.println("El excedente es: "+exc);
            System.out.println("El pago final anual del seguro es: "+ pfs + " Soles");
        }
        
    }
}
