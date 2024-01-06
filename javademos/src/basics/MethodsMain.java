package basics;

public class MethodsMain {

	public static void main(String[] args) {
		//className objname=new className
		MethodExample m=new MethodExample();
		int sum=m.addNumbers();
		System.out.println(sum);
		System.out.println(m.addNumbers());
	}
}
