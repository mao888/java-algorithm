package ����Ӧ��;

import java.util.Scanner;

public class �ж��·ݵ����� {

	public static void main(String[] args) {
		int month,days;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		switch (month) {
		case 2:days=28;
			   break;
		case 4:
		case 6:
		case 9:
		case 11:days=30;		//4 6 9 11 �·ݵ�����Ϊ30��
				break;
		default:days=31;		//�����·�Ϊ31��
			break;
		}
		System.out.println(month+"�·�Ϊ"+days+"��");
	}
}


















