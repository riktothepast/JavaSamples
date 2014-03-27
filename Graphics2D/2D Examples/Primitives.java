import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JPanel;

public class Primitives extends JPanel{

	private static final long serialVersionUID = 1L;
	private Graphics dbg;
	
 	public void paint(Graphics g) {
  		update(g);	
 	}
	
 	public void update (Graphics g){


   		 g.setColor(Color.RED);
		 g.fillRect(0, 0, getSize().width, getSize().height);	
		 
		 g.setColor(Color.GREEN);
		 g.fillRect(40, 40, 40, 40);

		 g.setColor(Color.BLUE);
		 g.fillOval(getSize().width/2, getSize().height/2,20,30);

		 g.setColor(Color.YELLOW);
		 g.drawLine(10,10,10,100);
		 repaint();
	 }

}