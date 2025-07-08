package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 04:
         * 
         * Una compañía de vuelos cuenta con 6 destinos a los que realiza 
         * 3 vuelos diariamente, uno por la mañana, otro al mediodía 
         * y otro por la noche.
         * 
         * Para administrar estos datos, utiliza una matriz, donde cada fila 
         * es un destino y en cada columna se guarda la cantidad 
         * de asientos disponibles. 
         * 
         * Por Ejemplo:
         *                       0		   1		  2
         *                       Mañana  	Mediodía 	Noche
         * 0 Río de Janeiro      120		15		30
         * 1 Cancún		 65		1		2
         * 2 Madrid		 4		52		7
         * 3 Roma		 46		32		16
         * 4 Milán		 64		23		11
         * 5 Iguazú		 61		12		91
         * 
         * 1. Se necesita un programa que permita la carga de la matriz con la 
         *    cantidad de asientos para cada vuelo.
         * 
         * 2. Al mismo tiempo, el programa debe permitir a un usuario ingresar 
         *    el número de destino al que quiere dirigirse, 
         *    el número de vuelo (dependiendo si quiere viajar a la mañana, 
         *    al mediodía o a la noche) y la cantidad de pasajes que necesita.
         * 
         * 3. A partir de la solicitud del usuario, el programa debe controlar 
         * si hay la cantidad suficiente de asientos para la cantidad de pasajes 
         * que se requiere. En caso de que así sea, se debe mostrar un cartel 
         * por pantalla que diga "su reserva fue realizada con éxito" y se debe 
         * descontar del total de asientos los solicitados por el usuario. 
         * En caso de no haber más asientos disponibles, se debe informar otro 
         * cartel que diga "disculpe, no se pudo completar su operación dado que 
         * no hay asientos disponibles".
         * 
         * Desde la compañía de vuelos manifiestan que NO CONOCEN 
         * cuantas ventas/reservas se hacen por día. 
         * Por lo cual, para finalizar las ventas se ingresa 
         * la palabra "finish".
         * 
         */
        
        // Declaración de Variables:
        String bandera = "";
        int destino, vuelo, cantPasajes; 
        
        // Declaración de la Matriz:
        int vuelos[][] = new int[6][3];
        
        // Bucle For para cargar la Matriz:
        for(int f = 0; f < 6; f++){
            for(int c = 0; c < 3; c++){
                System.out.println("Ingrese la Cantidad de Asientos para la Fila N°" + (f+1) + " y Columna N°" + (c+1) + ": ");
                vuelos[f][c] = teclado.nextInt();
            }
        }
        
        // Bucle While para el Ingreso de Datos:
        while(!bandera.equalsIgnoreCase("finish")){
            System.out.println("Ingrese el N° de Destino: ");
            destino = teclado.nextInt();
            
            System.out.println("Ingrese el N° de Vuelo: ");
            vuelo = teclado.nextInt();
            
            System.out.println("Ingrese la Cantidad de Pasajes: ");
            cantPasajes = teclado.nextInt();
            
            // Condicional para verificar disponibilidad de Asientos:
            if(destino >= 0 && destino <= 5){
                if(vuelo >= 0 && vuelo <= 2){
                    if(vuelos[destino][vuelo] >= cantPasajes){
                        System.out.println("Su reserva fue realizada con éxito.");
                        vuelos[destino][vuelo] -= cantPasajes;
                    } else {
                        System.out.println("No hay Asientos Disponibles.");
                    }
                } else {
                    System.out.println("Número de Vuelo Incorrecto.");
                }
            } else {
                System.out.println("Número de Destino Incorrecto.");
            }
            
            // Se vuelven a pedir datos y se establece la posibilidad de finalizar:
            System.out.println("¿Desea Continuar? Ingrese cualquier valor.");
            System.out.println("¿Desea Finalizar? Ingrese la palabra 'finish'.");
            bandera = tecladoDos.nextLine();
            
        }
        
    }
}