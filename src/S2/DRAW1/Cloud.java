package S2.DRAW1;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Cloud {
    private Graphics2D g2;
    private int x;
    private int y;
    private double scale;
    private Color cloudColor;

    public Cloud(Graphics2D g2, int x, int y, double scale, Color cloudColor) {
        this.g2 = g2;
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.cloudColor = cloudColor;
    }

    public void draw() {
        g2.setColor(cloudColor);
        g2.fillOval(x, y, (int) (60 * scale), (int) (30 * scale));
        g2.fillOval(x + (int) (20 * scale), y - (int) (10 * scale), (int) (60 * scale), (int) (40 * scale));
        g2.fillOval(x + (int) (40 * scale), y, (int) (60 * scale), (int) (30 * scale));
        g2.fillOval(x + (int) (10 * scale), y + (int) (10 * scale), (int) (60 * scale), (int) (30 * scale));
    }
}
