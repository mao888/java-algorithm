package ����;

public class foreach������ά���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[][]= {{5,7,15},{8,4,11},{3,6,13}};
		System.out.println("�����е�Ԫ���� ");
		int i=0;
		for(int x[]: Arr) {//��
			i++;
			int j=0;
			for(int e:x) {//��
				j++;
				if(i==Arr.length&&j==x.length) {
					System.out.print(e);//������һ��Ԫ�أ����治�Ӷ���
				}else
					System.out.print(e+"��");
			}	
		}		
								
		
	}
}
