package Vj?﷨;

import java.util.Scanner;

public class N {

	public static long arr[][] =new long[32][32];
	public static void Init() {
		arr[1][1]=1;
		for (int i = 2; i < 32; i++) {
			for(int j=1;j < 32;j++) {
			arr[i][j]= arr[i-1][j-1] + arr[i-1][j];
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Init();
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(arr[i][j]==0) {
						continue;
					}else {
						System.out.print(arr[i][j]+(i==j?"":" "));
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
