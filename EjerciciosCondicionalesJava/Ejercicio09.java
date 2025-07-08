package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoDos = new Scanner(System.in);
        
        /**
         * Ejercicio 09:
         * 
         * Una mercería vende canutillos y mostacillas al por mayor mediante su página web.
         * Como se trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta 
         * y dependiendo de esta realiza los siguientes controles:
         *      -Si la cantidad de productos es menor a 5: 
         *       Se debe emitir un mensaje indicando que no se permiten compras 
         *       inferiores a 5 productos.
         *      -Si la cantidad de productos es mayor o igual a 5 
         *       pero menor o igual a 15: 
         *       Se debe emitir un mensaje que el costo de envío es de $10 USD.
         *      -Si la cantidad de productos es mayor a 15: 
         *       Se debe emitir un mensaje de que el envío es gratuito.
         * Realizar el programa necesario para llevar a cabo los 3 controles citados.
         * 
         * -Punto Extra:
         * Solicitar, además de la cantidad de paquetes, el costo total que suma 
         * la compra en USD, y aplicar las siguientes promociones:
         *      -Si el monto total es inferior a $100 USD: 
         *       No hay promociones. Informar cuantos $USD más necesita para 
         *       poder entrar a una promoción.
         *      -Si el monto supera los $100 USD pero es menor a los $300 USD: 
         *       Informar que posee un descuento del 5% sobre el total. 
         *       Especificar cuanto sería el nuevo monto total con descuento.
         *      -Si el monto supera los $300 USD: Informar que posee un descuento del 10%. 
         *       Especificar cuanto sería el nuevo monto total con descuento.
         * 
         */
        
        // Declaración de Variables:
        int cantidadPaquetes;
        double costo, montoTotal;
        costo = 0;
        montoTotal = 0;
        
        // Ingreso de la Cantidad de Paquetes:
        System.out.println("Ingrese la Cantidad de Paquetes: ");
        cantidadPaquetes = teclado.nextInt();
        
        // Condicional donde determinamos las compras inferiores a 5 productos:
        if(cantidadPaquetes < 5){
            System.out.println("No se permiten compras inferiores a 5 productos.");
        }
        
        // Condicionales anidados donde ingresamos el costo de la compra y evaluamos:
        if(cantidadPaquetes >= 5){
            System.out.println("Ingrese el Costo de la Compra: ");
            costo = tecladoDos.nextDouble();
            
            // Condicional de los Paquetes entre 5 y 15:
            if(cantidadPaquetes >= 5 && cantidadPaquetes <= 15){
                
                if(costo < 100){
                    montoTotal = 100 - costo;
                    System.out.println("No tiene Promoción");
                    System.out.println("Le faltan $" + montoTotal + "USD para entrar en la Promoción.");
                    System.out.println("Monto Final: $" + costo + "USD.");
                } else if(costo >= 100 && costo < 300){
                    costo += 10;
                    montoTotal = costo - (costo * 0.05);
                    System.out.println("El costo del envío es de $10USD.");
                    System.out.println("Posee un descuento del 5%.");  
                    System.out.println("Monto Final con Descuento: $" + montoTotal + "USD.");
                } else {
                    costo += 10;
                    montoTotal = costo - (costo * 0.10);
                    System.out.println("Posee un descuento del 10%.");  
                    System.out.println("Monto Final con Descuento: $" + montoTotal + "USD.");
                }
                
            } else {
                System.out.println("El envío es gratuito.");
                
                // Condicional de los Paquetes superiores a 16:
                if(costo < 100){
                    montoTotal = 100 - costo;
                    System.out.println("No tiene Promoción");
                    System.out.println("Le faltan $" + montoTotal + "USD para entrar en la Promoción.");
                    System.out.println("Monto Final: $" + costo + "USD.");
                } else if(costo >= 100 && costo < 300){
                    montoTotal = costo - (costo * 0.05);
                    System.out.println("Posee un descuento del 5%.");  
                    System.out.println("Monto Final con Descuento: $" + montoTotal + "USD.");
                } else {
                    montoTotal = costo - (costo * 0.10);
                    System.out.println("Posee un descuento del 10%.");  
                    System.out.println("Monto Final con Descuento: $" + montoTotal + "USD.");
                }
            }
        }
        
    }
}