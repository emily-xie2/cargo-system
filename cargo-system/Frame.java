// Import classes
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;

/** [Frame.java]
  * Desc: The class for the frame holding the window elements
  * @author Emily Xie & Ali Asghar Bundookwalla
  * @version Oct 2022
  */

public class Frame extends JFrame {
    // Variables
    public static final int WIDTH = 1000, HEIGHT = 800;
    public static Container container;
    public static CardLayout layout;
    
    /**
     * Frame
     * This constructor creates a new Frame object.
     */
    public Frame() {
        // Instantiate objects
        container = getContentPane();
        layout = new CardLayout();
        container.setLayout(layout);
        
        // Set frame methods
        setTitle("Cargo System");
        setSize(WIDTH, HEIGHT); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
}