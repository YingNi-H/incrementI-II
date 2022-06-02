package bounce;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBorderShape {

    private MockPainter painter;

    @Before
    public void setUp() {
        painter = new MockPainter();
    }


    @Test
    public void testShapeMoveWithBounceOffRight() {
        BorderShape shape = new BorderShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        assertEquals("(rectangle 100,20,25,35)(rectangle 102,22,21,31)(oval 104,24,17,27)(rectangle 110,35,25,35)(rectangle 112,37,21,31)(oval 114,39,17,27)(rectangle 98,50,25,35)(rectangle 100,52,21,31)(oval 102,54,17,27)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffLeft() {
        BorderShape shape = new BorderShape(10, 20, -12, 15);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        assertEquals("(rectangle 10,20,25,35)(rectangle 12,22,21,31)(oval 14,24,17,27)(rectangle 0,35,25,35)(rectangle 2,37,21,31)(oval 4,39,17,27)(rectangle 12,50,25,35)(rectangle 14,52,21,31)(oval 16,54,17,27)", painter.toString());
    }




    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        BorderShape shape = new BorderShape(90, 90, 12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 90,90,25,35)(rectangle 92,92,21,31)(oval 94,94,17,27)(rectangle 100,100,25,35)(rectangle 102,102,21,31)(oval 104,104,17,27)(rectangle 88,85,25,35)(rectangle 90,87,21,31)(oval 92,89,17,27)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndLeft() {
        BorderShape shape = new BorderShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 10,90,25,35)(rectangle 12,92,21,31)(oval 14,94,17,27)(rectangle 0,100,25,35)(rectangle 2,102,21,31)(oval 4,104,17,27)(rectangle 12,85,25,35)(rectangle 14,87,21,31)(oval 16,89,17,27)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffBottomAndLeft() {
        BorderShape shape = new BorderShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 10,90,25,35)(rectangle 12,92,21,31)(oval 14,94,17,27)(rectangle 0,100,25,35)(rectangle 2,102,21,31)(oval 4,104,17,27)(rectangle 12,85,25,35)(rectangle 14,87,21,31)(oval 16,89,17,27)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndRight() {
        BorderShape shape = new BorderShape(90, 90, 12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 90,90,25,35)(rectangle 92,92,21,31)(oval 94,94,17,27)(rectangle 100,100,25,35)(rectangle 102,102,21,31)(oval 104,104,17,27)(rectangle 88,85,25,35)(rectangle 90,87,21,31)(oval 92,89,17,27)", painter.toString());
    }
}
