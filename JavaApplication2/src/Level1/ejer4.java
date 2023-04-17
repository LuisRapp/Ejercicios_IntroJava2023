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
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese un numero");
       Scanner leer=  new Scanner(System.in);
       int num1=leer.nextInt();
       int doble= num1*2;
       int triple= num1*3;
       double raiz= Math.sqrt(num1);
       String mensaje = String.format("El numero es %d, su doble es %d, su triple es %d y su raiz cuadrada es %.2f", num1, doble, triple, raiz);
       System.out.println(mensaje); 
    }
    
}
