package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    protected Color c;

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

        Color origin = painter.getColor();
        painter.setColor(c);

        if(c != moveColor){
            painter.fillRect(x, y, width, height);
//            moveColor = painter.getColor();
            //colored line but not solid


        } else {

            moveColor = painter.getColor();

            painter.setColor(moveColor);
            painter.drawRect(x, y, width, height);
        }

        painter.setColor(origin);

    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }


    public void move(int width, int height) {

//        this.x += this.deltaX;
//        this.y += this.deltaY;
//
//        if (this.x <= 0) {
//            this.x = 0;
//            this.deltaX = -deltaX;
//            c = leftC;
//        }
//        if (this.x >= width - this.width) {
//            this.x = width - this.width;
//            this.deltaX = -deltaX;
//            c = rightC;
//        }
//        if (this.y <= 0) {
//            this.y = 0;
//            this.deltaY = -deltaY;
//            c = moveColor;
//        }
//        if (this.y >= height - this.height) {
//            this.y = height - this.height;
//            this.deltaY = -deltaY;
//            c = moveColor;
//        }

        super.move(width, height);

        if(this.deltaX == -deltaX && this.x <= 0){
            c = leftC;
        } else if(this.deltaX == -deltaX && this.x + this.width >= width){
            c = rightC;
        }
        if(this.deltaY == -deltaY && (this.y <= 0 || this.y + this.height >= height)){
            c = moveColor;
        }


    }


}
