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
    public class Ejercicio3 {
        public static void main(String[] args) {
            //Variables de Entrada
            int n1,n2,n3;
            //Variables de Proceso
            double promedio ;

            Scanner scan = new Scanner(System.in);

            //Solicitar Datosd de Entrada

            System.out.println("Ingrese la primera nota del alumno: ");
            n1 = scan.nextInt();

            System.out.println("Ingrese la segunda nota del alumno: ");
            n2 = scan.nextInt();

            System.out.println("Ingrese la tercera nota del alumno: ");
            n3 = scan.nextInt();

            /*Proceso asumiendo que tocamos peso y vale el doble la nota del
             tercer alumno vale el doble de peso entonces se asume que vale
            50% y el resto 25%
            */
            promedio = (n1*0.25)+(n2*0.25)+(n3*0.50);


            //Salidas
            System.out.println("IMPRIMIENDO RESULTADOS");
            System.out.println("=======================");

            System.out.println("El promedio del alumno es: "+promedio);

        }
    }
