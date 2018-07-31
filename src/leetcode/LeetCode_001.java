package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		Utils.printArray(twoSum2(nums, 22));
	}
	
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				 return new int[]{map.get(nums[i]),i};
			}else {
				map.put(target - nums[i], i);
			}
		}
		throw new RuntimeException("Error");
    }
	
	public static int[] twoSum1(int[] nums, int target) {
		int[] results = new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			int tmp = target - nums[i];
			results[0] = i;
			for (int j = i+1; j < nums.length; j++) {
				if (tmp - nums[j] == 0) {
					results[1] = j;
					return results;
				}
			}
		}
		return results;
    }
	
}
