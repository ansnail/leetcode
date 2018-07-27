package leetcode;

public class LeetCode_2 {

	public static void main(String[] args) {
		System.out.println(10 / 10);

	}

	public ListNode addLists2(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		int carry = 0;
		int sum = 0;
		do {
			sum = carry;
			sum += l1 == null ? 0 : l1.val;
			sum += l2 == null ? 0 : l2.val;

			tail.next = new ListNode(sum % 10);
			tail = tail.next;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}

			carry = sum / 10;

		} while (l1 != null || l2 != null);

		if (carry != 0) {
			tail.next = new ListNode(carry);
		}

		return dummy.next;
	}

	public ListNode addLists(ListNode l1, ListNode l2) {
		// write your code here
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		int carry = 0;
		for (ListNode i = l1, j = l2; i != null || j != null;) {
			int sum = carry;
			sum += (i != null) ? i.val : 0;
			sum += (j != null) ? j.val : 0;

			tail.next = new ListNode(sum % 10);
			tail = tail.next;

			carry = sum / 10;
			i = (i == null) ? i : i.next;
			j = (j == null) ? j : j.next;
		}

		if (carry != 0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}

}
