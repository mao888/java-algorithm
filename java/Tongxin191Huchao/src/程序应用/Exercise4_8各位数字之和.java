package ����Ӧ��;

import java.util.Scanner;

//���㲢���һ��������λ����֮��
//5423�ĸ�λ����֮��Ϊ5+4+2+3
public class Exercise4_8��λ����֮�� {
	public static void main(String[] args) {
		System.out.println("������һ����:");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0,k;
		while (n!=0) {
			k=n%10;
			n=n/10;
			sum+=k;
		}
		System.out.println("��λ��֮��Ϊ:"+sum);
	}
}
