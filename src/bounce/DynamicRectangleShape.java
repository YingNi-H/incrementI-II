package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    protected Color c = Color.BLACK;

    protected Color leftC;

    protected Color rightC;

    protected Color moveColor;

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
        super(x, y, deltaX, deltaY, width, height);
        this.leftC = leftC;
        this.rightC = rightC;


    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftC, Color rightC, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
        this.leftC = leftC;
        this.rightC = rightC;

    }


    public void paint(Painter painter) {

//        Color origin = painter.getColor();
//        painter.drawRect(x, y, width, height);
//        if(c != null){
//            painter.setColor(c);
//            painter.fillRect(x, y, width, height);
//
//        }
        Color origin = painter.getColor();
        painter.drawRect(x, y, width, height);
        painter.setColor(c);
        painter.fillRect(x, y, width, height);
        moveColor = painter.getColor();
        painter.setColor(moveColor);
        if(c == moveColor){
        painter.drawRect(x, y, width, height);
        }


        painter.setColor(origin);

    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }


    public void move(int width, int height) {

//
//        int nextX = x + deltaX;
//        int nextY = y + deltaY;
//
//        if (nextX <= 0) {
//            nextX = 0;
//            deltaX = -deltaX;
//
//            c = leftC;
//
//
//        } else if (nextX + this.width >= width) {
//            nextX = width - this.width;
//            deltaX = -deltaX;
//
//
//            c = rightC;
//
//        }
//
//        if (nextY <= 0) {
//            nextY = 0;
//            deltaY = -deltaY;
//
//            c = null;
//
//
//        } else if (nextY + this.height >= height) {
//            nextY = height - this.height;
//            deltaY = -deltaY;
//
//            c = null;
//        }
//
//        x = nextX;
//        y = nextY;
//    }

        int posX = this.x() + this.deltaX;
        int posY = this.y() + this.deltaY;

        if (posX <= 0) {
            posX = 0;

            this.deltaX = -deltaX;
            c = leftC;
        }
        if (posX >= width - this.width) {
            posX = width - this.width;

            this.deltaX = -deltaX;
            c = rightC;
        }
        if (posY <= 0) {
            posY = 0;
            this.deltaY = -deltaY;
//            c = null;
            c = moveColor;
        }
        if (posY >= height - this.height) {
            posY = height - this.height;
            this.deltaY = -deltaY;
//            c = null;
            c = moveColor;
        }
        this.x = posX;
        this.y = posY;

//    super.move(width, height);
////    if(this.deltaX == -deltaX){
////        c = leftC;
////    }
//        if(this.deltaX == -deltaX){
//            c = rightC;
//        }
//        if(this.deltaY == -deltaY){
//            c = null;
//        }
//
    }


}
