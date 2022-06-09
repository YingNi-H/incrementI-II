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
        assertEquals("(line 100,20,130,20)(line 130,20,130,50)(line 130,50,100,50)(line 100,50,100,20)", painter.toString());
    }

    @Test
    public void testBig() {
        GemShape shape = new GemShape(100, 20, 0, 0,50,50);
        shape.paint(painter);
        assertEquals("(line 100,45,120,20)(line 120,20,130,20)(line 130,20,150,45)(line 150,45,130,70)(line 130,70,120,70)(line 120,70,100,45)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffRight() {
        GemShape shape = new GemShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        assertEquals("(line 100,20,125,20)(line 125,20,125,55)(line 125,55,100,55)(line 100,55,100,20)(line 110,35,135,35)(line 135,35,135,70)(line 135,70,110,70)(line 110,70,110,35)(line 98,50,123,50)(line 123,50,123,85)(line 123,85,98,85)(line 98,85,98,50)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffLeft() {
        GemShape shape = new GemShape(10, 20, -12, 15);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        assertEquals("(line 10,20,35,20)(line 35,20,35,55)(line 35,55,10,55)(line 10,55,10,20)(line 0,35,25,35)(line 25,35,25,70)(line 25,70,0,70)(line 0,70,0,35)(line 12,50,37,50)(line 37,50,37,85)(line 37,85,12,85)(line 12,85,12,50)", painter.toString());
    }


    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        GemShape shape = new GemShape(90, 90, 12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(line 90,90,115,90)(line 115,90,115,125)(line 115,125,90,125)(line 90,125,90,90)(line 100,100,125,100)(line 125,100,125,135)(line 125,135,100,135)(line 100,135,100,100)(line 88,85,113,85)(line 113,85,113,120)(line 113,120,88,120)(line 88,120,88,85)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffTopAndLeft() {
        GemShape shape = new GemShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(line 10,90,35,90)(line 35,90,35,125)(line 35,125,10,125)(line 10,125,10,90)(line 0,100,25,100)(line 25,100,25,135)(line 25,135,0,135)(line 0,135,0,100)(line 12,85,37,85)(line 37,85,37,120)(line 37,120,12,120)(line 12,120,12,85)", painter.toString());
    }
}
