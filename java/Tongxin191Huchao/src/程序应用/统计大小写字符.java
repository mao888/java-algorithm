package ����Ӧ��;

import java.util.Scanner;

public class ͳ�ƴ�Сд�ַ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char ch[]=new char[10]; 
		for(int i=0;i<10;i++){
			System.out.println("�������"+(i+1)+"���ַ�:");
			String s=scanner.next();
			char c=s.charAt(0);
			ch[i]=c;
		}
		int x=0;
		int y=0;
		int z=0;
		for(int j=0;j<ch.length;j++){
			if(ch[j]>='A'&&ch[j]<='Z'){
				x++;
			}
			else if(ch[j]>='a'&&ch[j]<='z'){
				y++;
			}
			else {
				z++;
			}
		}
		System.out.println("��д��ĸ�ĸ���:"+x);
		System.out.println("Сд��ĸ�ĸ���:"+y);
		System.out.println("�����ַ��ĸ���:"+z);
		
		String str=" ";
		for(int j=0;j<ch.length;j++){
			str+=ch[j];
		}
		System.out.println("�ַ���:"+str);
	}

}
