package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 03:
         * 
         * Llevar a cabo un programa que permita cargar mediante teclado 
         * una matriz de 3x3 (3 filas, 3 columnas) con razas de perros.
         * Una vez cargada, se debe permitir al usuario ingresar por teclado 
         * una raza de perro que quiera buscar, el programa deberá poder 
         * encontrarla y mostrar un mensaje con la posición (fila, columna) 
         * donde la encontró.
         * En caso de que la raza de perro no se encuentre en la matriz, 
         * se deberá informar la situación mediante un mensaje por pantalla.
         * 
         */
        
        // Declaración de Variables:
        String perroElegido;
        int fila, columna;
        boolean bandera = false;
        
        // Declaración de la Matriz 3x3:
        String razasPerros[][] = new String[3][3];
        
        // Bucle For para la Carga de la Matriz con las Razas de Perros:
        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 3; c++){
                System.out.println("Cargue una Raza de Perro: ");
                razasPerros[f][c] = teclado.nextLine();
            }
        }
        
        // Ingreso de la Raza Elegida:
        System.out.println("Ingrese la Raza de Perro que desea: ");
        perroElegido = teclado.nextLine();
        
        fila = 0;
        columna = 0;
        
        // Bucle For para el Recorrido de las Razas:
        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 3; c++){
                
                // Condicional para comparar si la Raza Elegida se encuentra Cargada:
                if(perroElegido.equalsIgnoreCase(razasPerros[f][c])){
                    fila = f + 1;
                    columna = c + 1;
                    bandera = true;
                }
            }
        }
        
        // Condicional para mostrar los datos de la Raza de Perro:
        if(bandera == true){
            System.out.println("El perro " + perroElegido + " está en el sistema.");
            System.out.println("Se encuentra en la Fila N°" + fila + " y en la columna N°" + columna + ".");
        } else {
            System.out.println("El Perro Ingresado no se encuentra en el Sistema.");
        }
        
    }
}