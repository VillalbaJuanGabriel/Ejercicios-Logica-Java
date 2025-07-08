package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 02:
         * 
         * Crea un programa que, dada una lista de nombres pre armada, 
         * un usuario sea capaz de ingresar un nombre por teclado y el 
         * programa realice una búsqueda e identifique si el mismo está 
         * presente en la lista o no.
         * En caso de estar, se debe informar por pantalla esta situación. 
         * Caso contrario, de igual manera se debe informar mediante su mensaje.
         * Tené en cuenta de que el programa debe ser insensible 
         * a mayúsculas y minúsculas.
         * 
         */
        
        // Declaración de Variables:
        String nombre;
        nombre = "";
        boolean banderaNombre = false;
        
        // Declaración del Vector con los Nombres cargados manualmente:
        String nombres[] = new String[4];
        nombres[0] = "Juan";
        nombres[1] = "Gabriel";
        nombres[2] = "Marianella";
        nombres[3] = "Clara";
        
        // Ingreso del Nombre:
        System.out.println("Ingrese un Nombre: ");
        nombre = teclado.nextLine();
        
        // Bucle For para Recorrer el Vector:
        for(int i = 0; i < nombres.length; i++){
            // Condicional para verificar si el nombre está:
            if(nombre.equalsIgnoreCase(nombres[i])){
                banderaNombre = true;
            }
        }
        
        // Condicional para mostrar por pantalla si el nombre está o no:
        if(banderaNombre){
            System.out.println("El nombre " + nombre + " está en la lista.");
        } else {
            System.out.println("El nombre " + nombre + " NO está en la lista.");
        }
        
    }
}