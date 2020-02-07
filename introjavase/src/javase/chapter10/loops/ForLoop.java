/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter10.loops;

/**
 *
 * @author PC
 */
public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void printSOS()
    {
        System.out.println("..._ _ _ ...");
    }
    
    public static boolean turnOnOffLight()
    {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }    
    
    public static void main(String[] args) {
        //encendemos o apagamos la lamara
        turnOnOffLight();
        
        //si esta encendida, imprimimos el mensaje sos con la lampara 10 veces
        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
    }
}
