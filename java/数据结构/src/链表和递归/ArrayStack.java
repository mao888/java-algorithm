package ����͵ݹ�;


import java.util.*;


//���ڶ�̬�����ʵ�ִ�����һ��ջ��������
public class ArrayStack<E> implements Stack<E> {
//����֧�ַ���
	Array arry;
	private Array array;
	
	public ArrayStack(int capacity) {
//capacity�ݻ�
		array = new Array();
	}
	
	public ArrayStack(){
		Object array = new Array();
	}

	@Override
	
	
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
