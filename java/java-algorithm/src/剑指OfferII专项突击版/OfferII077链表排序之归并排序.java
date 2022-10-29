package ��ָOfferIIר��ͻ����;

import Leetcode.ListNode;

public class OfferII077��������֮�鲢���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public ListNode sortList(ListNode head) {
		if (head==null||head.next==null) {
			return head;
		}
		// ��һ�����������ֳ�����
		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = head;
		while (fast!=null&&fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		// �ڶ������������ֵ�����ֱ�����
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		// ���������ϲ�������������
		return merge(l1, l2);
	}
	
	public ListNode merge(ListNode l1,ListNode l2) {
		ListNode p = new ListNode();
		ListNode l = p;
		while (l1 != null && l2 !=null) {
			if (l1.val<l2.val) {
				p.next = l1;
				l1 = l1.next;
			}else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if (l1!=null) {
			p.next = l1;
		}
		if (l2!=null) {
			p.next = l2;
		}
		return l.next;
	}

}
