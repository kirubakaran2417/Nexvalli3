package polymorphism;

public class Example1 {

	//polymorphism()-single entity with multiple forms
	
	//overloading()- same method name with different parameters
	//overriding()- same method name with same parameters in paret and child class
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(double a,double b) {
		System.out.println(a+b);
		
	}
	public void add(String a,int b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.add("aabreeq",22);
	}
}
