package ����͵ݹ�;

public class LinkedListStack<E> implements Stack<E> {
// LinkedListStack<E>֧�ַ���      implementsʵ��Stack����һ���ӿ�
	private LinkedList list;
// ˽�е�������Ķ���  �� list		
	
// ���캯��
	public LinkedListStack(){
		list = new LinkedList<>(); 			// ��ʼ��list
	}
// ��������������ջ  �ײ�ʵ�������� ����������˵Ҳû���ݻ���������ˣ��������ǹ��캯������һ���͹���

//  һһ�Ĺ��췽��
	@Override
	 public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
// ������ͷ������O(1)����ģ����Ե���addFirst��e��ӽ�ȥ��Ҳ��������ͷ��ջ��	
	}
	
	@Override
	public E pop() {
		return (E) list.removeFirst();
//	������ͷȡ��Ԫ��
	}

	@Override
	public E peek() {
		return (E) list.getFirst();
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack: top");
		res.append(list);
		return res.toString();
//	��������֮ǰ������ʵ�ֵĸ������ܷ�װ��һ���ײ�������ʵ�ֵ�����ջ
	}

	public static void main(String[] args) {
			
			LinkedList<Integer> stack = new LinkedList<>();
			
			for(int i = 0 ; i < 5 ; i ++) {
				stack.push(i);
				System.out.println(stack);
			}
		
			stack.pop();
			System.out.println(stack);
		}



}
