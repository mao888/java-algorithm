package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L19ɾ������ĵ�����N�����֮���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	List<ListNode> list = new ArrayList<>();
    	while (head!=null) {
			list.add(head);
			head = head.next;
		}
    	int size = list.size();
    	list.remove(size-n);
    	
    	for(int i=0;i<list.size();i++) {
    		head=list.get(i);
    	}
    	return head;
    }

}
