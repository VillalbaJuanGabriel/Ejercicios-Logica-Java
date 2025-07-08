package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 07:
         * 
         * En una carrera automovilística se desea calcular cuál es el 
         * MAYOR tiempo realizado por cada uno de sus 12 competidores.
         * Para ello, se pide un algoritmo que sea capaz de permitir el ingreso 
         * por teclado del número de vehículo y el tiempo (en segundos) de cada participante.
         * Una vez calculado el que cumplió esa condición, se debe informar por 
         * pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.
         * 
         */
        
        // Declaración de Variables:
        int numVehiculo = 0, tiempoSegundos = 0, mayorTiempo = 0, vehiculoMasLento = 0;
        
        // Ciclo For:
        for(int i = 0; i < 12; i++){
            // Ingreso de los Datos:
            System.out.println("Ingrese el Número de Vehículo: ");
            numVehiculo = teclado.nextInt();
            
            System.out.println("Ingrese el Tiempo que demoró en la Carrera: ");
            tiempoSegundos = teclado.nextInt();
            
            // Condicional para buscar el que tardó mayor tiempo:
            if(tiempoSegundos > mayorTiempo){
                mayorTiempo = tiempoSegundos;
                vehiculoMasLento= numVehiculo;
            }
        }
        
        // Se emite el Número de Vehículo que mas demoró en la Carrera:
        System.out.println("El Vehículo que más tardo en la Carrera es el N°" + vehiculoMasLento + ".");
        System.out.println("Demoró " + mayorTiempo + " Segundos.");
        
    }
}