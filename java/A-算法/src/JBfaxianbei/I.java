//�ھ��⣨Լɪ�򻷣�
//N����Χ��һȦ���ӵ�һ���˿�ʼ����������m���˳�Ȧ��ʣ�µ��˼�����1��ʼ����������m���˳�Ȧ�����������ֱ�������˳�Ȧ����ģ��˹��̣������Ȧ���˵���ţ�
//���������������
//ÿ�������� n  m��


package JBfaxianbei;
// ��while������Ϊ����
import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[n];
			int x=n;				// Ȧ������X��
			int p=0;				// �α꣬���㵱ǰ״̬
			while (x>0) {
				for (int i = 0; i < n; i++) {
					if (arr[i]==0) {
						p++;
						if (p==m) {
							arr[i]=1;
							x--;
							p=0;
							System.out.println(i+1+" ");
						}	
					}
				}
			}
		}
	}
}
