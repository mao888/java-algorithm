package ����Ӧ��;

import java.util.Scanner;

//�ж���ȫ��	
//��ȫ����ָ����������������1���������������ĺ͵��ڸ����������
public class Exercise4_7��ȫ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for (int i = 1; i <=n/2; i++) {
			if (n%i==0) sum+=i;
		}
		if (n==sum)System.out.println("�������"+n+"����ȫ��");
		else System.out.println("�������"+n+"������ȫ��");
	}

}
