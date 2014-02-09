/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Leer input del usuario usando  System.console

permite ingresar todo tipo de valores y almacenarlos en una variable tipo String.

*/

public class Console {   

   public static void main(String[] args) {

      String input = System.console().readLine("Ingrese los datos que desee:");

   	System.out.println(input);

   }

}