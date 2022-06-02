package bounce;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TestDynamicRectangleShape {

    private MockPainter painter;


    @Before
    public void setUp() {
        painter = new MockPainter();
    }



    @Test
    public void testShapeMoveWithBounceOffRight() {
        DynamicRectangleShape shape = new DynamicRectangleShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        assertEquals("(rectangle 100,20,25,35)(dynamicrectangle java.awt.Color[r=0,g=255,b=255])(rectangle 100,20,25,35)(dynamicrectangle null)(rectangle 110,35,25,35)(dynamicrectangle java.awt.Color[r=0,g=255,b=0])(rectangle 110,35,25,35)(dynamicrectangle null)(rectangle 98,50,25,35)(dynamicrectangle java.awt.Color[r=0,g=255,b=0])(rectangle 98,50,25,35)(dynamicrectangle null)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffLeft() {
        DynamicRectangleShape shape = new DynamicRectangleShape(10, 20, -12, 15);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        assertEquals("(rectangle 10,20,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 0,35,25,35)(dynamicrectangle java.awt.Color[r=255,g=175,b=175])(rectangle 0,35,25,35)(dynamicrectangle null)(rectangle 12,50,25,35)(dynamicrectangle java.awt.Color[r=255,g=175,b=175])(rectangle 12,50,25,35)(dynamicrectangle null)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffBottom() {
        DynamicRectangleShape shape = new DynamicRectangleShape(90, 90, 0, 15);
        shape.paint(painter);
        shape.move(135, 135);
        shape.paint(painter);
        shape.move(135, 135);
        shape.paint(painter);
        assertEquals("(rectangle 90,90,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,85,25,35)(dynamicrectangle null)(dynamicrectangle null)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTop() {
        DynamicRectangleShape shape = new DynamicRectangleShape(50, 90, 0, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 50,90,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 50,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 50,85,25,35)(dynamicrectangle null)(dynamicrectangle null)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        DynamicRectangleShape shape = new DynamicRectangleShape(90, 90, 12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 90,90,25,35)(dynamicrectangle java.awt.Color[r=0,g=255,b=0])(rectangle 90,90,25,35)(dynamicrectangle null)(rectangle 100,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 88,85,25,35)(dynamicrectangle null)(dynamicrectangle null)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndLeft() {
        DynamicRectangleShape shape = new DynamicRectangleShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 10,90,25,35)(dynamicrectangle java.awt.Color[r=255,g=175,b=175])(rectangle 10,90,25,35)(dynamicrectangle null)(rectangle 0,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 12,85,25,35)(dynamicrectangle null)(dynamicrectangle null)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffBottomAndLeft() {
        DynamicRectangleShape shape = new DynamicRectangleShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 10,90,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 0,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 12,85,25,35)(dynamicrectangle null)(dynamicrectangle null)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndRight() {
        DynamicRectangleShape shape = new DynamicRectangleShape(90, 90, 12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 90,90,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 100,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(rectangle 88,85,25,35)(dynamicrectangle null)(dynamicrectangle null)", painter.toString());
    }
}
