package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 09:
         * 
         * Un administrador de un estacionamiento necesita un programa que 
         * permita calcular el total a pagar de varios clientes 
         * que utilizan el servicio.
         * 
         * El programa debe solicitar por teclado dos datos:
         *      -La patente del vehículo.
         *      -El tipo de estacionamiento.
         * 
         * Los tipos de estacionamiento disponibles son 3:
         *      -Por hora (cuyo valor es de $3 USD por hora).
         *      -Media jornada (cuyo valor es de $15 USD y posee 5% de descuento).
         *      -Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento).
         * 
         * El programa debe calcular el monto a pagar para cada cliente en 
         * función del tipo de estacionamiento seleccionado. 
         * La carga de datos debe continuar hasta que el usuario ingrese 
         * la palabra "FIN" en lugar de la patente.
         * 
         * Al finalizar, el programa debe mostrar por pantalla:
         *      -La cantidad total de estacionamientos por hora.
         *      -La cantidad total de estacionamientos de media jornada.
         *      -La cantidad total de estacionamientos de jornada completa.
         *      -La suma total de ingresos en USD que hubo durante el día.
         * 
         */
        
        // Declaración de Variables:
        String numeroPatente;
        int tipoEstacionamiento, estacionamientoHora, estacionamientoMedia, estacionamientoCompleto;
        double monto, montoTotal;
        
        // Inicialización de Variables en 0:
        monto = montoTotal = 0;
        estacionamientoHora = estacionamientoMedia = estacionamientoCompleto = 0;
        
        // Ingreso de los Datos:
        System.out.println("Ingrese el Número de Patente: ");
        numeroPatente = teclado.nextLine();
        
        System.out.println("Ingrese el Tipo de Estacionamiento: ");
        System.out.println("1- Por hora (cuyo valor es de $3 USD por hora).");
        System.out.println("2- Media jornada (cuyo valor es de $15 USD y posee 5% de descuento).");
        System.out.println("3- Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento).");
        tipoEstacionamiento = tecladoDos.nextInt();
        
        // Bucle While:
        while(!numeroPatente.equalsIgnoreCase("fin")){
            
            // COndicional:
            if(tipoEstacionamiento == 1){
                monto = 3;
                montoTotal += monto;
                estacionamientoHora++;
            } else if(tipoEstacionamiento == 2){
                monto = 15 - (15 * 0.05);
                montoTotal += monto;
                estacionamientoMedia++;
            } else if(tipoEstacionamiento == 3){
                monto = 30 - (30 * 0.10);
                montoTotal += monto;
                estacionamientoCompleto++;
            } else {
                System.out.println("Tipo de Estacionamiento Inválido.");
            }
            
            // Se vuelven a pedir los Datos:
            System.out.println("Ingrese otro Número de Patente: ");
            numeroPatente = teclado.nextLine();
            
            // Se pide el tipo de estacionamiento solo si no se ingresa la palabra "fin" en la Patente:
            if(!numeroPatente.equalsIgnoreCase("fin")){
                System.out.println("Ingrese el Tipo de Estacionamiento: ");
                System.out.println("1- Por hora (cuyo valor es de $3 USD por hora).");
                System.out.println("2- Media jornada (cuyo valor es de $15 USD y posee 5% de descuento).");
                System.out.println("3- Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento).");
                tipoEstacionamiento = tecladoDos.nextInt();
            }
        
        }
        
        // Se emiten los Resultados por Pantalla:
        System.out.println("Cantidad de Estacionamientos 'Por Hora': " + estacionamientoHora + ".");
        System.out.println("Cantidad de Estacionamientos por 'Media Jornada': " + estacionamientoMedia + ".");
        System.out.println("Cantidad de Estacionamientos por 'Jornada Completa': " + estacionamientoCompleto + ".");
        System.out.println("Total de Ingresos por el Día Completo: $" + montoTotal + ".");
        
    }
}