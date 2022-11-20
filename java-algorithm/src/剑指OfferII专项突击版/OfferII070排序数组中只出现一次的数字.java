package ��ָOfferIIר��ͻ����;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class OfferII070����������ֻ����һ�ε����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,3,7,7,10,11,11};
//		System.out.println(singleNonDuplicate(nums));
		System.out.println(singleNonDuplicate2(nums));
	}
	
	/**
	 * ����һ���
	 * @param nums
	 * @return
	 */
    public static int singleNonDuplicate(int[] nums) {
    	int a = 0;
    	for (int i : nums) {
    		a = a^i;
		}
    	return a;
    }
    
    /**
     * �������� ����
     * @param nums
     * @return
     */
    /**
     * ���ֲ��ҹ������м�ֵnums[mid]�����������������
     * 	1������������һ��������ͬ
     * 	2��������ǰ��һ��������ͬ
     * 	3�������Ǵ�
     *  ���mid����Ӧ��һ�������±���(������ż��)����ôĿ��һ����mid֮ǰ������±���(ż��������)��Ŀ��һ����mid֮��
     */
    public static int singleNonDuplicate2(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid < n - 1 && nums[mid] == nums[mid + 1]) { //ż �� ��ָ������ 
                if (mid % 2 == 0) {
                    l = mid + 2;
                } else {			//�� ż ��ָ������
                    r = mid - 1;
                }
            } else if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {	// �� ż ��ָ������
                    r = mid - 2;
                } else {
                    l = mid + 1;	//ż �� ��ָ������ 
                }
            } else {	
                return nums[mid];
            }
        }
        // ������Ŀ�����ʣ�ansһ���ᱻ�ҵ������Բ��᷵��-1
        return 0;
    }
}
