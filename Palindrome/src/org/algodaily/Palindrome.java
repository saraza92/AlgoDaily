package org.algodaily;

public class Palindrome {
	public static void main ( String args [] ) {
		String pal = "ar o ra";
		System.out.println(checkForPalindrome(pal));
	}
	
	static boolean checkForPalindrome(String str) {
		
		
		for ( int i=0,j=str.length()-1;i<j;i++,j--) {
			if (str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
}
