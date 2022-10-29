package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Vj�﷨.S;

public class L3���ظ��ַ�����Ӵ�֮��������Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(new L3���ظ��ַ�����Ӵ�֮��������Map().lengthOfLongestSubstring(s));
	}
	
    public int lengthOfLongestSubstring(String s) {
    	Map<Character, Integer> map = new HashMap<>();
    	int max = 0;
    	int start = 0;
    	for(int right = 0;right < s.length();right++) {
    		char ch = s.charAt(right);
    		if (map.containsKey(ch)) {
				start = Math.max(map.get(ch)+1, start);
			}
    		max = Math.max(max, right-start+1);
    		map.put(ch, right);
    	}
    	return max;
    }
}
