package ��285������leetcode����;

public class L6027ͳ�������з�͹ȵ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {44,44,40,40};
		System.out.println(countHillValley(nums));
	}
    public static int countHillValley(int[] nums) {
    	int feng = 0;
    	int gu = 0;
    	int sum = 0;
    	for (int i = 1; i < nums.length-1; i++) {
    		if (nums[i]!=nums[i-1]) {
				if (Feng(nums, i)) {
					feng +=1;
				}
				if (Gu(nums, i)) {
					gu+=1;
				}
			}
		}
    	sum = feng + gu;
    	return sum;
    }
    // �жϷ�
    public static boolean Feng(int nums[],int i) {	
    	if (nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
			return true;
		}
    	if (nums[i]==nums[i+1]) {
			int j =xiabiao(nums, i);
			if (nums[i]>nums[i-1] && nums[j]>nums[j+1]) {
				return true;
			}
		}
    	return false;
    }
    // �жϹ�
    public static boolean Gu(int nums[],int i) {
    	if (nums[i]<nums[i-1] && nums[i]<nums[i+1]) {
			return true;
		}
    	if (nums[i]==nums[i+1]) {
			int j =xiabiao(nums, i);
			if (nums[i]<nums[i-1] && nums[j]<nums[j+1]) {
				return true;
			}
		}
    	return false;
    }
    // Ѱ���ٽ粻���±�
    public static int xiabiao(int nums[],int i) {
    	for (int j = i; j < nums.length-1; j++) {
    		if (nums[j] == nums[j+1]) {
    			j++;
    			if (j>=nums.length-1) {
					break;
				}
    		}
    		if (nums[j] != nums[j+1] ) {
        		return j;
    		}
		}
    	return 0;
    }
    
}
