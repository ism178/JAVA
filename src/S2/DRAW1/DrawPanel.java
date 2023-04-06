// Erick Duran & Ivan Marin
// Lab 12a: Draw Shapes
// Mar 19, 2023

// Erick Duran & Ivan Marin
// Lab 12b: Draw Tree
// Mar 24, 2023

// Erick Duran & Ivan Marin
// Lab 13a: Draw Objects
// Apr 01, 2023

package S2.DRAW1;
import java.awt.Font;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;
import java.util.Random;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;

	private static final String GREY = null;

	private static final String DARK_GREY = null;

	private static final String DARK_BLUE = null;
	
	//Landscape Colors
	private final String DARK_SKIN = "704214";
	private final String DARK_SKY_BLUE = "1E1E90";




	private final String LIGHT_SKY_BLUE = "87CEFA";
	private final String LIGHT_BLUE = "3399FF";
	private final String MIDNIGHT_BLUE = "191970";
	private final String SNOW3 = "CDC9C8";
	private final String WHITE = "FFFFFF";
	private final String MY_WHITE_SMOKE = "F5F5F5";
	private final String LAWN_GREEN = "7CFC00";
	private final String MEDIUM_SPRING_GREEN = "00FA9A";
	private final String SPRING_GREEN = "00FF7F";
	
	private final String BROWN = "A52A2A";
	private final String DARK_GREEN = "006400";
	private final String FOREST_GREEN = "228B22";
	private final String GRAY = "808080";
	private final String GREEN = "008000";
	private final String MEDIUM_GREEN = "00CC00";
	
	private final String DARK_SLATE_GRAY = "2F4F4F";
	private final String FIREBRICK = "B22222";
	private final String INDIAN_RED = "CD5C5C";
	private final String MAROON = "800000";
	private final String MOCCASIN = "FFE4B5";
	private final String RED = "FF0000";
	private final String SADDLE_BROWN = "8B4513";
	private final String SIENNA = "A0522D";
	private final String SLATE_GRAY = "708090";
	private final String PERU = "CD853F";

	private final String BURLYWOOD = "DEB887";
	private final String YELLOW = "EEFF00";
	
	private final String LIGHT_GRAY = "E0E0E0";
	private final String WHITE_SMOKE = "F5F5F5";
	private final String GOLD = "FFD700";
	
	
	private final boolean dia = true;
//	private final boolean dia = false;
	

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12b
	 * Draw all your objects here.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer
		int time =1
		;
		switch (time) {
			case 1:
				day(g2);
				break;
			case 2:
				night(g2);
				break;
			default:
				// Do something else
				break;
		}
			
		
		
		
	}//end of method paintComponent(Graphics)
	private void night(Graphics2D g2) {
		g2.setColor(Color.decode("#" + LIGHT_BLUE));
		g2.fillRect(0,0,this.getWidth(),this.getHeight());
		g2.setColor(Color.decode("#" + LAWN_GREEN));
		g2.fillOval((-600), 550, this.getWidth() + 1200, 700);
		Random rand = new Random();

		for (int i = 0; i < 30; i++) {
			int x = rand.nextInt(getWidth() - 200) + 100; // Random X-coordinate within the frame width, with a margin of 100 pixels on both sides
			int y = rand.nextInt(getHeight() / 2) + 50; // Random Y-coordinate in the top half of the frame, with a margin of 50 pixels
			int size = rand.nextInt(50) + 50; // Random size between 50 and 100 pixels
			Ellipse2D.Double cloud = new Ellipse2D.Double(x, y, size, size / 2); // Create an ellipse with the random parameters
			g2.setColor(Color.WHITE); // Set the color to white
			g2.fill(cloud); // Draw the cloud
		}
		

		Spire s1 = new Spire(g2, 640, 400, .5, LIGHT_GRAY, WHITE_SMOKE);
		s1.draw();
		
		Spire s2 = new Spire(g2, 780, 400, .5, LIGHT_GRAY, WHITE_SMOKE);
		s2.draw();
		
		Spire s3 = new Spire(g2, 500, 500, 1, LIGHT_GRAY, WHITE_SMOKE);
		s3.draw();
		
		Spire s4 = new Spire(g2, 900, 500, 1, LIGHT_GRAY, WHITE_SMOKE);
		s4.draw();
				
		// Temple 
		Temple te1 = new Temple(g2, 876, 601, 1, WHITE, WHITE);

		te1.draw();

		Tree t1 = new Tree(g2, 1300, 600, 2, 2, BROWN, PERU);
		t1.draw();
		Tree t2 = new Tree(g2, 1100, 600, 2, 2, BROWN, PERU);
		t2.draw();
		Tree t3 = new Tree(g2, 300, 600, 2, 2, BROWN, PERU);
		t3.draw();
		Tree t4 = new Tree(g2, 100, 600, 2, 2, BROWN, PERU);
		t4.draw();
		
		// g2.setColor(Color.WHITE); // set color to white
		// g2.setFont(new Font("Times New Roman", Font.BOLD, 360)); // set font and font size
		// g2.drawString("FOCUS", getWidth() / 2 - 100, getHeight() - 50); // draw string
		
    // FOCUS text
    g2.setFont(new Font("Times New Roman", Font.BOLD, 250)); // set font and font size
    FontMetrics fm = g2.getFontMetrics(); // get font metrics
    int x = (getWidth() - fm.stringWidth("focus")) / 2; // calculate x-coordinate to center text
    int y = getHeight() - 50; // set y-coordinate at bottom of canvas
    g2.setColor(Color.WHITE); // set color to white
    g2.drawString("Focus", x, y); // draw the text at the calculated position
		


	}
	private void day(Graphics2D g2) {
		Random rand = new Random();

//DrawTree LADNSCAPE
g2.setColor(Color.decode("#" + LIGHT_BLUE));
g2.fillRect(0,0,this.getWidth(),this.getHeight());

g2.setColor(Color.decode("#" + LAWN_GREEN));
g2.fillOval((-600), 350, this.getWidth() + 1200, 700);

g2.setColor(Color.decode("#" + MEDIUM_GREEN));
g2.fillOval((-500), 400, this.getWidth() + 2000, 700);

// SUN
g2.setColor(Color.decode("#" + YELLOW));
g2.setStroke(new BasicStroke(2));
g2.drawOval(450, 100, 100, 100);
g2.fillOval(450, 100, 100, 100);

// CLOUDS
for (int i = 0; i < 20; i++) {
    int x = rand.nextInt(getWidth() - 200) + 100; // Random X-coordinate within the frame width, with a margin of 100 pixels on both sides
    int y = rand.nextInt(getHeight() / 3 - 100) + 50; // Random Y-coordinate in the top half of the frame, with a margin of 50 pixels, but avoid touching the landscape by having a bottom margin of 100 pixels
    int size = rand.nextInt(50) + 100; // Random size between 50 and 100 pixels
    Ellipse2D.Double cloud = new Ellipse2D.Double(x, y, size, size / 2); // Create an ellipse with the random parameters
    g2.setColor(Color.decode("#" + "CCCCCC")); // Set the color to gray
    g2.fill(cloud); // Draw the cloud
} 

		
		//DrawTree Trees
		// g2, x, y, escala, niveles, color tronco, color hojas) 
		
		Tree t1 = new Tree(g2, 1300, 600, 2, 2, BROWN, PERU);
		t1.draw();
		
		Tree t2 = new Tree(g2, 100, 500, 1, 3, BROWN, SPRING_GREEN);
		t2.draw();
	
		Tree t3 = new Tree(g2, 200, 375, 1, 4, BROWN , FOREST_GREEN);
		t3.draw();
		
		Tree t4 = new Tree(g2, 1000, 400, 1, 2, BROWN, GREEN);
		t4.draw();
			

		Spire s1 = new Spire(g2, 640, 400, .5, LIGHT_GRAY, WHITE_SMOKE);
		s1.draw();
		
		Spire s2 = new Spire(g2, 780, 400, .5, LIGHT_GRAY, WHITE_SMOKE);
		s2.draw();
		
		Spire s3 = new Spire(g2, 500, 500, 1, LIGHT_GRAY, WHITE_SMOKE);
		s3.draw();
		
		Spire s4 = new Spire(g2, 900, 500, 1, LIGHT_GRAY, WHITE_SMOKE);
		s4.draw();
		
		// Temple 
		Temple te1 = new Temple(g2, 876, 601, 1, WHITE, WHITE);
		te1.draw();


		for (int i = 0; i < 300; i++) {
			int x = rand.nextInt(getWidth());
			int y = rand.nextInt(getHeight());
			int size = rand.nextInt(10) + 1;
			SnowFlake sf = new SnowFlake(g2, x, y, 1, size, WHITE);
			sf.draw();
		}
        for (int i = 0; i < 30; i++) {
            int x = rand.nextInt(getWidth() - 50); // Random X-coordinate within the frame width
            int y = rand.nextInt(getHeight() - 50); // Random Y-coordinate within the frame height
            double scale = rand.nextDouble() + 0.5; // Random scale between 0.5 and 1.5
            Color birdColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Generate a random color
            Bird bird = new Bird(g2, x, y, scale, birdColor); // Create a bird with the random parameters and color
            bird.draw();
		}
		for (int i = 0; i < 30; i++) {
			int x = rand.nextInt(getWidth() - 50); // Random X-coordinate within the frame width
			int y = rand.nextInt(getHeight() - 50); // Random Y-coordinate within the frame height
			double scale = rand.nextDouble() + 0.5; // Random scale between 0.5 and 1.5
			Color bodyColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Generate a random color for body
			Color wingColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Generate a random color for wings
			Bat bat = new Bat(g2, x, y, scale, 30, 60, bodyColor, wingColor); // Create a bat with the random parameters and colors
			bat.draw();
		}
		
		
		// Draw road
		g2.setColor(Color.GRAY);
		Rectangle2D.Double road = new Rectangle2D.Double(0, getHeight() - 30, getWidth(), 30);
		g2.fill(road);
		
		int laneY = getHeight() - 50; // Y-coordinate of the lane

		for (int i = 0; i < 10; i++) {
			int x = rand.nextInt(getWidth() - 100); // Random X-coordinate within the frame width
			int width = 100; // Fixed width of 100 pixels
			int height = 50; // Fixed height of 50 pixels
			Color carColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Generate a random color
			Car car = new Car(g2, x, laneY, 1.5, width, height, String.format("%06x", carColor.getRGB() & 0x00FFFFFF)); // Create a car with the fixed scale, parameters and random color
			car.draw();
		}
		
		

		



















	}

}//end of class DrawPanel