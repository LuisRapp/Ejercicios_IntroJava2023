/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package Level1;

import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese la temperatura en grados Centigrados: ");
       Scanner leer= new Scanner(System.in);
       double c= leer.nextInt();
       double multi= 9*c;
       double div= multi/5;
       double resultado= 32+div;
       System.out.println("La temperatura es de: "+resultado);
       
    }
    
}
