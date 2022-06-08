package bounce;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * Simple GUI program to show an animation of shapes. Class AnimationViewer is
 * a special kind of GUI component (JPanel), and as such an instance of
 * AnimationViewer can be added to a JFrame object. A JFrame object is a
 * window that can be closed, minimised, and maximised. The state of an
 * AnimationViewer object comprises a list of Shapes and a Timer object. An
 * AnimationViewer instance subscribes to events that are published by a Timer.
 * In response to receiving an event from the Timer, the AnimationViewer iterates
 * through a list of Shapes requesting that each Shape paints and moves itself.
 *
 * @author Ian Warren
 */
@SuppressWarnings("serial")
public class AnimationViewer extends JPanel implements ActionListener {
    // Frequency in milliseconds for the Timer to generate events.
    private static final int DELAY = 20;

    // Collection of Shapes to animate.
    private List<Shape> shapes;

    private Timer timer = new Timer(DELAY, this);

    private List<Shape> nestingShapes;

    /**
     * Creates an AnimationViewer instance with a list of Shape objects and
     * starts the animation.
     */
    public AnimationViewer() {
        shapes = new ArrayList<Shape>();

        // Populate the list of Shapes.
//        shapes.add(new RectangleShape(0, 0, 2, 3));
//        shapes.add(new RectangleShape(10, 10, 3, -1));
//        shapes.add(new OvalShape(20,20,2,3,80,120,"#_#"));
//        shapes.add(new OvalShape(30, 30,3,2,80,50,"XX"));
//        shapes.add(new GemShape(40,40,1,3,80,50,"Gem"));
//        shapes.add(new GemShape(50,50,2,2,30,39));
//
//        shapes.add(new DynamicRectangleShape(5,5,3,3,100,100, Color.PINK, Color.GREEN,"^_^"));
//        shapes.add(new DynamicRectangleShape(5,5,4,-5,100,100, Color.CYAN, Color.YELLOW));
        shapes.add(new DynamicRectangleShape(5,5,2,2,80,80, Color.MAGENTA));

        Shape r = new RectangleShape(15,15,2,-2,76,76);
        BorderShape b = new BorderShape(r, "..");
        BorderShape c = new BorderShape(b,",,");
        shapes.add(new BorderShape(c,"oo"));

        NestingShape midRectangleShape = new NestingShape(65, 65, 1,1,150,150,"OKKKKK");
        NestingShape bottomRectangleShape = new NestingShape(75, 75, -2,2,55,55,"!!!!");
        Shape oShape = new OvalShape(85, 85, 5,-2,50,50,"^^^");
        NestingShape nestingShape = new NestingShape(60,60,2,2,250,250,"+++++");
        nestingShape.add(midRectangleShape);
        midRectangleShape.add(bottomRectangleShape);
//       midRectangleShape.add(bottomRectangleShape);
        nestingShape.add(oShape);
        System.out.println(nestingShape.shapeCount());
        shapes.add(nestingShape);


        // Start the animation.
        timer.start();
    }

    /**
     * Called by the Swing framework whenever this AnimationViewer object
     * should be repainted. This can happen, for example, after an explicit
     * repaint() call or after the window that contains this AnimationViewer
     * object has been opened, exposed or moved.
     */
    public void paintComponent(Graphics g) {
        // Call inherited implementation to handle background painting.
        super.paintComponent(g);

        // Calculate bounds of animation screen area.
        int width = getSize().width;
        int height = getSize().height;

        // Create a GraphicsPainter that Shape objects will use for drawing.
        // The GraphicsPainter delegates painting to a basic Graphics object.
        Painter painter = new GraphicsPainter(g);

        // Progress the animation.
        for (Shape s : shapes) {
            s.paint(painter);
            if(s.text != null){
            s.drawText(painter);
            }
            s.move(width, height);
        }
    }

    /**
     * Notifies this AnimationViewer object of an ActionEvent. ActionEvents are
     * received by the Timer.
     */
    public void actionPerformed(ActionEvent e) {
        // Request that the AnimationViewer repaints itself. The call to
        // repaint() will cause the AnimationViewer's paintComponent() method
        // to be called.
        repaint();
    }


    /**
     * Main program method to create an AnimationViewer object and display this
     * within a JFrame window.
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Animation viewer");
                frame.add(new AnimationViewer());

                // Set window properties.
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
