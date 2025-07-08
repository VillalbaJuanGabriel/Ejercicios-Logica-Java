package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 05:
         * 
         * Realizar un algoritmo que permita la carga de 5 números 
         * y determinar cuantos son Pares y cuantos son Impares.
         * 
         */
        
        // Declaración de Variables:
        int contadorPar, contadorImpar;
        contadorPar = contadorImpar = 0;
        
        // Declaración del Vector de 5 posiciones:
        int numeros[] = new int[5];
        
        // Bucle For para cargar el Vector:
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un Número: ");
            numeros[i] = teclado.nextInt();
        }
        
        // Bucle For para recorrer el Vector:
        for(int i = 0; i < numeros.length; i++){
            
            // Condicional para determinar la cantidad de Pares e Impares:
            if(numeros[i] % 2 == 0){
                contadorPar++;
            } else {
                contadorImpar++;
            }
            
        }
        
        // Emitimos la cantidad de Pares e Impares por Pantalla:
        System.out.println("Cantidad de Pares: " + contadorPar + ".");
        System.out.println("Cantidad de Impares: " + contadorImpar + ".");
        
    }
}