package leetcode;

public class LeetCode_190 {

	public static void main(String[] args) {
		System.out.println(reverseBits(43261596));
	}
	
	public static int reverseBits(int n) {
		
		int reverse = 0;
		for (int i = 0; i < 32; i++) {
			reverse = reverse << 1;
			reverse += n & 1;
			n = n >> 1;
		}
		
		return reverse;
    }

}
