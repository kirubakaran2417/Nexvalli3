package inheritance;

public class Child extends Parent {

	int c=a+b;
	String phone="iphone15";
	
	public void camera() {
		System.out.println("iphone15 camera");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}
