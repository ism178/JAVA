// Erick Duran & Ivan Marin
// Lab 12b: Draw Tree
// Mar 24, 2023

package S2.DRAW1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Tree Class.  Extends LandscapObject Class.
 * Note this class inherits 3 protected attributes from LandscapeObject for convenience in coding methods.
 * protected int currentX
 * protected int currentY
 * protected Graphics2D
 * 
 * When creating a Tree object in the DrawPanel.paintComponent(Graphics) method, usually the following syntax is used.
 * 
 * Tree t1 = new Tree(args);
 * t1.draw();
 * 
 * @author Jeffrey L Light
 * @version 1.0
 * @since 2019-11-26
 */
public class Tree extends LandscapeObject{
	//Attributes
	private int levels;						//The number of levels (branch triangles) the tree will have.
	private String trunkColor; 				// The Hex color of the trunk, including the preceding '#'. Set in the constructor.
	private String branchColor; 			// The Hex color of the branches, including the preceding '#'. Set in the constructor.
	private int trunkWidth = 10;			//The trunk width in pixels.  Default of 10 for a scale of 1.  Modified by applyScale method().
	private int trunkHeight = 15;			//The trunk height in pixels.  Default of 15 for a scale of 1.  Modified by applyScale method().
	private int branchWidth = 30;			//The branch width in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	private int branchHeight = 30;			//The branch height in pixels.  Default of 30 for a scale of 1.  Modified by applyScale method().
	private double branchOverlap = .45;		//Indicates how much of each triangle is overlapped by the one above it.
	private BasicStroke treeStroke = new BasicStroke(1);	//Stroke of 1 pixel use to outline each shape of the tree.

	
	/**
	 * Primary Constructor.
	 * Sets all class attributes.
	 * 
	 * @param	g2				The Graphics2D interface.
	 * @param	x				int.  The startX coordinate.  currentX is also set to x upon object creation.
	 * @param	y				int.  The startY coordinate.  currentX is also set to y upon object creation.
	 * @param	levels			int indicating how many levels (branch triangles) the tree will have.
	 * @param	scale			double.  Scale multiplier for the object.
	 * @param	s_trunkColor	A String representing the Hex code for the color used for the trunk of the tree.
	 * @param	s_branchColor	A String representing the Hex code for the color used for the branches of the tree.
	 *  
	 * @return	void
	 */
	public Tree(Graphics2D g2, int x, int y, double scale, int levels,  String s_trunkColor, String s_branchColor) {
		super(g2, x, y, scale);
		this.levels = levels;
		this.trunkColor = "#" + s_trunkColor;
		this.branchColor = "#" + s_branchColor;
	}//end of Constructor Tree
	
	
	//Methods
	/**
	 * draw()
	 * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
	 * Calls drawTrunk to draw the trunk of the tree.
	 * Calls drawBranches to draw the branches of the tree.
	 * 
	 * @return	void. 
	 */
	public void draw() {
		applyScale();
		drawTrunk();
		drawBranches();
	}//end of method draw()
	
	/**
	 * applyScale
	 * Applies the scale multiplier to all shape dimensions for the object.
	 * Called by draw()
	 * 
	 * @return	void. 
	 */
	public void applyScale() {
		trunkWidth *= getScale();
		trunkHeight *= getScale();
		branchWidth *= getScale();
		branchHeight *= getScale();

	}//end of method applyScale()
	
	
	/**
	 * drawTrunk()
	 * Draws a rectangle for the trunk of the tree.
	 * Called by draw()
	 * 
	 * @return	void. 
	 */
	private void drawTrunk() {
		g2.setColor(Color.decode(trunkColor));
		g2.fillRect(currentX, currentY, trunkWidth, trunkHeight);

		g2.setColor(Color.BLACK);
		g2.setStroke(treeStroke);
		g2.drawRect(currentX, currentY, trunkWidth, trunkHeight);

	}//end of method drawTrunk()
	
	
	/**
	 * drawBranches()
	 * Draws 'level' number of triangles above the trunk overlapped by 'branchOverlap'.
	 * Called by draw()
	 * 
	 * @return	void. 
	 */
	private void drawBranches() {
		currentX = (currentX + trunkWidth/2) - branchWidth/2;
		int[] xTriang = {currentX, currentX + branchWidth, currentX + branchWidth/2};
		for(int i = 0; i < levels; i++) {
			int[] yTriang = {currentY - (int)(branchHeight * branchOverlap * i),
							currentY - (int)(branchHeight * branchOverlap * i), 
							currentY - branchHeight - (int)(branchHeight * branchOverlap * i)};
			g2.setColor(Color.decode(branchColor));
			g2.fillPolygon(xTriang, yTriang, 3);
			g2.setColor(Color.black);
			g2.setStroke(treeStroke);
			g2.drawPolygon(xTriang, yTriang, 3);
		}
	}//end of method drawBranches()
}//end of class Tree
