package bounce;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;



public class TestDynamicRectangleShape {

    private MockPainter painter;


    @Before
    public void setUp() {
        painter = new MockPainter();
    }



    @Test
    public void testShapeMoveWithBounceOffRight() {
        DynamicRectangleShape shape = new DynamicRectangleShape(100, 20, 12, 15, 25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 100,20,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 110,35,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 98,50,25,35)(dynamicrectangle null)" , painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffLeft() {
        DynamicRectangleShape shape = new DynamicRectangleShape(10, 20, -12, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 10,20,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 0,35,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 12,50,25,35)(dynamicrectangle null)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffBottom() {
        DynamicRectangleShape shape = new DynamicRectangleShape(90, 90, 0, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(135, 135);
        shape.paint(painter);
        shape.move(135, 135);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,90,25,35)(dynamicrectangle null)(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,85,25,35)(dynamicrectangle null)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTop() {
        DynamicRectangleShape shape = new DynamicRectangleShape(50, 90, 0, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 50,90,25,35)(dynamicrectangle null)(dynamicrectangle null)(dynamicrectangle null)(rectangle 50,100,25,35)(dynamicrectangle null)(dynamicrectangle null)(dynamicrectangle null)(rectangle 50,85,25,35)(dynamicrectangle null)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        DynamicRectangleShape shape = new DynamicRectangleShape(90, 90, 12, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,90,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 100,100,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 88,85,25,35)(dynamicrectangle null)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndLeft() {
        DynamicRectangleShape shape = new DynamicRectangleShape(10, 90, -12, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 10,90,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 0,100,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 12,85,25,35)(dynamicrectangle null)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffBottomAndLeft() {
        DynamicRectangleShape shape = new DynamicRectangleShape(10, 90, -12, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 10,90,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 0,100,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 12,85,25,35)(dynamicrectangle null)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndRight() {
        DynamicRectangleShape shape = new DynamicRectangleShape(90, 90, 12, 15,25, 35, Color.blue, "");
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(dynamicrectangle null)(dynamicrectangle null)(rectangle 90,90,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 100,100,25,35)(dynamicrectangle null)(dynamicrectangle java.awt.Color[r=0,g=0,b=255])(rectangle 88,85,25,35)(dynamicrectangle null)", painter.toString());
    }
}
