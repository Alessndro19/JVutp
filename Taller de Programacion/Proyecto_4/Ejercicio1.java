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
public class Ejercicio1 {
    public static void main(String[] args) {
         // Variables
        double n1, n2, r = 0;
        char op;
        int bd = 0; // bd inicia en 0

        // Crear un objeto Scanner para la entrada de datos
        Scanner scan = new Scanner(System.in);

        // Solicitar el primer número
        System.out.println("Ingresar primer numero: ");
        n1 = scan.nextDouble();

        // Solicitar la operación
        System.out.println("Seleccione el operador [+][-][*][/]: ");
        op = scan.next().charAt(0);

        // Solicitar el segundo número
        System.out.println("Ingresar segundo numero: ");
        n2 = scan.nextDouble();

        // Proceso (Realizar la operación)
        switch (op) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                if (n2 != 0)
                    r = n1 / n2;
                else {
                    System.out.println("Division irreal");
                    bd = 1; // bd cambia a 1 ante un posible error de ingreso
                }
                break;
            default:
                System.out.println("Operador invalido");
                bd = 1; // bd cambia a 1 ante un posible error de ingreso
        }

        // Mostrar resultado si no hubo errores
        if (bd == 0)
            System.out.println("El resultado de: " + n1 + " " + op + " " + n2 + " es: " + r);
    }
}
