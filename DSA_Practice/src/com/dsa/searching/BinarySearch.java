package com.dsa.searching;

import java.util.Scanner;

public class BinarySearch {

	public int[] sort(int arr[]) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public boolean search(int arr[], int key) {
		int size = arr.length;
		int mid = Math.abs(size/2);
		if(key == arr[mid]) {
			return true;
		}
		else if (key<arr[mid]) {
			for(int i=0; i<mid; i++) {
				if (key == arr[i]) {
					return true;
				}
			}
		}
		else{
			for(int i=mid; i<size; i++) {
				if (key == arr[i]) {
					return true;
				}
			}
		}
		return false;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BinarySearch b1 = new BinarySearch();
		int array[] = {1,64,124,6,21,62,77,99,0,69};
		int sorted[] = b1.sort(array);
		System.out.println("Sorted List: ");
		for (int j:sorted) {
			System.out.print(j+" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter input: ");
		int find = sc.nextInt();
		boolean res = b1.search(sorted, find);
		System.out.println("Found? = "+res);
	}

}
