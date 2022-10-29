package �������;

class Plane1{
	private String pName;
	private String pModel;
	private int pWeight;
	//���췽��1
	public Plane1(String pName){
		this.pName = pName;
	}
	//���췽��2
	public Plane1(String pName,String pModel,int pWeight){
		this(pName);
		this.pModel=pModel;
		this.pWeight=pWeight;
	}
	//��ͨ����
	//���طɻ��ͺ�
	public String getPModel() {
		return pModel;
	}
	//����equals����
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane1 other = (Plane1) obj;
		if (pModel == null) {
			if (other.pModel != null)
				return false;
		} else if (!pModel.equals(other.pModel))
			return false;
		return true;
	}
	//����toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�ɻ�����:  "+this.pName+"�ɻ��ͺ�:  "+this.pModel;
	}
}
//�������ӿ�
interface Aerocraft{
	//��Ա����
	public String takeofWay();
	public String mainUsage();
}
//�񺽿ͻ���
class Airliner extends Plane1 implements Aerocraft{
	//��Ա����
	private int seat;
	//���췽��
	public Airliner(String name, String model, int weight,int seat) {
		super(name, model, weight);
		this.seat = seat;
		// TODO Auto-generated constructor stub
	}
	//��ͨ����
	@Override
	//��дtakeOfway
	public String mainUsage() {
//		 TODO Auto-generated method stub
		return "����";
	}
	@Override
	//��дmainUsage
	public String takeofWay() {
		// TODO Auto-generated method stub
		return "�ܵ����";
	}
}
public class jikeplane {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane1 plane1=new Plane1("����", "Y192", 100);
		Plane1 plane2 = new Plane1("����", "N759", 120);
//		System.out.println(plane1.equals(plane2));
		if (plane1.equals(plane2)==true)System.out.println("�������������");
		else System.out.println("�������������");
		System.out.println(plane1.toString());
		Airliner airliner = new Airliner("����", "K468", 15, 1);
		System.out.println("��ɷ�ʽΪ:"+airliner.takeofWay());
		System.out.println("��Ҫ��;:"+airliner.mainUsage());
	}
}
