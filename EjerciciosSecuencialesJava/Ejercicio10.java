package EjerciciosSecuencialesJava;

public class Ejercicio10 {

    public static void main(String args[]) {
        
        /**
         * Ejercicio 10:
         * 
         * Un restaurante está a punto de calcular la cuenta de un 
         * comensal (cliente), al cual se le suma por separado $2800 + $1300 
         * de comida y $900 + $650 de bebida.
         * Crear un programa que calcule el total de comida, 
         * el total de bebida y el total completo de la cena.
         * Informar el resultado por pantalla.
         * 
         */
        
        // Declaración de Variables:
        double precioComida, precioBebida, precioTotal;
        
        // Asignación de los Valores a las Variables:
        precioComida = 2800 + 1300;
        precioBebida = 900 + 650;
        precioTotal = precioComida + precioBebida;
        
        // Se emiten todos los Precios por Pantalla:
        System.out.println("Precio de la Comida: $" + precioComida + "ARS (Pesos Argentinos).");
        System.out.println("Precio de la Bebida: $" + precioBebida + "ARS.");
        System.out.println("Precio Total de la Cena: $" + precioTotal + "ARS.");
        
    }
}