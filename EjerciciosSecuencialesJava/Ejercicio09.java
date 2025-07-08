package EjerciciosSecuencialesJava;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 09:
         * 
         * Calcular el salario semanal de un trabajador dado su salario diario 
         * y la cantidad de días trabajados en la semana.
         * 
         */
        
        // Declaración de Variables:
        double salarioDiario, diasTrabajados, salarioSemanal;
        
        // Ingreso de los Datos:
        System.out.println("Ingrese su Salario Diario: ");
        salarioDiario = teclado.nextDouble();
        
        System.out.println("Ingrese la cantidad de Días Trabajados: ");
        diasTrabajados = teclado.nextDouble();
        
        // Calculo del Salario Semanal:
        salarioSemanal = salarioDiario * diasTrabajados;
        
        // Se emite el Salario Semanal por Pantalla:
        System.out.println("Salario Semanal: $" + salarioSemanal + "ARS (Pesos Argentinos).");
        
    }
}