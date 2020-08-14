package gui;

//importing JAVA's Processing Library
import processing.core.PApplet;

public class Smile2 extends PApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setup()
	{
		//setting up the canvas
		size(400, 400);
		background(200, 200, 200);
		
	}
	
	public void draw()
	{
		//drawing circles and eclipse to make a smiley finally
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		ellipse(280, 130, 50, 70);
		
		noFill();
		arc(200, 280, 75, 75, 0, PI);
	}
	
}
/** For more visit JAVA documentation page*/