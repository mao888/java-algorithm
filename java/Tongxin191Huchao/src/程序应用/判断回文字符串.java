package ����Ӧ��;

import java.util.Scanner;

public class �жϻ����ַ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("�������ַ���:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length/2; i++) {
			if (chr[i]!=chr[chr.length-1-i]) {
				System.out.println(str+"���ǻ����ַ���");
				break;
			}else {
				System.out.println(str+"�ǻ����ַ���");
				break;
			}
		}
		
	}

}
