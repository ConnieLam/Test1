/**
 * 
 */
package Sorting;

/**
 * @author lams
 * 
 */
public class mergeSort {

	/**
	 * 
	 */
	private int[] arrNumbers = null;

	public mergeSort() {
		// TODO Auto-generated constructor stub

	}

	public void MergeSort(int[] arr, int low, int high) {
		int mid;
		if (arr != null) {
			if (low < high) {
				mid = (low + high) / 2;
				System.out.println ("low " + low + ", middle "+mid +", high "+high);
				MergeSort(arr, low, mid);
				//print(arr,low,mid,"left");
				MergeSort(arr, mid + 1, high);
				//print(arr,mid+1,high,"right");
				merge(arr,low,mid,high);
			
			}
		}

	}

	public void merge(int[] arr, int low, int middle, int high) {
		int[] helper = new int[arr.length];

		for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
		}
		print(arr,low,high,"merge");
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;

		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				arr[current] = helper[helperLeft];
				helperLeft++;
			}else{
				arr[current]=helper[helperRight];
				helperRight++;
			}
			current++;

		}
		int remain = middle - helperLeft;
		for(int i =0; i<=remain ;i++)
			arr[current+i] = helper[helperLeft+i];
	}

	
	public void print (int [] arrs ,int low , int high,String side){
		System.out.println ("Working on side: " + side +" low = "+ low +" high= " +high);
		String res = "" ;
		for (int a:arrs)
			res +=  (a +",");
		
		
		System.out.println (res.substring(0,res.length()-1)+"\n");
	
	}
}
