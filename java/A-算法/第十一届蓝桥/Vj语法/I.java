// - 回文字符串
//“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。请写一个程序判断读入的字符串是否是“回文”。
package Vj语法;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		for (int t = 0; t < n; t++) {
			char c[] =sc.next().toCharArray();
			for (int i = 0; i < c.length; i++) {
				if(c[i]!=c[c.length-1-i]) {
					System.out.println("no");
					break;
				}else if (i>c.length-1-i) {
					System.out.println("yes");
					break;
				}
			}
		}
	}
}
