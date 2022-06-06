package bounce;

import java.util.ArrayList;
import java.util.List;

public class NestingShape extends Shape{

    protected List<Shape> shapes = new ArrayList<Shape>();


    public NestingShape() {

    }
    public NestingShape(int x, int y){
        super(x,y);

    }

    public NestingShape(int x, int y, int deltaX, int deltaY){
        super(x, y, deltaX, deltaY);

    }

    public NestingShape ( int x , int y , int deltaX , int deltaY , int width , int height ){
        super(x, y, deltaX, deltaY, width, height);

    }


    public NestingShape(int x, int y, int deltaX, int deltaY, int width, int height, String text) {
        super(x, y, deltaX, deltaY, width, height, text);

    }

    @Override
    public void paint(Painter painter) {

        painter.drawRect(x,y,width,height);

        painter.translate(x,y);


        for(Shape s : shapes){

            s.paint(painter);
            if(s.text != null){
            s.drawText(painter);
            }
        }

        painter.translate(-x,-y);




    }

    public void move( int width , int height ){

        super.move(width, height);

        for(Shape s : shapes){

           width = this.width ;
           height = this.height ;
           s.move(this.width, this.height);

        }

    }

    @Override
    public void drawText(Painter painter) {
        painter.drawCenteredText(text, x, y);
    }

    public void add(Shape shape) throws IllegalArgumentException{

        if(!shapes.contains(shape)  && shape.parent == null
                && shape.x >= this.x && shape.y >= this.y
                && (shape.x + shape.width) <= (this.x + this.width)
                && (shape.y + shape.height) <= (this.y + this.height)){

            shape.parent = this;
            shapes.add(shape);
        }else{
            throw new IllegalArgumentException("This shape can't fit in or has already contained by this NestingShape!");
        }

    }

    public void remove(Shape shape ){
        shapes.remove(shape);
        shape.parent = null;
    }

    public Shape shapeAt ( int index ) throws IndexOutOfBoundsException{
        if(index >= 0 && index < shapes.size()){
            return shapes.get(index);
        }else{
            throw new IndexOutOfBoundsException("The index is beyond the scope of nesting shape!");
        }

    }

    public int shapeCount (){return shapes.size();}

    public int indexOf(Shape shape){

        if(!shapes.contains(shape)){
            return -1;

        }else{

            return shapes.indexOf(shape);
        }
    }

    public boolean contains (Shape shape ){
        return shapes.contains(shape);
    }



}
