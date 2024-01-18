package stringDemos;

import java.util.Scanner;

public class VowelPresence {
    /*
     * program algorithm
     * 1. create a string using a scanner
     * 2. create a boolean variable
     * 3. loop through the string
     * 4. if the character is a vowel
     * 5. set the boolean variable to true
     * 6. return the boolean
     * 
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				flag = true;
				System.out.println("The given string contains a vowel");
				break;
			}
		}
	}
}
