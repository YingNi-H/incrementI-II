package bounce;

import java.awt.*;

/**
 * Class to represent a simple rectangle.
 *
 * @author Ian Warren
 */
public class RectangleShape extends Shape {
    /**
     * Default constructor that creates a RectangleShape instance whose instance
     * variables are set to default values.
     */
    private Color leftColor;
    private Color rightColor;
    private Color topColor;
    private Color bottomColor;

    public RectangleShape() {
        super();
    }

    /**
     * Creates a RectangleShape instance with specified values for instance
     * variables.
     *
     * @param x      x position.
     * @param y      y position.
     * @param deltaX speed and direction for horizontal axis.
     * @param deltaY speed and direction for vertical axis.
     */
    public RectangleShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    /**
     * Creates a RectangleShape instance with specified values for instance
     * variables.
     *
     * @param x      x position.
     * @param y      y position.
     * @param deltaX speed (pixels per move call) and direction for horizontal
     *               axis.
     * @param deltaY speed (pixels per move call) and direction for vertical
     *               axis.
     * @param width  width in pixels.
     * @param height height in pixels.
     */
    public RectangleShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);
    }


    public RectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
    }

    public RectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftColor, Color rightColor, Color topColor, Color bottomColor){
        super(x, y, deltaX, deltaY, width, height);
        this.leftColor = leftColor;
        this.rightColor = rightColor;
        this.topColor = topColor;
        this.bottomColor = bottomColor;
    }

    /**
     * Paints this RectangleShape object using the supplied Painter object.
     */
    public void paint(Painter painter) {

        painter.drawRect(x, y, width, height);

    }



}
