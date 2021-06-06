package com.dsa.sorting;


public class SelectionSort {
	
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i=0; i<n-1; i++) {
			int min_ind = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min_ind])
					min_ind = j;
			}
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
		}
	}
	
	public void print(int arr[]) {
		for (int i : arr)
			System.out.print(i+" ");
	}

	public static void main(String[] args) {
		int arr[] = {1,64,124,6,21,62,77,99,0,69};
		SelectionSort s1 = new SelectionSort();
		s1.sort(arr);
		s1.print(arr);
	}

}
