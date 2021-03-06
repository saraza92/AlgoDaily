package com.org.practise;

import java.util.HashMap;
import java.util.Map;

public class LonelyNumber {
	public static void main(String[] args) {

		int a = lonelyNumber(new int[] { 1, 2, 3, 4, 3, 2, 1 });
     	System.out.println(a);
	}

	public static int lonelyNumber(int[] arr) {

		//return Arrays.stream(arr).reduce((x, y)->x^y).getAsInt();
		
		
		Map<Integer, Integer> map = new HashMap<>();
		int i = 0;
		while (i < arr.length) {
			if (map.containsKey(arr[i]))
				map.remove(arr[i]);
			else
				map.put(arr[i], 0);
			i++;
		}

		
		return (int)map.keySet().toArray()[0];
		
		
	}
}
