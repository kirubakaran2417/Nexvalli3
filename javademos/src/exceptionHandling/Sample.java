package exceptionHandling;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int a = 10;
		int b = 0;
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("the value of b should not be zero");
		}finally {
			
		}
		System.out.println("Welcome to java");		
		System.out.println("Byee");
	}
}

//full form of jar is
//jar file->java archive resource
