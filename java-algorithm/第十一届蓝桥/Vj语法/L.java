package Vj�﷨;

import java.util.Arrays;
import java.util.Scanner;

public class L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		double arr[] = new double[3];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < 3; j++) {
				arr[j] = sc.nextDouble();
			}
			Arrays.sort(arr);
			System.out.println((arr[0]+arr[1]>arr[2])?"YES":"NO");
		}
		
	}

}
