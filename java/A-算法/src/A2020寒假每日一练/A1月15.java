package A2020����ÿ��һ��;
//��:
//����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
//
//ʾ�� 1:
//
//����: 1->1->2
//���: 1->2
//ʾ�� 2:
//
//����: 1->1->2->3->3
//���: 1->2->3


//��һ:������
public class A1��15 {

	public static class ListNode{
		public int val;
		public ListNode next;
		
		public ListNode(int x) {
			val = x;
		}
		//����ڵ�Ĺ��캯��
		//ʹ��arrΪ����������һ��������ǰ��ListNodeΪ����ͷ�ڵ�
		public ListNode(int[] arr) {
			if(arr == null || arr.length == 0)
				throw new IllegalArgumentException("arr can not be empty.");
			
			this.val = arr[0];
			ListNode cur = this;
			for (int i = 1; i < arr.length; i++) {
				cur.next = new ListNode(arr[i]);
				cur = cur.next;
			}
		}
		
		@Override
		public String toString() {
			StringBuilder res = new StringBuilder();
			ListNode cur = this;
			while (cur != null) {
				res.append(cur.val + "->");
				cur = cur.next;
			}
			res.append("NULL");
			return res.toString();
		}
	}
	
	public  ListNode deleteDuplicates(ListNode head) {
		
		ListNode p = head;
		while (p != null) {
			ListNode q = p.next;            
			while (q != null && q.val == p.val) {
				q = q.next;
			}
			p.next = q;
			p = p.next;
		}
		return head;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,4,5,6};
		ListNode head = new ListNode(nums);
		System.out.println(head);
		
		ListNode res = (new A1��15()).deleteDuplicates(head);
		System.out.println(res);
	}
}



