/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level3;

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
        System.out.println("Bienvenido, ingrese dos nros para iniciar: ");
        Scanner leer= new Scanner(System.in);
        int nro1=leer.nextInt();
        int nro2=leer.nextInt();
        System.out.println("======Menu=======");
        System.out.println("1-Suma  ");
        System.out.println("2-Resta ");
        System.out.println("3-Division ");
        System.out.println("4-Multiplicacion ");
       int opM=leer.nextInt();
        switch (opM) {
    case 1:
        int caso1= sumar(nro1,nro2);
        System.out.println("La suma de los 2 nros es de: "+caso1);
        break;
    case 2:
        int caso2= restar(nro1,nro2);
        System.out.println("La resta de los 2 nros es de: "+caso2);
        break;
    case 3:
         int caso3= dividir(nro1,nro2);
        System.out.println("La division de los 2 nros es de: "+caso3);
        break;
    case 4:
        int caso4= multiplicar(nro1,nro2);
        System.out.println("La multiplicacion de los 2 nros es de: "+caso4);
        break;
        
    default:
        System.out.println("Ingrese un nro del 1 al 4 ");
        break;
}
    }
   
    public static int sumar(int nro1, int nro2){
       int rSuma= nro1+nro2;
       return rSuma;
    }
    public static int restar(int nro1, int nro2){
       int rResta= nro1-nro2;
       return rResta;
    }
     public static int dividir(int nro1, int nro2){
       int rDividir= nro1/nro2;
       return rDividir;
    }
      public static int multiplicar(int nro1, int nro2){
       int rMultiplicar= nro1*nro2;
       return rMultiplicar;
    }
}


