
import javax.swing.JFrame;

public class Main {
	
	public Main(){
		
	}

	public static void main(String args[]){

		JFrame jframe=new JFrame();
		jframe.setSize(800, 600);

		Primitives prim= new Primitives();
		BouncyBall bBall= new BouncyBall();
		
		jframe.add(prim);
		jframe.setVisible(true);
	}
	
}