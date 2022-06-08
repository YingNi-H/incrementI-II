package bounce;


import java.util.List;

public class BorderShape extends Shape {

    private Shape shape;


    public BorderShape(Shape shape, String text) {
        this.x = shape.x - 2;
        this.y = shape.x - 2;
        this.width = shape.width + 4;
        this.height = shape.height + 4;
        this.shape = shape;
        this.deltaX = shape.deltaX;
        this.deltaY = shape.deltaY;
        this.text = text;
    }


    @Override
    public void paint(Painter painter) {
        painter.drawRect(x, y, width, height);
        shape.paint(painter);

    }

    @Override
    public void move(int width, int height) {
//        int originalSpeedX = deltaX;
//        int originalSpeedY = deltaY;
//        int shapeOSX = shape.deltaX;
//        int shapeOSY = shape.deltaY;
        int originalX = this.x;
        int originalY = this.y;
        int shapeOriginalX = shape.x;
        int shapeOriginalY = shape.y;
        super.move(width, height);
        shape.move(width, height);
        if(originalX <= 0 && shapeOriginalX <=2){
            originalX = 0;
            shapeOriginalX = 2;
            deltaX = -deltaX;

        } else if (originalX + this.width >= width && shapeOriginalX + shape.width >= width - 2){
            originalX = width - this.width;
            shapeOriginalX = width - 2 - shape.width;
            deltaX = -deltaX;

        }if(originalY <= 0 && shapeOriginalY <=2){
            originalY = 0;
            shapeOriginalY = 2;
            deltaY = -deltaY;

        } else if (originalY + this.height >= height && shapeOriginalY + shape.height >= height - 2){
            originalY = height - this.height;
            shapeOriginalY = height - 2 - this.height;
            deltaY = -deltaY;
        }

    }


}
