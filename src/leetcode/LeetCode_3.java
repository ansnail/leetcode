package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_3 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("otodinokzfhycbuwygqsofctljsgezbvsryceomdvvdyzzuxfnrwstpgejmlkpgegggnuusrswprxmqdzhzrcqzgcltmcz"));

	}

	public static int lengthOfLongestSubstring(String s) {
		int length = 0;
		int[] dummy = new int[26];
		for (int i = 0, j = 0; j < s.length(); j++) {
			int re = s.charAt(j) - 'a';
			i = Math.max(dummy[re], i);
			length = Math.max(length, j - i + 1);
			dummy[re] = j + 1;
		}
		return length;
	}

	public static int lengthOfLongestSubstring2(String s) {
		char[] dummy = s.toCharArray();
		if (s.length() <= 1) {
			return s.length();
		}
		int length = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int slow = 0, fast = 0; fast < s.length(); fast++) {
			if (map.containsKey(dummy[fast])) {
				slow = Math.max(map.get(dummy[fast]), slow);
			}
			length = Math.max(length, fast - slow + 1);
			map.put(dummy[fast], fast + 1);
			System.out.println("slow = " + slow + ",fast=" + fast + ",length=" + length);
		}

		return length;
	}

}
