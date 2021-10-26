
public class StringReversal {

	public static void main(String args[]) {
		String a = "njnschnjkdasn j32 uida";
		a = ReverseString(a);
		System.out.println(a);
	}

	static String ReverseString(String str) {
		int i=0,j=str.length()-1;
		char temp;
		char[] tempArray = str.toCharArray();
		while(i<j) {
			temp=tempArray[j];
			tempArray[j]=tempArray[i];
			tempArray[i]=temp;
			i++;
			j--;
			
		}
	i=0;
	str="";
	while(i<tempArray.length) {
		str += tempArray[i];
		i++;
	}
	return str;
	}
}
