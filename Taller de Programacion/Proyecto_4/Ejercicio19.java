/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_4;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio19 {
     public static void main(String[] args) {
        //Datos
        int tipop, cantp, precio=0;
        double montoi, descuento=0, montofinal=0;
        boolean error = false;
        char tempo;

        Scanner scan = new Scanner(System.in);
    
        //Ingreso de datos
        System.out.println("Ingrese el tipo de pantalon [1]Deportivo [2]Casual [3]Elegante: ");
        tipop = scan.nextInt();
        
        System.out.println("Ingrese la cantidad de pantalones a compraro: ");
        cantp = scan.nextInt();
        
        System.out.println("Temporada de [I] Invierno o [V]Verano");
        tempo = scan.next().charAt(0);
        
        // Proceso (Validación)
        
        if (cantp <= 0) {
            System.out.println("Error: Cantidad de pantalones no valida.");
            error = true;
        }
        
        if (tempo != 'I' && tempo != 'V') {
            System.out.println("Error: Temporada no valida.");
            error = true;
        }

        //Proceso
        if (!error) {
            switch (tipop) {
            case 1:
                precio = 50 * cantp;
                switch (tempo) {
                    case 'I','i':
                        descuento = precio * 0.03;break;
                    case 'V','v':
                        descuento = precio * 0.01;break;
                }
                break;
            case 2:
                precio = 60 * cantp;
                switch (tempo) {
                    case 'I':
                        descuento = precio * 0.05;break;
                    case 'V':
                        descuento = precio * 0.02;break;
                }
                break;
            case 3:
                precio = 70 * cantp;
                switch (tempo) {
                    case 'I','i':
                        descuento = precio * 0.07;break;
                    case 'V','v':
                        descuento = precio * 0.03;break;
                }
                break;
            }
        
            montofinal = precio - descuento ;

            //Salida de datos
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("======================");
            System.out.println("El descuento es: "+descuento);
            System.out.println("El monto final es: "+montofinal);
        
        }
        
    }
}
