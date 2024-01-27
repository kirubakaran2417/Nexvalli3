package inheritance;

public class Subclass extends Baseclass {

	
	
	public void display() {
		super.num=30;
		System.out.println("Im child method displaying value of num: "+num);
	}
	
	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.display();
	}
}
