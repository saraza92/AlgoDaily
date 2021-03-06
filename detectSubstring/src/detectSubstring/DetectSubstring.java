package detectSubstring;

public class DetectSubstring {

	public static void main ( String args [] ) {
		System.out.println(detectSubstring("kyahaalhai", "hai"));
	}
	public static int detectSubstring(String a, String b) {
		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) == b.charAt(0)) {
				if (b.length() == 1)
					return i;
				int j = i + 1, k = 1, flag = 1;
				while (j < a.length() && k < b.length()) {
					if (a.charAt(j) != b.charAt(k)) {
						flag = 0;
						break;
					}
					j++;
					k++;
				}
				if (flag == 1)
					return i;
			}
		return -1;
	}
}
