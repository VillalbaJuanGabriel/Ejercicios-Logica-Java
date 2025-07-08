package EjerciciosSecuencialesJava;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 05:
         * 
         * Se necesita llevar a cabo un algoritmo que calcule el promedio 
         * de las 4 notas de un alumno de una institución educativa. 
         * Las notas deben ser ingresadas por teclado y el promedio 
         * debe ser visualizado por pantalla.
         * 
         */
        
        // Declaración de Variables:
        double notaUno, notaDos, notaTres, notaCuatro, promedio;
        
        // Ingreso de las Notas:
        System.out.println("Ingrese su Primer Nota: ");
        notaUno = teclado.nextDouble();
        
        System.out.println("Ingrese su Segunda Nota: ");
        notaDos = teclado.nextDouble();
        
        System.out.println("Ingrese su Tercer Nota: ");
        notaTres = teclado.nextDouble();
        
        System.out.println("Ingrese su Cuarta Nota: ");
        notaCuatro = teclado.nextDouble();
        
        // Calculo del Promedio:
        promedio = (notaUno + notaDos + notaTres + notaCuatro) / 4;
        
        // Se emite el Promedio por Pantalla:
        System.out.println("Promedio Final: " + promedio + ".");
        
    }
}