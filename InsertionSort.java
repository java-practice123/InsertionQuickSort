package com.example.javabasics;

public class InsertionSort {

	public static void main(String[] args) {
		int []a = {8,10,2,1,3,4};
		System.out.println("Before Sorting");
		displayArrayElements(a);
		System.out.println();
		System.out.println("---------------------------");
		
		insertionSort(a);
		
		System.out.println("After Sorting");
		displayArrayElements(a);
		
	}
	
		private static void insertionSort(int[] a) {
			for(int i=1;i<a.length;i++) {// O(n)
				int temp= a[i],j = i; //O(1)
				while(j> 0 && a[j-1] > temp) {
					a[j]=a[j-1];
					j--;
				}
				a[j]=temp;
				
			}
		}

	private static void displayArrayElements(int[] a) {
		for(int ar:a) {
			System.out.print(ar+" ");
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
}
