package ��ָOfferIIר��ͻ����;

import java.util.Iterator;

public class OfferII018��Ч�Ļ���֮reserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race a car";
//		String s = "A man, a plan, a canal: Panama";
		System.out.println(new OfferII018��Ч�Ļ���֮˫ָ��().isPalindrome(s));
	}
	
    public boolean isPalindrome(String s) {
    	StringBuffer sb = new StringBuffer();
    	s = s.toLowerCase();
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
		}
    	return sb.toString().equals(new StringBuffer(sb).reverse().toString());
    }

}
