import org.omg.CORBA.PRIVATE_MEMBER;

public class BST<E extends Comparable<E>> {

	private class Node{
		public E e;					// ��Ա����
		public Node left, right;	// ��Ա����
		
		public Node(E e) {			// �û�����e
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	private Node root;			// ���ڵ�
	private int size;			// ��¼�����������洢�˶���Ԫ��
			
	public BST() {				// �������������캯��
		root = null;
		size = 0;
	}
	
	public int size() {			// ��Ա����
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
