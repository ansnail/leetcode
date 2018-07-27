package leetcode;

public class LeetCode_461 {

	public static void main(String[] args) {
		int[] nums = { 4, 14, 2 };
		System.out.println(totalHammingDistance(nums));
	}

	public static int totalHammingDistance(int[] nums) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if ((nums[j] & 1) != 0) {
					count++;
				}
				nums[j] >>= 1;
			}
			sum += count*(nums.length - count);
		}
		return sum;
	}
}
