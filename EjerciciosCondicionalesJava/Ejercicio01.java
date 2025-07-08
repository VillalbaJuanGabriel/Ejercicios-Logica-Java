package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 01:
         * 
         * Ingresar dos valores por teclado. Determinar cuál de ellos es el 
         * mayor e informar el mismo por pantalla.
         * 
         */
        
        // Declaración de Variables:
        int num1, num2;
        
        // Ingreso de los Números:
        System.out.println("Ingrese un Número: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese otro Número: ");
        num2 = teclado.nextInt();
        
        // Condicional:
        if(num1 > num2){
            System.out.println("El número mayor es: " + num1 + ".");
        } else {
            System.out.println("El número mayor es: " + num2 + ".");
        }
        
    }
}