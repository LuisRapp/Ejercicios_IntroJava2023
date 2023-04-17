/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente
 */
package level4;

/**
 *
 * @author Rapp
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros= new int [100];
        for(int i=0; i<100; i++){
            numeros[i]= i;
        }
        for (int i = 0; i < 100; i++) {
        System.out.println(numeros[i]);
    }
        
        
    }
    
    
}
