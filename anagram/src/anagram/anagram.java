package anagram;

import java.util.Arrays;
import java.util.HashMap;

public class anagram {

	public static void main(String args[]) {
		String a = " anwa12r";
		String b = "rawna 12";
		System.out.println(isAnagram(a, b));

	}

	static boolean isAnagram(String a, String b) {
		char[] aChar = a.toLowerCase().toCharArray();
		char[] bChar = b.toLowerCase().toCharArray();
	
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		return Arrays.equals(aChar,bChar);
		
	}
	static boolean isAnagramHashMap(String a, String b) {

		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (char c : a.toCharArray())
			if (hashMap.containsKey(c)) {
				hashMap.replace(c, hashMap.get(c) + 1);
			} else
				hashMap.put(c, 1);
		for (char c : b.toCharArray())
			if (hashMap.containsKey(c)) {
				if (hashMap.get(c) > 1) {
					hashMap.replace(c, hashMap.get(c) - 1);
				} else
					hashMap.remove(c);
			} else
				return false;

		if (hashMap.isEmpty())
			return true;

		return false;
	}
}
