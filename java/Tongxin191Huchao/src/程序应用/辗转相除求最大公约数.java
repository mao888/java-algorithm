package ����Ӧ��;
import java.util.Scanner;
public class շת��������Լ�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("����������a:");
		a = sc.nextInt();
		System.out.println("����������b:");
		b = sc.nextInt();
		System.out.print("gcb("+a+","+b+")=");
		do {
			k=a%b;
			a=b;
			b=k;
		} while (k!=0);
		System.out.println(a);
	}
}

