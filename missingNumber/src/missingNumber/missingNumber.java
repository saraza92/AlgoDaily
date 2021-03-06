package missingNumber;

import java.util.List;
import java.util.ArrayList;

public class missingNumber {

	public static void main(String args[]) {
		int[] numArr = { 1, 2, 3, 4, 6, 9 };
		List<Integer> missing = missingNumbers(numArr);
		for (Integer a : missing)
			System.out.println(a);
	}

	static List<Integer> missingNumbers(int[] numArr) {
		List<Integer> missing = new ArrayList<>();
		for (int i = 0, j = 1; j < numArr.length; i++, j++) {
			if (numArr[j] - numArr[i] != 1) {
				for (int k = numArr[i] + 1; k < numArr[j]; k++)
					missing.add(k);
			}
		}
		return missing;
	}

}
