// Erick Duran & Ivan Marin
// Lab 13a: Draw Objects
// Apr 01, 2023

package S2.DRAW1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/*
 * Temple Class.  Extends LandscapObject Class.
 * Note this class inherits 3 protected attributes from LandscapeObject for convenience in coding methods.
 * protected int currentX
 * protected int currentY
 * protected Graphics2D
 */

public class Temple extends LandscapeObject{
	//Attributes

	private String baseColor; 				// The Hex color of the bases, including the preceding '#'. Set in the constructor.
	private String headColor; 				// The Hex color of the heads, including the preceding '#'. Set in the constructor.
	private int baseWidth = 323;			// The base width in pixels.  
	private int baseHeight = 102;			// The base height in pixels.  
	private int headWidth = 324;				// The head width in pixels.  
	private int headHeight = 130;			// The head height in pixels.  
	private double headOverlap = .45;		// Indicates how much of each triangle is overlapped by the one above it.
	private BasicStroke spireStroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree. 

	private final String GOLD = "FFD700";
	
	//  Constructor.
	//   	g2				The Graphics2D interface.
	// 		x				int.  The startX coordinate.  currentX is also set to x upon object creation.
	//  	y				int.  The startY coordinate.  currentX is also set to y upon object creation.
	//  	scale			double.  Scale multiplier for the object.
	//  	s_baseColor	A String representing the Hex code for the color used for the base of the spire.
	//  	s_headColor	A String representing the Hex code for the color used for the head of the spire.
	public Temple (Graphics2D g2, int x, int y, double scale,  String s_baseColor, String s_headColor) {
		super(g2, x, y, scale);
		this.baseColor = "#" + s_baseColor;
		this.headColor = "#" + s_headColor;
	}
	
	
	//Methods
	//  draw()
	public void draw() {
		applyScale();
		drawBase();
		drawHead();
	}
	
	
	//  applyScale
	public void applyScale() {
		baseWidth *= getScale();
		baseHeight *= getScale();
		headWidth *= getScale();
		headHeight *= getScale();
	}
	
		
	// 	drawBase()
	// 	Draws a rectangle for the base of the spire.
	private void drawBase() {
		g2.setColor(Color.decode(baseColor));
		g2.fillRect(currentX - 325, currentY - 100, baseWidth + 25, baseHeight - 34);
	//	g2.setColor(Color.GRAY);
		g2.setStroke(spireStroke);
		g2.drawRect(currentX - 325, currentY - 100, baseWidth + 25, baseHeight - 34); 
		}
	
		
//	  drawHead()
	private void drawHead() {
		currentX = ((currentX + baseWidth/2) - headWidth/2) - 325;
		currentY = currentY - 100;
		headWidth = headWidth + 25;
		int[] xTriang = {currentX, currentX + headWidth, currentX + headWidth/2};
		int[] yTriang = {currentY, currentY, currentY - headHeight};				
		g2.setColor(Color.decode(headColor));
		g2.fillPolygon(xTriang, yTriang, 3);
		g2.setStroke(spireStroke);
		g2.drawPolygon(xTriang, yTriang, 3);

		// MORONI		
		g2.setColor(Color.decode("#" + GOLD));
		g2.setStroke(new BasicStroke(20));
		g2.drawOval(723, 340, 1, 30);
		g2.fillOval(714, 312, 20, 20);
		
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(714, 318, 690, 308);
		
		g2.setStroke(new BasicStroke(6));
		g2.drawLine(690, 305, 690, 310);
		
		g2.setStroke(new BasicStroke(6));
		g2.drawLine(690, 305, 690, 310);
		
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(700, 310, 700, 330);
		
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(700, 330, 730, 330);
		
		}
	
}//end of class Temple
