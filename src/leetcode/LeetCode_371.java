package leetcode;

public class LeetCode_371 {

	public static void main(String[] args) {
		System.out.println(getSum(15, 29));

	}
	
	public static int getSum(int a, int b) {
        if (b == 0) {
			return a;
		} else {
			return getSum(a^b, (a&b)<<1);
		}
    }

}
