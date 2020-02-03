/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter3.math;

/**
 *
 * @author PC
 */
public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //devuelve de un entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //numero elevado a la potencia de otro numero
        System.out.println(Math.pow(x, y));
        //retorna el numero mayor entre dos datos
        System.out.println(Math.max(y, x));
        //retora la raiz cuadrada
        System.out.println(Math.sqrt(y));
        //calcular el area de un circulo: pi * radio2
        System.out.println(Math.PI * Math.pow(y, 2));
        //area de una esfera: 4PI * radios2
        System.out.println((4*Math.PI) * Math.pow(y, 2));
        //volumen de una esfera: (4/3)*PI *radio3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
