package ����Ӧ��;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		//����һ:
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("������:a=:"+a+" b="+b);
		//������:
		int c =a+b;
		b=c-a;		//15-10=5 b=5;
		a=c-b;		//15-5=10 a=10
		 System.out.println("a = " + a);
	     System.out.println("b = " + b);
		//������:�������
		c = a ^ b;
	     b = c ^ b; 
	     a = c ^ a;
	     System.out.println("a = " + a);
	     System.out.println("b = " + b);
	}

}
