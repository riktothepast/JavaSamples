package gt.edu.usac.ipc1a.objects;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float gravity;
	public float jumpImpulse;

	public Circle()
	{
		size = 20;
		gravity = 0.5f;
	}
	
	public void Update()
	{
		AplicarGravedad();
		DetectarSuelo();
		ActualizarPosicion();
	}
	
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
	}
	
	public void DetectarSuelo()
	{
		if(positionY+size > 600)
			System.out.println("Detecte Suelo");
	}
	
	public void AplicarGravedad()
	{
		velocityY += gravity;
	}
	
 	public void Draw (Graphics g){		 
 		
 		 g.setColor(Color.RED);
		 g.fillOval(positionX,positionY,size,size);
 	}

}