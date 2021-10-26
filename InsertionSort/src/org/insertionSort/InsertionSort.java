package org.insertionSort;

public class InsertionSort {

	public static void main ( String args [] ) {
		int [] arr = { 2,5,9,6,4,2,4,3,1,5 };
		insertionSort(arr);
		for ( int a : arr )
			System.out.println(a);
	}
	
	
	public static void insertionSort ( int[] arr) {
		 for ( int i=0; i<arr.length-1;i++ ) {
			 for ( int j=i,k=i+1;j>=0;j--,k--) {
				 if( arr[k]<arr[j] ) {
					 int temp = arr[k];
					 arr[k]=arr[j];
					 arr[j]=temp;
				 }
			 }
			 for (int a : arr ) {
				 System.out.print(a);
			 }
			 System.out.println(",");
		 }
	}
}
