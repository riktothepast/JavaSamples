/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Como crear un varias clases y llamarlas

*/

public class Principal {   
	
	// declaramos las clases que usaremos para las operaciones

	Addition suma;
	Product multiplicacion;
	Substraction resta;

	public Principal()
	{

	}

	// ejecutar con parametros "java principal op1 op2"
	
   public static void main(String[] args) {
   		// creamos una nueva instancia de principal y llamamos su metodo init, el cual recibe 2 parametros.
  		new Principal().init(Integer.parseInt(args[0].toString()),Integer.parseInt(args[1].toString()));
   }

// el metodo init recibe 2 enteros y crea nuevas instancias de las clases de operaciones.
   public void init(int x, int y)
   {
   		// inicializamos nuestras nuevas clases

   		suma = new Addition();
   		multiplicacion = new Product();
   		resta = new Substraction();

   		// llamamos a los metodos que realizan operaciones y mostramos resultados

   		System.out.println(suma.getAddition(x,y));
   		System.out.println(resta.getSubstraction(x,y));
   		System.out.println(multiplicacion.getProduct(x,y));
   }


}