package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        String cedula;
        Integer opcion;
        Integer cantidadProducto;
        double costoTotal;
        double sumatoriaTotal=0;

        Scanner teclado = new Scanner(System.in);

        //PROCESO
        //1.CREAR UN MENU DE OPCIONES

        System.out.println("******PELUCHITOS******");
        System.out.println("1. cumpleaños");
        System.out.println("2. Dia de la mujer");
        System.out.println("3. Baby showers");
        System.out.println("4. SALIR");

        //2. construir un ciclo para permitir que el usuario escoja

        do {
            System.out.println("Digita la opcion deseada");
            opcion=teclado.nextInt();

            //3. evaluando las opciones del menu

            if (opcion==1){
                System.out.printf("cuantos kit de cumpleaños deseas");
                cantidadProducto=teclado.nextInt();
                costoTotal=180000.0*cantidadProducto;
                sumatoriaTotal=sumatoriaTotal+costoTotal;



            }else if (opcion==2){
                System.out.printf("cuantos kit de mujer deseas");
                cantidadProducto=teclado.nextInt();
                costoTotal=60000.0*cantidadProducto;
                sumatoriaTotal=sumatoriaTotal+costoTotal;
            }else if (opcion==3){
                System.out.printf("cuantos kit de babyshower deseas");
                cantidadProducto=teclado.nextInt();
                costoTotal=250000.0*cantidadProducto;
                sumatoriaTotal=sumatoriaTotal+costoTotal;
            }else if (opcion==4){
                System.out.printf("Gracias por su compra");

            }else{
                System.out.printf("Digita una opcion valida");
            }

        }while(opcion!=4);

        System.out.printf("El costo es de :"+sumatoriaTotal);








    }
}