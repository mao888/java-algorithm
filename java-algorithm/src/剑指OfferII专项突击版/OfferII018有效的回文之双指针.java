package ��ָOfferIIר��ͻ����;

import java.util.Iterator;

public class OfferII018��Ч�Ļ���֮˫ָ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
//		String a = "a";
//		String b = "a";
//		System.out.println(a.equals(b));

		
    	System.out.println(new OfferII018��Ч�Ļ���֮˫ָ��().isPalindrome(s));

	}
	
    public boolean isPalindrome(String s) {
    	int left = 0;
    	int right = s.length() - 1;
    	s = s.toLowerCase();
    	char c1;
    	char c2;
    	while (left < right) {
			if (!Character.isLetterOrDigit(s.charAt(left))) {
				left += 1;
			} else if (!Character.isLetterOrDigit(s.charAt(right))) {
				right -=1;
			} else {
				c1 = s.charAt(left);
				left++;
				c2 = s.charAt(right);
				right--;
				if (c1 != c2) {
					return false;
				}
			}
		}
    	return true;
    }

}
