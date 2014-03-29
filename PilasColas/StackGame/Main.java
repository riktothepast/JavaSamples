/*
IPC1B, this class creates a jFrame with a jpanel of the stack game.
*/
import javax.swing.JFrame;


public class Main{
 
       
        public static void main(String[] args) {
               JFrame jframe=new JFrame();
				jframe.setSize(800, 600);

				GameBoard gameBoard= new GameBoard();			
				jframe.add(gameBoard);
				jframe.setVisible(true);
				jframe.addKeyListener(gameBoard);
				gameBoard.init();
                Thread t1 = new Thread(gameBoard, "Thread 1");

                t1.start();
        }
}