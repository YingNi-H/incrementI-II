package bounce;

import java.awt.Graphics;

/**
 * Implementation of the Painter interface that delegates drawing to a
 * java.awt.Graphics object.
 *
 * @author Ian Warren
 */
public class GraphicsPainter implements Painter {
    // Delegate object.
    private Graphics g;

    /**
     * Creates a GraphicsPainter object and sets its Graphics delegate.
     */
    public GraphicsPainter(Graphics g) {
        this.g = g;
    }

    /**
     * see bounce.Painter.drawRect
     */
    public void drawRect(int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);
    }

    /**
     * see bounce.Painter.drawOval
     */
    public void drawOval(int x, int y, int width, int height) {
        g.drawOval(x, y, width, height);
    }

    /**
     * see bounce.Painter.drawLine.
     */
    public void drawLine(int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }
}
