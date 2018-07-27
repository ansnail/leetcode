package leetcode;

public class LeetCode_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x < 10) {
			return true;
		}
		int dummy = 0;
		while (x != 0) {
			dummy = dummy * 10 + x % 10;
			if (dummy == 0) {
				return false;
			}
			x /= 10;
			System.out.println("dummy=" + dummy + ",x=" + x);
			if (dummy == x / 10 || dummy == x) {
				return true;
			}
		}
		return false;
	}

}
