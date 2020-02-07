/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter10.loops;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do
        {
            System.out.println("Seleccione el numero de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            
            //leemos del teclado
            Scanner input = new Scanner(System.in);
            response = Integer.valueOf(input.nextLine());
            switch(response)
            {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Usted quiere ver una pelicula");
                    break;
                case 2:
                    System.out.println("Usted quiere ver una serie");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        }
        while(response != 0);
        System.out.println("Termino la ejecucion del programa");
    }
}
