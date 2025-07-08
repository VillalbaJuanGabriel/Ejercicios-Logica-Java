package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 08:
         * 
         * Desarrolla un Programa que dependiendo del promedio de un alumno, 
         * nos diga si aprobó o no una materia. (Utilizar el Operador Ternario).
         * 
         */
        
        // Declaración de Variables:
        double promedio;
        String aprobacionMateria;
        
        // Ingreso del Promedio:
        System.out.println("Ingrese el Promedio del Alumno/a: ");
        promedio = teclado.nextDouble();
        
        // Operador Ternario:
        aprobacionMateria = promedio >= 7 ? "Aprobado." : "Desaprobado.";
        
        // Se emite la Situación del Alumno por Pantalla:
        System.out.println(aprobacionMateria);
        
    }
}