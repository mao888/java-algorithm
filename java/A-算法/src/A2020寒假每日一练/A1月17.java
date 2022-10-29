package A2020����ÿ��һ��;

//��:
//������������Ϊx�Ľڵ�֮ǰ����һ���ڵ�


import java.util.Scanner;

//ʱ�临�Ӷ�O(n)
public class A1��17 {
	public static void main(String[] args) {
		A1��17 d = new A1��17();
		d.testEnvironment();
	}

	// set environment
	public void testEnvironment() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("����val��"); // 3
		int k = input.nextInt();
		System.out.println("��������"); // 1 2 3 3 5 7 3
		// ���input���������˵�enter��
		input.nextLine();
		// ����һ�����֣��Կո����
		String nums = input.nextLine();
		// �������һ�У���ȥ�ո�������
		String[] numsCh = nums.split(" ");
		// ����OutputLink���������������Ȼ���k����ȥ
		ListNode1 result = Solution(OutputLink(numsCh), k);
		// output result
		printLink(result);
	}

	private void printLink(ListNode1 result) {
		// TODO Auto-generated method stub
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	// Array to link
	public ListNode1 OutputLink(String[] nums) {
		// TODO Auto-generated method stub
		ListNode1 head = new ListNode1(Integer.valueOf(nums[0]));
		ListNode1 prev = head;
		for (int i = 1; i < nums.length; i++) {
			ListNode1 temp = new ListNode1(Integer.valueOf(nums[i]));
			prev.next = temp;
			prev = prev.next;
		}
		return head;
	}

	/************************* ���� *****************************/
	public ListNode1 Solution(ListNode1 head, int val) {
		// TODO Auto-generated method stub
		ListNode1 way1 = solveIteration(head, val);
//		ListNode way2 = solveRecursion(head, val);

		return way1;
	}

	private ListNode1 solveIteration(ListNode1 head, int val) {
		// TODO Auto-generated method stub
		//����val������ǰ�����һ��3
		ListNode1 curr = head;
		while(curr.next != null) {
			if(curr.next.val == val) {
				ListNode1 temp = curr.next;
				curr.next = new ListNode1(3);
				curr.next.next = temp;
				curr = curr.next;
			}
			curr = curr.next;
		}
		
		if(head.val == val) {
			ListNode1 temp = head;
			head = new ListNode1(3);
			head.next = temp;
		}
		return head;
	}
}

/************************* ���� *****************************/
class ListNode1 {

	int val;
	ListNode1 next;

	ListNode1(int x) {
		val = x;
	}
}
