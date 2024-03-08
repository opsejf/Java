package com.qa;

/**
 * Class to hold the position or centre point of a Shape given as x, y co-ordinates.
 * @author Admin
 */
public class Point {
	private double x, y;

	/**
	 * Constructor to take a pair of x, y co-ordinates and store them as the
	 * position of a Shape
	 *
	 * @param x - double x co-ordinate
	 * @param y - double y co-ordinate
	 */
	public Point(double x, double y){
		this.x = x; this.y = y;
	}

	/**
	 * Getter method to return the x co-ordinate
	 *
	 * No parameters - returns double
	 */
	public double getX() {
		return x;
	}

	/**
	 * Setter method to provide a value for the x co-ordinate
	 * Returns nothing.
	 * @param x - double x co-ordinate
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * Getter method to return the y co-ordinate
	 *
	 * No parameters - returns double
	 */
	public double getY() {
		return y;
	}

	/**
	 * Setter method to provide a value for the y co-ordinate
	 * Returns nothing.
	 * @param y - double y co-ordinate
	 */
	public void setY(double y) {
		this.y = y;
	}

	@Override
	/**
	 * Overrides Object.toString() to give a basic String representation of a Point object
	 * - gives the x and y co-ordinate values
	 * @returns String.
	 * No parameters
	 */
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
