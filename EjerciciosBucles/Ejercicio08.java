package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 08:
         * 
         * En la ciudad de Oberá, Misiones se realiza año a año la 
         * "Maratón del Inmigrante" en el marco de la Fiesta Nacional del Inmigrante. 
         * El evento cuenta con un día de inscripciones el día anterior a la carrera, 
         * por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber.
         * 
         * Desde la Federación de Colectividades (Organismo que organiza), 
         * manifestaron que se solicitan los siguientes datos para la inscripción 
         * de cada participante: DNI, Nombre y Edad.
         * 
         * En cuanto a las categorías posibles para una inscripción, 
         * se manejan las siguientes:
         *      -Menores A (de 6 a 10 años).
         *      -Menores B (de 11 a 17 años).
         *      -Juveniles (de 18 a 30 años).
         *      -Adultos (de 31 a 50 años).
         *      -Adultos Mayores (mayores de 50 años).
         * 
         * Se necesita un programa que, a partir del ingreso de los datos 
         * y edad de cada participante, se muestre por pantalla a qué categoría 
         * debe ser inscripto.
         * Cabe destacar que, al finalizar el día, para dar fin a las 
         * inscripciones, se debe ingresar un DNI con el valor 0 y un nombre 
         * con la palabra "fin".
         * 
         */
        
        // Declaración de Variables:
        String dni, nombre;
        int edad;
        
        // Ingreso de los Datos:
        System.out.println("Ingrese su DNI: ");
        dni = teclado.nextLine();
        
        System.out.println("Ingrese su Nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese su Edad: ");
        edad = tecladoDos.nextInt();
        
        // Ciclo While:
        while(!dni.equals("0") && !nombre.equalsIgnoreCase("fin")){
            
            // Condicional:
            if(edad >= 6 && edad <= 10){
                System.out.println("Menores A (de 6 a 10 años).");
            } else if(edad >= 11 && edad <= 17){
                System.out.println("Menores B (de 11 a 17 años).");
            } else if(edad >= 18 && edad <= 30){
                System.out.println("Juveniles (de 18 a 30 años).");
            } else if(edad >= 31 && edad <= 50){
                System.out.println("Adultos (de 31 a 50 años).");
            } else if(edad > 50){
                System.out.println("Adultos Mayores (mayores de 50 años).");
            } else {
                System.out.println("No puedes participar porque no llegas a la edad mínima.");
            }
            
            // Se vuelven a pedir los Datos:
            System.out.println("Ingrese su DNI: ");
            dni = teclado.nextLine();
        
            System.out.println("Ingrese su Nombre: ");
            nombre = teclado.nextLine();
            
            if(!dni.equals("0") && !nombre.equalsIgnoreCase("fin")){
                System.out.println("Ingrese su Edad: ");
                edad = tecladoDos.nextInt();
            }
        
        }
        
    }
}