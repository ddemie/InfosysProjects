/*

Method Description

Point(double xCoordinate , double yCoordinate )

Initialize the instance variables xCoordinate and yCoordinate appropriately with the values passed to the constructor.
calculateDistance()

Calculate and return the distance of the point from the origin (0,0). The distance can be calculated using the formula given below. 
The distance should be rounded off to 2 decimal digits.
distance=√((x2-x1)2+(y2-y1)2), where x1 and x2 are values of x-coordinates of two points and y1 and y2 are values of y-coordinates of two points

calculateDistance(Point point)

Calculate and return the distance of the point from the 'point' passed to the method. The distance should be rounded off to 2 decimal digits.

*/




public class MethodOverloading{
  
  public static class Point {
    private double xCoordinate;
    private double yCoordinate;
    
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
	public Point(double xCoordinate, double yCoordinate){
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public double calculateDistance() {
		double x1 = getxCoordinate();
		
		double x2 = getyCoordinate();
		
		double squared = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
		
		double round = Math.round(squared * 100)/100.0;
		
		return round;
		
	}
	
	public double calculateDistance(Point point) {
		double x1 = getxCoordinate();
		
		double x2 = getyCoordinate();
		
		double y1 = point.getxCoordinate();
		
		double y2 = point.getyCoordinate();
		
		double distance = Math.sqrt(Math.pow(x1- y1, 2) + Math.pow(x2 - y2, 2));
		
		return Math.round(distance * 100)/100.0;
	}
	
}


public static class Tester {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
    

	}
}

}
