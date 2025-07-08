package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 03:
         * 
         * Realizar un algoritmo que permita la carga de 5 números en un vector. 
         * Una vez cargados, debe determinar cuál es el mayor de ellos.
         * 
         */
        
        // Declaración de Variables:
        int numeroMayor = 0;
        
        // Declaración del Vector con 5 posiciones:
        int numeros[] = new int[5];
        
        // Bucle For donde ingresamos los 5 números:
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un Número: ");
            numeros[i] = teclado.nextInt();
        }
        
        // Bucle For donde Recorremos los 5 Números:
        for(int i = 0; i < numeros.length; i++){
            
            // Condicional donde buscamos el Número Mayor:
            if(i == 0){
                numeroMayor = numeros[i];
            } else {
                if(numeros[i] > numeroMayor){
                    numeroMayor = numeros[i];
                }
            }
            
        }
        
        System.out.println("Número Mayor: " + numeroMayor + ".");
        
    }
}