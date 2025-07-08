package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 07:
         * 
         * Un empleado desea almacenar en un vector sus 12 sueldos del año. 
         * A partir de esto, necesita un programa que determine y muestre 
         * por pantalla la suma total de sus 12 sueldos y el promedio de 
         * sueldo que tuvo en el año.
         * 
         */
        
        // Declaración de Variables:
        double acumuladorSueldos = 0;
        double promedio = 0;
        
        // Declaración del Vector de 12 posiciones:
        double sueldos[] = new double[12];
        
        // Bucle For para cargar el Vector:
        for(int i = 0; i < sueldos.length; i++){
            System.out.println("Ingrese su Sueldo Mensual: ");
            sueldos[i] = teclado.nextDouble();
        }
        
        // Bucle For para recorrer el Vector:
        for(int i = 0; i < sueldos.length; i++){
            // Sumatoria de todos los Sueldos:
            acumuladorSueldos += sueldos[i];
        }
        
        // Calculamos el Promedio de Sueldo:
        promedio = acumuladorSueldos / 12;
        
        // Mostramos la Sumatorio de los Sueldos y el Promedio por Pantalla:
        System.out.println("Sumatoria de todos los Sueldos: $" + acumuladorSueldos + "USD.");
        System.out.println("Promedio de Sueldo: $" + promedio + "USD.");
           
    }
}