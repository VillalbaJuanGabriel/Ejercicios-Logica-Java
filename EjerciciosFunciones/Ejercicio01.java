package EjerciciosFunciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 01:
         * 
         * En un campo de entrenamiento de Pokémon, se necesita evaluar el 
         * desempeño de cada Pokémon en sus batallas para determinar si están 
         * listos para competir en la Liga.
         * 
         * -Crea una función que calcule el promedio de habilidades de un 
         *  Pokémon y determine si está preparado para la competición 
         * (promedio mayor o igual a 70) o no (promedio menor a 70).
         * 
         * -Utiliza arrays para almacenar las habilidades de cada Pokémon 
         *  y sus nombres.
         * 
         * Pistas y Sugerencias:
         * 
         * -Crea un array de nombres de Pokémon y una matriz de habilidades 
         *  donde el índice de cada array con los nombres de los Pokémons 
         *  represente la fila de habilidades de la matriz.
         * 
         * -Ejemplo: Si Bulbasaur es el Pokémon en la posición 1, la fila 1 de 
         *  la matriz tendrá sus habilidades.
         * 
         * -Utiliza métodos de arrays para manejar los datos y calcular el 
         *  promedio de habilidades.
         * 
         * -La función debe mostrar en pantalla el nombre del Pokémon, 
         *  sus habilidades y si está listo o no para la competición.
         * 
         * -Podés crear más de una función para diferentes tareas si querés 
         *  modularizar más aún tu aplicación.
         * 
         */
                
        // Declaración de Vectores para Promedios y para los Nombres de Pokemons:
        double promedios[] = new double[4];
        String nombresPokemon[] = {"Charmander", "Pikachu", "Bulbasaur", "Squirtle"};
        
        // Declaración de Matriz para las Habilidades:
        double habilidades[][] = new double[4][3];
        
        // Bucle For para Cargar las Habilidades y calcular Promedios:
        for(int f = 0; f < 4; f++){
            System.out.println("Ingrese las Habilidades del Pokemon " + nombresPokemon[f] + ": ");
            for(int c = 0; c < 3; c++){
                habilidades[f][c] = teclado.nextDouble();
            }
            
            // Métodos stream, average y getAsDouble para sumar las habilidades,
            // calcular el promedio y que nos devuelva un double.
            promedios[f] = Arrays.stream(habilidades[f]).average().getAsDouble();
        }
        
        // Bucle For para mostrar Aptitud de los Pokemons y sus habilidades:
        for(int f = 0; f < 4; f++){
                System.out.println("El Pokemon " + nombresPokemon[f] + ": " + evaluarHabilidades(promedios[f]));
            for(int c = 0; c < 3; c++){
                System.out.println("Sus habilidades son: " + habilidades[f][c]);
            }
            System.out.println("Promedio de Habilidades: " + String.format("%.2f", promedios[f]) + ".");
            System.out.println("");
        }
        
    }
    
    // Función para determinar si se reunen o no las habilidades de competencia:
    public static String evaluarHabilidades(double promedio){
        return promedio >= 70 ? "Puede participar de la competencia. " : "No puede participar de la competencia.";
    }
    
}