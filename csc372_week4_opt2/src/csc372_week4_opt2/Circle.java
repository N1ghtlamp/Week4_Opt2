package csc372_week4_opt2;

// Class “Circle” extending “Shape”
public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle with area: " + area() + " and perimeter: " + perimeter();
	}
}