package ����������;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ����Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
	      map.put("1", "value1");
	      map.put("2", "value2");
	      map.put("3", "value3");
	      
	    //��һ�֣��ձ�ʹ�ã�����ȡֵ
	      System.out.println("ͨ��Map.keySet����key��value��");
	      for (String key : map.keySet()) {
	       System.out.println("key= "+ key + " and value= " + map.get(key));
	      }
	      
	    //�ڶ���
	      System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
	      Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	      while (it.hasNext()) {
	       Map.Entry<String, String> entry = it.next();
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }  
	    //�����֣��Ƽ���������������ʱ
	      System.out.println("ͨ��Map.entrySet����key��value");
	      for (Map.Entry<String, String> entry : map.entrySet()) {
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }  
	      
	    //������
	      System.out.println("ͨ��Map.values()�������е�value�������ܱ���key");
	      for (String v : map.values()) {
	       System.out.println("value= " + v);
	      }
	}

}
