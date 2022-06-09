package bounce;

import java.awt.*;

public class AccordianShape extends Shape{
    private Color leftColor;
    private Color rightColor;
    private Color topColor;
    private Color bottomColor;
    private Color c;
    private Shape shape;


    public AccordianShape() {
    }


    public AccordianShape(Shape shape, Color leftColor, Color rightColor, Color topColor, Color bottomColor){

        this.x = shape.x - 5;
        this.y = shape.y - 5;
        this.width = shape.width + 10;
        this.height = shape.height + 10;
        this.shape = shape;
        this.deltaX = shape.deltaX;
        this.deltaY = shape.deltaY;
        this.leftColor = leftColor;
        this.rightColor = rightColor;
        this.topColor = topColor;
        this.bottomColor = bottomColor;
    }

    public AccordianShape(Shape shape){
        this.x = shape.x - 5;
        this.y = shape.y - 5;
        this.width = shape.width + 10;
        this.height = shape.height + 10;
        this.deltaX = shape.deltaX;
        this.deltaY = shape.deltaY;
        this.shape = shape;

    }

    @Override
    public void paint(Painter painter) {
        Color initial = painter.getColor();
        painter.setColor(c);
        int[] xPoints = new int[]{x, x + 20, x + width - 20, x + width, x + width - 20, x + 20};
        int[] yPoints = new int[]{y + height / 2, y, y, y + height / 2, y + height, y + height};
        int nPoints = 6;

        painter.fillPolygon(xPoints, yPoints, nPoints);
        shape.paint(painter);
        painter.setColor(initial);

//        Just outline (No color):
//        painter.drawRect(x, y, width, height);
//        shape.paint(painter);


    }

    @Override
    public void move(int width, int height) {
        int originalX = this.x;
        int originalY = this.y;
        int shapeOriginalX = shape.x;
        int shapeOriginalY = shape.y;
        super.move(width, height);
        shape.move(width, height);
            if (originalX <= 0 && shapeOriginalX <= 5) {

                deltaX = -deltaX;
                c = leftColor;


            } else if (originalX + this.width >= width && shapeOriginalX + shape.width >= width - 5) {

                deltaX = -deltaX;
                c = rightColor;


            }
            if (originalY <= 0 && shapeOriginalY <= 5) {

                deltaY = -deltaY;
                c = topColor;

            } else if (originalY + this.height >= height && shapeOriginalY + shape.height >= height - 5) {

                deltaY = -deltaY;
                c = bottomColor;
            }
        }

}
