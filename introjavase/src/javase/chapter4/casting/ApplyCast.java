/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter4.casting;

/**
 *
 * @author PC
 */
public class ApplyCast {
    public static void main(String[] args) {
        //en un año ubicamos 300 perros en hogares
        //cuantos perros ubicamos al mes?
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs); //2.5 PERROS, EN ESE CASO NO INTERESA LA PRECISION SINO LA ESTIMACION, EN ESTE
        //CASO PODEMOS APLICAR UNA OPERACION DE CAST
        int estimatedMonthlyDogs = (int)monthlyDogs;
        System.out.println(estimatedMonthlyDogs);
        
        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a / b);
    }
}
