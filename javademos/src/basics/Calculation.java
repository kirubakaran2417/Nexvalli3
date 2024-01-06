package basics;

public class Calculation {

	int a=10;
	int b=20;//global variables
	
	public int sum() {
		int result=a+b;
		return result;
	}
	public int sub() {
		int result=a-b;
		return result;
	}
	public int mul() {
		int v1=3;
		int v2 = 4;//local variables
		int result=v1*v2;
		return result;
	}
	public int div() {
		int result=a/b;
		return result;
	}
	public static void main(String[] args) {
		Calculation c=new Calculation();
		System.out.println(c.sum());
		System.out.println(c.sub());
		System.out.println(c.mul());
	}
}
