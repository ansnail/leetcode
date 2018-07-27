package leetcode;

public class LeetCode_206 {

	public static void main(String[] args) {
		

	}
	
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = pre;
			pre = head;
			head = tmp;
			
		}
		return head;
    }

}
