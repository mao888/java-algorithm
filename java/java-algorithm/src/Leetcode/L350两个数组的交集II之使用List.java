package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L350��������Ľ���II֮ʹ��List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		System.out.println(new L350��������Ľ���II֮ʹ��List().intersect(nums1, nums2));
	}
	public int[] intersect(int[] nums1, int[] nums2) {
		
		List<Integer> list1 = new ArrayList<>();
		for (int i : nums1) {
			list1.add(i);
		}
		
		List<Integer> list2 = new ArrayList<>();
		for (int i : nums2) {
			if (list1.contains(i)) {
				list2.add(i);
				// ��list1 ��ȥ��ƥ�����ֵ
				list1.remove(Integer.valueOf(i));
			}
		}
		int arr[] = new int[list2.size()];
		int j = 0;
		for (int i : list2) {
			arr[j]=i;
			j++;
		}
		return arr;
	}
}

