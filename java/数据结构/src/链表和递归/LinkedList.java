package ����͵ݹ�;

public class LinkedList<E> {
// ֧�ַ���
	private class Node{
//	ӵ��������Ա����
		public E e;
//	һ����Ա������ŵ�Ԫ����E���͵�e
		public Node next;
//	.............next,ָ��Node;
		
//	Ϊ���������ר�ŵĹ��캯��
		public Node(E e,Node next) {
			this.e = e;
//	���ڵ��e��ֵ���û�������e
			this.next = next;
//	���ڵ��next��ֵ���û�������next
		}
		
// ����һЩ������ĺ���������û�����һ��e�Ļ������������������Ĺ��췽��
		public Node(E e){
			//this(e, next:null);
			this.e = e; 
			this.next = null;
//	��ֵ��
		} 
		public Node(){
			//this(e:null, next:null);
			this.e = null;
			this.next = null;
		}
		
// ���������ÿһ���ڵ㣬��Ӧ���������ǵ�һ������toString()���������д�ӡ���	
		@Override
		public String toString() {
				return e.toString();
		}
	}
	private Node dummyHead;
// ������������Ӧ����һ��Node���͵ı���������head
	private int size;
// �洢һ��size����һ��int�ͱ���

// ������Щ����Ӧ��Ϊ���ǵ��������ù��캯��
	public LinkedList() {
		dummyHead = new Node(null, null);
		size = 0;
//	��ʱ��������յ�������˵������һ������ڵ�
//	�����Թ����������������罫����ת�����б�
	}
	
// Ϊ����д������������
// һ:��ȡ�����е�Ԫ�ظ���
	public int getSize() {
		return size;
	}
// ��:���������Ƿ�Ϊ��
	public boolean isEmpty() {
		return size == 0;
	}
// ��:������ͷ����µ�Ԫ��e
//	public void addFirst(E e) {	
// ���������ݽṹ��ͷ�����Ԫ�أ��� �����һ��E���͵�e
// ����һ���µĽڵ㣬�����洫���Ԫ��e,next���ܣ�Ϊ��

// ��һ
//		Node node = new Node(e);
//		  node.next = head;
//		  head = node;
		
// ����
//		  head = new Node(e,head);
//		add(0,e);
//		size ++;
//	ĩβ
//	 }	

// �������index(0-based)λ������µ�Ԫ��e
// �������в���һ�����õĲ�������ϰ�ã�)
	public void add(int index,E e) {
// ������������ index , e	

// �ж�index�ĺϷ���
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed.Illegal index.");
		 	// �Ƿ�
		
//		if (index == 0)
//			addFirst(e);
//		else {
//	��ǰ��ͷ��㴦����Ҫ�����ڲ���Ҫ��	
		
//	����
		Node prev = dummyHead;			// dummyHead  index ǰ  ;     prev ǰһ��
//	dummyHead��0Ԫ��ǰһ���ڵ�
		for(int i = 0 ;i < index ; i++)
//  head��ʼ��index0 - 1 ; dummyHead��ʼ: index
			prev = prev.next;

//	��һ
//			Node node = new Node(e);
//			node.next = prev.next;
//			prev.next = node;
		
// ����
			prev.next = new Node(e , prev.next);
			size ++;					
		}
// ������ͷ����µ�Ԫ��e
	public void addFirst(E e) {
		add(0,e);
	}
// ������ĩβ����µ�Ԫ��e;
	public void addLast(E e) {
		add(size, e);
	} 

//	����
//�������ĵ�index(0-based)��λ��Ԫ��
//�������в���һ�����õĲ�������ϰ�ã�)
	public E get(int index) {

//�ж�index�ĺϷ���
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Get failed.Illegal index.");
		 	// �Ƿ�
	
// ��0��ʼ������
		Node cur = dummyHead.next;			// dummyHead.next index��ǰ  ��cur����ǰ
		for(int i = 0 ; i < index ; i ++)
			cur = cur.next;
		return cur.e;
	}

	// ��ȡ����ĵ�һ��Ԫ��
	public E getFirst() {
		return get(0);
	}

	// �����������һ��Ԫ��
	public E getLast() {
		return get(size - 1);
	}

	//�޸�����ĵ�index(0-based)��λ�õ���Ԫ��Ϊe
	//�������в���һ�����õĲ�������ϰ�ã�)
	public void set(int index,E e) {
		
//�ж�index�ĺϷ���
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Set failed.Illegal index.");
				// �Ƿ�		

// ����
		Node cur = dummyHead.next;
		for(int i = 0 ; i < index ; i ++)
			cur = cur.next;
		cur.e = e ;
	}

// �����������Ƿ���Ԫ��e
	public boolean contains(E e) {

//	Ҳ����ʹ��size����forѭ��
		Node cur = dummyHead.next;
		while(cur != null) {
			if(cur.e.equals(e))			// cur.e  �Ƿ�����û�������e
				return true;
			cur = cur.next;
//	��cur����  ˵�������������������һ��
		}
		return false;
	}
//  ��ϰһ�£����� object������ķ�����Ҳ����toString�������
	
	
	//��������ɾ��index(0-based)λ�õ�Ԫ��Ϊ������ɾ����Ԫ��
		//�������в���һ�����õĲ�������ϰ�ã�)
	public E remove(int index) {
		
	//�ж�index�ĺϷ���
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Set failed.Illegal index.");
				// �Ƿ�		

// ����Ҫ�ҵ���ɾ����index֮ǰ�Ľڵ㣬���� dummyHead
		Node prev = dummyHead;
		for(int i = 0 ; i < index ; i++)
			prev = prev.next;
		
		Node retNode = prev.next;
		prev.next = retNode.next;
		retNode.next = null;
		size --;
		
		return retNode.e;
	}
	
// ��������ɾ����һ��Ԫ�أ�����ɾ����Ԫ��
	public E removeFirst() {
		return remove(0);
	}
	
// ��������ɾ�����һ��Ԫ�أ�����ɾ����Ԫ��
	public E removeLast() {
		return remove(size - 1);
	}
	
	@Override
	public String toString(){
		
		StringBuilder res = new StringBuilder();

//	��һ
// 		Node cur = dummyHead.next;
////	����һ��  cur �� node
//		while(cur != null) {
//			res.append(cur + "->");
//			cur = cur.next;
//		}
		
//	����
		for(Node cur = dummyHead.next ; cur !=null ; cur = cur.next)
			res.append(cur + "->");
		res.append("NULL");
		
		return res.toString();
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		
	}
}


 








