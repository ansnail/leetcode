package leetcode;

public class LeetCode_069 {

	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	}

	public static int mySqrt(int x) {
		int count = 0;
		while (x > 0) {
			x >>= 2;
			count++;
		}
		return count;
	}

}
