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
public class Ejercicio1 {
    public static void main(String[] args) {
        String papa = "Fernando";
        String mama = "Maria";
        String hermana = "Romina";
        String hermano = "Carlos";
        
        double pesoPapa = 79;
        double pesoMama = 60.5;
        double pesoHermana = 65;
        double pesoHermano = 73.5;
        
        double alturaPapa = 1.78;
        double alturaMama = 1.66;
        double alturaHermana = 1.67;
        double alturaHermano =  1.70;
        
        int imcPapa = (int)(pesoPapa / Math.pow(alturaPapa, 2));
        int imcMama = (int)(pesoMama / Math.pow(alturaMama, 2));
        int imcHermana = (int)(pesoHermana / Math.pow(alturaHermana, 2));
        int imcHermano = (int)(pesoHermano / Math.pow(alturaHermano, 2));
        
        System.out.println("Mi padre se llama: " + papa + " su Indice de masa corporal es: " + imcPapa);
        System.out.println("Mi madre se llama: " + mama + " su Indice de masa corporal es: " + imcMama);
        System.out.println("Mi hermana se llama: " + hermana + " su Indice de masa corporal es: " + imcHermana);
        System.out.println("Mi hermano se llama: " + hermano + " su Indice de masa corporal es: " + imcHermano);
    }
}
