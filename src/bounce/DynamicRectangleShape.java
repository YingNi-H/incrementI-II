package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    private Color color;

    private Color rightC;

    private boolean isfilled;



    public DynamicRectangleShape() {
        super();
    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);

    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color color, Color rightC) {
        super(x, y, deltaX, deltaY, width, height);
        this.color = color;
        this.rightC = rightC;


    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color color, Color rightC, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
        this.color = color;
        this.rightC = rightC;

    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color color, String text) {
        super(x, y, deltaX, deltaY, width, height);
        this.color = color;
        this.text = text;

    }



        public void paint(Painter painter) {

            Color origin = painter.getColor();
            painter.setColor(color);

            if(isfilled) {
                painter.fillRect(x, y, width, height);

            }else{
                painter.drawRect(x, y, width, height);
            }

            painter.setColor(origin);

        }



    public void move(int width, int height) {

        int originalSpeedX = deltaX;
        int originalSpeedY = deltaY;
        super.move(width, height);

        if(originalSpeedX != deltaX ){
            isfilled = true;
        } else if(originalSpeedY != deltaY ){
            isfilled = false;
        }

    }


}
