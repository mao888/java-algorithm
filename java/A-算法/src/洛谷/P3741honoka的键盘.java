package ���;

import java.util.Iterator;
import java.util.Scanner;

public class P3741honoka�ļ��� {
	static int n;
	static char []z;
	// ����kv
	public static int check() {
		int sum=0;
		for (int i = 0; i < n-1; i++) {
			if (z[i]=='V'&&z[i+1]=='K') {
				sum++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		String s = sc.next();
//		z = s.toCharArray();
//		
//		Scanner sc1 = new Scanner(System.in);
		z = sc.next().toCharArray();
		
		int maxi=check();//�ȿ�û�иĹ������
		for(int i=0;i<n;i++){
			if(z[i]=='V'){// �����V���͸ĳ�KȻ����check()����ж��ٸ�VK 
				z[i]='K';
		        maxi=Math.max(maxi,check());//һ�δ��滻 
		        z[i]='V';//����ٻ�ԭ 
		    }
		    else if(z[i]=='K'){//����ͬ�� 
		        z[i]='V';
		        maxi=Math.max(maxi,check());
		        z[i]='K';
		    }
		 }
		System.out.println(maxi);
	}
}
