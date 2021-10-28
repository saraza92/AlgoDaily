package org.com.practise;

public class AlphabetReversal {

	public static void main(String[] args) {
		System.out.print(reverseOnlyAlphabets("an3war34"));

	}

	static String reverseOnlyAlphabets(String s) {
		char[] charArray = s.toCharArray();

		for (int i = 0, j = charArray.length - 1; i < j;) {
			if (String.valueOf(charArray[i]).matches("[A-Za-z]")) {
				if (String.valueOf(charArray[j]).matches("[A-Za-z]")) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
					i++;
					j--;
				} else
					j--;
			} else
				i++;
		}
		return String.valueOf(charArray);
	}
}
 