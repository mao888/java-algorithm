package Leetcode;

public class L876������м��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	/**
	 * ˼·����ָ��qÿ����2������ָ��pÿ����1������q�ߵ�ĩβʱp�����ߵ��м䡣
	 * */
    public ListNode middleNode(ListNode head) {
    	ListNode p1 = head;
    	ListNode p2 = head;
    	while (p2!=null&&p2.next!=null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
    	return p1;
    }

}
