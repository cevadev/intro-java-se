/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter9.functions;

/**
 *
 * @author PC
 */
public class WorkingFunctions {
    public static double circleArea(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
    public static double sphereArea(double r)
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
    public static double sphereVolumen(double r)
    {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
    
    /** 
     * Descripcion: Funcionque especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity Cantidad de dinero
     * @param currency  Tipo de moneda: Solo acepta Pesos Mexicanos y Pesos Colombianos
     * @return quantity Devuelve la cantidad actualizada en dolares.
     **/
    public static double convertToDolar(double quantity, String currency)
    {
        switch(currency)
        {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.0031;
                break;
        }
        return quantity;
    }
    
    public static void main(String[] args) {
        System.out.println("El area del circulo es: " + circleArea(3));
        convertToDolar(500, "MXN");
    }
}
