package TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class TwoSum {

	public TwoSum() {
		// TODO Auto-generated constructor stub
	}

	public int[] Solution(int[] numbers, int target) {
        
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] results = new int[2];
	 
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				results[0] = index+1 ;
				results[1] = i+1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
	 
        
        return results;
    }
	
	
	
}

