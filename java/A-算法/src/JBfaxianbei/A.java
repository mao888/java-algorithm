//��һ�⣨����������
//����a=1; b=2;
//ϣ�������ĳ����������
//a=2; b=1; 
//���������ֽⷨ��


package JBfaxianbei;

public class A {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
//	����һ:����
		int c = a ;  // c = 1
		a = b ;  // a = 2
		b = c ;  // b = 1
		System.out.println(String.valueOf(a) + String.valueOf(b) );
		System.out.println(a + " " +b);
		
//	������:���
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a+","+b);
		
//	������:�Ӽ�
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+","+b);
	}
}
