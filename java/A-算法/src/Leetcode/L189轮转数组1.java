package Leetcode;

public class L189��ת����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2};
		int k=3;
		int arr[]=new int[nums.length];
		if(k>nums.length) {
			k=k%nums.length;
		}
		for (int i = nums.length-k,j=0; i < nums.length; i++) {
			arr[j]=nums[i];
			j++;
		}
		for (int i = 0,j=k; i <nums.length-k;) {
			arr[j]= nums[i];
			++i;
			j++;
		}
//		for (int i : arr) {
//			System.out.println(i);
//		}
//		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.arraycopy(arr, 0, nums, 0, nums.length);
	}
	

}
