import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends GeometricObject {
	private String rectName; // Name of the rectangle.
	private Point begin;
	private Point end;
	private Color color; // Colour of the rectangle.
	
	/**
	 * Default constructor.
	 */
	public Rectangle() {
		begin = new Point(0, 0);
		end = new Point(1, 1);
	}
	
	/**
	 * This constructor creates a rectangle given two
	 * opposite facing points of a rectangle.
	 * @param b - Beginning point.
	 * @param e - Ending point.
	 */
	public Rectangle(Point b, Point e) {
		begin = new Point(b.getX(), b.getY());
		end = new Point(e.getX(), e.getY());
	}
	
	/**
	 * Draws a rectangle
	 * @param g graphic context
	 */
	@Override
	public void draw(Graphics g) {
		int x = (int)smallestX();
		int y = (int)smallestY();
		int w = (int)width();
		int h = (int)height();
		
		g.setColor(getInteriorColor());
		g.fillRect(x, y, w, h);
		
		g.setColor(getBoundaryColor());
		g.drawRect(x, y, w, h);
	}
	
	/**
	 * Returns the first point defining this rectangle.
	 * 
	 * @return a point (corner) defining this rectangle.
	 */
	public Point getBegin() {
		return new Point(begin.getX(), begin.getY());
	}
	
	/**
	 * Returns the second defining this rectangle.
	 * 
	 * @return a point (corner) defining this rectangle.
	 */
	public Point getEnd() {
		return new Point(end.getX(), end.getY());
	}
	
	/**
	 * Determines the greatest x.
	 * 
	 * @return the greatest x.
	 */
	public double greatestX() {
		return begin.getX() > end.getX() ? begin.getX() : end.getX();
	}
	
	// -----------------------------------------------------------------
	// The following code has been introduced to this class.
	
	/**
	 * This function sets the name of the rectangle. The name
	 * of the rectangle is necessary since it will allow us to
	 * easily differentiate different rectangles from one-another.
	 * @param rectName
	 */
	public void setRectangleName(String rectName) {
		this.rectName = rectName;
	}
	
	/**
	 * This function returns the name of the current rectangle.
	 * @return
	 */
	public String getRectangleName() {
		return rectName;
	}
	
	/**
	 * This function sets the colour of the rectangle. The goal of 
	 * this function is to colour all the rectangles that have the
	 * same name with the same colour, in order to highlight the states
	 * with the same rectangles, and to which state they belong.
	 */
	public void setRectangleColor() {
		
		// For the colour to be consistent, we can translate the 
		// rectangle name into an integer using the hashCode() method,
		// which allows us to be consistent with the colours among
		// different rectangles with the same name.
		int hashCodeRed = (rectName.hashCode())%255;
		int hashCodeGreen = (rectName.hashCode() * 13)%255;
		int hashCodeBlue = (rectName.hashCode() * 17)%255;
		
		if(hashCodeRed < 0) {
			hashCodeRed = 0;
		}
		if(hashCodeGreen < 0) {
			hashCodeGreen = 0;
		}
		if(hashCodeBlue < 0) {
			hashCodeBlue = 0;
		}
		color = new Color(hashCodeRed, hashCodeGreen, hashCodeBlue, 128);
	}
	
	/**
	 * @return - Returns the colour of this rectangle.
	 */
	public Color getColor() {
		return color;
	}
	// ------------------------------------------------------------------
	
	public double greatestY() {
		return begin.getY() > end.getY() ? begin.getY() : end.getY();
	}
	
	public double height() {
		return Math.abs(begin.getY()-end.getY());
	}
	
	public void setBegin(Point p) {
		begin = new Point(p.getX(), p.getY());
	}
	
	public void setEnd(Point p) {
		end = new Point(p.getX(), p.getY());
	}
	
	public double smallestX() {
		return begin.getX() < end.getX() ? begin.getX() : end.getX();
	}
	
	public double smallestY() {
		return begin.getY() < end.getY() ? begin.getY() : end.getY();
	}
	
	@Override
	public String toString() {
		String str = "Rectangle " + super.toString() + "\n";
		str += begin + "\n" + end;
		return str;
	}
	
	public void translate(Vector v) {
		begin.translate(v);
		end.translate(v);
	}
	
	public double width() {
		return Math.abs(begin.getX() - end.getX());
	}
	
	public Rectangle sum(Rectangle r) {
		Vector x1 = new Vector(smallestX(), smallestY());
		Vector y1 = new Vector(greatestX(), greatestY());
		
		Vector x2 = new Vector(r.smallestX(), r.smallestY());
		Vector y2 = new Vector(r.greatestX(), r.greatestY());
		
		Vector sumX = x1.add(x2);
		Vector sumY = y1.add(y2);
		
		
		return new Rectangle(new Point(sumX.getX(), sumX.getY()), new Point(sumY.getX(), sumY.getY()));
	}
	
	boolean isPointInRectangle(Point p) {
		double x = p.getX();
		double y = p.getY();
		if((smallestX() <= x && x <= greatestX()) &&
				(smallestY() <= y && y <= greatestY()))
			return true;
		else
			return false;
	}
}
