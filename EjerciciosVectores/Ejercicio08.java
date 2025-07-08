package EjerciciosVectores;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 08:
         * 
         * En tres vectores diferentes se guardan los nombres, 
         * temperaturas mínimas y máximas de 3 ciudades de la provincia de Misiones. 
         * En el primer vector se guardan los nombres de las ciudades, en el 
         * segundo las temperaturas mínimas alcanzadas y en el tercero las 
         * temperaturas máximas alcanzadas en la última semana.
         * 
         * Se necesita un programa que permita la carga de las ciudades, 
         * sus temperaturas mínimas y máximas; además, deberá poder informar 
         * por pantalla cual fue la ciudad con la temperatura más baja 
         * y cual con la temperatura más alta (dando a conocer al mismo tiempo 
         * la cantidad de grados).
         * 
         * Ejemplo:
         * CIUDAD	     TEMP. MIN.    TEMP. MAX.
         * Oberá             16  	   29
         * Posadas           18 	   32
         * L. N. Alem        15 	   28
         * 
         */
        
        // Declaración de Variables:
        double minima;
        double maxima;
        String ciudadMinima;
        String ciudadMaxima;
        
        // Declaración de Vectores:
        String nombreCiudad[] = new String[3];
        double tempMin[] = new double[3];
        double tempMax[] = new double[3];
        
        // Bucle For para Cargar los 3 Vectores:
        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese el Nombre de la Ciudad: ");
            nombreCiudad[i] = teclado.nextLine();
            
            System.out.println("Ingrese la Temperatura Minima de la Ciudad: ");
            tempMin[i] = tecladoDos.nextDouble();
            
            System.out.println("Ingrese la Temperatura Máxima de la Ciudad: ");
            tempMax[i] = tecladoDos.nextDouble();
        }
        
        // Asignamos el primer valor como minimos y maximos para luego seguir verificando:
        minima = tempMin[0];
        ciudadMinima = nombreCiudad[0];
        maxima = tempMax[0];
        ciudadMaxima = nombreCiudad[0];
        
        
        // Bucle For para Recorrer los Vectores:
        for(int i = 0; i < 3; i++){
            
            // Se busca el Mínimo:
            if(tempMin[i] < minima){
                minima = tempMin[i];
                ciudadMinima = nombreCiudad[i];
            }
            
            // Se busca el Máximo:
            if(tempMax[i] > maxima){
                maxima = tempMax[i];
                ciudadMaxima = nombreCiudad[i];
            }
        }
        
        // Emitimos por pantalla las Ciudades con las Temperaturas Más Bajas y Altas:
        System.out.println("");
        
        System.out.println("Ciudad con Temperatura MÁS BAJA: ");
        System.out.println(ciudadMinima);
        System.out.println(minima + "°C.");
        System.out.println("");
        
        System.out.println("Ciudad con Temperatura MÁS ALTA: ");
        System.out.println(ciudadMaxima);
        System.out.println(maxima + "°C.");
        System.out.println("");
        
    }
}