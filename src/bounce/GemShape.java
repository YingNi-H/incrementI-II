package bounce;

import java.awt.*;

public class GemShape extends Shape{

    private Color leftColor;
    private Color rightColor;
    private Color topColor;
    private Color bottomColor;


    public GemShape() {
    }


    public GemShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public GemShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);

    }

    public GemShape(int x, int y, int deltaX, int deltaY, int width, int height, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
    }

    public GemShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftColor, Color rightColor, Color topColor, Color bottomColor){
        super(x, y, deltaX, deltaY, width, height);
        this.leftColor = leftColor;
        this.rightColor = rightColor;
        this.topColor = topColor;
        this.bottomColor = bottomColor;

    }

    @Override
    public void paint(Painter painter) {
        if(width >= 40 ) {
            painter.drawLine(x + 20, y, x + width - 20, y);
            painter.drawLine(x + width - 20, y, x + width, y + height/2);
            painter.drawLine(x + width, y + height/2, x + width - 20, y + height);
            painter.drawLine(x + width - 20, y + height, x + 20, y + height);
            painter.drawLine(x + 20, y + height, x, y + height/2);
            painter.drawLine(x, y + height/2, x + 20, y);



        }else {
            painter.drawLine(x + width/2, y, x + width, y + height/2);
            painter.drawLine(x + width, y + height/2,x + width/2, y + height);
            painter.drawLine(x + width/2, y + height, x, y + height/2);
            painter.drawLine(x, y + height/2, x + width/2, y);


        }

    }


}
