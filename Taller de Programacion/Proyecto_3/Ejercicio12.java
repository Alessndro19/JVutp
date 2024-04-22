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
public class Ejercicio12 {
    public static void main(String[] args) {
        // Datos de entrada
        double lado1, lado2, lado3;
        boolean bd = false; // Bandera para validar los ingresos

        Scanner scan = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese la longitud del primer lado del triangulo: ");
        lado1 = scan.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado del triangulo: ");
        lado2 = scan.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado del triangulo: ");
        lado3 = scan.nextDouble();

        // Proceso (Validación)
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Error: Los lados del triangulo deben ser mayores que cero.");
            bd = true;
        }

        // Proceso (Determinar tipo de triángulo)
        if (!bd) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El triangulo es equilatero, tiene tres lados iguales.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es isosceles, tiene dos lados iguales.");
            } else {
                System.out.println("El triangulo es escaleno, tiene todos sus lados diferentes.");
            }
        }
    }
}