
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Jframe {
	JFrame jframe;
	JLabel etiqueta;
	JButton boton;
	
	public static void main(String args[]){
		new Jframe().init();
	}
	
	public void init(){
		jframe = new JFrame();
		jframe.setSize(800, 600);
		jframe.setVisible(true);
		etiqueta = new JLabel();
		etiqueta.setText("soy una etiqueta");
		etiqueta.setBounds(200, 100, 100, 50);
		jframe.add(etiqueta);
	}

}
