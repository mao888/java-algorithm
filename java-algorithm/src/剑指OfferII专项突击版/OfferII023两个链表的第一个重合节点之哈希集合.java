package ��ָOfferIIר��ͻ����;

import java.util.HashSet;
import java.util.Set;

//import ��ָOfferII.OfferII023��������ĵ�һ���غϽڵ�.ListNode;

public class OfferII023��������ĵ�һ���غϽڵ�֮��ϣ���� {

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
		 Set<ListNode> set = new HashSet<>();
		 ListNode temp = headA;
		 while (temp!=null) {
			set.add(temp);
			temp = temp.next;
		}
		 temp = headB;
		 while (temp!=null) {
			 if (set.contains(temp)) {
				return temp;
			}
			 temp = temp.next;
		}
		 return null;		 
	 }
}