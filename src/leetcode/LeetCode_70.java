package leetcode;

public class LeetCode_70 {

	public static void main(String[] args) {
		System.out.println(climbStairs(101));

	}
	
	
	public static int climbStairs(int n) {
		if (n <= 1) {
			return n;
		}
		int pre = 1;
		int now = 0;
		int last = 1;
		for (int i = 2; i <= n; i++) {
			now = pre + last;
			pre = last;
			last = now;
		}
		return now;
	}

	public static int climbStairs2(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		return climbStairs(n - 1) + climbStairs(n - 2);
	}
	
}
