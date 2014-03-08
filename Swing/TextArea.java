
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextArea {
	JTextField textfield1;     
	JFrame jframe;

     public static void main(String args[]){
 		new TextArea().init();
 	}
 	
 	public void init(){
 		//adding a new jframe
 		
 		jframe = new JFrame();
		jframe.setSize(800, 600);
		jframe.setVisible(true);

 		textfield1=new JTextField();
 	    textfield1.setBounds(10,10,200,30);
 	    
 	    jframe.add(textfield1);
 	    
 	}
}
