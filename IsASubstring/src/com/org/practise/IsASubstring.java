package com.org.practise;

public class IsASubstring {
	public static void main(String[] args) {
		System.out.println(isASubstring("sj","sej"));
		System.out.println(isASubsequence("sj", "sej"));
	}

	static boolean isASubstring(String sub, String str) {
		if (sub.length() == 0 && str.length() == 0)
			return true;
		if (sub.length() == 0)
			return true;
		if (sub.length() != 0 && str.length() == 0)
			return false;
		if(sub.length()>str.length())
			return false;

		boolean isSubString = false;

		for (int i = 0; i < str.length()&&isSubString==false; i++) {
			if (str.charAt(i) == sub.charAt(0)) {
				int count = i;
				for (int j = 0; j < sub.length(); j++) {
					if (sub.charAt(j) != str.charAt(count)) {
						break;
					}
					count++;
					if (j == sub.length()-1)
						isSubString = true;
				}
			}
		}
		return isSubString;
	}
	
	static boolean isASubsequence(String sub,String str) {
		if (sub.length() == 0 && str.length() == 0)
			return true;
		if (sub.length() == 0)
			return true;
		if (sub.length() != 0 && str.length() == 0)
			return false;
		if(sub.length()>str.length())
			return false;

		boolean isSubsequence = false;
		
		for(int i=0,j=0;i<str.length()&&isSubsequence==false;i++) {
			if(str.charAt(i)==sub.charAt(j)) {
				j++;
				if(j==sub.length())
					isSubsequence=true;
			}
		}
		return isSubsequence;
	}

}
