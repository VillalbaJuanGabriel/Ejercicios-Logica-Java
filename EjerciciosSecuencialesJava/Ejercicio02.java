package EjerciciosSecuencialesJava;

public class Ejercicio02 {

    public static void main(String args[]) {
        
        /**
         * Ejercicio 02:
         * 
         * Declarar variables de distintos tipos de datos, 
         * asignarles a cada una de ellas un valor válido y luego mostrar 
         * los valores por pantalla.
         * 
         */
        
        // Declaración y Asignación de Variables con distintos Tipos de Datos:
        char inicialNombre = 'J';
        String nombreCompleto = "Juan Gabriel Villalba";
        int edad = 29;
        double estatura = 1.67;
        long numeroExtenso = 1550543212;
        boolean esProgramador = true;
        
        // Se emiten los Valores de las Variables por Pantalla:
        System.out.println("Hola, mi nombre es: " + nombreCompleto + ".");
        System.out.println("Tengo una edad de: " + edad + " años.");
        System.out.println("Mi estatura es de: " + estatura + "mts.");
        System.out.println("Numero Extenso: " + numeroExtenso + ".");
        System.out.println("¿Es Programador? " + esProgramador + ".");
        
    }
}