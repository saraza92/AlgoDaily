
public class BubbleSort {

	public static void main ( String args[] ) {
		int[] arr = { 9,9 ,4,5,2,3,6,1};
		bubbleSort(arr);
		for(int a : arr)
			System.out.println(a);
	}
	
	static void bubbleSort ( int [] arr) {
		
		for (int i =0;i<arr.length;i++) {
			for ( int j=0,k=1; k<arr.length-i;j++,k++) {
				if (arr[j]>arr[k]) {
					int temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
