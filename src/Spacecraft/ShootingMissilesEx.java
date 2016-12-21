package Spacecraft;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShootingMissilesEx extends JFrame {

    public ShootingMissilesEx() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
      
        
        setTitle("Mario vs Pockemon");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame mainFrame = new JFrame("Menu");
                mainFrame.setSize(300, 400);
                mainFrame.setVisible(true);
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setBackground(Color.WHITE);
                mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                JButton butoon = new JButton("Start");
                JButton button1 = new JButton("Exit");
                JPanel panel = new JPanel();
                
                panel.add(butoon);
                panel.add(button1);
                mainFrame.add(panel);
                butoon.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						ShootingMissilesEx ex = new ShootingMissilesEx();
		                ex.setVisible(true);
		                mainFrame.dispose();
					}
				});
                button1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						mainFrame.dispose();
					}
				});
                
                
            }
        });
    }
}
