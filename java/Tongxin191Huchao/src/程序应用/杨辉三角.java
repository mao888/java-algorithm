package ����Ӧ��;

import java.util.Scanner;

public class ������� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("������������ǵ�����:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int arr[][] = new int[a][];									// ����a�ж�ά���飬�����������еĸ���
		System.out.println("���������");
		for (int i = 0; i < arr.length; i++)arr[i]= new int [i+1];	//�����ά����ĵ�i����i+1��
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				arr[i][0]=arr[i][j]=1;
				if (i>0&&j>0&&j<i)arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
