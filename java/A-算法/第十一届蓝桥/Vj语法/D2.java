package Vj�﷨;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
		double r = sc.nextDouble();
		double sum = 3.1415927*4/3*r*r*r;
		System.out.println(String.format("%.3f", sum));
	}
	}
}
