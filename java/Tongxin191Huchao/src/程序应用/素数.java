package ����Ӧ��;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("������������Χ:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 2; i <=n; i++) {
			int j=2;
			while (i%j !=0) {
				j++;
			}
			if (i==j)System.out.print(i+" ");
		}
		
	}

}
