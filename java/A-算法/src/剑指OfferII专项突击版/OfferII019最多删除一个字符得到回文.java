package ��ָOfferIIר��ͻ����;
				
public class OfferII019���ɾ��һ���ַ��õ����� {
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(new OfferII019���ɾ��һ���ַ��õ�����().validPalindrome(s));
	}			
    public boolean validPalindrome(String s) {
    	StringBuffer sb = new StringBuffer();
    	int left = 0;
    	int right = s.length()-1;
    	while (left<right) {
    		// �������ȣ�������������ɾ����ߵ�Ԫ�أ������ұߵ�Ԫ�أ����жϸ����Ƿ���ģ�����һ�ּ��ɡ�
			if (s.charAt(left)!=s.charAt(right)) {
				return isPalindrome(s, left+1, right)||isPalindrome(s, left, right-1);
			}
			left++;
			right--;
		}
    	return true;
    }
    // �ж��ַ��� s �� [left, right] �Ƿ����
    public boolean isPalindrome(String s, int left,int right) {
    	while (left<right) {
			if (s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
    	return true;
    }

}
