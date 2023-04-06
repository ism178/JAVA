package S2.DRAW1;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * SnowFlake Class.
 * A custom class for drawing a snowflake.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since [Date of creation]
 */
public class SnowFlake extends LandscapeObject{
    //Attributes
    private int size;				//The size of the snowflake in pixels.
    private String color;			//The Hex color of the snowflake, including the preceding '#'. Set in the constructor.
    private BasicStroke snowStroke = new BasicStroke(2);	//Stroke of 1 pixel used to outline each shape of the snowflake.

    /**
     * Primary Constructor.
     * Sets all class attributes.
     * 
     * @param g2				The Graphics2D interface.
     * @param x				int.  The startX coordinate.  currentX is also set to x upon object creation.
     * @param y				int.  The startY coordinate.  currentX is also set to y upon object creation.
     * @param scale			double.  Scale multiplier for the object.
     * @param size			int indicating the size of the snowflake in pixels.
     * @param s_color		A String representing the Hex code for the color used for the snowflake.
     * 
     * @return	void
     */
    public SnowFlake(Graphics2D g2, int x, int y, double scale, int size, String s_color) {
        super(g2, x, y, scale);
        this.size = size;
        this.color = "#" + s_color;
    }

    //Methods
    /**
     * draw()
     * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
     * Calls drawSnowFlake to draw the snowflake.
     * 
     * @return	void. 
     */
    public void draw() {
        applyScale();
        drawSnowFlake();
    }

    /**
     * applyScale
     * Applies the scale multiplier to all shape dimensions for the object.
     * Called by draw()
     * 
     * @return	void. 
     */
    public void applyScale() {
        size *= getScale();
    }

    /**
     * drawSnowFlake()
     * Draws a snowflake shape.
     * Called by draw()
     * 
     * @return    void. 
     */
    private void drawSnowFlake() {
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2));
        int halfSize = size / 2;
        int quarterSize = size / 4;
        int threeQuarterSize = 3 * size / 4;
        
        g2.drawLine(currentX, currentY, currentX + size, currentY);
        g2.drawLine(currentX + halfSize, currentY - halfSize, currentX + halfSize, currentY + halfSize);
        g2.drawLine(currentX + quarterSize, currentY - quarterSize, currentX + threeQuarterSize, currentY + threeQuarterSize);
        g2.drawLine(currentX + quarterSize, currentY + threeQuarterSize, currentX + threeQuarterSize, currentY - quarterSize);
        g2.drawLine(currentX, currentY, currentX + size, currentY + size);
        g2.drawLine(currentX, currentY + size, currentX + size, currentY);
    }
    
    

    


}

    

