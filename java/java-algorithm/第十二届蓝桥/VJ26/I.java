package VJ26;
			
import java.util.Scanner;
			
public class I {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
			char c[] =sc.next().toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c[j]!=c[c.length-1-j]) {
					System.out.println("no");
					break;
				}else if (j>c.length-i-j) {
					System.out.println("yes");
				}
			}
		}	
	}

}
