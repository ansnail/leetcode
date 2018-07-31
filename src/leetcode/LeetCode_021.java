package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode_021 {

	public static void main(String[] args) {
		Utils.printNode(mergeTwoLists(Utils.createNode(), Utils.createNode()));

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode dummy2 = new ListNode(0);
		dummy2 = dummy;
        while (l1 != null || l2 != null) {
			if (l1 == null) {
				dummy.next = l2;
				return dummy2.next;
			}
			if (l2 == null) {
				dummy.next = l1;
				return dummy2.next;
			}
			if (l1.val <= l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			}else {
				dummy.next = l2;
				l2 = l2.next;
			}
			dummy = dummy.next;
		}
        return dummy2.next;
    }

}
