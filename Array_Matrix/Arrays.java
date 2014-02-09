/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Como declarar un arreglo en java y hacer operaciones con el.

*/

public class Arrays {   

   public static void main(String[] args) {

      /* un arreglo se declara asi:
         el tipo de variable que quermos y a la par [] para indicar que es un arreglo, 
         luego lo igualamos a una nueva variable de n posiciones.
      */

   	int[] arrayIntegers = new int[10];

      String[] arrayStrings = new String[10];

      // podemos recorrerlo en una estructura ciclica:

      for( int x =0; x< arrayIntegers.length; x++) // el .length (longitud) nos devuelve el tama~no de un arreglo.
      {
         arrayIntegers[x] = x;
      }

      // y luego podemos obtener los valores de la misma forma

       for( int x =0; x< arrayIntegers.length; x++) 
      {
         System.out.print(arrayIntegers[x]+", ");
      }

      // Tambien podemos conocer si una posicion que deseemos siempre  ycuando este dentro de los limites del array
      System.out.println("***");
      System.out.println("el valor en la posicion 4 del array es "+arrayIntegers[4]);

   }

}