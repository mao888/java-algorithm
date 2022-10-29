package A2020����ÿ��һ��;

//ɾ�������е��ڸ���ֵ val �����нڵ㡣
//
//ʾ��:
//
//����: 1->2->6->3->4->5->6, val = 6
//���: 1->2->3->4->5


import java.util.Scanner;

//ʱ�临�Ӷ�O(n)
public class A1��14{
	public static void main(String[] args) {
		A1��14 d = new A1��14();
		d.testEnvironment();
	}
	//set environment

//	�������
	public void testEnvironment() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("����val��" );
		int val = input.nextInt();
		System.out.println("��������" );
		//���input���������˵�enter��
		input.nextLine();
		//����һ�����֣��Կո����
		String nums = input.nextLine();
		//�������һ�У���ȥ�ո�������
		String[] numsCh = nums.split(" ");
		//����OutputLink���������������Ȼ���k����ȥ
		ListNode result = Solution(OutputLink(numsCh),val);
		//output result
		printLink(result);
	}
	//Array to link
//	��һ�����飬�������
	public ListNode OutputLink(String[] nums) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(Integer.valueOf(nums[0]));
		ListNode prev = head; 
		for(int i = 1 ; i < nums.length ; i++) {
			ListNode temp = new ListNode(Integer.valueOf(nums[i]));
			prev.next = temp;
			prev = prev.next;
		}
		return head;
	}
//	����ͷ��㣬������������
	private void printLink(ListNode result) {
		// TODO Auto-generated method stub
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	
	/*************************����*****************************/
	public ListNode Solution(ListNode head, int val) {
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;

		ListNode prev = dummyHead;
		while(prev.next != null) {
			if(prev.next.val == val) 
				prev.next = prev.next.next;
			else
				prev = prev.next;
		}
		return dummyHead.next;
	}
	
}

// �ڵ�ģ��
class ListNode {
	
	int val;
	ListNode next;
	
	ListNode(int x){
		val = x;
	}
}




