package leetcode;

public class LeetCode_160 {

	public static void main(String[] args) {
		ListNode node = Utils.createNode();
		getIntersectionNode(node, node);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode dummy = headA;
		headA = reserve(headA);
		headB = reserve(headB);
		if (headA != headB) {
			return null;
		}
		ListNode preA = headA;
		ListNode preB = headB;
		
		Utils.printNode(headA);
		boolean flag = false;
		headA = headA.next;
		headB = headB.next;
		while (headA == null || headB == null) {
			
			if (headA != headB) {
				
			}
			
		}
		
		
		return null;
    }
	
	
	public static ListNode reserve(ListNode head) {
		ListNode pre = null;
		
		while (head != null) {
			ListNode tmp = head.next;
			head.next = pre;
			pre = head;
			head = tmp;
		}
		return pre;
	}

}
