/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter1.variables;

/**
 *
 * @author PC
 */
public class variables02 {
    public static void main(String[] args) {
        int hextra = 30;
        int qtyHExtra = 2;
        int hExtraTotal = hextra * qtyHExtra;
        
        int salary = 1000;
        int bono = 200;
        int ingresos = salary + bono + hExtraTotal;
        
        //descuentos
        int pension = 50;
        int comida = 45;
        int egresos = pension + comida;
        
        String employee = "Juan Antonio Gomez";
        
        salary = ingresos - egresos;
        System.out.println("Salario de " + employee + " es: " + salary);
    }
}
