/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package level2;

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
        Scanner leer= new Scanner(System.in);
        String frase= leer.nextLine();
        String frase2="eureka";
        if(frase.equals(frase2)){
             System.out.println("Correcto");
        }else{
             System.out.println("Incorrecto");
        }
    }
    
}
