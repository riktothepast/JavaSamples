import java.util.Scanner;

public class InputRunnable implements Runnable{
 
                       Scanner reader = new Scanner(System.in);

        public void run(){
        	while(true){
                       System.out.println("Ingrese un numero: ");

						int valNumerico=reader.nextInt();

								System.out.println("ud. Ingreso: "+valNumerico);


                        try{
                                Thread.sleep(50);
                        }
                        catch(InterruptedException ie){
                                System.out.println("thread interrupted! " + ie);
                        }
                
               }
        }
       
}