package polymorphism;

public class Shape {

	public void area() {
		System.out.println("Formula for areas");
	}
}

class Square extends Shape{
	public void area() {
		System.out.println("Area of square: a*a");
	}
}
class Circle extends Shape{
	public void area() {
		System.out.println("Area of ciecle: 3.14*r*r");
	}
}
class polymorphism{
	public static void main(String[] args) {
		Shape s;
		s=new Shape();
		s.area();
		s=new Square();
		s.area();
	}
}