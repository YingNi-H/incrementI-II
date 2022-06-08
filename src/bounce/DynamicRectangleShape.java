package bounce;
import java.awt.*;


public class DynamicRectangleShape extends Shape {

    private Color c;

    private Color leftC;

    private Color rightC;

    private Color moveColor;


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

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color leftC) {
        super(x, y, deltaX, deltaY, width, height);
        this.leftC = leftC;



    }


//    public void paint(Painter painter) {
//
//        Color origin = painter.getColor();
//        painter.setColor(c);
//
//        if(c != moveColor) {
//            painter.fillRect(x, y, width, height);
////            moveColor = painter.getColor();
//            //colored line but not solid
//
//        }else{
//            moveColor = painter.getColor();
//            painter.setColor(moveColor);
//            painter.drawRect(x, y, width, height);
//        }
//
//        painter.setColor(origin);
//
//    }
//
//
//    public void move(int width, int height) {
//
//        int originalSpeedX = deltaX;
//        int originalSpeedY = deltaY;
//        super.move(width, height);
//
//        if(originalSpeedX != deltaX && this.x <= 0){
//            c = leftC;
//        } else if(originalSpeedX != deltaX && this.x + this.width >= width){
//            c = rightC;
//        }
//        if(originalSpeedY != deltaY && (this.y <= 0 || this.y + this.height >= height)){
//            c = moveColor;
//        }
//        if((originalSpeedY != deltaY && this.y <= 0 ) && (originalSpeedX != deltaX && this.x <= 0) ||
//                (originalSpeedY != deltaY && this.y + this.height >= height) && (originalSpeedX != deltaX && this.x <= 0)) {
//            c = leftC;
//        }
//        if((originalSpeedY != deltaY && this.y <= 0 ) && (originalSpeedX != deltaX && this.x + this.width >= width) ||
//                (originalSpeedY != deltaY && this.y + this.height >= height) && (originalSpeedX != deltaX && this.x + this.width >= width)){
//            c = rightC;
//
//        }


        public void paint(Painter painter) {

            Color origin = painter.getColor();
            painter.setColor(c);

            if(c != moveColor) {
                painter.fillRect(x, y, width, height);
//            moveColor = painter.getColor();
                //colored line but not solid

            }else{
                moveColor = painter.getColor();
                painter.setColor(moveColor);
                painter.drawRect(x, y, width, height);
            }

            painter.setColor(origin);

        }


        public void move(int width, int height) {

            int originalSpeedX = deltaX;
            int originalSpeedY = deltaY;
            super.move(width, height);

            if(originalSpeedX != deltaX ){
                c = leftC;
            }
            if(originalSpeedY != deltaY ){
                c = moveColor;
            }
            if((originalSpeedY != deltaY ) && (originalSpeedX != deltaX )){
                c = leftC;
            }



    }


}
