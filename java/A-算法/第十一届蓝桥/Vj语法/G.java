//统计每个元音字母在字符串中出现的次数
package Vj语法;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < n; t++) {
			String s = sc.nextLine();
			int arr[] = new int[5];
			char c[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if(c[i]=='a') {
					arr[0]++;
				}else if (c[i]=='e') {
					arr[1]++;
				}else if (c[i]=='i') {
					arr[2]++;
				}else if (c[i]=='o') {
					arr[3]++;
				}else if (c[i]=='u') {
					arr[4]++;
				}
			}
		System.out.println("a:"+arr[0]);
		System.out.println("e:"+arr[1]);
		System.out.println("i:"+arr[2]);
		System.out.println("o:"+arr[3]);
		System.out.println("u:"+arr[4]);
		if(t!=n-1)
			System.out.println();
		
		}
		
	}

}
