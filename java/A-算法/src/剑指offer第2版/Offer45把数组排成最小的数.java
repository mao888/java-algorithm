package ��ָoffer��2��;

import java.util.Arrays;

//����Ȿ������һ�������⣬����ֻ���ɻ��ڱȽϵ������㷨��ɡ�
//��� a �� b ��ɵ��ַ������� b �� a ��ɵ��ַ������򽻻� a �� b��
//������ð�������㷨��ɱ��⡣
public class Offer45�������ų���С���� {
	
	static int arr[] = {3,30,34,5,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minNumber(arr));
	}
    public static String minNumber(int[] nums) {
    	bubbleSort(nums);
    	return Arrays.toString(nums).replaceAll("\\[|]|,|\\s", "");
    }
    
    // ð������
    public static void bubbleSort(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
                if (("" + arr[i] + arr[j]).compareTo("" + arr[j] + arr[i]) > 0) {
                    // ��� "" + arr[i] + arr[i + 1] ��ɵ��ַ������� "" + arr[i + 1] + arr[i] ��ɵ��ַ������򽻻�
                    swap(arr, i, j);
                }
				
			}
		}
    	
    }
       
    public static void swap(int arr[],int i,int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    
}
