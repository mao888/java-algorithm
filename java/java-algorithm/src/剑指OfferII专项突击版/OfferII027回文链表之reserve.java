package ��ָOfferIIר��ͻ����;

import java.util.ArrayList;
import java.util.List;

import Leetcode.ListNode;

public class OfferII027��������֮reserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
    public boolean isPalindrome(ListNode head) {
    	StringBuffer sb = new StringBuffer();
    	StringBuffer reserve = new StringBuffer();
    	while (head!=null) {
			sb.append(head.val);
            reserve.append(head.val);
			head = head.next;
    	}
        reserve.reverse();
    	return sb.toString().equals(reserve.toString());
    }   
}
