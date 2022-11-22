package bounce;


import java.awt.*;

public class OvalShape extends Shape {

    private Color leftColor;
    private Color rightColor;
    private Color topColor;
    private Color bottomColor;


    public OvalShape() {
        super();
    }

    public OvalShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public OvalShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);
    }

    public OvalShape(int x, int y, int deltaX, int deltaY, int width, int height, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
    }

    public OvalShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftColor, Color rightColor, Color topColor, Color bottomColor){
        super(x, y, deltaX, deltaY, width, height);
        this.leftColor = leftColor;
        this.rightColor = rightColor;
        this.topColor = topColor;
        this.bottomColor = bottomColor;
    }

    @Override
    public void paint(Painter painter) {
        painter.drawOval(x, y, width, height);
    }


}
