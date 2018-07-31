package leetcode;

public class LeetCode_415 {

	public static void main(String[] args) {
		System.out.println(addStrings("0", "0"));
	}

	public static String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		int carry = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int sum = carry;
			sum += i >= 0 ? (num1.charAt(i) - '0') : 0;
			sum += j >= 0 ? (num2.charAt(j) - '0') : 0;
			result.insert(0, sum % 10);
			carry = sum / 10;
		}
		if (carry != 0) {
			result.insert(0, carry);
		}
		return result.toString();
	}

}
