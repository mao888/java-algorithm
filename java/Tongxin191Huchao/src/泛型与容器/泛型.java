package ����������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/*
 *
 *������ʵ�ʾ��ǽ����ݵ����Ͳ�������ͨ��Ϊ�࣬�ӿڼ������������Ͳ��������巺��
 *����ʹһ�����һ���������ڶ��ֲ�ͬ���͵Ķ����Ͻ��в��������÷�����ζ�ű�д�Ĵ�����Ա��ܶ����Ͳ�ͬ�Ķ��������ã��Ӷ�������������ת����Ǳ�ڴ���
 *����ʵ�������ڶ����࣬�ӿڻ򷽷�ʱͨ��Ϊ������"���Ͳ���"��ʵ�ֵ�
 		*���������������������ͱ�ָ��Ϊһ�����������������Ϊ���Ͳ���
    	ʵ��	*����˵�����͵�ʵ���ǽ����ݵ����Ͳ�����	
*/
 
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> c= new ArrayList<String>();
		c.add("aaa");c.add("bbb");c.add("ccc");
		for (int i = 0; i < c.size(); i++) {
			String s = c.get(i);		//����Ҫǿ��ת�� 
			System.out.println(s);
		}
		 
		Collection<String> c2 = new	HashSet<String>();
		c2.add("aaa");c2.add("bbb");c2.add("ccc");
		for (Iterator<String> it  =c2.iterator();it.hasNext();) {
			String s = it.next();
			System.out.println(s);
			
class MyName implements Comparable<MyName>{
	int age;

	@Override
	public int compareTo(MyName mn) {
		// TODO Auto-generated method stub
		if (this.age>mn.age)return 1;
		else if (this.age<mn.age)return -1;
		else return 0;
	}
	
}	

		}
	}
}
