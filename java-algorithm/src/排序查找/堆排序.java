 package 排序查找;

import java.util.Arrays;

import 练习本.a;

public class 堆排序 {
	
	/**
	 * 1.无序序列构建成一个堆，根据升序降序需求选择大腚堆或小顶堆
	 * 2.将堆顶元素与末尾元素交换，将最大元素“沉”到数组末端
	 * 3.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到这个序列有序
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 要求将数组进行升序排序
//		int arr[] = {4,6,8,5,9};
		int arr[] = {9,8,5,4,3};
		heapSort(arr);
	}
	
	// 编写一个堆排序的方法
	public static void heapSort(int arr[]) {
		int temp = 0;
		// 分步完成
//		adjustHeap(arr, 1, arr.length);
//		System.err.println("第一次调整"+Arrays.toString(arr));	// 4,9,8,5,6
//		adjustHeap(arr, 0,arr.length);
//		System.err.println("第一次调整"+Arrays.toString(arr));	// 9, 6, 8, 5, 4
		/**
		 * 1.无序序列构建成一个堆，根据升序降序需求选择大腚堆或小顶堆
		 * */
		// 构造一个大顶堆
		for(int i = arr.length / 2 -1; i >=0; i--) {
			adjustHeap(arr, i, arr.length);
		}
		/**
		 *2.将堆顶元素与末尾元素交换，将最大元素“沉”到数组末端
		 *3.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到这个序列有序 
		 * */
		for (int j = arr.length-1;j>0;j--) {
			// 交换
			swap(arr, 0, j);
			// 调整
			adjustHeap(arr, 0, j);
			}
		System.out.println("数组="+Arrays.toString(arr));
		
		}
	
	// 将一个数组(二叉树)，调整成一个大顶堆
	/**
	 * 1.无序序列构建成一个堆，根据升序降序需求选择大腚堆或小顶堆
	 * 功能：完成 将 以 i对应的非叶子结点的树调整成大顶堆
	 * 例:  int arr[] =   {4,6,8,5,9};
	 * i = 1,adjustHeap=>{4,9,8,5,6}
	 * i = 0,adjustHeap=>{9,4,8,5,6}
	 *                 =>{9,6,8,5,4}
	 * @param arr 待调整的数组
	 * @param i 表示非叶子结点在数组中索引
	 * @param length 表示对多少个元素继续调整，length是在逐渐减少的
	 * */
	public static void adjustHeap(int arr[],int i,int length) {
		int temp = arr[i];	// 先取出当前元素的值，保存在临时变量
		// 开始调整
		// 说明:k = 2*i+1 是 i 的左子结点
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
		// 当for循环结束后，我们已经将以i为父结点的树的最大值，放在了最顶(以i为父结点的局部二叉树)
		arr[i] = temp;
	}
	
	// 交换函数
    public static void swap(int arr[],int i,int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
}
