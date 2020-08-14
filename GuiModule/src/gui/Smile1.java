package gui;

//importing JAVA's Processing ibrary
import processing.core.PApplet;

public class Smile1 extends PApplet{
	
	public void setup() {
		
		// Setting up the size of the canvas using pre-defined method
		size(400, 400);
		
		// using predefined method "background(red, green, blue)"
		background(0,100,100);
	}
	
	public void draw() {
		
		// pre-defined method "circle(x, y, radius)"
		fill(0, 200, 200);//fill the color before defining the ecllipse
		ellipse(200, 200, 200, 200);
		fill(255, 255, 255);
		ellipse(150, 180, 30, 40);
		fill(255,255,255);
		ellipse(250, 180, 30, 40);
		
		arc(200, 240, 80, 60, 0, PI, CHORD);
		
	}

}
/** For more visit JAVA documentation page*/