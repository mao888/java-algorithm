package ��ָOfferIIר��ͻ����;

import java.util.Iterator;
import java.util.LinkedList;

public class OfferII021ɾ������ĵ�����n����� {
	
	// �Զ����ListNode���������£�
	public class ListNode {
	       int val;
	       ListNode next;   // ��һ���������
	       ListNode(int x) { val = x; }  //��ֵ�����ֵ
	  }
		
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	// ��������ͷ�ڵ㣬head , fast �� slow ��ָ���������ͷ�ڵ�
        ListNode fast =  new ListNode(0);
        fast.next = head;
        head = fast;
        ListNode slow = fast;

        // fast ָ������ n + 1 ����λ
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        // fast ָ��� slow ָ��һ���ƶ���ֱ�� fast ָ��պ�slow ָ����ָ������ n + 1���ڵ㡣
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        // ɾ�������� n ���ڵ�
        slow.next = slow.next.next;

        // �������������˸���ͷ�ڵ㣬���� head.next �����������Ԫ�ڵ㡣
        return head.next;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5};
//		int n =2;
		/**
		ListNode nodestr = new ListNode(0); //�����׽��
	    ListNode nextNode;     //������һ�����
	    nextNode = nodestr;    //ָ���׽��
	    for (int i = 0; i < nums.length; i++) {
			ListNode newnode = new ListNode(i);		// �����µĽڵ�
			nextNode.next = newnode;	// ���½��������
			nextNode = nextNode.next;	// �ѽ��������
		}//nextNodeָ�����һ�����
	    
	     nextNode = nodestr;  //����ָ���׽��
	     //��ӡ
	     while(nextNode != null){
	         System.out.println("��һ�����ֵ��"+ nextNode.val);
	         nextNode = nextNode.next;
	     }*/

		System.err.println(new OfferII021ɾ������ĵ�����n�����().removeNthFromEnd(null, 0));
		
	}
	

}
