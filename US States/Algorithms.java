public class Algorithms {
	
	
	/**
	 * Determines the closest pair of points. Brute-force solution is used.
	 * 
	 * @param points - input points. Array is assumed to be fully populated.
	 * @param indices - indices output array containing the indices of closest pair.
	 */
	public static void closestPairOfPoints(Point[] points, int[] indices) {
		double minDistance = Double.MAX_VALUE;
		
		for(int i = 0; i < points.length; i++) {
			for(int j = i+1; j < points.length; j++) {
				double d = points[i].distance(points[j]);
				if(d<minDistance) {
					minDistance = d;
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
	}
	
	/**
	 * How did the line turn?
	 */
	public static int turnDirection(Point p0, Point p1, Point p2) {
		
		// To confirm the correct direction, you can just change the -1 and 1 to configure it.
		double D;
		D = (p0.getX()*p1.getY() + p1.getX()*p2.getY() + p2.getX()*p0.getY())
				- (p1.getX()*p0.getY() + p2.getX()*p1.getY() + p0.getX()*p2.getY());
		
		if(D > 0) { // Turn Left (Right for the print on screen)
			return -1;
		}
		else if(D == 0) { // Go straight
			return 0;
		}
		else { // Turn Right (Left on screen)
			return 1;
		}
	}
	
	/**
	 * Checks if the point passed is part of any of the rectangles passed in the
	 * rectangle array.
	 * @param rArray - Array of rectangles
	 * @param p
	 * @return - The index in the array if point is in a rectangle, -1 otherwise.
	 */
	public static int isPointInSet(Rectangle[] rArray, Point p) {
		for(int i = 0; i < rArray.length; i++) {
			if(rArray[i].isPointInRectangle(p)) return i;
		}
		
		return -1;
	}
}
