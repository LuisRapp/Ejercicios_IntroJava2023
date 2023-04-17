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
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase: ");
        Scanner leer=new Scanner(System.in);
        String frase=leer.nextLine();
        String fraseMayus=frase.toUpperCase();
        String fraseMin=frase.toLowerCase();
        
        System.out.println("La frase es: "+frase);
        System.out.println("La frase en mayuscula es: "+fraseMayus);
        System.out.println("La frase en minuscula es: "+fraseMin);
    }
    
}
