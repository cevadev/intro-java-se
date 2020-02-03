/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter8.switchope;

/**
 *
 * @author PC
 */
public class WorkignSwitch {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        switch(colorModeSelected)
        {
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Debe seleccionar una opcion");
        }
    }
}
