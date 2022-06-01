package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    protected GraphicsPainter g;



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
        painter.setColor(Color.MAGENTA);
        painter.fillRect(x, y, width, height);
    }


    public void move(int width, int height) {
        int nextX = x + deltaX;
        int nextY = y + deltaY;

        if (nextX <= 0) {
            nextX = 0;
            deltaX = -deltaX;

            this.g.setColor(Color.PINK);
            this.g.fillRect(x,y,width,height);

        } else if (nextX + this.width >= width) {
            nextX = width - this.width;
            deltaX = -deltaX;
            this.g.setColor(Color.CYAN);
            this.g.fillRect(x,y,width,height);

        }

        if (nextY <= 0) {
            nextY = 0;
            deltaY = -deltaY;


        } else if (nextY + this.height >= height) {
            nextY = height - this.height;
            deltaY = -deltaY;
        }

        x = nextX;
        y = nextY;
    }

}
