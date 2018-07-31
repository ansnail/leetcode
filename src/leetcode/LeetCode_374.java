package leetcode;

public class LeetCode_374 {

	public static void main(String[] args) {
		System.out.println(guessNumber(2));

	}

	public static int guessNumber(int n) {
		if (guess(n) == 0) {
			return n;
		}
		int left = 0;
		int right = n;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (guess(mid) == 0) {
				return mid;
			} else if (guess(mid) == -1) {
				right = mid - 1;
			} else {
				left = mid + 1;
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
