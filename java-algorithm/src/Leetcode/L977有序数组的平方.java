package Leetcode;

import java.util.Arrays;

public class L977有序数组的平方 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-7,-3,2,3,11};
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		Arrays.sort(nums);
		for (int i : nums) {
			System.out.println(i);
		}

	}

}
