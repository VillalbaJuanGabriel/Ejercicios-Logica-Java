package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 04:
         * 
         * Ingresar dos números por teclado y almacenar sus valores 
         * en dos variables distintas.
         * Realizar una resta entre los dos valores.
         * Almacenar el resultado en una variable.
         * Si el resultado de la resta es mayor a 0, mostrar por pantalla 
         * el mensaje "Es mayor a 0".
         * Si es mayor a cero, comparar si el número es par, en caso de que lo sea, 
         * mostrar un mensaje "Es par", en caso de que no, uno que diga "es impar".
         * En caso que sea menor a 0, mostrar un mensaje que diga "Es menor o igual a 0".
         * 
         */
        
        // Declaración de Variables:
        int num1, num2, resta;
        
        // Ingreso de los Dos Números:
        System.out.println("Ingrese un Número: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese otro Número: ");
        num2 = teclado.nextInt();
        
        // Resta de ambos Números:
        resta = num1 - num2;
        
        // Condicional:
        if(resta > 0){
            System.out.println("La Resta es Mayor a 0.");
            if(resta % 2 == 0){
                System.out.println("Es Par.");
            } else {
                System.out.println("Es Impar.");
            }
        } else {
            System.out.println("Es Menor o Igual a 0.");
        }
        
    }
}