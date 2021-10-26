
public class StringReversalRecursion {
	public static String reverseStringRec(String str) {
		if (str.length() == 0)
			return "";
		return str.charAt(str.length() - 1) + reverseStringRec(str.substring(0, str.length() - 1));
	}
}
