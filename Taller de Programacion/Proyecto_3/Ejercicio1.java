/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_3;

/**
 *
 * @author sandr
 */
import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args) {
      //Datos de entrada
      char cat;
      int canth;
      double sa;
      //Datos de proceso
      double inc = 0 , sn;
      int aum = 0;
      boolean bd = false;
      
      Scanner scan = new Scanner(System.in);
      
      //Solicitar datos de entrada
      System.out.println("Indique la categoria del empleado [A] o [B]: ");
      cat = scan.next().charAt(0);
      
      System.out.println("Ingrese su sueldo actual: ");
      sa = scan.nextDouble();
      
      System.out.println("Ingrese su numero de hijos: ");
      canth = scan.nextInt();
      
      //Proceso
      if (cat == 'A' || cat == 'a') {
          inc = sa * 0.15;
      } else if (cat == 'B' || cat == 'b') {
            inc = sa * 0.10;
         } else {
            System.out.println("Error de ingreso");
            bd = true;
         }
      if (canth > 2) {
         aum = 160;
      } 
      sn = sa + inc + aum;
      
      if (!bd) {
        //Salidas
          
        System.out.println("IMPRIMIENDO RESULTADOS");
        System.out.println("-----------------------");
        System.out.println("El incremento es: "+inc);
        System.out.println("El aumento es: "+ aum);
        System.out.println("El sueldo neto es: " + sn + "soles");
      }
      
   }
}
