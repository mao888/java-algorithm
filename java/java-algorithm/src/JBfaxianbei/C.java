//�����⣨������
//��������T����ʾ��T��������ݡ�
//��������N����ʾ��Ҫ�����N�������Ƕ��١�
//�����n��������
package JBfaxianbei;
import java.util.Scanner;
// �ÿռ任ʱ��
// ҪǮ������-ҪǮ������-ҪǮ������
// ҪǮ������-����-����
public class C {
	
	public static boolean check(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if((n/i)*i==n)return false;
		}
		return true;
}
	
	 public static void main(String[] args) {
		int arr[]=new int[10000];// ǰ10000������
		boolean b[]=new boolean[100000];// ǰ100000λ��Ȼ��
		int p = 0;
		for (int i = 2; i < 100000; i++) {
			if(b[i])continue;
			else if (check(i)) {
				for (int j = i; j < b.length; j+=i) {
					b[j]=true;
				}
				arr[p]=i;
				p++;
			}
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(arr[n-1]);
		}
	}

}
