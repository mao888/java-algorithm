package CSDNÿ��һ��;

import java.util.Iterator;

/*
 * �⣺
 * ��0��9����ʮλ��������������ϣ�����0�����ڵ�һ����������ɵ�ʮλ�����������ظ�������
 * */
public class ��0��9����ʮλ������������� {
	public static void main(String[] args) {
		String str[]= {"0","1","2","3","4","5","6","7","8","9"};	
	}
	
	static void swap(String[] str,int start,int end) {
		String temp =str[start];
		str[start] = str[end];
		str[end]=temp;
	}
	
	static void permutation(String[]str,int start,int end) {
		if (start==end-1) {
			for (int i = start; i < end; i++) {
				System.out.println(str[i]);
			}
			System.out.println();
		}else {
			for (int i = start; i < end; i++) {
				if (i==0 && str[0].equals("0")) {
					continue;
				}
			swap(str,start,i);
			permutation(str,start+1,end);
			swap(str,start,i);
			}
		}	
	}
	
	
}
