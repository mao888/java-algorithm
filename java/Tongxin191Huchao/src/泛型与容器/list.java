package ����������;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

//import java.util.LinkedList;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//list��������
		List l1 = new LinkedList();

		
		for (int i = 0; i<=5; i++) {
			l1.add("a"+i);
		}
		System.out.println(l1);
		l1.add(3, "a100");		//��indexλ�ò���Ԫ��element
		System.out.println(l1);
		l1.set(6, "a200");		//��elementȡ��indexλ�õ�Ԫ��
		System.out.println(l1);			
		System.out.print(l1.get(2)+" ");	//get�����б���ָ��λ�õ�Ԫ��
		System.out.println(l1.indexOf("a3"));//indexof����Ԫ��o�״γ��ֵ���ţ���o�����ڷ���-1
		System.out.println(l1.indexOf("0"));
		l1.remove(1);	//���б���ɾ��indexλ�õ�Ԫ��
		System.out.println(l1);
		
		System.out.println("========================================");
		//list�����㷨
		System.out.println("list�����㷨");
		
		
		List l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		
		for (int i = 0; i <=9; i++) {l2.add("a"+i);}
		System.out.println(l2);
		Collections.shuffle(l2);//�������
		System.out.println(l2+"�������");
		
		Collections.reverse(l2);
		System.out.println(l2+"����");//����
		
		l2.sort(null);				//����
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2+"����");
		
	}
}
