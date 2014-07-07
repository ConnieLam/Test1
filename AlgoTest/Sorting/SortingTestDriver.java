/**
 * 
 */
package Sorting;

import java.util.Random;

/**
 * @author lams
 *
 */
public class SortingTestDriver {

	/**
	 * 
	 */
	public SortingTestDriver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[6];
		for (int i = 0;i<arr.length;i++){
			arr[i] = new Random().nextInt(100);
			System.out.print(arr[i]+",");
		}
		System.out.println();
		mergeSort ms = new mergeSort();
		ms.MergeSort(arr, 0, arr.length-1);
		ms.print(arr, 0, 0, "0");
		
		
	}

}
