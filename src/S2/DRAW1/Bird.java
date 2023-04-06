package S2.DRAW1;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bird {
    private Graphics2D g2;
    private int x;
    private int y;
    private double scale;
    private Color birdColor;

    public Bird(Graphics2D g2, int x, int y, double scale, Color birdColor) {
        this.g2 = g2;
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.birdColor = birdColor;
    }

    public void draw() {
        g2.setColor(birdColor);
    
        // Body
        g2.fillOval(x - (int) (5 * scale), y + (int) (5 * scale), (int) (40 * scale), (int) (20 * scale));
    
        // Head
        g2.fillOval(x + (int) (15 * scale), y - (int) (10 * scale), (int) (20 * scale), (int) (20 * scale));
    
        // Beak
        int[] beakX = {x + (int) (30 * scale), x + (int) (50 * scale), x + (int) (35 * scale)};
        int[] beakY = {y + (int) (5 * scale), y + (int) (20 * scale), y + (int) (12 * scale)};
        g2.setColor(Color.orange);
        g2.fillPolygon(beakX, beakY, 3);
    
        // Eye
        g2.setColor(Color.white);
        g2.fillOval(x + (int) (20 * scale), y - (int) (2 * scale), (int) (8 * scale), (int) (8 * scale));
        g2.setColor(Color.black);
        g2.fillOval(x + (int) (23 * scale), y, (int) (4 * scale), (int) (4 * scale));
    }
    

    
    
    
    
}
