package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode_20 {

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));

	}

	public static boolean isValid(String s) {
		Stack<Character> dummy = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				dummy.push(c);
			}
			
			if (c == ')' ) {
				if (dummy.isEmpty() || dummy.pop() != '(') {
					return false;
				}
			}
			if (c == ']' ) {
				if (dummy.isEmpty() || dummy.pop() != '[') {
					return false;
				}
			}
			if (c == '}' ) {
				if (dummy.isEmpty() || dummy.pop() != '{') {
					return false;
				}
			}
			
		}

		return dummy.isEmpty();
	}

}
