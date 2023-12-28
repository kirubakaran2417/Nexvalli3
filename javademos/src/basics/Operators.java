package basics;

public class Operators {

	/*
	 * Types of operators
	 * 1. Arithmetic operators
	 * 2. Assignment operators
	 * 3. Comparison operators or relational operators
	 * 4. Logical operators
	 * 5. unary operators

	 */
	
	public static void main(String[] args) {
		//arithmetic operators-+,-,*,/,%
		int a=12, b=5;
		//addition operator
		System.out.println("a+b = "+(a+b));
		//subtraction operator
		System.out.println("a-b = "+(a-b));
		//multiplication operator
		System.out.println("a*b = "+(a*b));
		//division operator
		System.out.println("a/b = "+(a/b));    //calculates quotient
		System.out.println("a%b = "+(a%b));    //calculates remainder
		System.out.println("====================================================================");

		//assignment operators
		int c=10;
		int var;
		//assign the value of c to var using =
		var=c;
		System.out.println("var = "+var);
		
		//assigning the value using =+ i.e., 
		//a+=b==>a=a+b    a+=5==>a=a+5
		var+=c;
		System.out.println("var += "+var);
		
		System.out.println("====================================================================");
		
		//relational operators=>,<,>=,<=,==,!=
		int x=10;
		int y=20;
		
		//== operator
		System.out.println(x==y);
		//!= operator
		System.out.println(x!=y);
		//> operator
		System.out.println(x>y);
		//< operator
		System.out.println(x<y);
		//>= operator
		System.out.println(x>=y);
		//<= operator
		System.out.println(x<=y);
		System.out.println("====================================================================");

		//logical operators=>&&,||,!--->AND,OR,NOT
		// expression 1 && expression 2------>(a>b) && (b>c)--true only if both expression1 and expression2 are true
		
		// && operator
		System.out.println((5>3) && (8>5));
		System.out.println((5>3) && (8<5));
		// || operator--true if either expression1 or expression2 is true
		System.out.println((5>3) || (8>5));
		System.out.println((5>3) || (8<5));
		// ! operator--true if expression is false
		System.out.println(!(5>3));
		System.out.println(!(5==3));
		
		System.out.println("====================================================================");

		//unary operators-increment(++)/decrement(--)
		int m=12;
		int n=12;
		
		int result1,result2;
		System.out.println("value of m:  "+m);
		//increment operator
		result1=++m;
		System.out.println("After increment: "+result1);
		//decrement operator
		result2=--n;
		System.out.println("After decrement: "+result2);
		
		System.out.println("====================================================================");

		//++ and -- operator as prefix and postfix
		//if you use the ++ operator as  a prefix like: ++var,the value of var is incremented by 1;then it returns the value
		//if you use the ++ operator as a postfix like: var++,the value of var is returned first; then car is incremented by 1
		
		int var1=5;
		int var2=5;
		
		System.out.println("value of var1:  "+var1); 
		//5 is displayed
		
		//Then var1 is increased to 6
		System.out.print(var1++); 		//5 is displayed
		
	}
}
