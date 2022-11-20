package Leetcode;

public class L912��������֮���� {
	
	static int nums[] = {5,2,3,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort(nums, 0, nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	// ����
//	public static void QuickSort(int arr[]) {
//		QuickSort(arr, 0, arr.length-1);
//	}
	// ����
	public static void QuickSort(int arr[],int start,int end) {
		// ��������ڵ���������2�����˳��ݹ�
		if (start >= end) {
			return;
		}
		// �����������������м�ֵ���±�
	    int middle = partition(arr, start, end);
	    // ����������������
	    QuickSort(arr, start, middle - 1);
	    // ���ұ������������
	    QuickSort(arr, middle + 1, end);
	}
	// �����㷨
	// �� arr �� start �� end �������������Ȼ���С���ұ�����Ȼ�����Ȼ�󷵻��м�ֵ���±�
	public static int partition(int[] arr, int start, int end) {
	    // ȡ��һ����Ϊ����
	    int pivot = arr[start];
	    // �ӵڶ�������ʼ����
	    int left = start + 1;
	    // �ұ߽�
	    int right = end;
	    // left��right ����ʱ�˳�ѭ��
	    while (left < right) {
	        // �ҵ���һ�����ڻ�����λ��
	        while (left < right && arr[left] <= pivot) {
	        	left++;
	        }
	        // ��������������ʹ����߷�����С�ڻ���ڻ������ұ߷������ڻ���ڻ���
	        if (left != right) {
	            exchange(arr, left, right);
	            right--;
	        }
	    }
	    // ��� left �� right ��ȣ������Ƚ� arr[right] �� pivot
	    if (left == right && arr[right] > pivot) right--;
	    // ���������м�������
	    if (right != start) exchange(arr, start, right);
	    // �����м�ֵ���±�
	    return right;
	}
	// ����
	public static void exchange(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
