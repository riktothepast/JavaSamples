import java.util.Scanner;

/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Leer input del usuario usando Scanner

La limitante de este metodo permite leer valores numericos o string.

*/

public class byScanner {   

   public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");

		int valNumerico=reader.nextInt();

		System.out.println("Ingrese texto: ");

		String stringValue=reader.next();

		System.out.println("ud. Ingreso: "stringValue+" "+valNumerico);
   
   }

}