package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_167 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

	public int[] twoSum2(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
        while (left < right) {
			if (numbers[left]+numbers[right] < target) {
				left++;
			}else if (numbers[left]+numbers[right] > target) {
				right--;
			}else {
				return new int[]{left+1,right+1};
			}
		}
		
		throw new RuntimeException("Error");
    }
	
	public int[] twoSum1(int[] numbers, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < numbers.length;i++){
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i])+1,i+1};
            }else{
                map.put(target - numbers[i],i);
            }
        }
        throw new RuntimeException("Error");
        
    }
	
	
}
