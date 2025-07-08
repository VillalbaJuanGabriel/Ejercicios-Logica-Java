package EjerciciosSecuencialesJava;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 08:
         * 
         * Calcular el área de un círculo dado su radio.
         * 
         */
        
        // Declaración de Variables:
        double radio, area;
        
        // Definición de la Constante PI:
        final double NUMERO_PI = 3.1416;
        
        // Ingreso del Radio:
        System.out.println("Ingrese el Radio del Círculo: ");
        radio = teclado.nextDouble();
        
        // Calculo del Área:
        area = NUMERO_PI * (radio * radio);
        
        // Se emite el Área del Circulo por Pantalla:
        System.out.println("El Área del Circulo, dado su radio, es: " + area + ".");
        
    }
}