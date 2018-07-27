package leetcode;

public class Utils {
	
	private static String array2String(int[] js) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < js.length; i++) {
			builder.append(js[i]);
			if (i != js.length -1) {
				builder.append(",");
			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static void printArray(int[] js) {
		System.out.println(array2String(js));
	}
	
	public static void printArray(String tag, int[] js) {
		System.out.println(tag +" : "+ array2String(js));
	}
	
	
	
	public static ListNode createNode() {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		ListNode head6 = new ListNode(6);
		ListNode head7 = new ListNode(7);
		ListNode head8 = new ListNode(8);
		ListNode head9 = new ListNode(9);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = head7;
		head7.next = head8;
		head8.next = head9;
		head9.next = null;
		return head1;
	}
	public static void printNode(String tag, ListNode head) {
		System.out.println(tag+"："+node2String(head));
	}
	
	public static void printNode(ListNode head) {
		System.out.println(node2String(head));
	}
	
	
	private static String node2String(ListNode head) {
		if (head == null) {
			System.out.println("链表是空的");
		}
		StringBuilder builder = new StringBuilder();
		while (head != null) {
			builder.append(head.val);
			builder.append("-->");
			head = head.next;
		}
		builder.append("null");
		return builder.toString();
	}
	

}
