package bounce;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;



public class TestGemShape {

    private MockPainter painter;


    @Before
    public void setUp() {
        painter = new MockPainter();
    }


    @Test
    public void testSmall() {
        GemShape shape = new GemShape(100, 20, 0, 0,30,30);
        shape.paint(painter);
        assertEquals("(line 100,20,115,20)(line 115,20,115,50)(line 115,50,100,50)(line 100,50,100,20)", painter.toString());
    }

    @Test
    public void testBig() {
        GemShape shape = new GemShape(100, 20, 0, 0,50,50);
        shape.paint(painter);
        assertEquals("(line 100,20,116,-5)(line 116,-5,132,-5)(line 132,-5,150,20)(line 150,20,132,45)(line 132,45,116,45)(line 116,45,100,20)", painter.toString());
    }


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
