package ��������2022��10��25;

import java.util.Scanner;

public class ͳ�ƴ�д��ĸ���� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int a = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('A'<=str.charAt(i)&&str.charAt(i) <= 'Z') {
				a++;
			}
		}
		System.out.println(a);
	}
}
