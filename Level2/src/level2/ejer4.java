/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la funcion
Substring y equals() de Java.
 */
package level2;

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
       System.out.println("Ingrese una frase: ");
       Scanner leer= new Scanner(System.in);
       String frase= leer.nextLine();
       String frase2=frase.substring(0,1);
       
       if (frase2.equals("A")||frase2.equals("a")){
           System.out.println("Correcto");
       }else{
           System.out.println("Incorrecto");
       }
    }
    
}
