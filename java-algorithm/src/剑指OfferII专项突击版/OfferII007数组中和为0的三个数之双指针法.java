package ��ָOfferIIר��ͻ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Java2021���ֱ�������.RE;
import ����.foreach������ά����;

public class OfferII007�����к�Ϊ0��������֮˫ָ�뷨 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] ={-1,0,1,2,-1,-4};
		System.out.println(new OfferII007�����к�Ϊ0��������֮˫ָ�뷨().threeSum(nums));
	}
	
	public List<List<Integer>> threeSum(int[] nums){
		if (nums==null||nums.length<3) {
			return new ArrayList<>(); 
		}  
		
		List<List<Integer>> res= new ArrayList<>();
		Arrays.sort(nums);  // ʱ�临�Ӷ� O(nlogn)
		
		//ʱ�临�Ӷ�  O(n^2)
		for (int i = 0; i < nums.length-2; i++) {	  // ʱ�临�Ӷ�O(n)
			// i ȥ��
			if (i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			// �� i + 1 ... nums.length - 1 �в�����ӵ��� -nums[i] ��������
			int target = -nums[i];
			int left = i+1;
			int right = nums.length-1;
			while (left<right) {	// ʱ�临�Ӷ�O(n)
				int sum = nums[left]+nums[right];
				if (sum==target) {
					res.add(Arrays.asList(nums[i],nums[left],nums[right]));
					// ȥ�� ���ǰһ��left==�����left  ����
//					while (left<right&& nums[left]==nums[++left]);
//					while (left<right&& nums[right]==nums[--right]);
					while (left<right) {
						left++;
						if (nums[left-1]!=nums[left]) {
							break;	// ��left-1 ��=left ��ʱ�� ����left++ѭ�� ��ָ��ȥ�����
						}
					}
					
					while (left<right) {
						right--;
						if (nums[right]!=nums[right+1]) {
							break;	// �� right ��= right+1��ʱ�� ����right--ѭ�� ��ָ��ȥ�����
						}
					}
				}else if (sum < target) {
					left++;
				}else {
					right--;
				}
			}
		}
	
		return res;	// O(n)
	}
	
	
}
