package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 03:
         * 
         * Una pequeña despensa desea calcular los sueldos de sus empleados. 
         * Los puestos de los mismos pueden tener 3 categorías:
         *      1. Repositor.
         *      2. Cajero.
         *      3. Supervisor.
         * -Los repositores cobran $15.890 + un bono del 10%.
         * -Los cajeros cobran $25.630,89 fijos.
         * -Los supervisores cobran $35.560,20 en bruto al cual se les 
         * descuenta un 11% de jubilación.
         * 
         * Se necesita un programa que, dependiendo del tipo de empleado del que 
         * se trate, calcule y muestre en pantalla el correspondiente sueldo.
         * 
         */
        
        // Declaración de Variables:
        int tipoEmpleado;
        double sueldo = 0;
        
        // Ingreso del Tipo de Empleado:
        System.out.println("Ingrese el N° de Tipo de Empleado: ");
        System.out.println("1- Repositor.");
        System.out.println("2- Cajero.");
        System.out.println("3- Supervisor.");
        tipoEmpleado = teclado.nextInt();
        
        // Condicionales:
        if(tipoEmpleado == 1){
            sueldo = 15.890 + (15.890 * 0.10);
        } else if(tipoEmpleado == 2){
            sueldo = 25630.89;
        } else if(tipoEmpleado == 3){
            sueldo = 35560.20 - (35560.20 * 0.11);
        } else {
            System.out.println("Tipo de Empleado Inválido.");
        }
        
        if(tipoEmpleado >= 1 && tipoEmpleado <= 3){
            System.out.println("Sueldo Total: $" + sueldo + "ARS. (Pesos Argentinos)" );
        }
        
    }
}