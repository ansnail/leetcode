package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_119 {

	public static void main(String[] args) {
//		int rows = 10;
//
//		for (int i = 0; i < rows; i++) {
//			int number = 1;
//			// 打印空格字符串
//			System.out.format("%" + (rows - i) * 2 + "s", "");
//			for (int j = 0; j <= i; j++) {
//				System.out.format("%4d", number);
//				number = number * (i - j) / (j + 1);
//			}
//			System.out.println();
//		}
		System.out.println(generate(3));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> dummy = new ArrayList<>();
		if (numRows == 0) {
			return dummy;
		}
		List<Integer> tmp1 = new ArrayList<>();
		tmp1.add(1);
		dummy.add(tmp1);
		for (int i = 1; i < numRows; i++) {
			List<Integer> tmp = new ArrayList<>();
			tmp.add(1);
			for (int j = 1; j < i; j++) {
				System.out.println("i=" + i + ",j=" + j + ",dummy=" + dummy.size());
				List<Integer> cur = dummy.get(i - 1);
				tmp.add(cur.get(j) + cur.get(j - 1));
			}
			tmp.add(1);
			dummy.add(tmp);
		}

		return dummy;
	}

}
