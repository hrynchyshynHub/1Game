package game1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel{
	   private final int B_WIDTH = 350;
	    private final int B_HEIGHT = 350;
	    private final int INITIAL_X = 40;
	    private final int INITIAL_Y = 40;
	    private final int DELAY = 300;

	    private Image star;
	    private Timer timer;
	    private int x, y;
	    
	public Board(){
		initBoard();
	}
	
	public void initBoard(){
			setBackground(Color.WHITE);
	        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	        setDoubleBuffered(true);
	        
	        loadImage();
	        
	        x = INITIAL_X;
	        y = INITIAL_Y;
	        
	        timer = new Timer();
	        timer.scheduleAtFixedRate(new ScheduleTask(),100, 25);     
	        
	}
	
	private void loadImage() {
	ImageIcon ii = new ImageIcon("star.png");
	star = ii.getImage();
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		drawStar(g);
	}

	public void drawStar(Graphics g) {
		g.drawImage(star, 0, 0, this);
		Toolkit.getDefaultToolkit().sync();
    }

	class ScheduleTask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			  x += 1;
	            y += 1;

	            if (y > B_HEIGHT) {
	                y = INITIAL_Y;
	                x = INITIAL_X;
	            }
	            
	            repaint();
		}
		
	}

	

	}
	

	

