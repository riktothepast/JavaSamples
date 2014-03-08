package main;

import graphics.Screen;

import javax.swing.JFrame;

public class Main {
	/**
	 * Codigo ejemplo tutorial de Java2D, USAC, 2012.
	 * Usenlo para su juego, traten de implementar y mejorar eso ;).
	 * Ricardo Illescas, rikarudoiresukas@gmail.com
	 */
	
	public Main(){
		
	}

	public static void main(String args[]){
		/*
		 * un nuevo frame donde pondremos nuestro panel de dibujo
		 * agregamos un keylistener
		 */
		JFrame jframe=new JFrame();
		jframe.setSize(800, 600);
		Screen scr= new Screen();
		jframe.add(scr);
		jframe.setVisible(true);
		jframe.addKeyListener(scr);
	}
	
}