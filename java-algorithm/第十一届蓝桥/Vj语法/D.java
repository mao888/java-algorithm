package Vj�﷨;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double r = sc.nextDouble();
			double s = 3.1415927*(4.0/3.0)*(r*r*r);
			System.out.println(String.format("%.3f",s));
		}
	}

}
