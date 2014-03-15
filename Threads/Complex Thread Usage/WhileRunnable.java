
public class WhileRunnable implements Runnable{
 
int sum = 0;
        public void run(){

                       while(true){
                            System.out.println(sum);
                        try{
                                Thread.sleep(1000);
                        }
                        catch(InterruptedException ie){
                                System.out.println("thread interrupted! " + ie);
                        }

                    sum ++;
               }
        }
       
}