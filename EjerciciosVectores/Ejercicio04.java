package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 04:
         * 
         * Realizar un programa que permita la carga de 10 números en un vector. 
         * Una vez cargados, se necesita que el programa determine cual es el 
         * mayor y cual es el menor de ellos.
         * 
         */
 
        // Declaración de Variables:
        int numeroMayor = 0;
        int numeroMenor = Integer.MAX_VALUE;
        
        
        // Declaración del Vector con 10 posiciones:
        int numeros[] = new int[10];
        
        // Bucle For donde ingresamos los 10 números:
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un Número: ");
            numeros[i] = teclado.nextInt();
        }
        
        // Bucle For donde Recorremos los 10 Números:
        for(int i = 0; i < numeros.length; i++){
            
            // Condicional donde Buscamos el Número Mayor:
            if(i == 0){
                numeroMayor = numeros[i];
            } else {
                if(numeros[i] > numeroMayor){
                    numeroMayor = numeros[i];
                }
            }
            
            // Condicional donde Buscamos el Número Menor:
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
        }
        
        // Se emite el mayor y el menor por pantalla:
        System.out.println("Número Mayor: " + numeroMayor + ".");
        System.out.println("Número Menor: " + numeroMenor + ".");
    }
}