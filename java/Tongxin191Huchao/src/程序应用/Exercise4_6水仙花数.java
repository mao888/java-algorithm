package ����Ӧ��;
//ˮ�ɻ���
//��ʮ���������ֵ������͵��������λ������
//��:153 370 371 407
public class Exercise4_6ˮ�ɻ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ˮ�ɻ���Ϊ:");
		for (int i = 100; i < 1000; i++) {
			int sum=0,k,n=i;
			while (n!=0) {
				k=n%10;		//��λ
				n=n/10;		//i��1λ
				sum+=k*k*k;
			}
			if (i==sum)System.out.println(i+" ");
		}
	}

}
