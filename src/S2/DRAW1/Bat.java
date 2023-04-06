package S2.DRAW1;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Bat {
    private Graphics2D g2;
    private int x, y, width, height;
    private double scale;
    private Color bodyColor, wingColor;

    public Bat(Graphics2D g2, int x, int y, double scale, int width, int height, Color bodyColor, Color wingColor) {
        this.g2 = g2;
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.width = width;
        this.height = height;
        this.bodyColor = bodyColor;
        this.wingColor = wingColor;
    }

    public void draw() {
        g2.setColor(bodyColor);
    
        // Head
        g2.fillOval(x + (int) (25 * scale), y + (int) (10 * scale), (int) (20 * scale), (int) (20 * scale));
    
        // Ears
        g2.fillOval(x + (int) (18 * scale), y + (int) (5 * scale), (int) (14 * scale), (int) (14 * scale));
        g2.fillOval(x + (int) (38 * scale), y + (int) (5 * scale), (int) (14 * scale), (int) (14 * scale));
    
        // Eyes
        g2.setColor(Color.white);
        g2.fillOval(x + (int) (27 * scale), y + (int) (15 * scale), (int) (8 * scale), (int) (8 * scale));
        g2.fillOval(x + (int) (45 * scale), y + (int) (15 * scale), (int) (8 * scale), (int) (8 * scale));
    
        // Pupils
        g2.setColor(Color.black);
        g2.fillOval(x + (int) (29 * scale), y + (int) (17 * scale), (int) (4 * scale), (int) (4 * scale));
        g2.fillOval(x + (int) (47 * scale), y + (int) (17 * scale), (int) (4 * scale), (int) (4 * scale));
    
        // Nose
        g2.setColor(Color.gray);
        g2.fillOval(x + (int) (35 * scale), y + (int) (22 * scale), (int) (10 * scale), (int) (8 * scale));

    }
    
}
