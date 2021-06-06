package com.dsa.sorting;


public class BubbleSort {

	private void bubsort(int arr[]) {
		int temp = 0;
		int n = arr.length;
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("\nPass: ");
			for (int k: arr) {
				System.out.print(k+" ");
			}	
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {4,1111,12,71221,9,3,4334,12221,0,235,76573};
		System.out.println("Original Array:");
		for (int l: arr) {
			System.out.print(l+" ");
		}
		BubbleSort b1 = new BubbleSort();
		b1.bubsort(arr);
	}

}
