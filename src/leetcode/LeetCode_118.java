package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_118 {

	public static void main(String[] args) {
		getRow(5);
	}

	public static List<Integer> getRow(int rowIndex) {
		int[] res = new int[rowIndex + 1];
		return null;
		
	}

	public static List<Integer> getRow3(int rowIndex) {
		int[] dummy = new int[rowIndex];
		int[] tmp = new int[rowIndex];
		dummy[0] = 1;
		for (int i = 1; i < rowIndex; i++) {
			for (int j = 1; j < i; j++) {
				dummy[j] = tmp[j] + tmp[j - 1];
			}
			dummy[i] = 1;
			for (int j = 0; j < tmp.length; j++) {
				tmp[j] = dummy[j];
			}
			Utils.printArray("dummy", dummy);
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < dummy.length; i++) {
			list.add(dummy[i]);
		}

		return list;
	}

	public static List<Integer> getRow2(int numRows) {

		List<Integer> dummy = new ArrayList<>();
		if (numRows == 0) {
			return dummy;
		}
		dummy.add(1);
		for (int i = 1; i < numRows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println("i=" + i + ",j=" + j + ",dummy=" + dummy.size());
				dummy.add(j, dummy.get(j) + dummy.get(j - 1));
			}
			dummy.add(1);
		}
		return dummy;
	}

}
