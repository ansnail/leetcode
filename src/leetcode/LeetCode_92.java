package leetcode;

public class LeetCode_92 {

	public static void main(String[] args) {
		ListNode node = Utils.createNode();
		reverseBetween(node, 2, 4);
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if (m >= n || head == null) {
            return head;
        }
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		Utils.printNode(head);
		
		for (int i = 1; i < m; i++) {
			if (head == null) {
				return null;
			}
			head = head.next;
		}
		
		
		ListNode premNode = head;
		ListNode mNode = head.next;
		ListNode nNode = mNode, postnNode = mNode.next;
		
		Utils.printNode("premNode", premNode);
		Utils.printNode("mNode", mNode);
		Utils.printNode("nNode", nNode);
		Utils.printNode("postnNode", postnNode);
		
		for (int i = m; i < n; i++) {
            if (postnNode == null) {
                return null;
            }
            ListNode temp = postnNode.next;
            postnNode.next = nNode;
            nNode = postnNode;
            postnNode = temp;
        }
		
		mNode.next = postnNode;
        premNode.next = nNode;
        
        
        System.out.println("====================");
		Utils.printNode("premNode", premNode);
		Utils.printNode("mNode", mNode);
		Utils.printNode("nNode", nNode);
		Utils.printNode("postnNode", postnNode);
		
		return dummy.next;
	}
	
	public ListNode reverseBetween2(ListNode head, int m, int n) {
		ListNode dummy = head;
		ListNode pre = null;
		ListNode slow = null;
		ListNode start = null;
		ListNode tail = null;
		int index = 0;
		while (head != null) {
			index++;
			if (index < m) {
				slow = head;
				head = head.next;
			} else if (index >= m && index <= n) {
				if (index == m) {
					start = slow;
					tail = head;
				}
				if (index == n) {
					start.next = head;
					tail.next = pre;
				}
				ListNode tmp = head.next;
				head.next = pre;
				pre = head;
				head = tmp;
				
			}else {
				head = head.next;
			}

		}

		return dummy;
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
