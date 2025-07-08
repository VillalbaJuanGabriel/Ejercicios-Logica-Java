package EjerciciosCondicionalesJava;

import java.time.DayOfWeek;
import static java.time.DayOfWeek.SUNDAY;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 07:
         * 
         * Ingresar una fecha por teclado (formato mes/día/año - mm/dd/yyyy).
         * Mostrar luego por pantalla, a qué día de la semana corresponde.
         * 
         */
        
        // Declaración de Variables:
        String fecha;
        
        // Ingreso de la Fecha:
        System.out.println("Ingrese una Fecha con el formato mes/día/año - mm/dd/yyyy: ");
        fecha = teclado.nextLine();
        
        // Establecemos el Formato de Fecha:
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        // Establecemos la Fecha Local de la Fecha Ingresada con su Formato:
        LocalDate fechaFormato = LocalDate.parse(fecha, formato);
        
        // Establecemos el Día de la Semana:
        DayOfWeek diaSemana = fechaFormato.getDayOfWeek();
        
        // Condicional Switch:
        switch(diaSemana){
            case SUNDAY: System.out.println("El Día de la Semana es Domingo."); break;
            case MONDAY: System.out.println("El Día de la Semana es Lunes."); break;
            case TUESDAY: System.out.println("El Día de la Semana es Martes."); break;
            case WEDNESDAY: System.out.println("El Día de la Semana es Miércoles."); break;
            case THURSDAY: System.out.println("El Día de la Semana es Jueves."); break;
            case FRIDAY: System.out.println("El Día de la Semana es Viernes."); break;
            case SATURDAY: System.out.println("El Día de la Semana es Sábado."); break;
            default: System.out.println("Día de la Semana Inválido.");
        }
       
    }
}