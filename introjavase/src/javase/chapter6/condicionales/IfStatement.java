/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter6.condicionales;

/**
 *
 * @author PC
 */
public class IfStatement {
    public static void main(String[] args) {
        boolean isBlueToothEnabled = true;
        int fileSended = 3;
        
        if(isBlueToothEnabled)
        {
            fileSended++;
            System.out.println("Archivo enviado");
        }
        else
        {
            System.out.println("Verifique que su bluetooth este encendido");
        }
    }
}
