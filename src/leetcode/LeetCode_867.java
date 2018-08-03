package leetcode;

public class LeetCode_867 {

	public static void main(String[] args) {
		int[] cost = { 1, 2 };

	}

	public static int[][] transpose(int[][] A) {
		int width = A.length;
		int heigth = A[0].length;
		int[][] dummy = new int[heigth][width];
		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < width; j++) {
				dummy[i][j] = A[j][i];
			}
		}
		return dummy;
    }

}
