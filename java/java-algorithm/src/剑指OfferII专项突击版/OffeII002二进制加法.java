package ��ָOfferIIר��ͻ����;

/** 
 *static String toBinaryString(int i) 
  �ڻ���2�з��������������ַ�����ʾ��ʽΪ�޷���������  
 * */

/**
 * public static int parseInt(String s,
                           int radix)
                    throws NumberFormatException
                    ���ַ�����������Ϊ�ڶ�������ָ���Ļ����е��з��������� 
                    �ַ����е��ַ�����ȫ����ָ�����������֣���Character.digit(char, int)���طǸ�ֵȷ������
                    ���˵�һ���ַ�������ASCII����'-' �� '\u002D' ����ָʾ��ֵ��ASCII�Ӻ�'+' �� '\u002B' ���Ա�ʾ��ֵ�� 
                    �������õ�������ֵ�� 
 * */

public class OffeII002�����Ƽӷ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
//		System.out.println(Integer.toBinaryString(
//				Integer.parseInt(a,2) + Integer.parseInt(b,2)
//				)
//			);
		System.out.println(a.charAt(a.length()-2));
//		a.charAt(a.length()-1-'0');
	}

}
