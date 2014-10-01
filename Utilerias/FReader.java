import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Freader {
	

	public static void main(String args[]) throws IOException{
		 Scanner scan= new Scanner(System.in);
		    System.out.println("Ingrese la ruta al archivo que desea leer ej: C://User/Desktop/file.txt");

		    String text= scan.nextLine();

		    System.out.println(text);

		    new Freader(text);
	}
	
	public Freader(String path) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(path));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	        System.out.println(sb.toString());
	    } finally {
	        br.close();
	    }
		
	}
}