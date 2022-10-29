package 数字马力2022年10月25;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 数组单调和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 1; i <=n; i++) {
			sum = sum + getSubSum(Arrays.copyOfRange(arr, 0, i+1), i);
		}
		System.out.println(sum % 1000000007);
	}
	
	public static int getSubSum(int[] B, int n) {
		int sub = 0;
		for (int i : B) {
			if (i<=B[n]) {
				sub = sub + i;
			}
		}
		return sub - B[n];
	}
}
