package ����Ӧ��;

import java.util.Scanner;

public class ���׳� {
	public static void main(String[] args) {
		int s=1,n=1,m ;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		do {
			System.out.println("���������1��������:");
		} while (m<=1);
		while (s<m) {
			s*=n;
			n++;
		}
	}
}
