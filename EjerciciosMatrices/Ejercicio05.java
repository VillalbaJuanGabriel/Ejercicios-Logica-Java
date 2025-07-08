package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 05:
         * 
         * En una tabla de 4 filas y 3 columnas se guardan las notas de 
         * 4 alumnos de secundario. 
         * Cada fila corresponde a las notas de cada alumno.
         * 
         * -Se necesita un programa que permita a un profesor cargar en las 
         *  3 primeras posiciones de cada fila las notas del alumno y que en 
         *  un vector diferente se calculen promedios.
         * 
         * -Este vector debe tener la misma cantidad de posiciones que alumnos 
         *  y coincidir en sus índices.
         * -Una vez realizados los cálculos, se desea mostrar las 3 notas de 
         *  cada alumno y el promedio correspondiente recorriendo la matriz.
         * 
         * Ejemplo:
         *            Nota1 Nota2 Nota3 Promedio
         * Alumno1    8     8     7     ?
         * Alumno2    7     9     10    ?
         * Alumno3    10    9     5     ?
         * Alumno4    4     9     8.50  ?
         * 
         */
        
        // Declaración de la Matriz:
        double notas[][] = new double[4][3];
        
        // Declaración del Vector:
        double promedio[] = new double[4];
        
        // Declaración de la Variable:
        double sumaNotas = 0;
        
        // Bucle For para Cargar la Matriz de Notas:
        for(int f = 0; f < 4; f++){
            System.out.println("Ingrese las Notas del Alumno N°" + (f+1) + ": ");
            for(int c = 0; c < 3; c++){
                notas[f][c] = teclado.nextDouble();
                
                // Sumamos las Notas:
                sumaNotas += notas[f][c];
            }
            
            // Calculamos el Promedio:
            promedio[f] = sumaNotas / 3;
            sumaNotas = 0;
        }
        
        System.out.println("");
        
        // Bucle For para recorrer las notas y promedio de todos los alumnos:
        for(int f = 0; f < 4; f++){
            System.out.println("Las Notas del Alumno N°" + (f+1) + " son: ");
            for(int c = 0; c < 3; c++){
                System.out.println("Nota N°" + (c+1) + ": " + notas[f][c] + ".");
            }
            
            System.out.println("Promedio Final: " + promedio[f] + ".");
            
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("");
        }
        
    }
}