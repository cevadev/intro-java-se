/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter5.ejercicios;

/**
 *
 * @author PC
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //calculo excato / casteo implicito
        char c = 'z';
        int letter = c;
        
        int i = 250;
        //calculo exacto / casteo explicito
        long iLong = i;
        //calculo estimado
        short iShort = (short)iLong;
        
        double d = 301.067;
        //calculo estimado / casteo explicito
        long dLong = (long)d;
        
        int num = 100;
        //calculo exacto / casteo explicito
        double numD = (double) num + 5000.66;
        float numF = (float)numD;
        
        int num2 = 737 * 100;
        //casteo explicito
        byte numB = (byte)num2;
        
        double num3 = 298.638 / 25;
        // calculos estimado / casteo explicito
        long numL= (long)num3;
        
    }
}
