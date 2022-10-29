package ��������2022��10��25;

import java.util.Scanner;

public class ���鵥���͹鲢���� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (arr == null || n == 0) {
            System.out.println(0);
        }
		System.out.println(mergeSortRecursion(arr, 0, n-1)  % 1000000007);
	}
	
	/**
     * �ݹ�ʵ�ֹ鲢����
     */
    public static int mergeSortRecursion(int[] arr, int l, int r) {
        if (l == r) {   // �����������鳤��Ϊ1ʱ���ݹ鿪ʼ���ݣ�����merge����
            return 0;
        }
        int mid = (l + r) / 2;
        return mergeSortRecursion(arr, l, mid) + mergeSortRecursion(arr, mid + 1, r) + merge(arr, l, mid, r);
    }
    
    /**
     * �ϲ��������ź��������s[left...mid]��s[mid+1...right]
    */
    public static int merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];    // �����洢�ռ� O(n)
        int index = 0;
        int i = left;
        int j = mid + 1;
        int smallSum = 0;       // �����������ۼ�����С��
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                // ��ǰһ������Ԫ��С�ڻ���ں�һ������Ԫ��ʱ���ۼ�С��
                // s[i] <= s[j] -> s[i] <= s[j]...s[right]
                smallSum += arr[i] * (right - j + 1);
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left++] = temp[k];
        }
        return smallSum;
    }
}
