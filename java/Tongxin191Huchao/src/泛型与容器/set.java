package ����������;

import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("a");s2.add("b");s2.add("d");
		//���췽�����Գ�ʼ��������
		Set sn = new HashSet(s1);
		sn.retainAll(s2);
		System.out.println(sn);
		
//		s1.retainAll(s2);
//		System.out.println(s1);
		Set su = new HashSet(s1);
		su.addAll(s2);
		System.out.println(su);
//		String a = "1";
//		String b = "1";
//		System.out.println(a.equals(b));
////		
//		String c = "2";
//		String s = new String();
//		s="2";
//		String n = new String("2");
		
		//��ϣ��������Ԫ�صĵĴ洢λ�ú�Ԫ�ص�ֵk֮�佨��һ���ض��Ķ�Ӧ��ϵf��ʹÿ��Ԫ����һ��Ψһ�Ĵ洢λ�����Ӧ��
		//�ڱȽ����������ϣ����HashSet�е�Ԫ���Ƿ���ͬʱ�����ȱȽϹ����뷽��hashCode()�ķ���ֵ�Ƿ���ͬ������ͬ������ʹ��equals()�����Ƚ���洢λ�ã����ڴ��ַ��
		//�����߶���ͬ������Ϊ��ͬ��Ԫ�ء�֮�����ڱȽ��˹�����֮�󣬻�Ҫͨ��equals�����������бȽϣ�����Ϊ�Բ�ͬԪ�ؼ�����Ĺ����������ͬ��
		//��ˣ����ڹ�ϣ������˵������д��Ԫ�ض�Ӧ���equals����������hashcode���������е�ĳһ�����������д��һ�����Ա�֤���жϵ�һ����
	
	}
}








