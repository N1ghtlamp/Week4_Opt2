package csc372_week4_opt2;

// Class “Triangle” extending “Shape”
public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

// Constructor
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

// Implement the area method
	@Override
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

// Implement the perimeter method
	@Override
	public double perimeter() {
		return side1 + side2 + side3;
	}

// Implement toString method
	@Override
	public String toString() {
		return "Triangle with area: " + area() + " and perimeter: " + perimeter();
	}
}
