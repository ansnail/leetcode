package leetcode;

public class LeetCode_066 {

	public static void main(String[] args) {
		int[] dummy = { 2, 4, 9, 8, 9 };
		Utils.printArray(plusOne(dummy));
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i] += 1;
				return digits;
			}
		}

		int[] dummy = new int[digits.length + 1];
		dummy[0] = 1;
		return dummy;
	}

	public static int[] plusOne2(int[] digits) {
		if (digits.length == 1 && digits[0] == 9) {
			return new int[] { 1, 0 };
		}
		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			System.out.println(i);
			int tmp = digits[i] + carry;
			carry = 0;
			if (i == digits.length - 1) {
				if (tmp + 1 >= 10) {
					digits[i] = (tmp + 1) % 10;
					carry = 1;
				} else {
					digits[i] = tmp + 1;
				}
			} else {
				if (i == 0) {
					if (tmp >= 10) {
						digits[i] = tmp % 10;
						int[] dummy = new int[digits.length + 1];
						dummy[0] = 1;
						for (int j = 1; j < dummy.length; j++) {
							dummy[j] = digits[j - 1];
						}
						return dummy;
					} else {
						digits[i] = tmp;
					}
				} else {
					if (tmp >= 10) {
						digits[i] = tmp % 10;
						carry = 1;
					} else {
						digits[i] = tmp;
					}
				}
			}
		}

		return digits;
	}

}
