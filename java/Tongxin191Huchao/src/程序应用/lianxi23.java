package ����Ӧ��;
//�Ӽ���������10�����������������һά����a�С����±����5��Ԫ�ط�Ϊһ�飬
//����a[0]��a[5]��a[1]��a[6]��a[2]��a[7]��a[3]��a[8]��a[4]��a[9]��
//��ѭ���ж�ÿ��Ԫ�صĵ�1���Ƿ���ڵ�2�������ǣ�������Ԫ�ء�
//�ֱ��������ԭ����Ԫ�ص�ֵ�ͶԻ����Ԫ�ص�ֵ��
import static org.junit.Assert.fail;

import java.util.Scanner;

public class lianxi23 {
	public static void main(String[] args) {
		int arr[]= new int [10]; 
		int arr1[]= new int [10];
		int t;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)arr[i]= sc.nextInt();
		for (int i = 0; i < arr1.length/2; i++) {
			arr1[i*2]=arr[i];
	        arr1[i*2+1]=arr[i+5];
	        if (arr1[i*2]>arr1[i*2+1]) {
	        	t=arr1[i*2];
	        	arr1[i*2]=arr1[i*2+1];
	        	arr1[i*2+1]=t; 
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}

