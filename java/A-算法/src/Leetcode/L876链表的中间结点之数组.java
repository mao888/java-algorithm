package Leetcode;

import java.util.ArrayList;
import java.util.List;

import Leetcode.L876������м���.ListNode;

public class L876������м���֮���� {

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
	
    public ListNode middleNode(ListNode head) {
    	List<ListNode> list = new ArrayList<>();
    	while (head!=null) {
    		list.add(head);
    		head = head.next;
		}	
    	int middle = list.size();
		middle = middle/2;
    	return list.get(middle);
    }

}
