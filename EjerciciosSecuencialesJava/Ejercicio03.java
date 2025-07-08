package EjerciciosSecuencialesJava;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 03:
         * 
         * Solicitar por teclado dos números y realizar todas las operaciones 
         * aritméticas básicas existentes en Java. 
         * (Suma, Resta, Multiplicación, División y Resto).
         * 
         */
        
        // Declaración de Variables:
        double num1, num2, suma, resta, multiplicacion, division, resto;
        
        // Ingreso de los dos Números:
        System.out.println("Ingrese el Primer Número: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el Segundo Número: ");
        num2 = teclado.nextInt();
        
        // Operaciones Aritméticas con los dos Números Ingresados:
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;
        
        // Se emite por Pantalla los Resultados de las Operaciones:
        System.out.println("Resultado de la Suma: " + suma + ".");
        System.out.println("Resultado de la Resta: " + resta + ".");
        System.out.println("Resultado de la Multiplicación: " + multiplicacion + ".");
        System.out.println("Resultado de la División: " + division + ".");
        System.out.println("Resultado del Resto: " + resto + ".");
        
    }
}