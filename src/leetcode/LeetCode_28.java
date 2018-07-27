package leetcode;


public class LeetCode_28 {

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
	}

	public static int strStr(String haystack, String needle) {

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int j = 0;
			for (j = 0; j < needle.length(); j++) {
				if (haystack.charAt(j + i) != needle.charAt(j)) {
					break;
				}
			}
			if (j == needle.length()) {
				return i;
			}
		}
		return -1;

	}

}
