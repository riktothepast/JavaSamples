import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class GraphicsControl extends JPanel implements Runnable,  KeyListener{

	private static final long serialVersionUID = 1L;
	private Graphics dbg;

	//declaramos nuestras 3 esferas.

	public Esfera pelota1, pelota2, pelota3;

	int threadSleepTime = 50;


	public GraphicsControl(){
		//Les asignamos diferentes valores a cada una al inicializarlas.

		pelota1 = new Esfera(this, 10, 10, 10,25, Color.WHITE);
		pelota2 = new Esfera(this, 300, 100,14,20, Color.RED);
		pelota3 = new Esfera(this, 10, 400,20,15,Color.CYAN);
	}

	public void paint(Graphics g) {
		update(g);	
	}
	
	public void update (Graphics g){
		// primero pintamos un rectangulo del total de la pantalla para "borrar" el dibujo anterior

		g.setColor(Color.black);
		g.fillRect(0, 0, getSize().width, getSize().height);	

			//ahora pintamos cada una de nuestras entidades

			pelota1.Draw(g);
			pelota2.Draw(g);
			pelota3.Draw(g);

		g.setColor(Color.WHITE);
		g.drawString("Current Thread Speed: "+threadSleepTime +" chage the value with keys 1 to 5", 20,20);
		repaint();

	}


	public void run(){

		while(true){

				//actualizamos nuestras entidades
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