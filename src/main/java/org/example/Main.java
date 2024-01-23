package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreFruta;
        boolean temporada;
        Integer costocarga;


        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese la fruta :");
        nombreFruta= leer.nextLine();

        System.out.println("Esta en temporada: ");
        temporada= leer.nextBoolean();

        if (temporada==true){
            System.out.println("La fruta es colombiana? ");
            boolean esColombiana=leer.nextBoolean();
            if (esColombiana==true){
                costocarga=100000;
                System.out.println("El costo es :"+ costocarga);
            }else{
                costocarga=200000;
                System.out.println("El costo es: "+ costocarga);
            }

        }else{
            costocarga=350000;
            System.out.println("El costo es: "+ costocarga);
        }
    }
}