package JBfaxianbei;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//��ϣ����Hash table��Ҳ�й�ϣ�����Ǹ��ݹؼ���ֵ(Key value)��ֱ�ӽ��з��ʵ����ݽṹ��Ҳ����˵����ͨ���ѹؼ���ֵӳ�䵽����һ��λ�������ʼ�¼���Լӿ���ҵ��ٶȡ����ӳ�亯������ɢ�к�������ż�¼���������ɢ�б�
//������M�����ں���f(key)������������Ĺؼ���ֵkey�����뺯�������ܵõ������ùؼ��ֵļ�¼�ڱ��еĵ�ַ����Ʊ�MΪ��ϣ(Hash��������f(key)Ϊ��ϣ(Hash) ������

public class JB11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Scanner(System.in).nextLine();

		Map<Character,Integer> m=new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++){

			//ÿ���ַ�(key)�����ִ���(value)����HashMap

			char c=s.charAt(i);

			m.put(c,m.containsKey(c)?m.get(c)+1:1);

		}

		int max=Collections.max(m.values());

		Set<Character> v=new HashSet<Character>();

		for(Map.Entry<Character,Integer> e:m.entrySet())

			if(e.getValue()==max) v.add(e.getKey());

		System.out.println(v+"times"+max);
	}

}
