package ��ָOfferIIר��ͻ����;

import java.util.HashSet;
import java.util.Set;

public class OfferII022�����л�����ڽڵ� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new OfferII022�����л�����ڽڵ�().detectCycle(null));
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
        ListNode pos = head;
        Set<ListNode> set = new HashSet<>();
        while (pos !=null) {
			if (set.contains(pos)) {
				return pos;
			} else {
				set.add(pos);
			}
			pos = pos.next;
		} 
        return head;
    }

}
