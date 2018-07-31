package leetcode;

public class LeetCode_342 {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(45));
	}

	public static boolean isPowerOfFour(int num) {
		if (num <= 0) {
			return false;
		}
		while (num % 3 == 0) {
			System.out.println("num="+num);
			num /= 3;
		}
		return num == 1;
	}

}
