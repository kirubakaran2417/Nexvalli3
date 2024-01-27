package abstraction;

public class RecArea implements Rectangle {

	@Override
	public void calc(int l, int b) {
		int area = l * b;//implmentation
		System.out.println("Area of rectangle: " + area);
	}

	
}
