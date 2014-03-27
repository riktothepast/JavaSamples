import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class GraphicsControl extends JPanel implements Runnable,  KeyListener{

	private static final long serialVersionUID = 1L;
	private Graphics dbg;
	int posX =0; int posY=0;
	int dirX = 1;
	int dirY = 1;
	int threadSleepTime = 50;
	public void paint(Graphics g) {
		update(g);	
	}
	
	public void update (Graphics g){


		g.setColor(Color.black);
		g.fillRect(0, 0, getSize().width, getSize().height);	
		g.setColor(Color.RED);
		g.fillOval(posX,posY,100,100);
		g.setColor(Color.WHITE);
		g.drawString("Current Thread Speed: "+threadSleepTime +" chage the value with keys 1 to 5", 20,20);
		repaint();

	}


	public void run(){

		while(true){
		posX+=dirX;
		posY+=dirY;

		// make it bounce
		if(posX>getSize().width){
			dirX = -1;
		}
		if(posX<0){
			dirX = 1;
		}

		if(posY>getSize().height){
			dirY = -1;
		}
		if(posY<0){
			dirY = 1;
		}


		try{
			Thread.sleep(threadSleepTime);
		}
		catch(InterruptedException ie){
			System.out.println("thread interrupted! " + ie);
		}

	}
}


/*
 Keyboard control
*/

	@Override
	public void keyPressed(KeyEvent arg0) {

	if(arg0.getKeyChar()=='1'){	
		threadSleepTime = 10;
	}
	if(arg0.getKeyChar()=='2'){	
		threadSleepTime = 20;
	}
	if(arg0.getKeyChar()=='3'){	
		threadSleepTime = 30;
	}
	if(arg0.getKeyChar()=='4'){	
		threadSleepTime = 40;
	}
	if(arg0.getKeyChar()=='5'){	
		threadSleepTime = 50;
	}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}