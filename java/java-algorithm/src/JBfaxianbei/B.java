//�ڶ��⣨����
//����n�����ݽ�����д�С��������
//���룺
//��һ����������n��
//�ڶ�������n�����֣�
//�����
//�������n������������˳�� 


package JBfaxianbei;

import java.util.Arrays;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
	
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]+" ");
		}
	} 

}
 