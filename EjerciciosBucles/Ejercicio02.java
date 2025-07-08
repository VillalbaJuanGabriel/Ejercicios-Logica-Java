package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 02:
         * 
         * Realizar un programa que dado por teclado un limite numérico 
         * (por ejemplo 100), muestre en pantalla todos los números hasta ese 
         * limite (empezando por 1).
         * 
         */
        
        // Declaración de Variables:
        int limiteNumerico;
        
        // Ingreso del Límite Numérico:
        System.out.println("Ingrese el Límite Numérico: ");
        limiteNumerico = teclado.nextInt();
        
        // Bucle For:
        for(int i = 1; i <= limiteNumerico; i++){
            System.out.println(i);
        }
        
    }
}