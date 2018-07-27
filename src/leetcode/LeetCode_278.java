package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_278 {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(2126753390));

	}
	
	public static int firstBadVersion(int n) {

		int left = 1;
		int right = n;
		int mid = 0;
		while (left < right) {
			System.out.println("left=" + left + ",right=" + right + ",mid=" + mid);
			mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid +1;
			}
		}
		return left;
	}

	public static int firstBadVersion2(int n) {

		int left = 1;
		int right = n;
		int mid = 0;
		while (left <= right) {
			System.out.println("left=" + left + ",right=" + right + ",mid=" + mid);
			mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				if (isBadVersion(mid - 1)) {
					right = mid - 1;
				} else {
					return mid;
				}

			} else {
				if (isBadVersion(mid + 1)) {
					return mid + 1;
				} else {
					left = mid + 1;
				}
			}
		}
		return 0;
	}

	static boolean isBadVersion(int version) {
		if (version >= 1702766719) {
			return true;
		}
		return false;
	};

}
