package Java��ϰ;
import java.util.*;
public class C�����¶��뻪���¶ȵ�ת�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("������Ŀǰ��Ҫת�����¶����ͣ�C��F");
		String s = sc.next();
		if("C".equalsIgnoreCase(s)) {
			System.out.println("��������Ҫת�������϶ȵ��¶���ֵ");
			double wd1=sc.nextDouble();
			double wd2=wd1*1.8+32;
			System.out.println("��Ӧ�Ļ����¶ȣ�"+ wd2  +"�������϶�");
		}
		else if ("F".contentEquals(s))
			 {
			System.out.println("��������Ҫת���Ļ������϶ȵ��¶���ֵ");
			double hd1=sc.nextDouble();
			double hd2=(hd1-32)/1.8;
			System.out.println("��Ӧ�������¶�Ϊ��"+  hd2 +"���϶�");
		}
		else {
			System.out.println("��������ַ��������˳�����");
			break;
			}
		}		
	}
}
