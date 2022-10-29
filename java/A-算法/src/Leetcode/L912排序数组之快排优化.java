package Leetcode;

import java.security.Policy;
import java.util.Arrays;
import java.util.Iterator;

import ����.foreach������ά����;
import ��ϰ��.a;

public class L912��������֮�����Ż� {
	
	static int nums[] = {5,1,1,2,0,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortArray(nums);
	}
	
    public static int[] sortArray(int[] nums) {
    	partition(nums, 0, nums.length-1);
    	for (int i : nums) {
			System.out.println(i);
		}
    	return nums;
    }
    // ����
	public static void QuickSort(int arr[],int start,int end) {
		// ��������ڵ���������2�����˳��ݹ�
		if (start < end) {
			// �����������������м�ֵ���±�
		    int d = partition(arr, start, end);
		    // ����������������
		    QuickSort(arr, start, d - 1);
		    // ���ұ������������
		    QuickSort(arr, d + 1, end);
		}

	}
    // �����㷨
    public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		// ����һ��Ԫ����Ϊpivot
		while (i<j) {
			while (i<j&&pivot<arr[j]) {	// ���ұ߿�ʼ�ҳ�С��pivot
				j--;
			}
			if (i<j) {
				arr[i] = arr[j];
				i++;
			}
			while (i<j&&arr[i]<pivot) {	// �ҳ�����pivot
				i++;
			}
			if (i<j) {
				arr[j] = arr[i];
				j--;
			}
		}
		arr[i] = pivot;	// ��ʱi��pivot����λ��
		return i;
	}
	
}
