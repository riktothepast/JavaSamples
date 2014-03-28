import java.awt.Color;
import java.awt.Graphics;

public class Pelota{


	GraphicsControl graphicsControl;
	int posX =0; int posY=0;
	int dirX = 1;
	int dirY = 1;


	public Pelota(GraphicsControl gC, int x, int y){

		graphicsControl = gC;
		posX = x;
		posY = y;
	}

	public void Update(){

		posX+=dirX;
		posY+=dirY;

		// make it bounce
		if(posX>graphicsControl.getSize().width){
			dirX = -1;
		}
		if(posX<0){
			dirX = 1;
		}

		if(posY>graphicsControl.getSize().height){
			dirY = -1;
		}
		if(posY<0){
			dirY = 1;
		}

	}

	public void Draw (Graphics g){
		g.setColor(Color.RED);
		g.fillOval(posX,posY,100,100);
	}


}