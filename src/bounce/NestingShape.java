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


    @Override
    public void paint(Painter painter) {
//        painter.translate(x,y);
        painter.drawRect(x,y,width,height);
        painter.drawRect(x+5, y+5, width-40,height-40);
        painter.drawOval(x+15, y+15, width-60,height-60);

        painter.drawLine(x+25, y+65, x+25 + (width-80)/3, y+65 - (height-80)/2);
        painter.drawLine(x+25 + (width-80)/3, y+65 - (height-80)/2, x+25 + (width-80)/3*2, y+65 - (height-80)/2);
        painter.drawLine(x+25 + (width-80)/3*2, y+65 - (height-80)/2, x+25 + (width-80), y+65);
        painter.drawLine(x+25 + (width-80), y+65, x+25 + (width-80)/3*2, y+65 + (height-80)/2);
        painter.drawLine(x+25 + (width-80)/3*2, y+65 + (height-80)/2, x+25 + (width-80)/3, y+65 + (height-80)/2);
        painter.drawLine(x+25 + (width-80)/3, y+65 + (height-80)/2, x+25, y+65);




    }

//    public void move( int width , int height ){
//        for(Shape s : shapes){
//            if(! s.equals(shapes.get(0))){
//                this.width = width;
//                this.height = height;
//            }
//        }
//
//
//    }

    public void add(Shape shape) throws IllegalArgumentException{

        if(!shapes.contains(shape) ){

//            && shape.width < shapes.get(0).width
            shapes.add(shape);
        }else{
            throw new IllegalArgumentException("This shape can't fit in or has already contained by this NestingShape!");
        }

    }

    public void remove(Shape shape ){
        shapes.remove(shape);
    }

    public Shape shapeAt ( int index ) throws IndexOutOfBoundsException{
        if(index >= 0 && index < shapes.size()){
            return shapes.get(index);
        }else{
            throw new IndexOutOfBoundsException("The index is beyond the scope of nesting shape!");
        }

    }

    public int shapeCount (){return shapes.size();}

    public int indexOf(Shape shape ){
        if(!shapes.contains(shape)){
            return -1;
        }else{
        int index = 0;
        shape = shapes.get(index);
        return index;
        }
    }

    public boolean contains (Shape shape ){
        return shapes.contains(shape);
    }



}
