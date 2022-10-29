package B5��30����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10J���ܴ��� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ���ܻ����������������� ʹ������ȡ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());// ��������
		int n;// ÿ���������ָ���
		String[] a;// ���ո�ָ��ַ���,ÿ���ַ�����Ӧ�±�+1��������
		int[] s;// �洢����
		int[] st;// ��¼������s
		boolean[] visit;//��¼s�е�ֵ�Ƿ��Ѿ���������
		while (N-- >= 0) {
			n = Integer.parseInt(br.readLine().trim());

			a = br.readLine().split("\\s+");

			s = new int[a.length + 1];
			st = new int[a.length + 1];
			visit=new boolean[a.length + 1];
			for (int i = 1; i <= n; i++) {
				// ��ÿ�����ݽ���ǰ׺�͵ļ���
				s[i] = s[i - 1] + Integer.parseInt(a[i - 1]);
			}
			int s0 = s[0];
			int sn = s[n];
			if (s[0] > s[n]) {
				int temp = s[0];
				s[0] = s[n];
				s[n] = temp;
			}
			Arrays.sort(s);
			for (int i = 0; i <= n; i++)
				if (s0 == s[i]) {
					s0 = i;
					break;
				}
			for (int i = n; i >= 0; i--)
				if (sn == s[i]) {
					sn = i;
					break;
				}
			int l = 0, r = n;
			for (int i = s0; i >= 0; i-=2) {
				st[l++] = s[i];
				visit[i]=true;
			}
			for(int i=sn;i<=n;i+=2) {
				st[r--]=s[i];
				visit[i]=true;
			}
			for(int i=0;i<=n;i++) {
				if(!visit[i]) {
					st[l++]=s[i];
				}
			}
			int max=0;
			for(int i=1;i<=n;i++) {
				max=Math.max(max, Math.abs(st[i]-st[i-1]));
			}
			System.out.println(max);
		}
	}
}
