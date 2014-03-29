import java.awt.Color;
import java.awt.Graphics;

public abstract class Objeto{

	public GraphicsControl graphicsControl;
	public int posX =0; int posY=0;
	public int dirX,dirY;
	public int dimension;
	public int speed;
	public Color color;

	public Objeto(){}


	/*
		Recibe un objeto graphicsControl (el tablero), posiciones iniciales, dimension (funciona como alto y ancho), velocidad y color.
	*/

	public Objeto(GraphicsControl gC, int x, int y, int dim, int s, Color c){
		graphicsControl = gC;
		posX = x;
		posY = y;
		dimension = dim;
		speed = s;
		dirX = dirY = s;
		color = c;
	}

	public void Update(){

	}

	public void Draw (Graphics g){

	}


}