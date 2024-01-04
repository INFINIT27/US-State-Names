import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GraphDisplay extends JPanel implements MouseMotionListener
{
    GeometricObject[] gArray; //geometric objects
    private BufferedImage image; //background image
    String description; //description of map element
    Rectangle[] rArray; // Rectangle array.
    /**
     * Parameterized constructor.
     */
    public GraphDisplay(int frameWidth, int frameHeight, GeometricObject[] g)
    {
        gArray = g;
        description = "";
        Dimension d = new Dimension(frameWidth, frameHeight);
        setPreferredSize(d); //sets the preferred size of this panel
        addMouseMotionListener(this);
        //opens/read image file
        try
        {
            image = ImageIO.read(new File("us_map.png"));
        }
        catch (IOException ex)
        {
            System.out.println("Image file not found!");
        }                
    }
    
    /**
     * This constructor will accept the dimensions for the frame, 
     * as well as a rectangle array that will hold the information for each
     * state.
     * 
     * @param frameWidth - Width of the frame
     * @param frameHeight - Height of the frame
     * @param r - Array of rectangles
     */
    public GraphDisplay(int frameWidth, int frameHeight, Rectangle[] r)
    {
        rArray = r; // Store and give access to the rectangle array in other methods of this class.
        description = ""; 
        Dimension d = new Dimension(frameWidth, frameHeight);
        setPreferredSize(d); //sets the preferred size of this panel
        addMouseMotionListener(this);
        
        // Opens and reads the us_map.png file.
        try
        {
            image = ImageIO.read(new File("us_map.png"));
        }
        catch (IOException ex)
        {
            System.out.println("Image file not found!");
        }                
    }
    
    public void mouseDragged(MouseEvent e){}

    /**
     * Determines which element the mouse button is hovering on and sets 
     * output string accordingly.
     * 
     * @param e contains current location of mouse
     */
    public void mouseMoved(MouseEvent e) {
    	
        // This is the current point of the cursor.
    	Point p = new Point(e.getPoint().x, e.getPoint().y);
        
    	// This loop goes through the array and checks if the
    	// current cursor point is in the rectangle.
    	for(Rectangle r:rArray) {
        	if(r.isPointInRectangle(p)) { 
        		description = r.getRectangleName(); // If its in the rectangle
        											// update the description.
        	}
        }
    	repaint();
    }
    
    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
    @Override
    public void paint(Graphics g)
    {        
        super.paint(g); //clears window
        
        //draws background image
        Dimension d = getSize();
        g.drawImage(image, 0, 0, d.width, d.height, this);
        
        // The following loop, goes through all the rectangles and
        // updates their colour, and if you want to highlight those
        // rectangle in the frame, uncomment the r.draw(g); line.
        // 
        // All the rectangles with the same colour mark the same state.
        
        for (Rectangle r:rArray)
        {
        	r.setRectangleColor();
        	r.setInteriorColor(r.getColor());
            // r.draw(g); //invokes object's draw method through polymorphism
        }
        
        //outputs description
        g.setColor(new Color(64, 64, 64, 128));
        g.fillRoundRect(590, 420, 160, 30, 5, 5); // Bottom Right textfield for output
        g.setColor(Color.WHITE);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        g.drawString(description, 595, 440); //outputs description of map element
        
    }
}
