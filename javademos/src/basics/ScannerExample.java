package basics;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//Scanner is a class
		//scanner-is used to get inputs from user through console
		/*
		 * nextInt-used to read integers
		 * nextDouble-used to read double values
		 * next-used to read strings
		 * nextline
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the value of a");
		int a=s.nextInt();
		System.out.println("The value of a is: "+a);
	}
}
