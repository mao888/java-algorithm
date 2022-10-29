package Leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class L121������Ʊ�����ʱ��֮Dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		System.out.println(new L121������Ʊ�����ʱ��֮Dp().maxProfit(prices));
	}
	
    public int maxProfit(int[] prices) {
    	
    	 if(prices.length <= 1) {
    		 return 0;
    	 }
         int min=prices[0];
         int max = 0;
         for (int i = 0; i < prices.length; i++) {
			max = Math.max(max,prices[i]-min);
			min = Math.min(min, prices[i]);
		}
         return max;
    }
}