package abstraction;

public class Bird {

	String color;
	String size;
	
	public void fly() {
		System.out.println("I can fly!");
	}
}

class Bluebird extends Bird{
	public void fly() {
		System.out.println("I can fly very far and high!");
	}
}

class yellowBird extends Bird{
	public void fly() {
		System.out.println("I cant fly all that high!");
	}
}