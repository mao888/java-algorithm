package ����������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ����ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list =new ArrayList<String>();
		list.add("Hello");
	    list.add("World");
	    list.add("HAHAHAHA");
	  //��һ�ֱ�������ʹ�� For-Each ���� List
	     for (String str : list) {            //Ҳ���Ը�д for(int i=0;i<list.size();i++) ������ʽ
	        System.out.println(str);
	     }
	     
	   //�ڶ��ֱ������������Ϊ������ص����ݽ��б���
	     String[] strArray=new String[list.size()];
	     list.toArray(strArray);
	     for(int i=0;i<strArray.length;i++) //����Ҳ���Ը�дΪ  for(String str:strArray) ������ʽ
	     {
	        System.out.println(strArray[i]);
	     }
	     
	     //�����ֱ��� ʹ�õ�����������ر���
	     Iterator<String> ite=list.iterator();
	     while(ite.hasNext())//�ж���һ��Ԫ��֮����ֵ
	     {
	         System.out.println(ite.next());
	     }  
	     
	     
	     
	}

}
