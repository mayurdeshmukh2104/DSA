package com.dsa.searching;

import java.util.Scanner;

public class LinearSearch {
	
	private boolean search(int[] arr, int key) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == key)
					return true;
		}
		return false;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		LinearSearch s1 = new LinearSearch();
		int arr[] = {4,1111,12,71221,9,3,4334,12221,0,235,76573};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search: ");
		int ip = sc.nextInt();
		boolean res = s1.search(arr, ip);
		if (res == true)
				System.out.println("Found in array");
		else
			System.out.println("Not Found!");
	}

}
