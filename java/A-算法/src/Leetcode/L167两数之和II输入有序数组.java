package Leetcode;

import java.util.Iterator;

public class L167����֮��II������������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,7,11,15};
		int target = 9;
		System.out.println(new L167����֮��II������������().twoSum(numbers, target));
	}
	
    public int[] twoSum(int[] numbers, int target) {
//    	int arr [] = new int [2];
    	int left = 0;
    	int right = numbers.length-1;
    	while (left<right) {
    		if (numbers[left]+numbers[right]==target) {
    			return new int[] {left+1,right+1};
			}else if (numbers[left]+numbers[right]<target) {
				left++;
			}else {
				right--;
			}
		}   	
    	return new int[0];
    }

}
