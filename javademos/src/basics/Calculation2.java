package basics;

import java.util.Scanner;

public class Calculation2 {

	public int add(int a ,int b) {
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Calculation2 c=new Calculation2();
		Scanner s=new Scanner(System.in);
		int v1=s.nextInt();
		int v2=s.nextInt();
		System.out.println(c.add(v1,v2));
	}
}
