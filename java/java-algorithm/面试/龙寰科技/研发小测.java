package ��徿Ƽ�;

import java.util.Scanner;

public class �з�С�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(NumberOf1(n));
	}                        
	
	// �Ƚ�������תΪ�������ַ������ڽ��ַ���תΪ�ַ����飬�����ַ�������1�ĸ���
	public static int NumberOf1(int n) {
        int tmp = 0;
        char[] arr = Integer
        		.toBinaryString(n)	// ������nתΪ�������ַ���
        		.toCharArray();		// ���ַ���תΪ�ַ�����
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '1'){//�ж��Ƿ�Ϊ�ַ�1
                tmp++;
            }
        }
        return tmp;
    }
	
}
