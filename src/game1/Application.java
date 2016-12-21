package game1;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application extends JFrame{
	public Application(){
		initUI();
	}
	
	public void initUI(){
		setTitle("My Game");
		setSize(250, 200);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add(new Board());
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Application ex = new Application();
				ex.setVisible(true);
			}
		});
	}
}
