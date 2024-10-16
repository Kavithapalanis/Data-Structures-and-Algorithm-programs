package leetproblems;
//Given a linked list, swap every two adjacent nodes and return its head. 
//You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

//import leetcodeProblems.SwapNodesinPair;
import leetproblems.ListNode;

//testcase 1. Input: head = [1,2,3,4]
//          Output: [2,1,4,3]

//testcase 2. Input: head = [1,2,3]
//           Output: [2,1,3]

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}

public class SwapNodesinPair {
	public ListNode swaplistnode(ListNode head ) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode point = dummy;
		
		while (point.next != null && point.next.next != null) {
			
			ListNode swap1 = point.next;
			ListNode swap2 = point.next.next;
			
			swap1.next = swap2.next;
			swap2.next = swap1;
			
			point.next = swap2;
			point = swap1;
		}
		return dummy.next;
		
	}
	
	public static void printlist(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String args[]) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		// original list
		System.out.println("Original List : ");
		printlist(head);
		
		// instance on class SwapNodesinPair
		SwapNodesinPair object = new SwapNodesinPair();
		
		ListNode swaplist = object.swaplistnode(head);
		
		System.out.println("Swapped list : ");
		printlist(swaplist);
		
	}

}



