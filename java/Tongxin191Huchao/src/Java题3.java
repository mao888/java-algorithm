public class Java��3{
	public static void main(String[] args) {
		

/*	public static void main(String[] args) 
*	{
*	 TODO Auto-generated method stub
*System.out.println("HelloJava");
*	}
*
*	public static void main1(String[] args) 
*	{
*		;
*		class Jianpan
*		{
*			public void main(String[] args)throws IOException 
*			{
*			float f =3.22f;	// TODO Auto-generated method stub
*			double d=3.1415926;
*			System.out.println(f);
*			char c='��';
*			byte b=123;
*			short s=12345;
*			int i=123123;
*			long h=123456789;
*			char a='x';
*			boolean z=false;
*			System.out.println(d);
*			System.out.println(c);
*			System.out.println(b);
*			System.out.println(s);
*			System.out.println(i);
*			System.out.println(h);
*			System.out.println(a);
*			System.out.println(z);
*			}	
*		}
*
*/	
////10��5�� �ɼ�
//		 /*
//		 * if(�ж�����){
//	     * }   else {
//		 *	public class Day02{
//		 *	public static void main(String[] args) {
//		 *  �ɼ�����90��  ���A      80~90 B
//	     *  60~80 C   60D//
//	     */	 	
////1	����
//    int age=18;
//	if (age == 18)
//		System.out.println("���Է��ʱ���վ");
//	else
//	System.out.println("�����Է��ʱ���վ");
//	
//	
////2	�ɼ��ȼ�
//	System.out.println("���������ĳɼ�");
//	Scanner sc = new  Scanner(System.in);
//	
//	int grade = sc.nextInt();
//	if(grade>90) {
//		System.out.println('A');
//	}else if (grade>80) {
//		System.out.println('B');
//	}else if (grade>60) {
//		System.out.println('C');
//	}else  {
//		System.out.println('D');
//			}
//		}

//3����
//1 ����λ��
/*import java.util.Scanner;
*public class Zuoye2 {
*	public static void main(String[] args) {
*	System.out.println("���û�������������");
*		Scanner sc = new Scanner(System.in);
*		int a = sc.nextInt();
*		int b = sc.nextInt();
*		int c = sc.nextInt();
*		if (a > b && a > c ) { 
*		       System.out.println(a);
*		}else if(b > a && b>c) {
*			System.out.println(b);
*		}else if(c > a && c>b) {
*			System.out.println(c);
*			}
*		}
*	}
*/
//2 ����λ��
//
//		System.out.println("���û�����һ����λ��");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		int qianwei = a/1000; 
//		int baiwei = a/100%10; 
//		int shiwei = a/10%10;
//		int gewei = a%10; 
//		int b = qianwei+baiwei*10+shiwei*100+gewei*1000;
//		System.out.println(b);

//3
//
//		for (int i = 0; i < 100; i++) {
//			
//			System.out.println(i);
//		}
//4		
	
/*		public class Guoqingѵ�� {
*public void main(String[] args) {
*				for (int i = 1; i < 1000  ; i++) {
*					if (i%3==0&&i%5==0&&i%7==0) {
*						System.out.println(i);
*					}
*				}
*			}
*		}
*/
		
//10��6��
	//1   ����λ�� ������
		
		//import java.util.Scanner;

		/*public class B {
	*
	*		public static void main(String[] args) {
	*			System.out.println("���û�����һ����λ��");
	*
	*			Scanner sc = new Scanner(System.in);
	*			int a = sc.nextInt();
	*			while (!(999 < a && a <10000)) {
	*	System.out.println("�����������");
	*	System.out.println("������һ����λ��");
	*	a= sc.nextInt();
	*	}
	*int qianwei = a/1000; 
	*int baiwei = a/100%10; 
	*int shiwei = a/10%10;
	*int gewei = a%10; 
	*int b = qianwei+baiwei*10+shiwei*100+gewei*1000;
	*System.out.println(b);
	*			}
		}*/
//2
//		public class 
// {
//			public static void main1(String[] args) {
//						int[] arr = {
//								6,2,66,67,68,69,9,60,9,74,4,7,8,1
//						};
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 != 0 ) {
//				System.out.println(arr[i]);
//			}
//			
//		}
//						}
//				}	
//int arr[] = new int[100];
//		for (int i = 0; i < arr.length; i++  ) {
//		arr[i] = i;
//		System.out.println(arr[i]);
//		System.out.println(arr[i]);
//		}
//	}
//	
//	
	
//10.10 
///1 100���ڵ�����
	/*public class Sushu {
*
*		public static void main(String[] args) {
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


//2
 * 
 */
/*import java.util.Scanner;
*public class Zuoye2 {
*	public static void main(String[] args) {
*		System.out.println("������100���ڵ�����");
*		Scanner sc = new Scanner(System.in);
*		int num = sc.nextInt();
*		boolean b = false;
*	for (int i = 2; i < num; i++) {
*		if (num % i ==0) {
*			b = true;
*				}
*			}
*	if (b == true) {
*		System.out.println("��������");
*	}else {
*		System.out.println("������");
*				}
*			}
*		}	
*/

//3
/*import java.util.Scanner;
*public class T1 {
*	public static void main(String[] args) {
*		Scanner sc = new Scanner(System.in);
*		int a = sc.nextInt();
*		int b = sc.nextInt();
*		int c = sc.nextInt();
*		if (a >= b && a >= c ) {
*			System.out.println(a);**		}
*		else if (b >= c && b >= a ) {		System.out.println(b);
*		}else {
*			System.out.println(c);
*				}
*			}
*		}
*/

//4
//public class Java��� {
//
//	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print("*");
//				
//			}System.out.println();
//
//			
//		}
//	}
//
//}
//5
//1�������
//public class B{
//public static void main(String[] args) {
//	int art[] = {1,5,5,5,58,5,5,54,6,5,468,46,4,4,64,46,46,44,4,64,4,84,84,4,84,46};
//	int sum =0 ;
//	for (int i = 0; i < art.length; i++) {
//		sum =sum+i;
//	}
//	System.out.println(sum);
////2�ҳ������е������
//	int mac = art[0];
//	for (int i = 0; i < art.length; i++) {
//		if (art[i]>mac) {
//			mac = art[i];
//		}	
//	}System.out.println(mac);
////3�ҳ�������ֻ������һ�ε��Ǹ���
//	int L=8848;
//	for (int i = 0; i < art.length; i++) {
//		L = L^art[i];
//	}
//	System.out.println(L^8848);
////4 
//	int arr[] = new int [10];
//	System.out.println(arr[0]);
//
//	
	
//10.11
	//�˷���
/*public class Chenfabiao{
*		public static void main(String[] args) {
*			for (int i = 1; i < 10; i++) {
*			for (int j = 1; j <=i; j++) {
*			System.out.print(i+"*"+j+"="+i*j+"\t");
*				
*				}System.out.println();	
*			}
*		}
*	}
*/

//10.13
	//�Ӽ�������n�����������Щ���д�����ƽ��ֵ����
	/*import java.util.Scanner;
	*public class Chenfabiao{
	*		public static void main(String[] args) {
	*			System.out.println("�������뼸������");
	*			Scanner scanner =new Scanner(System.in) ;
	*			int count =scanner.nextInt();
	*			int sum =0;
	*			int num[]=new int[count];
	*			float avg=0;
	*			for (int i = 0; i < count; i++) {
	*				System.out.println("�������"+(i+1)+"������");
	*			num[i]=scanner.nextInt();
	*			sum+=num[i];
	*			}avg=sum/count;
	*			for (int i = 0; i < count; i++) {
	*				if (num[i]>avg) {
	*					System.out.print(num[i]+"");
	*				}
	*			}
	*		}
	*	}
    */

	
	//�Ӽ�������n����������n�����е����������С�������
	//import java.util.Scanner;
//	public class T1 {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("������n����");
//			int n = sc.nextInt();
//			int num[] = new int[n];
//			for (int i = 0; i < n; i++) {
//				num[i] = sc.nextInt();
//			}
//			int min = 0;
//			int max = 0;
//			int b[] = new int[n];
//			for (int i = 0; i < n; i++) {
//				System.out.println("�������" + (i + 1) + "������");
//				b[i] = sc.nextInt();
//			}
//			min = max = b[0];
//			for (int i = 1; i < n; i++) {
//				if (min > b[i]) {
//					min = b[i];
//				}
//				if (max < b[i]) {
//					max = b[i];
//				}
//			}
//			System.out.println(min + "  " + max);
//		}
//	}
//	



//��дjavaӦ�ó��򣬱Ƚ��������и����������ַ����Ƿ���ȣ�������ȽϵĽ��
/*	import java.util.Scanner;
*	public class A{
*		public static void main(String[] args) {
*			Scanner sc = new Scanner(System.in);
*			System.out.println("�������һ���ַ���");
*		    String a = sc.nextLine();
*		    System.out.println("������ڶ����ַ���");
*		   	String b = sc.nextLine();
*		    if (a.equals(b)) {
*				System.out.println("�����ַ������");
*			}else {
*				System.out.println("�����ַ��������");
*			}
*		}
*	}
*/

	
//10��24��25��	
//Callatz�����Ȳ���
//��һ	
//	package Java��ϰ;
//	import java.util.Scanner;
//	public class Callatz�����Ȳ��� {
//		public static void main(String[] args) {
//			int a ;
//			Scanner reader = new Scanner(System.in);
//			a = reader.nextInt();
//			for(int i = 1; i < 1000; i ++) {
//				if(a != 1) {
//					if(a % 2 == 0) {
//						a = a/2;
//					}
//					else {
//						a = (3 * a + 1)/2;
//					}
//					if(a == 1) {
//						System.out.println(i);
//						break;
//					}
//				}
//				if(a == 1) {
//					System.out.println(0);
//					break;
//				}
//			}
//		}
//	}

//����
//	package Java��ϰ;
//	import java.util.Scanner;
//	public class A {
//		public static void main(String[] args) {
//			System.out.println("����������������ֵ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a = 0;
//		while (n!=1) {
//		if (n%2 == 0) {
//		  n=n/2;
//			a+=1;	
//		}else {
//			n=(n*3+1)/2;
//			a+=1;
//				}
//			}
//		System.out.println(a);
//		}
//	}
//			


	
	
	
//10��26��
//�ֶκ���	
//	package Java��ϰ;
//
//	import java.util.Scanner;
//
//	public class B�ֶκ��� {
//
//		public static void main(String[] args) {
//			double y;
//			System.out.println("������X��ֵ");
//			Scanner sc = new Scanner(System.in);
//			double x = sc.nextDouble();
//			if (0 <= x && x < 20) {
//				if (0 <= x && x < 5) {
//					y = -x + 2.5;
//				} else if (5 <= x && x < 10) {
//					y = 2 - 1.5 * (x - 3) * (x - 3); 
//				} else {
//					y = x / 2 - 1.5;
//				}System.out.println(y);
//				}
//			
//		}
//	}
//
	
	//�����¶��뻪���¶ȵ�ת��
//	package Java��ϰ;
//	import java.util.*;
//	public class C�����¶��뻪���¶ȵ�ת�� {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("������Ŀǰ��Ҫת�����¶����ͣ�C��F");
//			String s = sc.next();
//			if("C".equalsIgnoreCase(s)) {
//				System.out.println("��������Ҫת�������϶ȵ��¶���ֵ");
//				double wd1=sc.nextDouble();
//				double wd2=wd1*1.8+32;
//				System.out.println("��Ӧ�Ļ����¶ȣ�"+ wd2  +"�������϶�");
//			}
//			else if ("F".contentEquals(s))
//				 {
//				System.out.println("��������Ҫת���Ļ������϶ȵ��¶���ֵ");
//				double hd1=sc.nextDouble();
//				double hd2=(hd1-32)/1.8;
//				System.out.println("��Ӧ�������¶�Ϊ��"+  hd2 +"���϶�");
//			}
//			else {
//				System.out.println("��������ַ��������˳�����");
//				break;
//				}
//			}		
//		}
//	}
	}
	}
	
	
	