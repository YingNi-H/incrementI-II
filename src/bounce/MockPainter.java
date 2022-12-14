package bounce;

import java.awt.*;
import java.util.Arrays;

/**
 * Implementation of the Painter interface that does not actually do any
 * painting. A MockPainter implementation responds to Painter requests by
 * logging simply logging them. The contents of a MockPainter object's
 * log can be retrieved by a call to toString() on the MockPainter.
 *
 * @author Ian Warren
 */
public class MockPainter implements Painter {
    // Internal log.
    private StringBuffer log = new StringBuffer();

    /**
     * Returns the contents of this MockPainter's log.
     */
    public String toString() {
        return log.toString();
    }

    /**
     * Logs the drawRect call.
     */
    public void drawRect(int x, int y, int width, int height) {
        log.append("(text " + x + "," + y + "," + width + "," + height + ")");
    }

    /**
     * Logs the drawOval call.
     */
    public void drawOval(int x, int y, int width, int height) {
        log.append("(oval " + x + "," + y + "," + width + "," + height + ")");
    }

    /**
     * Logs the drawLine call.
     */
    public void drawLine(int x1, int y1, int x2, int y2) {
        log.append("(line " + x1 + "," + y1 + "," + x2 + "," + y2 + ")");
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        log.append("(rectangle " + x + "," + y + "," + width + "," + height + ")");

    }

    @Override
    public void clearRect(int x, int y, int width, int height) {
        log.append("(rectangle " + x + "," + y + "," + width + "," + height + ")");

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void setColor(Color color) {
        log.append("(dynamicrectangle " + color + ")");

    }

    @Override
    public void translate(int x, int y) {
        log.append("(translate " + x + "," + y + ")");


    }

    @Override
    public void drawCenteredText(String str, int x, int y) {
        log.append("(string)");
    }


    @Override
    public void fillOval(int x, int y, int width, int height) {
        log.append("(oval " + x + "," + y + "," + width + "," + height + ")");

    }

    @Override
    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints){
        log.append("(polygon " + Arrays.toString(xPoints) + "," + Arrays.toString(yPoints) + "," + nPoints + ")");

    }


}