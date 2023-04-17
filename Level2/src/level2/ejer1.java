/*
Crear un programa que dado un número determine si es par o impar.
 */
package level2;

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
        System.out.println("Ingrese un nro para determinar si es par o impar: ");
        Scanner leer= new Scanner(System.in);
        int n= leer.nextInt();
        if (n/2==0){
            System.out.println("El nro es par"); 
        }else{
             System.out.println("El nro es impar"); 
        }
    }
    
}
