package ����Ӧ��;

import java.util.Scanner;

public class dsf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,k,p=n;
		while (n!=0) {
			k=n%10;		//��λ
			n=n/10;		//i��1λ
			sum+=k*k*k;
		}
		if (p==sum)System.out.println(p+"��ˮ�ɻ���");
		else System.out.println(p+"����ˮ�ɻ���");
		
	}

}
