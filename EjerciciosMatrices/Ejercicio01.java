package EjerciciosMatrices;

public class Ejercicio01 {

    public static void main(String args[]) {
        
        /**
         * Ejercicio 01:
         * 
         * Llevar a cabo un programa que permita completar con números 1 toda 
         * la diagonal principal de una matriz de 6x6.
         * Entiéndase por diagonal principal aquella que comienza en [0,0] 
         * y termina en [6,6].
         * 
         */
        
        // Declaración de la Matriz:
        int numeros[][] = new int[6][6];
        
        // Recorremos la Matriz y agregamos el 1 en la coincidencia de fila/columna:
        for(int f = 0; f < numeros.length; f++){
            for(int c = 0; c < numeros.length; c++){
                if(f == c){
                    numeros[f][c] = 1;
                }
            }
        }
        
        // Mostramos por pantalla la Diagonal Principal:
        for(int f = 0; f < numeros.length; f++){
            for(int c = 0; c < numeros.length; c++){
                System.out.print(numeros[f][c]);
            }
            System.out.println("");
        }
        
    }
}