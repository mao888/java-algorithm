//�����⣨�ݹ飩
//�þ���ǧ����࣬ѧ�����ڴ�Ӧ������һ��ȥ�Է�������������ѧ��ȥ��������ϲ���Ĵ���ӣ�����ƽʱ�԰��Ӷ���һ�ڳ��������Ϊ����ѧ����ǰ���ֵ�������һЩ����������Լ�һ��ֻ�ܳ�һ�������������������Ҫ��N�����ӣ���֪���ж����ֳԷ���
//���������������
//ÿ�������� n��
//���n�����Ӷ�Ӧ�ĳԷ���

package JBfaxianbei;
import java.util.*;
// �ݹ��Ե���
// �ϴ���С��ȥ����
public class F {
	public static int find(int n) {
		if(n==0||n==1)return 1;
		else return find(n-1)+find(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			System.out.println(find(n));
		}
	}
}
 