package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 06:
         * 
         * Realizar un programa que permita la carga de 15 números en un vector. 
         * Una vez cargados, se necesita que el programa cuente e informe por 
         * pantalla cuantas veces se cargó el número 3.
         * 
         */
        
        // Declaración de Variables:
        int contadorTres = 0;
        
        // Declaración del Vector de 15 posiciones:
        int numeros[] = new int[15];
        
        // Bucle For para cargar el Vector:
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un Número: ");
            numeros[i] = teclado.nextInt();
        }
        
        // Bucle For para recorrer el Vector:
        for(int i = 0; i < numeros.length; i++){
            
            // Condicional para contar la cantidad de veces que aparece el 3:
            if(numeros[i] == 3){
                contadorTres++;
            }
        }
        
        // Se emite por pantalla la cantidad de veces que aparece el 3:
        System.out.println("Cantidad de Veces que aparece el Número 3: " + contadorTres + " veces.");
        
    }
}