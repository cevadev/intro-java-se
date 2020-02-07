/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter12.examen;

/**
 *
 * @author PC
 */
public class Examen {
    public static void ask2()
    {
        int x = 1;
        while(x <= 10)
        {
            System.out.println(++x);
        }
    }
    
    public static void main(String[] args) {
        ask2();

    }
}
