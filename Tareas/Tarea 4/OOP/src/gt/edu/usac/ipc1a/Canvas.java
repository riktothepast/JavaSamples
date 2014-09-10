package gt.edu.usac.ipc1a;

import gt.edu.usac.ipc1a.objects.BouncyCircle;
import gt.edu.usac.ipc1a.objects.Circle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{

	private static final long serialVersionUID = 1L;
	Circle circle = new Circle();
	BouncyCircle bouncy= new BouncyCircle();
	
	public Canvas()
	{
		
	}

 	public void paint(Graphics g) {
  		update(g);	
  		g.setColor(Color.black);
		 g.fillRect(0, 0, getSize().width, getSize().height);	
		 circle.Draw(g);
		 bouncy.Draw(g);
		 repaint();
 	}
	
 	public void update (Graphics g){	
		 circle.Update();
		 bouncy.Update();
	 }

}