package bounce;

import java.awt.*;

/**
 * Interface to represent a type that offers primitive drawing methods.
 *
 * @author Ian Warren
 */
public interface Painter {
    /**
     * Draws a rectangle. Parameters x and y specify the top left corner of the
     * oval. Parameters width and height specify its width and height.
     */
    public void drawRect(int x, int y, int width, int height);

    /**
     * Draws an oval. Parameters x and y specify the top left corner of the
     * oval. Parameters width and height specify its width and height.
     */
    public void drawOval(int x, int y, int width, int height);

    /**
     * Draws a line. Parameters x1 and y1 specify the starting point of the
     * line, parameters x2 and y2 the ending point.
     */
    public void drawLine(int x1, int y1, int x2, int y2);


    public void fillRect(int x, int y, int width, int height);

    public Color getColor();

    public void setColor(Color color);

    public void translate(int x, int y);

    public void drawCenteredText(String text, int x, int y);

    public void fillOval(int x, int y, int width, int height);

    public void fillPolygon(int[] xPoints, int[] yPoints, int Points);

    public void clearRect(int x, int y, int width, int height);

}
