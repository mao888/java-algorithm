package ����Ӧ��;

import java.util.Scanner;

public class �ж�Fibonaqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a=0,b=1,n;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while (a<num) {
			n=a+b;
			a=b;
			b=n;
		}
		if (num==a)System.out.println(num+"��Fibonacci��");
		else System.out.println(num+"����Fibonacci��");
	}

}
