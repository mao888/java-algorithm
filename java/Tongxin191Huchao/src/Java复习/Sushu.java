package Java��ϰ;

//100���ڵ�����
	public class Sushu {

		public static void main(String[] args) {
			int Max = 100;										 //���峣��Max=100
			int j, k ,n;
			System.out.println("2~"+Max+"֮�����������Ϊ��");
			System.out.print("2\t");							//2�ǵ�һ���������������ֱ�����
			n = 1;												//n�ۼ������ĸ���
			k = 3;										//k�Ǳ�������������С����3��ʼ������ż������Ҫ����
			do											//���ѭ��,��3~100������������
			{
				j = 3;									//��jȥ����������
				while (j<Math.sqrt(k) && (k % j!=0))	//�ڲ�ѭ��
					j++;								//��j< ,��j��������k����j��1���ٲ���ȥ��k
				if (j>Math.sqrt(k)) {
					System.out.println(k + "\t");
					n++;
					if(n%10 == 0)System.out.println();  //ÿ�����10����
				}
				k=k+2;									//������һ������
				}while(k<Max);
			System.out.println("\n����"+n+"������");
			}
		}