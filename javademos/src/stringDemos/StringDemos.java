package stringDemos;

public class StringDemos {
	/*
	 * String is a class for representing sequence of characters and it is used for creating and manipulating strings.
	 * string methods-concat(),charAt(),contains(),endsWith(),indexOf(),
	 * lastIndexOf(),length(),replace(),split(),substring(),valueOf(),valueOf(),toUpperCase(),toLowerCase()
	 */
	public static void main(String[] args) {
		char c='a';
		//using char[] array
		char[] arr= {'j','a','v','a'};
		System.out.println(arr);
		//using String
		String str="java";
		System.out.println(str);
		//How to create String
		//1.using string literal
		String str1="java";
		String str3="JAVA";
		//2.using new keyword
		String str2=new String("java");
		//compare two strings
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		String str4=str1+str3;
		System.out.println(str4);
	}
}
