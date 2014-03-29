import java.awt.Color;
import java.awt.Graphics;

public class Jugador{

	public GameBoard gameBoard;
	public int posX =0; int posY=0;
	public int dirX,dirY;
	public int dimension;
	public int speed;
	public Color color;

	public Jugador(){}

	public Jugador(GameBoard gC, int x, int y, int dim, Color c){
		gameBoard = gC;
		posX = x;
		posY = y;
		dimension = dim;
		dirX = dirY ;
		color = c;
		System.out.println(posX+" "+posY);
	}

	public void Update(String dir){
		if(dir.equals("arriba")){
			posY -=dimension;
		}
		if(dir.equals("abajo")){
			posY +=dimension;
		}
		if(dir.equals("izquierda")){
			posX -=dimension;
		}
		if(dir.equals("derecha")){
			posX +=dimension;
		}
	}

	public void Draw (Graphics g){
		g.setColor(color);
		g.fillRect(posX,posY,dimension,dimension);
	}


}