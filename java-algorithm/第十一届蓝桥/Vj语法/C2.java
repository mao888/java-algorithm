package Vj�﷨;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x= 0,y=0;
			for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
				if (i%2==0) {
					x+=i*i;
				}else {
					y+=i*i*i;
				}
			}
			System.out.println(x+" "+y);
		}
	}
}
