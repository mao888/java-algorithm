package Leetcode;

import java.util.Arrays;

public class L215�����еĵ�K�����Ԫ��֮������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,3,1,2,4,5,5,6};
		
		System.out.println(findKthLargest(arr, 4));
	}
	
    public static int findKthLargest(int[] nums, int k) {
    	heapSort(nums);
    	return nums[nums.length-k];
    }
    
	// ��дһ��������ķ���
	public static void heapSort(int arr[]) {
		int temp = 0;
		// �ֲ����
//		adjustHeap(arr, 1, arr.length);
//		System.err.println("��һ�ε���"+Arrays.toString(arr));	// 4,9,8,5,6
//		adjustHeap(arr, 0,arr.length);
//		System.err.println("��һ�ε���"+Arrays.toString(arr));	// 9, 6, 8, 5, 4
		/**
		 * 1.�������й�����һ���ѣ���������������ѡ�����ѻ�С����
		 * */
		// ����һ���󶥶�
		for(int i = arr.length / 2 -1; i >=0; i--) {
			adjustHeap(arr, i, arr.length);
		}
		/**
		 *2.���Ѷ�Ԫ����ĩβԪ�ؽ����������Ԫ�ء�����������ĩ��
		 *3.���µ����ṹ��ʹ������Ѷ��壬Ȼ����������Ѷ�Ԫ���뵱ǰĩβԪ�أ�����ִ�е���+�������裬ֱ������������� 
		 * */
		for (int j = arr.length-1;j>0;j--) {
			// ����
			swap(arr, 0, j);
			// ����
			adjustHeap(arr, 0, j);
			}
//		System.out.println("����="+Arrays.toString(arr));
		
		}
	
	// ��һ������(������)��������һ���󶥶�
	public static void adjustHeap(int arr[],int i,int length) {
		int temp = arr[i];	// ��ȡ����ǰԪ�ص�ֵ����������ʱ����
		// ��ʼ����
		// ˵��:k = 2*i+1 �� i �����ӽ��
		for (int k = 2*i+1; k < length; k=k*2+1) {
			if (k+1 < length && arr[k]<arr[k+1]) {
				k++;
			}
			if (arr[k]>temp) {
				arr[i] = arr[k];
				i = k;
			}else {
				break;
			}
		}
		// ��forѭ�������������Ѿ�����iΪ�������������ֵ���������(��iΪ�����ľֲ�������)
		arr[i] = temp;
	}
	
	// ��������
    public static void swap(int arr[],int i,int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    
}