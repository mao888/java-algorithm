package A2020����ÿ��һ��;

// ��:����һ����������������е�����k���ڵ�
//��һ:�¹��
//import java.util.*;
//public class A1��12�� {
//	class Node {
//		int val;
//		Node next;
//
//		public Node(int val) {
//			// TODO Auto-generated constructor stub
//			this.val = val;
//			next = null;
//		}
//	}
//
//	private Node makeList() {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		Node head = new Node(sc.nextInt());
//		Node cur = head;
//		for (int i = 1; i < 3; i++) {
//			cur.next = new Node(sc.nextInt());
//			cur = cur.next;
//		}
//		return head;
//	}
//
//	private  void print(Node head, int k) {
//		// TODO Auto-generated method stub
//		while (head != null) {
//			Node cur = head;
//			
//			for (int i = 0; i < k; i++)
//				cur = cur.next;
//
//			if (cur == null) {
//				System.out.println(head.val);
//				break;
//				}
//			else
//				head = head.next;
//		}
//	}
//	
//	public static void main(String[] args) {
//		A1��12�� h = new A1��12��();
//		Node l2 = h.makeList();
//		h.print(l2,3);
//	}
//}

//class Day02{
//	public ListNode FindKthToTail(ListNode head,int k){
//		ListNode a = null;
//		ListNode b = null;
//		
//		a = head;
//		b = head;
//		int c = k;
//		int count = 0;
//		while(a!=null){
//			a = a.next;
//			count++;
//			if(k<1){
//				b = b.next;
//			}
//			k--;
//		}
//		if(count<c)
//			return null;
//		return b;
//	}
//}



//���Ʒɽⷨ:
//import java.util.Scanner;
//
////ʱ�临�Ӷ�O(n)
//public class A1��12�� {
//	public static void main(String[] args) {
//		A1��12�� d = new A1��12��();
//		d.testEnvironment();
//		
//	}
//	//set environment
//	public void testEnvironment() {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		System.out.println("����K��" );
//		int k = input.nextInt();
//		System.out.println("��������" );
//		//���input���������˵�enter��
//		input.nextLine();
//		//����һ�����֣��Կո����
//		String nums = input.nextLine();
//		//�������һ�У���ȥ�ո�������
//		String[] numsCh = nums.split(" ");
//		//����OutputLink���������������Ȼ���k����ȥ
//		String result = Solution(OutputLink(numsCh),k);
//		//output result
//		System.out.println(result);
//	}
//	//Array to link
//	public ListNode OutputLink(String[] nums) {
//		// TODO Auto-generated method stub
//		ListNode head = new ListNode(nums[0]);
//		ListNode prev = head; 
//		for(int i = 1 ; i < nums.length ; i++) {
//			ListNode temp = new ListNode(nums[i]);
//			prev.next = temp;
//			prev = prev.next;
//		}
//		return head;
//	}
//	/*************************����*****************************/
//	public String Solution(ListNode head,int k) {
//		// TODO Auto-generated method stub
//		//�ҵ��뷨������һ��ѭ���ҵ�link��length��Ȼ���ٱ���һ�Σ������ҵ�length - k��������
//		
//		//temp����һ��ͷ�ڵ�
//		ListNode temp = head;
//		//���ѭ�������鿴��ǰ����ĳ���
//		int i = 0;
//		while(temp != null) {
//			temp = temp.next;
//			i++;
//		}
//		//��ʱ����ĳ��Ⱦ���i+1,��Ϊ��temp=null��ʱ�򣬻����1
//		int len = i;
//		//����i��temp
//		i = 0;
//		temp = head;
//		//���±���  ��i == len-k  ���ǵ�����k���������ص�ǰtemp��ֵ
//		while(i != (len-k)) {
//			temp = temp.next;
//			i++;
//		}
//		return temp.val;
//	}
//}
//
//class ListNode {
//	
//	String val;
//	ListNode next;
//	
//	ListNode(String x){
//		val = x;
//	}
//}

