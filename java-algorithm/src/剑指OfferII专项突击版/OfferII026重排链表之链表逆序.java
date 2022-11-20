package ��ָOfferIIר��ͻ����;

import ��ָOfferIIר��ͻ����.OfferII026��������֮���Ա�.ListNode;

public class OfferII026��������֮�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode {
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	public void reorderList(ListNode head) {
		if (head==null) {
			return;
		}
		ListNode mid = middleNode(head);
		ListNode l1 = head;
		ListNode l2 = mid.next;
		mid.next = null;
		l2 = reverseList(l2);
		mergeList(l1, l2);
		
	}
	// Ѱ�������е�+��������+�ϲ�����
	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		// Ѱ�������е�
		while (fast.next!=null&&fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	// ��������
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = nextTemp;
		}
		return pre;
	}
	// �ϲ�����
	public void mergeList(ListNode l1,ListNode l2) {
		ListNode l1Temp;
		ListNode l2Temp;
		while (l1 != null && l2 !=null) {
			l1Temp = l1.next;
			l2Temp = l2.next;
			
			l1.next = l2;
			l1 = l1Temp;
			
			l2.next = l1;
			l2 = l2Temp;
		}
	}	
}