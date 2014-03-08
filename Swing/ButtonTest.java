

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest {

	JFrame jframe;
	JButton boton;
	
	public static void main(String args[]){
		new ButtonTest().init();
	}
	
	public void init(){
		jframe = new JFrame();
		jframe.setSize(800, 600);
		jframe.setVisible(true);
		boton = new JButton();
		boton.setText("Presioname");
		
		//adding a listener
		boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("Presionaste un botton");
            }
        });    

		jframe.add(boton);
	}
	
}
