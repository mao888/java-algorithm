//��ʽ��Ŀ��
//�����⣨��䣩
//һ����������ʵ�������⣬��ʱ��һ��ѧ���ܹ����ʣ�
//��ѧ���Ҹոջ��ӡ���Σ����������ӡ����һ�������ǣ������Ҳ��ᣬ���ܽ����𣿡�
//����˵�����ۣ�����ѽ����Ҳ����ѽ����
//����һ�ᣬһ��ѧ�ù���������ͬ�����⣬�������̰�������ˡ�
//������֪��������ô��ӡ����������
//
//���ݰ�����������
//ÿ������N��
//���N��Ӧ�ĵ�������ͼ����
 
package JBfaxianbei;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			for(int i=1;i<=4*(n-1)+1;i++) {    		// ��
				for(int j=1;j<=5*(n-1)+n;j++) {		// ��
					if((i==n&&j%2==1)||(i==3*n-2&&j%2==1)||i==j+n-1||i==j-3*n+3||i==-j+3)
						System.out.print("*");
					else 
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
