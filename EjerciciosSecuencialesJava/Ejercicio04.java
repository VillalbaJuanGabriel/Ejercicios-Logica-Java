package EjerciciosSecuencialesJava;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 04:
         * 
         * Se necesita un algoritmo que calcule el índice de Masa Corporal (IMC) 
         * de una persona a partir de brindar por teclado su peso en KG 
         * y su estatura en metros. 
         * El resultado del cálculo debe ser visualizado por pantalla.
         */
        
        // Declaración de Variables:
        double peso, estatura, imc;
        
        // Ingreso de los Datos:
        System.out.println("Ingrese su Peso en KG: ");
        peso = teclado.nextDouble();
        
        System.out.println("Ingrese su Estatura en Metros: ");
        estatura = teclado.nextDouble();
        
        // Calculo del IMC:
        imc = peso / (estatura * estatura);
        
        // Se emite el IMC por pantalla:
        System.out.println("Su IMC es: " + imc + ".");
        
    }
}