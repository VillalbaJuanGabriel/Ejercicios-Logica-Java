package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 05:
         * 
         * Un instituto de inglés desea informar a sus alumnos 
         * los días y horarios de sus clases. 
         * Para ello, decidió la creación de una aplicación que, a partir del 
         * ingreso de la edad del alumno, le informe en que días y horarios 
         * los alumnos tienen clases.
         * 
         * Como información, la academia proporciona los siguientes datos 
         * respecto a los grupos y los diferentes horarios:
         *      -Kinder (de 4 a 6 años inclusive). Lunes y Miércoles de 16hs a 17hs.
         *      -1st Year (de 7 a 8 años inclusive). Martes y Jueves de 16:30hs a 17:30hs.
         *      -2nd Year (de 9 a 10 años inclusive). Martes y Jueves de 17:30hs a 19hs.
         *      -3rd Year (de 11 a 13 años inclusive). Lunes y Miércoles de 17hs a 18:30hs.
         * 
         * Realizar el programa solicitado por el instituto, donde a partir 
         * del ingreso de la edad del alumno, el sistema informe por pantalla 
         * los días y horarios de cursada.
         * 
         */
        
        // Declaración de Variables:
        int edad;
        
        System.out.println("------- Bienvenido a Nuestro Instituto de Inglés -------");
        
        // Ingreso de la Edad:
        System.out.println("Ingrese la Edad del Alumno: ");
        edad = teclado.nextInt();
        
        if(edad >= 4 && edad <= 13){
            System.out.println("Los Horarios de las Clases, en relación a la Edad Ingresada, son: ");
        }
        
        // Condicional:
        if(edad >= 4 && edad <= 6){
            System.out.println("Kinder: Lunes y Miércoles de 16hs a 17hs.");
        } else if(edad >= 7 && edad <= 8){
            System.out.println("1st Year: Martes y Jueves de 16:30hs a 17:30hs.");
        } else if(edad >= 9 && edad <= 10){
            System.out.println("2nd Year: Martes y Jueves de 17:30 hs a 19hs.");
        } else if(edad >= 11 && edad <= 13){
            System.out.println("3rd Year: Lunes y Miércoles de 17hs a 18:30hs.");
        } else {
            System.out.println("La Edad Ingresada no coincide con los Grupos Académicos.");
        }
        
    }
}