package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    protected Color c = Color.CYAN;

    protected Color leftC;
    protected Color rightC;

    public DynamicRectangleShape() {
        super();
    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);

    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftC, Color rightC) {
        this.x = x;
        this.y = y;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.width = width;
        this.height = height;
        this.leftC = leftC;
        this.rightC = rightC;


    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftC, Color rightC, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
        this.leftC = leftC;
        this.rightC = rightC;
    }



    public void paint(Painter painter) {

        painter.drawRect(x, y, width, height);
        Color origin = painter.getColor();


        if(c != null){
            painter.setColor(c);
            painter.fillRect(x, y, width, height);
        }



        painter.setColor(origin);




    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }


    public void move(int width, int height) {
        this.x

        int nextX = x + deltaX;
        int nextY = y + deltaY;

        if (nextX <= 0) {
            nextX = 0;
            deltaX = -deltaX;

            c = leftC;


        } else if (nextX + this.width >= width) {
            nextX = width - this.width;
            deltaX = -deltaX;


            c = rightC;

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
