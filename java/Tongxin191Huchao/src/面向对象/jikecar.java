package �������;

//1.��ͨ������
class vehicle{
	private String vType;	//	����
	private int vNum;		// �ؿ�����
	//���췽��1
	public vehicle() {
		System.out.println("������һ����ͨ����");
	}
	//���췽��2
	public vehicle(String vType,int vNum) {
		this();
		this.vType=vType;
		this.vNum=vNum;
	}
	//��ͨ����
		//1.get set
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	public int getvNum() {
		return vNum;
	}
	public void setvNum(int vNum) {
		this.vNum = vNum;
	}
		//2.��дequals����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vNum;
		result = prime * result + ((vType == null) ? 0 : vType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		vehicle other = (vehicle) obj;
		if (vNum != other.vNum)
			return false;
		if (vType == null) {
			if (other.vType != null)
				return false;
		} else if (!vType.equals(other.vType))
			return false;
		return true;
	}
		//3.��дtostring
	@Override
	public String toString() {
		return "����: "+this.vType+"  �ؿ�����: "+this.vNum;
	}
}
//2.�Ʒѽӿ�
interface Charge{
	public void billingMethods();
}
//3.��������
class Bus extends vehicle implements Charge{
	//��Ա����
	private String bNo;
	private String linel;
	//���췽��
	public Bus(String vType, int vNum,String bNo,String linel) {
		super(vType, vNum);
		this.bNo=bNo;
		this.linel=linel;
		// TODO Auto-generated constructor stub
	}
	//��ͨ����
	//��дbillingMethods( )����
	@Override
	public void billingMethods() {
		// TODO Auto-generated method stub
		System.out.println(getvType()+" "+getvNum()/10+"Ԫ/�ţ����ƹ�������");
	}
	//����showBus�����������������Bus�����������Ϣ����������ࣩ
	public void showBus() {
		System.out.println("����:"+getvType()+"  �ؿ�����:"+getvNum()+"  ��·��:"+bNo+"  ��·:"+linel);
	}	
}
public class jikecar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������vehicle����v1��v2���ֱ����v1��v2����������equals�����ж����������Ƿ���ȣ�
		vehicle v1 = new vehicle("С�ͳ�",20);
		System.out.println(v1.toString());
		vehicle v2 = new vehicle("���ͺ�",50);
		System.out.println(v2.toString());
		if (v1.equals(v2)==true)System.out.println("�������������");
		else System.out.println("�������������");
		//����һ��Bus���󣬵�����showBus����������billingMethods( )������
		Bus bus =new Bus("������", 30, "4·", "�Ƽ�ѧԺ������վ");
		bus.showBus();
		bus.billingMethods();
	}
}
