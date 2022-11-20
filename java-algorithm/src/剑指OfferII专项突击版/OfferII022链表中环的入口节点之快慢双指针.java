package ��ָOfferIIר��ͻ����;

import ��ָOfferIIר��ͻ����.OfferII022�����л�����ڽڵ�.ListNode;

public class OfferII022�����л�����ڽڵ�֮����˫ָ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
		// ����ָ���ʼ��ָ�� head
		ListNode fast = head;
		ListNode slow = head;
		// ��ָ���ߵ�ĩβʱֹͣ
		while (fast!=null) {
			// ��ָ����һ������ָ��������
			slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
			// ����ָ��������˵�����л�
			if (slow == fast) {
				// ��һ�ڵ�ָ��ͷ�ڵ�
				fast = head;
				// ͬ����ǰ��
				while (fast!=slow) {
					fast = fast.next;
					slow = slow.next;
				}
				// ������ڽڵ�
				return fast;
			}	
		}
		// ��������
		return null;
    }
}
