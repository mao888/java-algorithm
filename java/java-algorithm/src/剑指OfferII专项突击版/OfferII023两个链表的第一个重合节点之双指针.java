package ��ָOfferIIר��ͻ����;

import ��ָOfferIIר��ͻ����.OfferII023��������ĵ�һ���غϽڵ�֮��ϣ����.ListNode;

public class OfferII023��������ĵ�һ���غϽڵ�֮˫ָ�� {

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
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if (headA==null||headB==null) {
			return null;
		}
		 ListNode pa = headA;
		 ListNode pb = headB;
		 while (pa!=pb) {
			if (pa==null) {
				pa = headB;
			}
			pa = pa.next;
			if (pb==null) {
				pb = headB;
			}
			pb = pb.next;
		}
		 return pb;
	 }

}
