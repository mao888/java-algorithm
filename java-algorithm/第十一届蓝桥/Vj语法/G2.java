package Vj�﷨;
import java.util.Scanner;
public class G2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			int arr[] = new int[5];
			char c[] = s.toCharArray();
			for (int j = 0; j < s.length(); j++) {
				if (c[j]=='a') 
					arr[0]++;
				if(c[j]=='e')
					arr[1]++;
				if(c[j]=='i')
					arr[2]++;
				if(c[j]=='o')
					arr[3]++;
				if(c[j]=='u')
					arr[4]++;
			}
			System.out.println("a:"+arr[0]);
			System.out.println("e:"+arr[1]);
			System.out.println("i:"+arr[2]);
			System.out.println("o:"+arr[3]);
			System.out.println("u:"+arr[4]);
		}
	}
}
