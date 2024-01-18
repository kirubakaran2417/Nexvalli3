package exersices;

import java.util.Scanner;

public class StrongNumber {

	public void inputAcceptor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		//should call input validator method
		inputValidator(number);
	}
	public void inputValidator(int number) {
		if(number<0) {
			System.out.println("Give proper input not negative number");
		}else if(number==0) {
			System.out.println("Give proper input .....DONT GIVE ZEROOOOOO");
		}else {
			boolean isStrong = strongNumberChecker(number);
			outputprinter(isStrong);
		}
	}
	
	public int factorial(int number) {
		if(number==0 || number==1) {
			return 1;
		}else {
			return number*factorial(number-1);
		}
	}
	
	public boolean strongNumberChecker(int number) {
			int originalNumber = number;
			int sum = 0;
			
			while(number>0) {
				int digit = number%10;   //this operation extracts the last digit from the number
				sum=sum+factorial(digit);
				number=number/10;
			}
			
			return originalNumber==sum;
	}
	public void outputprinter(Object printStatement) {
		System.out.println(printStatement);
		
	}
	
	public static void main(String[] args) {
		StrongNumber sn = new StrongNumber();
		sn.inputAcceptor();
	}
}
