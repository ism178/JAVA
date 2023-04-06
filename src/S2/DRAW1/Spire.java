// Erick Duran & Ivan Marin
// Lab 13a: Draw Objects
// Apr 01, 2023

package S2.DRAW1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Spire Class.  Extends LandscapObject Class.
 * Note this class inherits 3 protected attributes from LandscapeObject for convenience in coding methods.
 * protected int currentX
 * protected int currentY
 * protected Graphics2D
 * 

 */
public class Spire extends LandscapeObject{
	//Attributes

	private String baseColor; 				// The Hex color of the bases, including the preceding '#'. Set in the constructor.
	private String headColor; 				// The Hex color of the heads, including the preceding '#'. Set in the constructor.
	private int baseWidth = 50;				//The base width in pixels.  
	private int baseHeight = 70;			//The base height in pixels.  
	private int headWidth = 50;				//The head width in pixels.  
	private int headHeight = 350;			//The head height in pixels.  
	private double headOverlap = .45;		//Indicates how much of each triangle is overlapped by the one above it.
	private BasicStroke spireStroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree.  

	
	//  Constructor.
	//   	g2				The Graphics2D interface.
	// 		x				int.  The startX coordinate.  currentX is also set to x upon object creation.
	//  	y				int.  The startY coordinate.  currentX is also set to y upon object creation.
	//  	scale			double.  Scale multiplier for the object.
	//  	s_baseColor	A String representing the Hex code for the color used for the base of the spire.
	//  	s_headColor	A String representing the Hex code for the color used for the head of the spire.
	public Spire(Graphics2D g2, int x, int y, double scale,  String s_baseColor, String s_headColor) {
		super(g2, x, y, scale);
		this.baseColor = "#" + s_baseColor;
		this.headColor = "#" + s_headColor;
	}//end of Constructor spire
	
	
	//Methods
	//  draw(), 
	//  Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
	//  Calls drawBase,  Calls drawHead 
	public void draw() {
		applyScale();
		drawBase();
		drawHead();
	}//end of method draw()
	
	
	//  applyScale
	public void applyScale() {
		baseWidth *= getScale();
		baseHeight *= getScale();
		headWidth *= getScale();
		headHeight *= getScale();
	}//end of method applyScale()
	
	
	
	// 	drawBase()
	// 	Draws a rectangle for the base of the spire.
	private void drawBase() {
		g2.setColor(Color.decode(baseColor));
		g2.fillRect(currentX, currentY, baseWidth, baseHeight);
		g2.setColor(Color.GRAY);
		g2.setStroke(spireStroke);
		g2.drawRect(currentX, currentY, baseWidth, baseHeight);

	}//end of method drawBase()
	
	
	
//	  drawHead()
	private void drawHead() {
		currentX = (currentX + baseWidth/2) - headWidth/2;
		int[] xTriang = {currentX, currentX + headWidth, currentX + headWidth/2};
		int[] yTriang = {currentY, currentY, currentY - headHeight};				
		g2.setColor(Color.decode(headColor));
		g2.fillPolygon(xTriang, yTriang, 3);
		g2.setColor(Color.GRAY);
		g2.setStroke(spireStroke);
		g2.drawPolygon(xTriang, yTriang, 3);
		
	}//end of method drawHead()
}//end of class Spire
