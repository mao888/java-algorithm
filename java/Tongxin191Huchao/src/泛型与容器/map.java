package ����������;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap();Map m2 = new HashMap();
		
		//�ں��ʵ�ʱ���Զ���������
			//�Զ�����������ת��Ϊ����
			//�Զ�������ת��Ϊ��������
		
		//map�涨���߶������Ƕ���
//		m1.put("one", new Integer(1));//��keyΪ�����򼯺������ֵΪvalue��Ԫ�أ�����key����Ψһ����������ӵ�ֵ��ȡ�����е�ֵ
		m1.put("one",1 );
//		m1.put("two", new Integer(2));
		m1.put("two",2 );
//		m1.put("three", new Integer(3));
		m1.put("three", 3);
//		m2.put("A", new Integer(1));
		m2.put("A", 1);
//		m2.put("B", new Integer(2));
		m2.put("B", 2);
		
		System.out.println(m1.size());//���ش�ӳ���еļ�ֵӳ���ϵ��
		
		System.out.println(m1.containsKey("one"));  //�ж��Ƿ����ָ���ļ�key
		
//		System.out.println(m1.containsValue(new Integer(1))); 	//�ж��Ƿ����ָ����ֵvalue
		System.out.println(m2.containsValue(1));
		
		//get���ؼ�key��ӳ���ֵ����key�������򷵻�null
		if (m1.containsKey("two")) {
//			int i=((Integer)m1.get("two")).intValue();
			int i = (Integer) m1.get("two");
			System.out.println(i);
		}
		
		//��ӳ��m�е�����ӳ���ϵ���Ƶ����ô˷�����ӳ����
		Map m3= new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
		
	}

}
