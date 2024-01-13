package stringDemos;

public class StringMethods {
	public static void main(String[] args) {
		//initializing a sample string
		String sampleString="Hello, World!";  //string is immutable
		//1.length()-Returns the length of the string
		int length=sampleString.length();
		System.out.println("The length of the string is: "+length);
		//2.charAt()-Returns the character at the specified index
		char c=sampleString.charAt(7);
		System.out.println("The character at index 7 is: "+c);
		//3.concat()-Concatenates the specified string to the end of this string
		String newString=sampleString.concat(" Welcome to java!");
		System.out.println("The new string is: "+newString);
		//4.substring()-Returns a new string that is a substring of this string
		String subString=sampleString.substring(0,5);
		System.out.println("The substring is: "+subString);
	    //5.contains()-Returns true if this string contains the specified sequence of char values
		boolean contains=sampleString.contains("z");
		System.out.println("The string contains the character W: "+contains);
		//indexOf()-Returns the index within this string of the first occurrence of the specified character
		int index=sampleString.indexOf("W");
		System.out.println("The index of the character W is: "+index);
		//lastIndexOf()-Returns the index within this string of the last occurrence of the specified character
		int lastIndex=sampleString.lastIndexOf("l");
		System.out.println("The last index of the character l is: "+lastIndex);
		//replace()-Replaces all the occurrences of a substring in this string with another string
		String replaceString=sampleString.replace("World", "Java");
		System.out.println("The new string is: "+replaceString);
		//toCharArray()-Converts this string to a new character array
		char[] charArray=sampleString.toCharArray();
		//toupperCase()-Converts all of the characters in this String to upper case
		String upperCase=sampleString.toUpperCase();
		System.out.println("The new string is: "+upperCase);
		//toLowerCase()-Converts all of the characters in this String to lower case
		String lowerCase=sampleString.toLowerCase();
		System.out.println("The new string is: "+lowerCase);
		//trim()-Returns a string whose value is this string, with any leading and trailing whitespace removed
		String stringwithspaces="                               Hello, World!                               ";
		System.out.println("The original string is: "+stringwithspaces);
		String trimmedString=stringwithspaces.trim();
		System.out.println("The trimmed string is: "+trimmedString);
		
	}
}
