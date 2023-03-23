package S2.DRAW;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

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

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	
	
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12a
	 * Draw all your objects in the paintComponent method.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer
		//
		final Color MAROON = new Color(0x800000);
		final Color NAVY = new Color(0x000080);
		final Color LIME = new Color(0x00FF00);
		final Color GOLD = new Color(0xFFD700);
		final Color INDIGO = new Color(0x4B0082);
		final Color OLIVE = new Color(0x808000);
		final Color TEAL = new Color(0x008080);
		final Color DARK_CYAN = new Color(0x008B8B);
		final Color FOREST_GREEN = new Color(0x228B22);
		final Color ROSY_BROWN = new Color(0xBC8F8F);
		


		// RECTAGLE
		g2.setColor(MAROON);
		g2.setStroke(new BasicStroke(10));
		g2.drawRect(50, 50, 200, 100);
		g2.setColor(TEAL);

		g2.fillRect(50, 200, 200, 100);
		// OVAL		
		g2.setColor(NAVY);
		g2.setStroke(new BasicStroke(20));
		g2.drawOval(300, 50, 200, 100);
		g2.setColor(DARK_CYAN);
		g2.fillOval(300, 200, 200, 100);
		// TRIANGLE
		g2.setColor(LIME);
		g2.setStroke(new BasicStroke(5));
		int[] xPoints = {600, 650, 550};
		int[] yPoints = {50, 150, 150};
		g2.drawPolygon(xPoints, yPoints, 3);
		int[] xPointss = {600, 650, 550};
		int[] yPointss = {200, 300, 300};
		g2.setColor(FOREST_GREEN);
		g2.fillPolygon(xPointss, yPointss, 3);

		// POLIGONO
		g2.setColor(GOLD);
		g2.setStroke(new BasicStroke(2));
		int[] xPoints1 = {700, 725, 775, 800, 775, 725};
		int[] yPoints1 = {75, 100, 100, 75, 50, 50};
		g2.drawPolygon(xPoints1, yPoints1, 6);

		int[] xPoints2 = {700, 725, 775, 800, 775, 725};
		int[] yPoints2 = {275, 300, 300, 275, 250, 250};
		g2.setColor(ROSY_BROWN);
		g2.fillPolygon(xPoints2, yPoints2, 6);

		
		
		//
		g2.setColor(INDIGO);
		g2.setStroke(new BasicStroke(1));
		int[] xPointsss = {900, 950, 900, 850};
		int[] yPointsss = {170, 100, 30, 100};
		g2.drawPolygon(xPointsss, yPointsss, 4);

		int[] yPointsss1 = {370, 300, 230, 300};
		g2.fillPolygon(xPointsss, yPointsss1, 4);
		
		g2.setColor(OLIVE);
		g2.setStroke(new BasicStroke(2));
		g2.drawOval(50, 350, 100, 100);
		g2.fillOval(350, 350, 100, 100);























		/*
		 * Use this section to write your code.
		 * DrawShapes
		 * Draw at least 6 shapes in BOTH draw and fill formats using methods found in the Graphics class and/or the Graphics2D class.
		 * In other words, if you draw an empty rectangle, you should also draw a filled rectangle.  That counts as one (1) shape.
		 * The empty and filled versions of the shape should be at different orientations.
		 * One of the shapes MUST be a triangle.
		 * Each shape should be a different color.  An empty and a filled rectangle may be the same color, but they must be a different color from an empty and filled triangle.
		 * At least one of the colors should NOT be a standard color from the COLOR palette.
		 * Each empty shape should have a different stroke size.
		 * Be sure all shapes are located such that they can all be seen.
		 */
		

		
	}//end of method paintComponent(Graphics)

}//end of class DrawPanel