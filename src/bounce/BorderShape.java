package bounce;


import java.util.List;

public class BorderShape extends Shape {

//    protected Shape shape;


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
        super(shape);
    }

    public BorderShape(List<Shape> shapes, Shape shape) {
        this.shapes = shapes;
        this.shape = shape;
    }

    @Override
    public void paint(Painter painter) {
        painter.drawRect(shape.x - 2 , shape.y - 2, shape.width + 4, shape.height + 4);

//        for(Shape s : shapes){
            shape.paint(painter);
//        }


    }

    @Override
    public void move(int width, int height) {
        super.move(width, height);
//        for(Shape s : shapes){
            shape.move(width,height);
//        }

    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }

}
