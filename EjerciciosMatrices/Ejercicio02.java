package EjerciciosMatrices;

public class Ejercicio02 {

    public static void main(String args[]) {
        
        /**
         * Ejercicio 02:
         * 
         * Llevar a cabo un programa que permita cargar completamente 
         * con números 5 una matriz de 4x5 (4 filas, 5 columnas).
         * 
         */
        
        // Declaración de la Matriz:
        int numeros[][] = new int[4][5];
        
        // Cargamos la Matriz:
        for(int f = 0; f < 4; f++){
            for(int c = 0; c < 5; c++){
                numeros[f][c] = 5;
            }
        }
        
        // Recorremos la Matriz:
        for(int f = 0; f < 4; f++){
            for(int c = 0; c < 5; c++){
                System.out.print(numeros[f][c]);
            }
            System.out.println("");
        }
        
    }
}