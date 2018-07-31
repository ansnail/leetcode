package leetcode;

public class LeetCode_367 {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(5));
	}

	public static boolean isPerfectSquare(int num) {
		if (num == 1) {
			return true;
		}
		int left = 1;
		int right = num / 2;
		int mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;
			System.out.println("right=" + right + ",left=" + left + ",num=" + num);
			if (num == mid * mid) {
				return true;
			} else if (num / mid < mid) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}

}
