package com.example.javabasics;

public class QuickSortBestCase {

	public static void main(String[] args) {
		int []a = {8,10,2,1,3,4};
		System.out.println("Before Sorting");
		displayArray(a);
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("After Sorting");
		quicksort(a,0,a.length-1);
		displayArray(a);
		
	}

	private static void quicksort(int[] a, int start, int end) {
		
		if(start<end) {
			int pivot = partition(a,start,end);
			quicksort(a, start, pivot-1);
			quicksort(a, pivot+1, end);
		}
	}

	private static int partition(int[] a, int start, int end) {
		int pivot = end;
		int i = start-1;
		for (int j = start; j <= end; j++) {
			if (a[j] <= a[pivot]) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return i;
	}

	private static void displayArray(int[] a) {
		for(int ar:a) {
			System.out.print(ar+" ");
		}
	}
}
