package bounce;


import java.util.List;

public class BorderShape extends Shape {

    protected Shape shape;
    protected List<Shape> shapes;


    public BorderShape() {
        super();
    }


    public BorderShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public BorderShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);
    }

    public BorderShape(int x, int y, int deltaX, int deltaY, int width, int height, String text) {
        super(x, y, deltaX, deltaY, width, height, text);
    }

    public BorderShape(Shape shape) {
        this.x = shape.x - 2;
        this.y = shape.x - 2;
        this.width = shape.width + 4;
        this.height = shape.height + 4;
        this.shape = shape;
    }



    @Override
    public void paint(Painter painter) {
        painter.drawRect(x, y, width, height);
        shape.paint(painter);

    }

    @Override
    public void move(int width, int height) {
        super.move(width, height);
        shape.move(width,height);
        if(shape.x() == 2){
            shape.deltaX = -deltaX;
        }
        if(shape.x() == width - 2 - shape.width){
            shape.deltaX = -deltaX;
        }
        if(shape.y() == 2){
            shape.deltaY = -deltaY;
        }
        if(shape.y() == height -2 - shape.height){
            shape.deltaY = -deltaY;
        }



    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }

}
