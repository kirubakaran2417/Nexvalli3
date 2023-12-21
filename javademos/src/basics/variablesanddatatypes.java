package basics;

public class variablesanddatatypes {

	public static void main(String[] args) {
		//java datatypes and variables
		/*
		 * variable-is a data container that stores the data values during execution
		 */
		//variable declaration
		int count;
		//variable initialization
		count=10;
		//you can combine variable declaration and initialization
		int count1=20;
		
		//datatypes
		//8 primitive datatypes
		
		/*
		 * 1. byte
		 * 2. short
		 * 3. int
		 * 4. long
		 * 5. float
		 * 6. double
		 * 7. char
		 * 8. boolean
		 */
		
		//byte =-128 to 127
		byte mybyte=100;
		System.out.println("byte:  "+mybyte);
		//short =-32768 to 32767
		short myshort=30000;
		short s=(short)2000;
		System.out.println("short:  "+myshort);
		//int =-2147483648 to 2147483647
		int myint=2000000000;
		System.out.println("int:  "+myint);
		//long =-9223372036854775808 to 9223372036854775807
		long mylong=2000l;
		System.out.println("long:  "+mylong);
		//float =-3.4E38 to 3.4E38
		float myfloat=3.4123f;
		System.out.println("float:  "+myfloat);
		//double =-1.7E308 to 1.7E308
		double mydouble=3.4123;
		System.out.println("double:  "+mydouble);
		//char =single character
		char mychar='a';
		System.out.println("char:  "+mychar);
	}
}
