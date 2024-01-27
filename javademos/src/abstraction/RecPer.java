package abstraction;

public class RecPer implements Rectangle {

	@Override
	public void calc(int l, int b) {
		int perimeter = 2*(l+b);//implmentation
		System.out.println("Perimeter of rectangle: " + perimeter);
	}
}
