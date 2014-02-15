/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Como declarar un arreglo bidimensional en java y hacer operaciones con el.

*/

public class Matrix {   

   public static void main(String[] args) {

      /* una matriz se declara asi:
         Se trabaja como si fueran 2 arreglos juntos,
         solo indicamos que es una matriz usando [][]
         podemos tener matrices de mxn
      */

   	int[][] matrixIntegers = new int[10][10];

      String[][] matrixStrings = new String[10][10];

      // podemos recorrerlo en una estructura ciclica:

      for( int x =0; x< matrixIntegers.length; x++) // el .length (longitud) en este caso es m 
      {
            for ( int y = 0; y< matrixIntegers[0].length; y++) // aca usamos el [0].length para obtener n en el arreglo
            {
               matrixIntegers[x][y] = x*y;
            }
      }

      // y luego podemos obtener los valores de la misma forma

      for( int x =0; x< matrixIntegers.length; x++) 
      {
            for ( int y = 0; y< matrixIntegers[0].length; y++)
            {
              System.out.print( matrixIntegers[x][y]+", " );
            }
            System.out.println();
      }

      // Tambien podemos conocer si una posicion que deseemos siempre  ycuando este dentro de los limites del array
      System.out.println("***");
      System.out.println("el valor en 2,4 es "+matrixIntegers[2][4]);

   }

}