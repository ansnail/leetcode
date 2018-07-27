package leetcode;

public class LeetCode_7 {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(Integer.MAX_VALUE);

	}

	public static int reverse(int x) {
		int result = 0;
		int pop = 0;
		while (x != 0) {
			pop = x % 10;
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}
			result = result * 10 + pop;
			x /= 10;
		}

		return result;
	}

}
