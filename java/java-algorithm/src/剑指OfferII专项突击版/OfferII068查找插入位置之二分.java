package ��ָOfferIIר��ͻ����;

public class OfferII068���Ҳ���λ��֮���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,5,6};
		System.out.println(searchInsert(nums, 7));
	}
	
    public static int searchInsert(int[] nums, int target) {
        // ���ò�������Ϊ���ұգ���[left,right)
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return left;
    }


}
