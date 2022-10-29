package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class L3���ظ��ַ�����Ӵ�֮��������Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(new L3���ظ��ַ�����Ӵ�֮��������Set().lengthOfLongestSubstring(s));
	}
	
    public int lengthOfLongestSubstring(String s) {
    	// ��ϣ���ϣ���¼ÿ���ַ��Ƿ���ֹ�
    	Set<Character> set = new HashSet<>();
    	int n = s.length();
    	// ��ָ�룬��ʼֵΪ-1���൱���������ַ�������߽����࣬��û�п�ʼ�ƶ�
    	int right = -1;
    	int ans = 0;
    	for(int i = 0;i<n;i++) {
    		if (i!=0) {
				// ��ָ�������ƶ�һ���Ƴ�һ���ַ�
    			set.remove(s.charAt(i-1));
			}
    		while(right+1<n && !set.contains(s.charAt(right+1))) {
    			set.add(s.charAt(right+1));
    			right++;
    		}
    		// ��i��rk���ַ���һ�����������ظ��ַ��Ӵ�
    		ans = Math.max(ans, right-i+1);
    	}
    	return ans;
    }

}
