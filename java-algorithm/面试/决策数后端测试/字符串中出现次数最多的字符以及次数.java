package ��������˲���;

import java.util.Scanner;

public class �ַ����г��ִ��������ַ��Լ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="1444411";
		MaxStr(s);		
	}
	
	public static void MaxStr(String s) {
		// ת��Ϊ�ַ����顣
		char[] c=s.toCharArray();
		// ����һ����������
		int [] count=new int[c.length];
		
		//��ÿ����Ӧ��ֵ�Լ�����������
		// �ӵ�һ���ַ���ʼ�������ַ���,mid==c[j] count[i]++;
		for(int i=0;i<=c.length-1;i++)
		{
			char mid=c[i];
		    for(int j=0;j<=c.length-1;j++)
		    {
		    	if(mid==c[j])
		    	count[i]++;
		    }				
		}
		// ȡ��count��������ֵ�����ҵõ��±�
		int index=0;
		int max=0;

		for(int i=0;i<=c.length-1;i++)
		{
			if(max<=count[i])
			{
				max=count[i];
				index=i;
			}			

		}
	
		System.out.println("���������ַ��ǣ�"+c[index]+"�������Ĵ�����:"+count[index]);
	}

}
