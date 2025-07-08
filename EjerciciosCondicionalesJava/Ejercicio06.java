package EjerciciosCondicionalesJava;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        /**
         * Ejercicio 06:
         * 
         * Se necesita un algoritmo para una Veterinaria que determine el 
         * precio de las atenciones dadas a una mascota. 
         * Tener en cuenta que el usuario deberá ingresar:
         *      1- Servicio de baño. Valor $3500.
         *      2- Servicio de peluquería. Valor $6000.
         *      3- Servicio de vacunación. Valor $12500.
         *      4- Servicio de baño y peluquería.
         *      5- Los 3 Servicios.
         *      6- Baño y Vacunación.   
         *      7- Peluquería y Vacunación.
         * En base a la opción ingresada se deberá mostrar por pantalla el 
         * monto total gastado por el propietario.
         * 
         */
        
        // Declaración de Variables:
        int tipoServicio;
        double precioBanio, precioPelu, precioVacu, precio;
        
        // Asignación de los Precios:
        precioBanio = 3500;
        precioPelu = 6000;
        precioVacu = 12500;
        precio = 0;
        
        // Ingreso del Tipo de Servicio:
        System.out.println("------- ¡Bienvenido a nuestra Veterinaria! -------");
        System.out.println("Ingrese el Tipo de Servicio que Desea: ");
        System.out.println("1- Servicio de baño. Valor $3500.");
        System.out.println("2- Servicio de peluquería. Valor $6000.");
        System.out.println("3- Servicio de vacunación. Valor $12500.");
        System.out.println("4- Servicio de baño y peluquería.");
        System.out.println("5- Los 3 Servicios.");
        System.out.println("6- Baño y Vacunación.");
        System.out.println("7- Peluquería y Vacunación.");
        tipoServicio = teclado.nextInt();
        
        // Condicional Switch:
        switch(tipoServicio){
            case 1: precio = precioBanio; break;
            case 2: precio = precioPelu; break;
            case 3: precio = precioVacu; break;
            case 4: precio = precioBanio + precioPelu; break;
            case 5: precio = precioBanio + precioPelu + precioVacu; break;
            case 6: precio = precioBanio + precioVacu; break;
            case 7: precio = precioPelu + precioVacu; break;
            default: System.out.println("Opción Inválida del Tipo de Servicio.");
        }
        
        // Se emite el precio Final por Pantalla:
        if(tipoServicio >= 1 && tipoServicio <= 7){
            System.out.println("Precio Final: $" + precio + "ARS. (Pesos Argentinos).");
        }
   
    }
}