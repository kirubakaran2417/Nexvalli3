package exersices;

import java.util.Scanner;

public class RectanglePerimeter {

	public double perimeterCalculator(double length, double breadth) {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}
	
	public void getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		
		double perimeter=perimeterCalculator(length,breadth);
		System.out.println("The perimeter of the rectangle is: "+perimeter);
	}
	
	public static void main(String[] args) {
		RectanglePerimeter rp = new RectanglePerimeter();
		rp.getValues();
	}
}
