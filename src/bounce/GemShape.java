package bounce;

public class GemShape extends Shape{


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

    @Override
    public void paint(Painter painter) {
        if(width > 40) {
            painter.drawLine(x, y, x + width/3, y - height/2);
            painter.drawLine(x + width/3, y - height/2, x + width/3*2, y - height/2);
            painter.drawLine(x + width/3*2, y - height/2, x + width, y);
            painter.drawLine(x + width, y, x + width/3*2, y + height/2);
            painter.drawLine(x + width/3*2, y + height/2, x + width/3, y + height/2);
            painter.drawLine(x + width/3, y + height/2, x, y);

        }else {
            painter.drawLine(x,y,x + width/2, y);
            painter.drawLine(x + width/2, y,x + width/2, y + height);
            painter.drawLine(x + width/2,y + height, x, y + height);
            painter.drawLine(x,y + height,x,y);


        }



    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }


}
