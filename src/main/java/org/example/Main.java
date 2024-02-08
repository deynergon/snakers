package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Integer tamanoculebra=3;
       Integer tamanoterreno;
        Scanner lea = new Scanner(System.in);

        System.out.println("....snake....");
        System.out.println("digita el tamaño del terreno");
        tamanoterreno=lea.nextInt();

        System.out.println("1. comer");
        System.out.println("2. salir");

        int opcion;
        do {
            System.out.println("digite una opcion:");
            opcion=lea.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("comiendo");
                    tamanoculebra++;
                    if (tamanoculebra>tamanoterreno);
                    System.out.println("perdistes");
                    break;
                case 2:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;

            }
        }while (opcion!=2);


    }
}