//��ʮ�⣨�ַ�����
//����һ������һ�����ڵ��ַ����������ҳ���kunkun���ַ������ֵĴ�����
//���룺fgkunkundfsaf
//�����1

package JBfaxianbei;

import java.util.Scanner;
// API String ��Ӧ��
public class J {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count =0;
		while(s.indexOf("maomao") >=0) {
			int x=s.indexOf("maomao");
			s =s.substring(x + 5);
			count++;
		}
		System.out.println(count);
	}

}
