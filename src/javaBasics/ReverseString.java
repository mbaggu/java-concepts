package javaBasics;

public class ReverseString {

	public static void main(String[] args) {

		String input = "ManikantaKumar";

		char[] c = input.toCharArray();

		for (int i = c.length-1 ; i >= 0; i--)
			System.out.print(c[i]);

	}

}
