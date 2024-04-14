package com.sunbeam;

import java.util.Comparator;

public class Program01 
{
	static <T> void selectionSort(T[] arr, Comparator<T> c) 
	{
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

	public static void main(String[] args) {

		Double[] arr = new Double[5];

		arr[0] = 1.22;
		arr[1] = 32.2;
		arr[2] = 43.9;
		arr[3] = 0.323;
		arr[4] = 15.09;

		System.out.println("Before Sorting -------------");

		for (double element : arr)
			System.out.println(element);

		class SelectionSortComparator implements Comparator<Double> {

			@Override
			public int compare(Double o1, Double o2) 
			{
				int value = Double.compare(o1, o2);
				return value;
			}

		}

		SelectionSortComparator selectionSortComparator = new SelectionSortComparator();

		Program01.selectionSort(arr, selectionSortComparator);

		System.out.println("\nAfter Sorting -------------");

		for (double element : arr)
			System.out.println(element);

	}

}
