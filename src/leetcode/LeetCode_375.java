package leetcode;

public class LeetCode_375 {

	public static void main(String[] args) {
		System.out.println(guessNumber(2));

	}

	public static int guessNumber(int n) {
		int money = 0;
		if (n == 1) {
			return 1;
		}
		int left = 0;
		int right = n;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (mid == 0) {
				return money;
			} else if (guess(mid) == -1) {
				right = mid - 1;
				money += mid;
			} else {
				left = mid + 1;
				money += left;
			}
		}
		return 0;
	}

	public static int guess(int m) {
		int target = 1;
		if (m == target) {
			return 0;
		} else if (m < target) {
			return -1;
		} else {
			return 1;
		}
	}

}
