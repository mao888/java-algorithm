package ����Ӧ��;

import java.util.Scanner;

public class Exercise4_9�����͸��������� {
	public static void main(String[] args) {
		System.out.println("����һ�������͵���:");
		Scanner sc = new Scanner(System.in);
		double n =sc.nextDouble();
		double n2=n;
		int s=0;
		while (n>1) {
			n--;
			s+=1;
			if (n<1)break;
		}
		System.out.println("��������Ϊ:"+s+"  С������Ϊ:"+(n2-s));
	}
}

