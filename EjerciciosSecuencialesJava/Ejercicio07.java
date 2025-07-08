package EjerciciosSecuencialesJava;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 07:
         * 
         * Solicitar al usuario que ingrese su nombre y edad y mostrar 
         * en pantalla un saludo que incluya esta información.
         * 
         */
        
        // Declaración de Variables:
        String nombre, edad;
        
        // Ingreso de los Datos:
        System.out.println("Ingrese su Nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese su Edad: ");
        edad = teclado.nextLine();
        
        // Se emite un Saludo por Pantalla:
        System.out.println("Hola, mi nombre es: " + nombre + ".");
        System.out.println("Tengo una edad de: " + edad + " años.");
           
    }
}