package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L19ɾ������ĵ�����N�����֮˫ָ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode p1 = head;
    	ListNode p2 = head;
    	if (head==null||head.next==null) {
			return null;
		}
    	//���ÿ�ָ����n��
    	for(int i=0;i<n;i++) {
			p1 = p1.next;
    	}
    	// �����ָ���ߵ������˵��ɾ�����ǵ�һ���ڵ㣬�ͷ���head.next�ͺ�
    	if(p1 == null) {
    		return head.next;
    	}
    	while (p1.next!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
    	p2.next = p2.next.next;
    	return head;
    	
    }
    
}
