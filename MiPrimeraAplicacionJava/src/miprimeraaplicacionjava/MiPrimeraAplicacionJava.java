/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacionjava;

import java.util.Scanner;

/**
 *
 * @author Joseph Marrero
 */
public class MiPrimeraAplicacionJava {

    public static String nombre;
    public static Scanner sc;
    public static int X, Y, opcionElegida, resultado;
    public static boolean continuar = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        // TODO code application logic here
        System.out.println("Prueba en casa de Java");
        System.out.print("Introduzca Nombre:   ");

        nombre = sc.nextLine();
        System.out.println("Nombre es " + nombre);

        menu();

        while (continuar) {
        dataEntryProcesar();
        }
        
        
           System.out.println("Su resultado es : " + resultado);

    }//Cierra Clase Main

    public static int solicitarDatoX() {

        System.out.println("Introduzca dato de 'X':    ");

        X = sc.nextInt();

        solicitarDatoY();

        return opcionElegida;
    }

    public static int solicitarDatoY() {

        System.out.println("Introduzca datos de'Y':    ");

        Y = sc.nextInt();
        return opcionElegida;
    }

    public static void menu() {
        System.out.println("*******Menu de opciones******");
        System.out.println("1.- Sumar (x+y)");
        System.out.println("2.- Restar (x-y)");
        System.out.println("3.- Multiplicar (x*y)");
        System.out.println("4.- Dividir (x/y)");
        System.out.println("5.- Salir");
    }

    public static void dataEntryProcesar() {

        opcionElegida = sc.nextInt();
        opcionElegida = (opcionElegida > 0 && opcionElegida <= 4) ? solicitarDatoX() : opcionElegida;

        switch (opcionElegida) {

            case 1:
                resultado = X + Y;
                break;

            case 2:
                resultado = X - Y;
                break;

            case 3:
                resultado = X / Y;
                break;

            case 4:
                resultado = X * Y;
                break;
            case 5:
                continuar = true;

            default: {
                System.out.println("opcion no valida");
            }

        }

      continuar = (opcionElegida > 0 && opcionElegida <= 4) ? false : continuar;

    }

}//Cierra Clase
