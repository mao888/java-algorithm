package ����������;

import java.util.HashMap;
import java.util.Map;

public class mapTest2 {
	public static void main(String[] args) {
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		
		if (m1.containsKey("two")) {
			int i = m1.get("two");	//get("two")�ó�������Integer�������ͣ�����ǿ������ת����Ȼ���Զ������int i���ֻ�������         
			System.out.println(i);
		}
	}
}
