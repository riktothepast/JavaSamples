package graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Screen extends JPanel implements KeyListener{
	/**
	 * Codigo ejemplo tutorial de Java2D, USAC, 2012.
	 * Usenlo para su juego, traten de implementar y mejorar eso ;).
	 * Ricardo Illescas, rikarudoiresukas@gmail.com
	 */
	private static final long serialVersionUID = 1L;
	private Graphics dbg;
	private Image dbImage = null;
	public String arreglo[][]=new String[20][20];
	int Posx,Posy;
	boolean gameover=false;
	boolean romper=false;
	public Screen(){
		
		//llenamos el arreglo con posiciones "vacias", hacemos esto para evitar punteros vacios al recorrer la matriz
		for(int x=0;x<20;x++){
			for(int y=0;y<20;y++){
				arreglo[x][y]="0";
			}
		}
		//agregamos unas "paredes"
		for(int x=0;x<20;x++){
			arreglo[x][0]="1";
			arreglo[x][19]="1";
			arreglo[0][x]="1";
			arreglo[19][x]="1";
		}
		
		//agregamos al jugador
		arreglo[10][10]="p";
		Posx=10;
		Posy=10;	
		
		//agregamos objetos
		arreglo[15][15]="e";		
		arreglo[17][17]="t";
		arreglo[9][9]="t";
		arreglo[5][9]="t";
		arreglo[2][9]="t";
		arreglo[2][4]="t";
		
	}

 	public void paint(Graphics g) {
  		update(g);	
 	}
	
 	public void update (Graphics g){
 		/*
 		 * Se crea una nueva imagen donde dibujaremos 1ero, para evitar el flickering, a esto se le llama
 		 * Doble Buffer.
 		 */
		 dbImage = createImage(getSize().width, getSize().height);
		 dbg=dbImage.getGraphics();
		 dbg.setColor(Color.black);
		 dbg.fillRect(0, 0, getSize().width, getSize().height);	
		 dbg.setColor(Color.GREEN);
		 //si aun estamos con vida pintamos, de lo contrario sacamos un game over.
		 if(!gameover){
		 for(int x=0;x<20;x++){
				for(int y=0;y<20;y++){
					if(arreglo!=null){
						if(arreglo[x][y]=="0"){
							dbg.setColor(Color.GREEN);
							dbg.fillRect(x*25, y*25, 20, 20);
						}
					if(arreglo[x][y]=="1"){
						dbg.setColor(Color.BLUE);
	//estamos multiplicando por 25 para "separar" las imagenes,este valor puede ser el que nosotros definamos
						dbg.fillRect(x*25, y*25, 20, 20);
					}
					if(arreglo[x][y]=="p"){
						dbg.setColor(Color.white);
						dbg.fillOval(Posx*25, Posy*25, 20, 20);
					}
					if(arreglo[x][y]=="e"){
						dbg.setColor(Color.red);
						dbg.fillOval(x*25, y*25, 20, 20);
					}
					if(arreglo[x][y]=="t"){
						dbg.setColor(Color.orange);
						dbg.fillRect(x*25, y*25, 20, 20);
					}
					if(arreglo[x][y]=="g"){
						dbg.setColor(Color.magenta);
						dbg.fillOval(x*25, y*25, 20, 20);
					}
					}
				}
			}
		 }else{
			 
			 dbg.drawString("GAME OVER", 50, 50);
		 }
		 g.drawImage(dbImage, 0, 0, null);
		 repaint();
	 }


	@Override
	public void keyPressed(KeyEvent arg0) {
/* movemos al "personaje" por las posiciones de la matriz logica, comparando lo que encontremos.
*
*
*/
System.out.println(arg0.getKeyChar());
if(arg0.getKeyChar()=='x'){
	romper=true;
}

	if(arg0.getKeyChar()=='a'){	
		
		if(arreglo[Posx-1][Posy]=="0"){	
			arreglo[Posx][Posy]="0";
			arreglo[Posx-1][Posy]="p";
			Posx-=1;
		}
		if(arreglo[Posx-1][Posy]=="e"){	
			gameover=true;
		}
		if(arreglo[Posx-1][Posy]=="t"&&romper){	
			AddObject(Posx-1,Posy);
		}
		
	}
	if(arg0.getKeyChar()=='d'){
		
		if(arreglo[Posx+1][Posy]=="0"){	
			arreglo[Posx][Posy]="0";
			arreglo[Posx+1][Posy]="p";
			Posx+=1;
		}
		if(arreglo[Posx+1][Posy]=="e"){	
			gameover=true;
		}
		if(arreglo[Posx+1][Posy]=="t"&&romper){	
			AddObject(Posx+1,Posy);
		}
	
	}
	if(arg0.getKeyChar()=='s'){	
		
		if(arreglo[Posx][Posy+1]=="0"){	
			arreglo[Posx][Posy]="0";
			arreglo[Posx][Posy+1]="p";
			Posy+=1;
		}
		if(arreglo[Posx][Posy+1]=="e"){	
			gameover=true;
		}
		if(arreglo[Posx][Posy+1]=="t"&&romper){	
			AddObject(Posx,Posy+1);
		}
	
	}
	if(arg0.getKeyChar()=='w'){	
		if(arreglo[Posx][Posy-1]=="0"){	
			arreglo[Posx][Posy]="0";
			arreglo[Posx][Posy-1]="p";
			Posy-=1;
		}
		if(arreglo[Posx][Posy-1]=="e"){	
			gameover=true;
		}
		if(arreglo[Posx][Posy-1]=="t"&&romper){	
			AddObject(Posx,Posy-1);
		}
	
	}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyChar()=='x'){
			romper=false;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void AddObject(int x, int y){
		/*
		*agregamos un objeto al "azar" usamos la funcion random de Java para generar un numero entre 0 y 3
		*dependiendo su valor lo agregamos a la matriz.
		*/
		double val=(Math.random()*3);
		int var = (int)val;
		
		System.out.println(var);
		switch(var){
		case 0:
			arreglo[x][y]="0";
			break;
		case 1:
			arreglo[x][y]="e";
			break;
		case 2:
			arreglo[x][y]="g";
			break;
		}

		
	}
	
}