import java.awt.Color;
import java.awt.Graphics;

public class Esfera extends Objeto{

	public Esfera(GraphicsControl gC, int x, int y, int dim, int s, Color c){
		graphicsControl = gC;
		posX = x;
		posY = y;
		dimension = dim;
		speed = s;
		dirX = dirY = s;
		color = c;
	}

		/*
			Ahora sumamos la variable de velocidad a la direccion para tener movimients a velocidades distintas, ademas usamos la variable dimension para calcular el tamano
			del objeto e impedir que se "salga" de la pantalla.

		*/
		public void Update(){

		posX+=dirX;
		posY+=dirY;

		// make it bounce
		if(posX+dimension>graphicsControl.getSize().width){
			dirX = -speed;
		}
		if(posX<0){
			dirX = speed;
		}

		if(posY+dimension>graphicsControl.getSize().height){
			dirY = -speed;
		}
		if(posY<0){
			dirY = speed;
		}

	}

	/*
		Pintamos deacuerdo del color que declaramos en el constructor.
	*/

	public void Draw (Graphics g){
		g.setColor(color);
		g.fillOval(posX,posY,dimension,dimension);
	}
}