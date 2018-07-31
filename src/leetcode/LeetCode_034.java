package leetcode;

public class LeetCode_034 {

	public static void main(String[] args) {
		int[] nums = { 10,10 };
		Utils.printArray(searchRange(nums, 11));
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] results = new int[2];
		results[0] = -1;
		results[1] = -1;
		if (nums.length == 0) {
			return results;
		}
		int start = 0;
		int end = nums.length - 1;
		while (start <= end ) {
			System.out.println("start=" + start + ",end=" + end);
			int mid = (start + end) / 2;
			if (mid < 0 || mid >nums.length -1) {
				
			}
			if (nums[mid] == target) {

				int tmp = mid;
				results[0] = 0;
				while (tmp > 0) {
					tmp--;

					if (nums[mid] != nums[tmp]) {
						results[0] = tmp + 1;
						break;
					}
				}
				Utils.printArray("====", results);

				results[1] = nums.length - 1;
				while (tmp < nums.length - 1) {
					tmp++;
					if (nums[mid] != nums[tmp]) {
						results[1] = tmp - 1;
						break;
					}
				}
				return results;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return results;
	}

}
