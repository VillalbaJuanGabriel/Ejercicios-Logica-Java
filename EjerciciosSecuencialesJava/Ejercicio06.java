package EjerciciosSecuencialesJava;

public class Ejercicio06 {

    public static void main(String args[]) {
        
        /**
         * Ejercicio 06:
         * 
         * Realizar un algoritmo que permita intercambiar el valor de dos variables. 
         * Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, 
         * hacer que la variable1 valga 12 y la variable2 valga 5. 
         * Tener en cuenta que al asignar un valor a una variable se 
         * sobrescribe el valor anterior.
         * 
         */
        
        // Declaración de Variables:
        int num1, num2, aux;
        
        // Asignación de Valores:
        num1 = 5;
        num2 = 12;
        
        // Se emite los Valores Iniciales por Pantalla:
        System.out.println("------- Valores Iniciales -------");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("");
        
        // Intercambio de los Valores:
        aux = num1;
        num1 = num2;
        num2 = aux;
        
        // Se emite los Valores Intercambiados por Pantalla:
        System.out.println("------- Valores Intercambiados -------");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("");
        
    }
}