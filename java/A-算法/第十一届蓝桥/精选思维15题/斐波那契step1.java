package ��ѡ˼ά15��;

import java.util.Scanner;

public class 쳲�����step1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
			long a  =1;
			long b = 1;
			long t = 1;
			for (long i = 2; i < n; i++) {
				t = a;
				a += b;
				a %= 10007;
				b = t;
			}
			long result = a;
			System.out.println(result);	
	}
}
