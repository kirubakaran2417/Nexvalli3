package abstraction;

public class Execution {

	public static void main(String[] args) {
		Rectangle r;//creating an interface reference
		r = new RecArea();
		r.calc(10, 20);
		r = new RecPer();
		r.calc(10, 20);
	}
}
