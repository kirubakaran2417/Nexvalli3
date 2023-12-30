package basics;

public class Nestedloops {

	public static void main(String[] args) {
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.print(i);
			}
	System.out.println();
		}
		
		System.out.println("=========================================");
		/*
		 * triangle pattern
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
}
}