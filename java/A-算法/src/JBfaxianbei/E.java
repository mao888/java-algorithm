package JBfaxianbei;

import java.util.Scanner;

//����
//ÿ�α�֤����ȡ��ֵΪm+1
//��17���ǹ������ȡ4��             
public class E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n%(m+1)==0)System.out.println("No");
			else System.out.println("Yes");
		}
	}
}
 