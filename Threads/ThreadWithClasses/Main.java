/*
IPC1B, this class creates a jpanel with a thread to control the speed of 2d primitives rendering.
*/
import javax.swing.JFrame;


public class Main{
 
       
        public static void main(String[] args) {
               JFrame jframe=new JFrame();
				jframe.setSize(800, 600);

				GraphicsControl graphicsControl= new GraphicsControl();			
				jframe.add(graphicsControl);
				jframe.setVisible(true);
				jframe.addKeyListener(graphicsControl);
                Thread t1 = new Thread(graphicsControl, "Thread 1");

                t1.start();
        }
}