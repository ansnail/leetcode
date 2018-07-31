package leetcode;

public class LeetCode_231 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(0));
	}

	public static boolean isPowerOfTwo(int n) {
		return n > 0 && ((n & (n - 1)) == 0);
	}

}
