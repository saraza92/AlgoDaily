import java.util.*;

public class ArrayIntersection {

	public static void main ( String args[]) {

		int[] first = {1,2,3,4,5};
		int[] second = {4,5,6,7,8};
		Integer[] answer = arrayIntersection(first,second);
		for ( int a : answer)
			System.out.println(a);
	}
	
	public static Integer[] arrayIntersection(int[] first, int[] second) {
		
		Set<Integer> answer = new HashSet<Integer>();
		for (int i=0;i<first.length;i++) {
			for ( int j=0; j<second.length; j++) {
				if ( first[i]==second[j]) {
					answer.add(first[i]);
				}
			}
		}
		return answer.toArray(new Integer[answer.size()]);
	}
}
