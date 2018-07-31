package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_118 {

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
		System.out.println(getRow(3));
	}

	public static List<Integer> getRow(int numRows) {
		
		List<Integer> dummy = new ArrayList<>();
		if (numRows == 0) {
			return dummy;
		}
		dummy.add(1);
		for (int i = 1; i < numRows; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.println("i=" + i + ",j=" + j + ",dummy=" + dummy.size());
				System.out.println(dummy);
				System.out.println(dummy.get(j));
				System.out.println(dummy.get(j - 1));
				dummy.add(j, dummy.get(j) + dummy.get(j - 1));
			}
		}
		return dummy;
	}

}
