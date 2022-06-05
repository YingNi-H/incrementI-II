package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    protected static Color c = Color.CYAN;

    public DynamicRectangleShape() {
        super();
    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);

    }


    public void paint(Painter painter) {

        painter.drawRect(x, y, width, height);
        Color origin = painter.getColor();
        painter.setColor(c);

        if(c != null){
            painter.fillRect(x, y, width, height);
        }

//        painter.drawCentredText("**********", x+7,y+27);

        painter.setColor(origin);




    }

//    @Override
//    public void drawText(Painter painter) {
//        painter.drawCenteredText(text, x, y);
//    }


    public void move(int width, int height) {
        int nextX = x + deltaX;
        int nextY = y + deltaY;

        if (nextX <= 0) {
            nextX = 0;
            deltaX = -deltaX;
            c = Color.PINK;


        } else if (nextX + this.width >= width) {
            nextX = width - this.width;
            deltaX = -deltaX;
            c = Color.GREEN;

        }

        if (nextY <= 0) {
            nextY = 0;
            deltaY = -deltaY;

            c = null;


        } else if (nextY + this.height >= height) {
            nextY = height - this.height;
            deltaY = -deltaY;

            c = null;
        }

        x = nextX;
        y = nextY;
    }

}
