/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter2.operadores;

/**
 *
 * @author PC
 */
public class PrePostIncrement {
    public static void main(String[] args) {
        int marioLives = 5;
        
        //cuando gana una vida, se le da un gift
        int gift = 100 + marioLives++;
        System.out.println(gift);
        System.out.println(marioLives);
        
    }
}
