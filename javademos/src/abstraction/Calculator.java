package abstraction;

public abstract class Calculator {

	//The class which have at least one abstract method is called abstract class
	//what is abstract method ? it is a method without body
	
	abstract void display();
	
	//concrete method 
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
