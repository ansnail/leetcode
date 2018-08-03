package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_000 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		rotate(nums, 3);
	}

	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start++;
			end--;
		}
	}

	public static void rotate2(int[] nums, int k) {
		k = k % nums.length;
		for (int i = 0; i < k; i++) {
			int tmp = nums[nums.length - 1];
			for (int j = nums.length - 2; j >= 0; j--) {
				nums[j + 1] = nums[j];
			}
			nums[0] = tmp;
		}
	}

	public static void rotate(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < col; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0, k = col - 1; j < k; j++, k--) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[i][k];
				matrix[i][k] = tmp;
			}
		}
	}

	public static List<String> fizzBuzz(int n) {
		List<String> dummy = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				dummy.add("FizzBuzz");
			} else if (i % 5 == 0) {
				dummy.add("Buzz");
			} else if (i % 3 == 0) {
				dummy.add("Fizz");
			} else {
				dummy.add(i + "");
			}
		}

		return dummy;
	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int sum = n * (n + 1) / 2;
		for (int i : nums) {
			sum -= i;
		}
		return sum;
	}

	public static boolean isPalindrome(String s) {
		StringBuilder builder = new StringBuilder();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
				builder.append(c);
			}
		}
		for (int i = 0, j = builder.length() - 1; i < j; i++, j--) {
			if (builder.charAt(i) != builder.charAt(j)) {
				return false;
			}
		}
		return true;

	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] data = new int[26];
		for (int i = 0; i < s.length(); i++) {
			data[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			data[t.charAt(i) - 'a']--;
		}
		for (int i : data) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	public static int firstUniqChar(String s) {
		int[] data = new int[26];
		for (int i = 0; i < s.length(); i++) {
			data[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (data[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}

	public static String reverseString(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}

	public static int singleNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum ^= nums[i];
		}
		return sum;
	}

	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

	public static void moveZeroes(int[] nums) {
		int local = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (i != local) {
					nums[local] = nums[i];
				}
				local++;
			}
		}
		for (int i = local; i < nums.length; i++) {
			nums[i] = 0;
		}
		Utils.printArray(nums);
	}

	public static int removeDuplicates(int[] nums) {
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[length] != nums[i]) {
				length++;
				nums[length] = nums[i];
			}
		}
		return ++length;
	}

}
