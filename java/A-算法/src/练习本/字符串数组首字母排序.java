package ��ϰ��;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.*;

public class �ַ�����������ĸ���� {

	 public static void main(String[] args) {
	        Random random=new Random();
	        String[] str=new String[8];//����һ��������8���ַ�������
	        Set<Integer> a = new HashSet<Integer>();
	        //ʹ��8��������5������ַ�����ʼ���������
	        for (int i = 0; i <8; i++) {
	            //����ַ������ɷ�
	            char c[]=new char[5] ;
	            for (int j = 0; j <5 ; j++) {
	                char temp;
	                if(random.nextInt(2)==0){
	                    //0-1�൱��һ���ж�
	                    temp=(char)(random.nextInt(26)+65);//65-90 ��д��ĸ
	                }
	                else
	                    temp=(char)(random.nextInt(26)+97);//97-122 Сд��ĸ

	                c[j]=temp;

	            }
	            str[i]=new String(c);
	        }
	        System.out.println(Arrays.toString(str));
	        System.out.println("����ú���ַ���������:");

	        for (int i = 0; i < 8; i++)
	        {
	        	
	            int min = i;
	            for (int j = i; j < 8; j++){
	                if(Character.toLowerCase(str[j].toCharArray()[0])<
	                        Character.toLowerCase(str[min].toCharArray()[0])) //�Ƚϵ�һ����ĸ
	                    min=j;
	            }
	            //���������str[j]��һ����ĸ<str[min]��һ����ĸ
	            //��ʱ��min=j;�ַ�����������С��
	            //����str[i] ��str[min]
	            String temp = str[i];
	            str[i] = str[min];
	            str[min] = temp;
	        }
	        System.out.println(Arrays.toString(str));

	    }

}
