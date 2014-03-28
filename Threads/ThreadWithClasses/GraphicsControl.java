import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class GraphicsControl extends JPanel implements Runnable,  KeyListener{

	private static final long serialVersionUID = 1L;
	private Graphics dbg;

	public Pelota pelota1, pelota2, pelota3;

	int threadSleepTime = 50;


	public GraphicsControl(){
		pelota1 = new Pelota(this, 10, 10);
		pelota2 = new Pelota(this, 300, 100);
		pelota3 = new Pelota(this, 10, 400);
	}

	public void paint(Graphics g) {
		update(g);	
	}
	
	public void update (Graphics g){


		g.setColor(Color.black);
		g.fillRect(0, 0, getSize().width, getSize().height);	
			pelota1.Draw(g);
			pelota2.Draw(g);
			pelota3.Draw(g);

		g.setColor(Color.WHITE);
		g.drawString("Current Thread Speed: "+threadSleepTime +" chage the value with keys 1 to 5", 20,20);
		repaint();

	}


	public void run(){

		while(true){

				pelota1.Update();
				pelota2.Update();
				pelota3.Update();


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