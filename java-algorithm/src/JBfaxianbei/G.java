//�����⣨������
//����һ�죬ѧ��������������ָ����ը�ǲ����������͵����ģ���
//����˵�����кö��������͵Ķ�Ҫ��ָ����ըҪ�죬����׳ˣ�17�Ľ׳�int���Ѿ��Ų����ˡ���
//ѧ�����ʣ�����ѧ����֪��2019�Ľ׳��Ƕ����𣿡�
//����ô���ѵ������أ���������̫���������������1000000000000000007ȡ��������֪�����Ƕ�����


package JBfaxianbei;

import java.math.BigInteger;
//�������㣬java����API
public class G {
	public static BigInteger jc(BigInteger n) {
		if(n.equals(BigInteger.ONE))return BigInteger.ONE;
		else return n.multiply(jc(n.subtract(BigInteger.ONE)));
	}
	public static void main(String[] args) {
		BigInteger n=new BigInteger("2019");
		BigInteger mod=new BigInteger("1000000000000000007");
		System.out.println(jc(n).mod(mod));
	}
}
