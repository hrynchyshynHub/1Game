package Spacecraft;

import java.util.Random;

public class Pockemon extends Sprite {
	  private final int INITIAL_X = 400;

	    public Pockemon(int x, int y) {
	        super(x, y);
	        
	        initPockemon();
	    }

	    private void initPockemon() {
	    	Random r = new Random();
	    	loadImage("pokemon/"+ r.nextInt(150)+ ".png");
	    	getImageDimensions();
	    }

	    public void move() {

	        if (x < 0) {
	            x = INITIAL_X;
	        }

	        x -= 1;
	    }
}
