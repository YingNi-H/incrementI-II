package bounce;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBorderShape {

    private MockPainter painter;

    private Shape shape;

    private BorderShape border;

    @Before
    public void setUp() {

        painter = new MockPainter();
    }


    @Test
    public void testShapeMoveWithBounceOffRight() {
        shape = new RectangleShape(100,20,12,15, 25, 35);
        border = new BorderShape(shape, null);

        border.paint(painter);
        shape.paint(painter);
        shape.move(135, 10000);
        border.paint(painter);
        shape.paint(painter);
        shape.move(135, 10000);
        border.paint(painter);
        shape.paint(painter);
        assertEquals("(rectangle 98,18,29,39)(rectangle 100,20,25,35)(rectangle 100,20,25,35)(rectangle 98,18,29,39)(rectangle 110,35,25,35)(rectangle 110,35,25,35)(rectangle 98,18,29,39)(rectangle 98,50,25,35)(rectangle 98,50,25,35)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffLeft() {
        shape = new RectangleShape(10, 20, -12, 15, 25, 35);
        border = new BorderShape(shape, null);
        border.paint(painter);
        shape.paint(painter);
        shape.move(10000, 10000);
        border.paint(painter);
        shape.paint(painter);
        shape.move(10000, 10000);
        border.paint(painter);
        shape.paint(painter);
        assertEquals("(rectangle 8,18,29,39)(rectangle 10,20,25,35)(rectangle 10,20,25,35)(rectangle 8,18,29,39)(rectangle 0,35,25,35)(rectangle 0,35,25,35)(rectangle 8,18,29,39)(rectangle 12,50,25,35)(rectangle 12,50,25,35)", painter.toString());
    }




    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        shape = new RectangleShape(90, 90, 12, 15);
        border = new BorderShape(shape, null);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        assertEquals("(rectangle 88,88,29,39)(rectangle 90,90,25,35)(rectangle 90,90,25,35)(rectangle 88,88,29,39)(rectangle 100,100,25,35)(rectangle 100,100,25,35)(rectangle 88,88,29,39)(rectangle 88,85,25,35)(rectangle 88,85,25,35)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndLeft() {
        shape = new RectangleShape(10, 10, -12, -15);
        border = new BorderShape(shape, null);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        assertEquals("(rectangle 8,8,29,39)(rectangle 10,10,25,35)(rectangle 10,10,25,35)(rectangle 8,8,29,39)(rectangle 0,0,25,35)(rectangle 0,0,25,35)(rectangle 8,8,29,39)(rectangle 12,15,25,35)(rectangle 12,15,25,35)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffBottomAndLeft() {
        shape = new RectangleShape(10, 90, -12, 15);
        border = new BorderShape(shape, null);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        assertEquals("(rectangle 8,88,29,39)(rectangle 10,90,25,35)(rectangle 10,90,25,35)(rectangle 8,88,29,39)(rectangle 0,100,25,35)(rectangle 0,100,25,35)(rectangle 8,88,29,39)(rectangle 12,85,25,35)(rectangle 12,85,25,35)", painter.toString());
    }
    @Test
    public void testShapeMoveWithBounceOffTopAndRight() {
        shape = new RectangleShape(90, 10, 12, -15);
        border = new BorderShape(shape, null);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        shape.move(125, 135);
        border.paint(painter);
        shape.paint(painter);
        assertEquals("(rectangle 88,8,29,39)(rectangle 90,10,25,35)(rectangle 90,10,25,35)(rectangle 88,8,29,39)(rectangle 100,0,25,35)(rectangle 100,0,25,35)(rectangle 88,8,29,39)(rectangle 88,15,25,35)(rectangle 88,15,25,35)", painter.toString());
    }
}
