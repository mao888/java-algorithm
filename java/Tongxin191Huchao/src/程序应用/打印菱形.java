package ����Ӧ��;

import java.util.Scanner;

public class ��ӡ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		System.out.println("������Ҫ��ӡ������:");
			Scanner sc= new Scanner(System.in);
			int row = sc.nextInt();
				// ��������һ�е�����
				int maxNum = (row + 1) / 2;
				// ������
				for(int i = 1; i <= maxNum; i++) {
					// �ո�
					for(int j = 1; j <= maxNum- i; j++) {
						System.out.print(" ");
					}
					// ����
					for(int k = 1; k <= (2 * i) - 1; k++) {
						System.out.print("*");
					}
					// ����
					System.out.println();
				}
				// ������
				
				// ������
				for(int i = row - maxNum; i > 0; i--) {
					// �ո�
					for(int j = 1; j <= maxNum - i; j++) {
						System.out.print(" ");
					}
					// ����
					for(int k = 1; k <= 2 * i -1; k++) {
						System.out.print("*");
					}
					// ����
					System.out.println();
				}
				// ������
		
	}

}
