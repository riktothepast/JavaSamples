import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

import java.util.*;

public class GameBoard extends JPanel implements Runnable,  KeyListener{

	private static final long serialVersionUID = 1L;
	private Graphics dbg;

	//declaramos nuestra pila
	Stack<String> pila = new Stack<String>();
	Queue<String> cola = new LinkedList<String>();
	//declaramos nuestra cola

	int threadSleepTime = 150;
	boolean runLogic;
	String stackInst, queueInst;

	Jugador jugadorPila, jugadorCola;
	public GameBoard(){
			
	}

	public void init(){
				jugadorPila = new Jugador(this,getSize().width/2 -20, getSize().height/2 -20, 40, Color.RED);
				jugadorCola = new Jugador(this,getSize().width/2 -20, getSize().height/2 -20, 40, Color.YELLOW);
	}

	public void paint(Graphics g) {
		update(g);	
	}
	
	public void update (Graphics g){
		// primero pintamos un rectangulo del total de la pantalla para "borrar" el dibujo anterior

		g.setColor(Color.black);
		g.fillRect(0, 0, getSize().width, getSize().height);	

			//ahora pintamos cada una de nuestras entidades
		jugadorPila.Draw(g);
		jugadorCola.Draw(g);

		g.setColor(Color.WHITE);
		g.drawString("Current Thread Speed: "+threadSleepTime +", chage the value with keys 1 to 5," + "  Is Game Running? " + runLogic, 20,20);
		g.drawString("Stack instruction: "+stackInst +" Queue instruction: "+queueInst, 20,40);

		repaint();

	}


	public void run(){

		while(true){

			if(!pila.empty()&&runLogic){
				stackInst = pila.pop();
				jugadorPila.Update(stackInst);
			}
			if(cola.size()>0&&runLogic){
				queueInst = cola.poll();
				jugadorCola.Update(queueInst);
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
		threadSleepTime = 20;
	}
	if(arg0.getKeyChar()=='2'){	
		threadSleepTime = 30;
	}
	if(arg0.getKeyChar()=='3'){	
		threadSleepTime = 50;
	}
	if(arg0.getKeyChar()=='4'){	
		threadSleepTime = 100;
	}
	if(arg0.getKeyChar()=='5'){	
		threadSleepTime = 150;
	}

	if(arg0.getKeyChar()=='r'){
		runLogic = runLogic?false:true;
	}

	//entity movement
	if(arg0.getKeyChar()=='w'){	
		pila.push("arriba");
		cola.add("arriba");
	}
	if(arg0.getKeyChar()=='a'){	
		pila.push("izquierda");
		cola.add("izquierda");
	}
	if(arg0.getKeyChar()=='s'){	
		pila.push("abajo");
		cola.add("abajo");
	}
	if(arg0.getKeyChar()=='d'){	
		pila.push("derecha");
		cola.add("derecha");
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