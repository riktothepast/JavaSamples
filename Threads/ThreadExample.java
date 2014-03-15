
public class ThreadExample implements Runnable{
 

        public void run(){
               
                for(int i=0; i < 5; i++){
                        System.out.println("Thread : " + i);
                       
                        try{
                                Thread.sleep(50);
                        }
                        catch(InterruptedException ie){
                                System.out.println("thread interrupted! " + ie);
                        }
                }
               
                System.out.println("thread finished!");
        }
       
        public static void main(String[] args) {
               
                Thread t1 = new Thread(new ThreadExample(), "Thread 1");
                Thread t2 = new Thread(new ThreadExample(), "Thread 2");

                t1.start();
                t2.start();
        }
}