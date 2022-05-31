package bounce;



public class OvalShape extends Shape {


    public OvalShape() {
        super();
    }




    /**
     *
     * @param x position.
     * @param y position.
     * @param deltaX speed and direction for horizontal axis.
     * @param deltaY speed and direction for vertical axis.
     */

    public OvalShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public OvalShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);
    }



    @Override
    public void paint(Painter painter) {
        painter.drawOval(x, y, width, height);

    }

}
