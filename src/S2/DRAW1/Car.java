package S2.DRAW1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Car Class.
 * A custom class for drawing a car.
 * 
 * @author [Your Name]
 * @version 1.0
 * @since [Date of creation]
 */
public class Car extends LandscapeObject {
    //Attributes
    private int width;                  //The width of the car in pixels.
    private int height;                 //The height of the car in pixels.
    private String color;               //The Hex color of the car, including the preceding '#'. Set in the constructor.

    /**
     * Primary Constructor.
     * Sets all class attributes.
     * 
     * @param g2        The Graphics2D interface.
     * @param x         int.  The startX coordinate.  currentX is also set to x upon object creation.
     * @param y         int.  The startY coordinate.  currentX is also set to y upon object creation.
     * @param scale     double.  Scale multiplier for the object.
     * @param width     int indicating the width of the car in pixels.
     * @param height    int indicating the height of the car in pixels.
     * @param s_color   A String representing the Hex code for the color used for the car.
     * 
     * @return void
     */

    public Car(Graphics2D g2, int x, int y, double scale, int width, int height, String s_color) {
        super(g2, x, y, scale);
        this.width = width;
        this.height = height;
        this.color = "#" + s_color;
        this.currentY = y;
    }
    

    //Methods
    /**
     * draw()
     * Calls applyScale to apply the scale multiplier to all shape dimensions for the object.
     * Calls drawCar to draw the car.
     * 
     * @return void. 
     */
    public void draw() {
        applyScale();
        drawCar();
    }

    /**
     * applyScale
     * Applies the scale multiplier to all shape dimensions for the object.
     * Called by draw()
     * 
     * @return void. 
     */
    public void applyScale() {
        width *= getScale();
        height *= getScale();
    }

    /**
     * drawCar()
     * Draws a car shape.
     * Called by draw()
     * 
     * @return void. 
     */
    private void drawCar() {
        // Draw body
        g2.setColor(Color.decode(color));
        Rectangle2D.Double body = new Rectangle2D.Double(currentX, currentY + height/4, width, height/4);
        g2.fill(body);
    
        // Draw top
        g2.setColor(Color.decode(color));
        Polygon top = new Polygon(new int[]{currentX, currentX + width/4, currentX + 3*width/4, currentX + width}, new int[]{currentY + height/4, currentY, currentY, currentY + height/4}, 4);
        g2.fill(top);
    
        // Draw windows
        g2.setColor(Color.decode("#" + "A9A9A9"));
        Rectangle2D.Double window1 = new Rectangle2D.Double(currentX + width/16, currentY + height/16, width/4, height/8);
        Rectangle2D.Double window2 = new Rectangle2D.Double(currentX + width - width/4 - width/16, currentY + height/16, width/4, height/8);
        g2.fill(window1);
        g2.fill(window2);
    
        // Draw wheels
        g2.setColor(Color.BLACK);
        Ellipse2D.Double wheel1 = new Ellipse2D.Double(currentX + width/8, currentY + 3*height/8, height/4, height/4);
        Ellipse2D.Double wheel2 = new Ellipse2D.Double(currentX + 5*width/8, currentY + 3*height/8, height/4, height/4);
        g2.fill(wheel1);
        g2.fill(wheel2);
    
        // Draw headlights
        g2.setColor(Color.decode("#" + "FFFF99"));
        Rectangle2D.Double headlight1 = new Rectangle2D.Double(currentX + 7*width/8, currentY + height/8, width/16, height/8);
        Rectangle2D.Double headlight2 = new Rectangle2D.Double(currentX + width/8 - width/16, currentY + height/8, width/16, height/8);
        g2.fill(headlight1);
        g2.fill(headlight2);
    

    }
    
    
}
