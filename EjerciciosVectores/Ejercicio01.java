package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * EJercicio 01:
         * 
         * Llevar a cabo un programa que incluya un vector que almacene 
         * los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, 
         * Daniel, Luisa y Ludmila. 
         * Realizar un recorrido del vector para cargar los datos y otro 
         * recorrido para mostrar los mismos por pantalla.
         * 
         */
        
        // Declaración del Vector de 8 Posiciones:
        String nombres[] = new String[8];
        
        // Cargamos el Vector:
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Ingrese un Nombre: ");
            nombres[i] = teclado.nextLine();
        }
        
        System.out.println("");
        System.out.println("Los Nombres del Vector son: ");
        
        // Recorremos el Vector:
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
        
    }
}