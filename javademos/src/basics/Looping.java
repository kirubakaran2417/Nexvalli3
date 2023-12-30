package basics;

public class Looping {
	//Looping is a block of code that will be executed repeatedly until a certain condition holds false
	
	/*
	 *while-entry-controlled
	 *do while-exit controlled
	 *for loop-entry-controlled
	 */
	
	//loops are also known as iterating statements
	//Imagine you are asked to print the calue of 2²,2^3....you can declare x=2
	public static void main(String[] args) {
	/*
	 * Initialization expression
	 * Test expression
	 * body of the loop
	 * update expression
	 */
		
		//while loop
		
		int i=1;
		System.out.println("=====while loop=====");
		while(i<4) {
			System.out.println(i);
			i++;
		}
		
		
		int j=6;
		System.out.println("=====do while loop=====");

		do {
			System.out.println(j);
			j++;
		}while(j<5);
		System.out.println("=====for loop=====");
		for(int k=0;k<5;k++) {
			System.out.println(k);
		}
		
		5
		5*4*3*2*1
	}
	
}
