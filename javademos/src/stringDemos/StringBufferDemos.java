package stringDemos;

public class StringBufferDemos {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello, ");
		System.out.println(sb);
		//1.append()-Appends the specified string to the end of this string
		sb.append("World!");
		System.out.println(sb);
		//2.insert()-Inserts the string representation of an object into this string at the specified index
		sb.insert(7, "Java ");
		System.out.println(sb);
		//3.delete()-Deletes the characters in a substring of this string
		sb.delete(7, 12);
		System.out.println(sb);
		//4.reverse()-Reverses the characters in this string
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		//5.deleteCharAt()-Deletes the character at the specified index
		sb.deleteCharAt(7);
		System.out.println(sb);
		//6.setCharAt()-Replaces the character at the specified index
		sb.setCharAt(7, '!');
		System.out.println(sb);
	}
}
