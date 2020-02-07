/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.chapter11.arays;

/**
 *
 * @author PC
 */
public class WorkingArrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        
        //Arreglo multidimensionales
        // String[][] cities = new String[renglones][columns]
        /** column 1     column2
         * +-------------------------+
         * | Country   | City        |
         * --------------------------+
         * | Mexico    | CDMX        |  renglon 4
         * | Mexico    | Guadalajara |  renglon 3
         * | Colombia  | Bogota      |  renglon 2
         * | Colombia  | Medellin    |  renglon 1
         * +-------------------------+
         **/
        String[][] cities = new String[4][2];
        int[][][] number = new int[2][2][2]; //2 renglones, 2 columnas, 2 paginas
        int[][][][] numbers4 = new int[2][2][2][2]; //arregloes hasta 4 dimensiones
        
        //LECTURA DE LOS ELEMENTOS EN ARRAYS
        /**   INDICE
         * +-----------+
         *2|           |
         * +-----------+
         *1|           |
         * +-----------+
         *0|           |
         * +-----------+
         *       0
         **/
        
        /**  2 DIMENSIONES (La lecutra es de izquierda a dereche y de abajo hacia arriba)
         * +-------------------------+
         *2|           |             |
         * +-------------------------+
         *1|           |             |
         * +-------------------------+
         *0|           |             |
         * --------------------------+
         *      0             1
         **/
        
        
        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        
        //For anidados
        /**
        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }
        
        System.out.println("");
        System.out.println("");
        
        for(String androidVersion : androidVersions)
        {
            System.out.println(androidVersion);
        }
        * */
        
        System.out.println("");
        System.out.println("");
        
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guagalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";
        
        /*
        for (int i = 0; i < cities.length; i++) //con este for imprimimos los renglones
        {
            for (int j = 0; j < cities[i].length; j++) 
            {
                System.out.println(cities[i][j]);
            }
        }
        */
        
        //Imprimir las ciudades usando foreach
        for(String[] pair : cities)
        {
            for(String name : pair)
            {
                System.out.println(name);
            }
        }
        
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        
        /*
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        */
        
        
    }
}
