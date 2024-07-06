package csc372_week4_opt2;

// Class “Rectangle” extending “Shape”
public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

@Override
	public double area() {
		return width * length;
	}

@Override
	public double perimeter() {
		return 2 * (width + length);
	}

@Override
	public String toString() {
		return "Rectangle with area: " + area() + " and perimeter: " + perimeter();
	}
}