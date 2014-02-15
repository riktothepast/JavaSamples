/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Formas de realizar un numero aleatorio.

*/
import java.util.Random;

public class random {   

   public static void main(String[] args) {

   	// usando java random, de la libreria java.util.Random (necesita el import)

    Random aleatorio = new Random();

    int randomNum = aleatorio.nextInt(5);

    System.out.println(randomNum);

    // usando math.random:

    randomNum =  (int)(Math.random()*5); //hacemos un cast de un punto flotante a entero.

    System.out.println(randomNum);

   }

}