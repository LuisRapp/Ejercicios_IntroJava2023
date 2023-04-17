/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese los valores que desea sumar: "); 
      Scanner leer= new Scanner(System.in);
      int num1= leer.nextInt();
      int num2= leer.nextInt();
      int suma= num1+num2;
      System.out.println("El valor de la suma es: "+suma);
    }
    
}
