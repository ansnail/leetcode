package leetcode;

public class LeetCode_633 {

	public static void main(String[] args) {
		System.out.println(judgeSquareSum(5));
	}

	public static boolean judgeSquareSum(int num) {
		if (num < 0)
			return false;
		if (num == 0)
			return true;

		int n = (int) Math.sqrt(num);
		for (int a = 0; a <= n; a++) {
			int b = 0;
			if ((b = (int) Math.sqrt(num - a * a)) <= n) {
				if ((b * b + a * a) == num)
					return true;
			}
		}
		return false;
	}

}
