package Java��ϰ;

import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		System.out.println("����������������ֵ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a = 0;
	while (n!=1) {
	if (n%2 == 0) {
	  n=n/2;
		a+=1;	
	}else {
		n=(n*3+1)/2;
		a+=1;
			}
		}
	System.out.println(a);
	}
}
		
