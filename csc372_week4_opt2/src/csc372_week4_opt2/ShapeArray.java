package csc372_week4_opt2;

// Driver Class “ShapeArray”
public class ShapeArray {
	public static void main(String[] args) {
// Instantiate one triangle
		Triangle triangle = new Triangle(3.0, 4.0, 5.0);

// Instantiate one circle
		Circle circle = new Circle(2.0);

// Instantiate one square (using Rectangle class with equal width and length)
		Rectangle square = new Rectangle(2.0, 3.0);

// Store the class instances into an array named "shapeArray"
		Shape[] shapeArray = new Shape[3];
		shapeArray[0] = triangle;
		shapeArray[1] = circle;
		shapeArray[2] = square;

// Loop through the array and print out the instance data of each object
// using the object instance's "toString" method
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
	}
}
