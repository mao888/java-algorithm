package Leetcode;
//��203:�Ƴ�����Ԫ��
//ɾ�������е��ڸ���ֵ val �����нڵ㡣
//
//ʾ��:
//
//����: 1->2->6->3->4->5->6, val = 6
//���: 1->2->3->4->5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// ���1
//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//    	while(head !=null && head.val ==  val){
//    		ListNode delNode = head;
//    		head = head.next;
//    		delNode.next = null;
//    	}
//    	if(head == null)
//    		return null;
//    	
//    	ListNode prev = head;
//    	while(prev.next != null) {
//    		if(prev.next.val == val) {
//    			ListNode delNode = prev.next;
//    			prev.next = delNode.next;
//    			delNode.next = null;
//    		}
//    		else
//    			prev = prev.next;
//    	}
//    	return head;
//	}
//}


// ���2
//class Solution {
//	public ListNode removeElements(ListNode head, int val) {
//		while(head !=null && head.val ==  val)
//			head = head.next;
//		
//		if(head == null)
//			return null;
//	
//		ListNode prev = head;
//		while(prev.next != null) {
//			if(prev.next.val == val) 
//				prev.next = prev.next.next;
//			else
//				prev = prev.next;
//		}
//		return head;
//	}
//}


//���3 ����ͷ�ڵ�
//class Solution {
//	public ListNode removeElements(ListNode head, int val) {
//		ListNode dummyHead = new ListNode(-1);
//		dummyHead.next = head;
//	
//		ListNode prev = dummyHead;
//		while(prev.next != null) {
//			if(prev.next.val == val) 
//				prev.next = prev.next.next;
//			else
//				prev = prev.next;
//		}
//		return head;
//	}
//}









