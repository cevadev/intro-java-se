/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter7.logicope;

/**
 *
 * @author PC
 */
public class LogicOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //Operadores de Asignacion
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente que b? -> " + (a != b));
        
        //Operadores relacionales
        System.out.println("a es mayor que b? -> " + (a > b));
        System.out.println("a es menor que b? -> " + (a < b));
        System.out.println("a es mayor igual que b? -> " + (a >= b));
        System.out.println("a es menor igual que b? -> " + (a <= b));
        
        //Operadores logicos en sentencias if
        if(a == b)
        {
            System.out.println("a y b son iguales");
        }
        else if(a != b)
        {
            System.out.println("a y b son distintos");
        }
    }
}
