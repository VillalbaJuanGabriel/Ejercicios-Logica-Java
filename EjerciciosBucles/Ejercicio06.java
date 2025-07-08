package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 06:
         * 
         * Un niño de primaria necesita realizar 5 cálculos diferentes entre dos números.
         * Para esto necesita un programa que, para cada cálculo, permita el 
         * ingreso de los dos números por separado al igual que la operación 
         * que desea hacer entre ambos.
         * Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar 
         * el resultado por pantalla.
         * Por ejemplo:
         *      - num1 = 25.
         *      - num2 = 15.
         *      - operador = +
         * 
         */
        
        // Declaración de Variables:
        double num1, num2, suma, resta, multiplicacion, division;
        String operador;
        
        // Bucle For:
        for(int i = 0; i < 5; i++){
            
            // Ingreso de los Números y Operador:
            System.out.println("Ingrese un Número: ");
            num1 = teclado.nextDouble();
        
            System.out.println("Ingrese el Operador: ");
            System.out.println("Suma: +");
            System.out.println("Resta: -");
            System.out.println("Multiplicación: *");
            System.out.println("División: /");
            operador = tecladoDos.nextLine();
        
            System.out.println("Ingrese otro Número: ");
            num2 = teclado.nextDouble();
            
            // Condicionales de las Distintas Operaciones:
            if(operador.equals("+")){
                suma = num1 + num2;
                System.out.println("Resultado de la Suma: " + suma + ".");
            } else if(operador.equals("-")){
                if(num1 > num2){
                    resta = num1 - num2;
                    System.out.println("Resultado de la Resta: " + resta + ".");
                } else if(num2 > num1){
                    resta = num2 - num1;
                    System.out.println("Resultado de la Resta: " + resta + ".");
                } else {
                    resta = num1 - num2;
                    System.out.println("Resultado de la Resta: " + resta + ".");
                }
            } else if(operador.equals("*")){
                multiplicacion = num1 * num2;
                System.out.println("Resultado de la Multiplicación: " + multiplicacion + ".");
            } else if(operador.equals("/")){
                if(num2 != 0){
                    division = num1 / num2;
                    System.out.println("Resultado de la División: " + division + ".");
                } else {
                    System.out.println("No se puede dividir por Cero.");
                }
            } else {
                System.out.println("Operador Inválido.");
            }
            
        }
        
    }
}