package bounce;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A class that implements test cases aimed at identifying bugs in the
 * implementations of classes Shape and RectangleShape.
 *
 * @author Ian Warren
 */
public class TestGemShape {
    // Fixture object that is used by the tests.
    private MockPainter painter;

    /**
     * This method is called automatically by the JUnit test-runner immediately
     * before each @Test method is executed. setUp() recreates the fixture so
     * that there no side effects from running individual tests.
     */
    @Before
    public void setUp() {
        painter = new MockPainter();
    }

    /**
     * Test to perform a simple (non-bouncing) movement, and to ensure that a
     * Shape's position after the movement is correct.
     */
    @Test
    public void testSimpleMove() {
        GemShape shape = new GemShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(500, 500);
        shape.paint(painter);
        assertEquals("(line 100,20,112,20)(line 112,20,112,55)(line 112,55,100,55)(line 100,55,100,20)(line 112,35,124,35)(line 124,35,124,70)(line 124,70,112,70)(line 112,70,112,35)",
                painter.toString());
    }

    /**
     * Test to perform a bounce movement off the right-most boundary and to
     * ensure that the Shape's position after the movement is correct.
     */
    @Test
    public void testShapeMoveWithBounceOffRight() {
        GemShape shape = new GemShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        assertEquals("(line 100,20,112,20)(line 112,20,112,55)(line 112,55,100,55)(line 100,55,100,20)(line 110,35,122,35)(line 122,35,122,70)(line 122,70,110,70)(line 110,70,110,35)(line 98,50,110,50)(line 110,50,110,85)(line 110,85,98,85)(line 98,85,98,50)", painter.toString());
    }

    /**
     * Test to perform a bounce movement off the left-most boundary and to
     * ensure that the Shape's position after the movement is correct.
     */
    @Test
    public void testShapeMoveWithBounceOffLeft() {
        GemShape shape = new GemShape(10, 20, -12, 15);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        assertEquals("(line 10,20,22,20)(line 22,20,22,55)(line 22,55,10,55)(line 10,55,10,20)(line 0,35,12,35)(line 12,35,12,70)(line 12,70,0,70)(line 0,70,0,35)(line 12,50,24,50)(line 24,50,24,85)(line 24,85,12,85)(line 12,85,12,50)", painter.toString());
    }

    /**
     * Test to perform a bounce movement off the bottom right corner and to
     * ensure that the Shape's position after the movement is correct.
     */
    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        GemShape shape = new GemShape(90, 90, 12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(line 90,90,102,90)(line 102,90,102,125)(line 102,125,90,125)(line 90,125,90,90)(line 100,100,112,100)(line 112,100,112,135)(line 112,135,100,135)(line 100,135,100,100)(line 88,85,100,85)(line 100,85,100,120)(line 100,120,88,120)(line 88,120,88,85)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffTopAndLeft() {
        GemShape shape = new GemShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(line 10,90,22,90)(line 22,90,22,125)(line 22,125,10,125)(line 10,125,10,90)(line 0,100,12,100)(line 12,100,12,135)(line 12,135,0,135)(line 0,135,0,100)(line 12,85,24,85)(line 24,85,24,120)(line 24,120,12,120)(line 12,120,12,85)", painter.toString());
    }
}
