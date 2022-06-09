package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    private Color c;

    private Color color;

    private Color rightC;

    private Color moveColor;

    private int originalSpeedX = deltaX;
    private int originalSpeedY = deltaY;




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

//            Color origin = painter.getColor();
//            painter.setColor(c);
//
//            if(c != moveColor) {
//                painter.fillRect(x, y, width, height);
////            moveColor = painter.getColor();
////                //colored line but not solid
//
//            }else{
//
//                moveColor = painter.getColor();
//                painter.setColor(moveColor);
//                painter.drawRect(x, y, width, height);
//            }
//
//            painter.setColor(origin);

            Color origin = painter.getColor();
            painter.setColor(c);
            if(originalSpeedX == -deltaX) {
                painter.fillRect(x, y, width, height);

            } else if(originalSpeedY == -deltaY){

                moveColor = painter.getColor();
                painter.setColor(moveColor);
                painter.drawRect(x, y, width, height);
            }

            painter.setColor(origin);



        }


//        public void move(int width, int height) {
//
//            int originalSpeedX = deltaX;
//            int originalSpeedY = deltaY;
//            super.move(width, height);
//
//            if(originalSpeedX != deltaX ){
//                c = color;
//            }
//            if(originalSpeedY != deltaY ){
//                c = moveColor;
//            }
//            if((originalSpeedY != deltaY ) && (originalSpeedX != deltaX )){
//                c = color;
//            }
//        }

    public void move(int width, int height) {

//        int originalSpeedX = deltaX;
//        int originalSpeedY = deltaY;
        super.move(width, height);

        if(originalSpeedX != deltaX ){
            c = color;
        } else if(originalSpeedY != deltaY ){
            c = moveColor;
        }

    }


}
