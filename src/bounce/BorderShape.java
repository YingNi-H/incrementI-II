package bounce;



public class BorderShape extends Shape {


    public BorderShape() {
        super();
    }


    public BorderShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public BorderShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);
    }



    @Override
    public void paint(Painter painter) {
        painter.drawRect(x, y, width, height);
        painter.drawRect(x+2, y+2, width-4, height-4);
        painter.drawOval(x+4, y+4, width-8, height-8);
        painter.drawCentredText("((()))",x+20,y+30);

    }

}
