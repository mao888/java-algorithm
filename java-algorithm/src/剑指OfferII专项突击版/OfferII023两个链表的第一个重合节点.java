package ��ָOfferIIר��ͻ����;

public class OfferII023��������ĵ�һ���غϽڵ� {

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
     ListNode n1 = headA;
     ListNode n2 = headB;
     
     int size1 = 0;
     int size2 = 0;
     // ��ȡA�ĳ���
     while (n1!=null) {
		size1++;
		n1 = n1.next;
	}
     // ��ȡB�ĳ���
     while (n2!=null) {
    	 size2++;
    	 n2 = n2.next;
	}
     
     // ��A,B�нϳ���һ���ƶ�dif����ʹ��������һ����
     if (size1 >  size2) {
    	 int dif = size1 - size2;
    	 for (int i = 0; i < dif; i++) {
			headA = headA.next;
		}
	}else {
		int dif = size2 - size1;
		 for (int i = 0; i < dif; i++) {
				headB = headB.next;
			}
	}
     // �����������ڵ�
     while (headA!=null) {
		if (headA==headB) {
			return headA;
		}else {
			headA = headA.next;
			headB = headB.next;
		}
	}
    	return null;
    }
	
	

}