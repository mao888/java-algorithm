package ��������2022��10��25;

import java.util.Scanner;

public class �ַ������һ�����ʵĳ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = str.length()-1;
		int count = 0;
		while ( i >=0 && str.charAt(i) != ' ') {
			i --;
			count++;
		}
		System.out.println(count);
	}

}
