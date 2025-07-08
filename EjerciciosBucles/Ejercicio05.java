package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 05:
         * 
         * Realizar un programa que muestre en pantalla palabras que sean 
         * ingresadas por teclado hasta que se ingrese la palabra "salir".
         * 
         */
        
        // Declaración de Variables:
        String palabra;
        
        // Ingreso de las Palabras:
        System.out.println("Ingrese una Palabra: ");
        palabra = teclado.nextLine();
        
        // Bucle While:
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println(palabra);
            
            // Se vuelve a pedir más palabras:
            System.out.println("Ingrese otra Palabra: ");
            System.out.println("Para finalizar, ingrese 'salir'. ");
            palabra = teclado.nextLine();
        }
        
    }
}