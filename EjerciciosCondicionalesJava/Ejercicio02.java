package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 02:
         * 
         * Un gerente de una empresa prestadora de servicios de internet 
         * necesita un algoritmo que permita realizar el cálculo del monto a 
         * pagar de la factura de consumo de internet de 5 clientes de una empresa. 
         * Para ello, el algoritmo debe solicitar por teclado dos datos: 
         * DNI del cliente y tipo de servicio.
         * 
         * Los tipos de servicio son 3:
         *      1. Internet 30 megas (cuyo valor es de $750 - 10% de descuento).
         *      2. Internet 50 megas (cuyo valor es de $930 - 5% de descuento).
         *      3. Internet 100 megas (cuyo valor fijo es de $1200).
         * 
         * El algoritmo debe poder calcular el monto a pagar 
         * (dependiendo del tipo de servicio con el que cuente el cliente) 
         * e informar por pantalla el DNI del mismo junto con el monto a 
         * pagar y el número de servicio con el que cuenta.
         * 
         */
        
        // Declaración de Variables:
        String dni;
        int tipoServicio;
        double monto = 0;
        
        // Ingreso de los Datos:
        System.out.println("Ingrese su DNI: ");
        dni = teclado.nextLine();
        
        System.out.println("Ingrese el Tipo de Servicio: ");
        System.out.println("1- Internet 30 megas.");
        System.out.println("2- Internet 50 megas.");
        System.out.println("3- Internet 100 megas.");
        tipoServicio = tecladoDos.nextInt();
        
        // Condicionales:
        if(tipoServicio == 1){
            monto = 750 - (750 * 0.10);
        } else if(tipoServicio == 2){
            monto = 930 - (930 * 0.05);
        } else if(tipoServicio == 3){
            monto = 1200;
        } else {
            System.out.println("Tipo de Servicio Inválido.");
        }
        
        if(tipoServicio >= 1 && tipoServicio <= 3){
            System.out.println("Monto Final: $" + monto + "ARS.");
        }
        
    }
}