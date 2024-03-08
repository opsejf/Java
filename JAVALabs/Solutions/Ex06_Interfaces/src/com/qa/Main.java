package com.qa;

public class Main {

	public static void main(String[] args) {
		//create some objects
		Circle c = new Circle ("circle1", "red", 0,0, 10);
		Circle c2 = new Circle ("circle2", "blue", 10,10, 5);
		Rectangle r = new Rectangle ("rectangle1", "yellow", 0, 0, 10, 10);
		Rectangle r2 = new Rectangle ("rectangle2", "green", 2, 2, 5, 2);
		
		//print out the objects
		System.out.println(c);
		
		System.out.println(c2);
		
		System.out.println(r);
		System.out.println(r2);

		System.out.println(c + ", CentrePoint is: " + c.getCentrePoint() + ", Area is: " + c.getArea());
		
		System.out.println(c2 + ", CentrePoint is: " + c2.getCentrePoint() + ", Area is: " + c2.getArea());
		
		System.out.println(r + ", CentrePoint is: " + r.getCentrePoint() + ", Area is: " + r.getArea());
		if(r.isSquare()){
			System.out.println(r + " is a square");
		}
		System.out.println(r2 + ", CentrePoint is: " + r2.getCentrePoint() + ", Area is: " + r2.getArea());
		if(r2.isSquare()){
			System.out.println(r2 + " is a square");
		}
		// Move a Circle
		System.out.println("Circle location before move: " + c.getCurrentLocation());
		c.move(10.5, 4.3);
		System.out.println("Circle location after move: " + c.getCurrentLocation());

		Triangle t1 = new Triangle("Tripod", "Green", 3.2, 5.8, 1, 2, 3);
		Pentagon p1 = new Pentagon("White House", "White", 432678.2, 9876547.8, 90807, 80605,
				65430, 12345, 67890);
		Hexagon h1 = new Hexagon("Pie", "Brown", 0, 0, 1, 2, 3, 4, 5, 6);
		t1.log(t1.getName() + " checking in");
		p1.log(p1.getName() + " signing in");
		h1.log(h1.getName() + " very tasty");
	}
}
