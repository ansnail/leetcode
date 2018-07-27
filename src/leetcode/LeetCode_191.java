package leetcode;

public class LeetCode_191 {

	public static void main(String[] args) {
		System.out.println(hammingWeight(12813467));
	}

	public static int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {

			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}

//		while (n != 0) {
//			count++;
//			n = n & (n-1);
//		}

		return count;
	}

}
